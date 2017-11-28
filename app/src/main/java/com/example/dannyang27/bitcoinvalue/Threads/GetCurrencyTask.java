package com.example.dannyang27.bitcoinvalue.Threads;

import android.net.Uri;
import android.os.AsyncTask;
import android.widget.TextView;

import com.example.dannyang27.bitcoinvalue.Pojo.CurrenciesPOJO;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public class GetCurrencyTask extends AsyncTask<Void, Void, CurrenciesPOJO> {


    CurrenciesPOJO pojo;
    public GetCurrencyTask() {
        super();

    }


    @Override
    protected CurrenciesPOJO doInBackground(Void... params) {
        //https://blockchain.info/es/ticker

        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("blockchain.info");
        builder.appendPath("es");
        builder.appendPath("ticker");

        try {
            URL url = new URL(builder.build().toString());
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoInput(true);


            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            Gson gson = new Gson();
            pojo = gson.fromJson(reader, CurrenciesPOJO.class);
            reader.close();

            System.out.println(pojo.getJPY().getLast() + pojo.getJPY().getSymbol());


            if (conn.getResponseCode() == HttpsURLConnection.HTTP_OK) {
            }


            conn.disconnect();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return pojo;

    }


    @Override
    protected void onPostExecute(CurrenciesPOJO p) {
        super.onPostExecute(p);

    }
}