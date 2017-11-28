package com.example.dannyang27.bitcoinvalue.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dannyang27.bitcoinvalue.Pojo.AbstractCurrency;
import com.example.dannyang27.bitcoinvalue.Pojo.CurrenciesPOJO;
import com.example.dannyang27.bitcoinvalue.R;
import com.example.dannyang27.bitcoinvalue.Threads.GetCurrencyTask;

import java.util.List;

public class BitcoinValueScreen extends AppCompatActivity {

    TextView valueTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitcoin_value_screen);

        valueTv = (TextView) findViewById(R.id.bitcoin_value);

        GetCurrencyTask task = new GetCurrencyTask();
        try {
            CurrenciesPOJO cpojo = task.execute().get();
            List<AbstractCurrency> ac = cpojo.getCurrencies();
            for(int i=0; i< ac.size(); i++){
                System.out.println(ac.get(i).getClass().getSimpleName() +" : "+ ac.get(i).getLast() + ac.get(i).getSymbol());
            }
        }catch (Exception e){
            e.printStackTrace();
        }







    }
}
