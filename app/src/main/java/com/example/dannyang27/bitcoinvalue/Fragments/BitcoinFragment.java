package com.example.dannyang27.bitcoinvalue.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dannyang27.bitcoinvalue.Adapters.BitcoinAdapter;
import com.example.dannyang27.bitcoinvalue.Pojo.CurrenciesPOJO;
import com.example.dannyang27.bitcoinvalue.R;
import com.example.dannyang27.bitcoinvalue.Threads.GetCurrencyTask;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public class BitcoinFragment extends Fragment {

    RecyclerView rv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bitcoin, container, false);

        rv = (RecyclerView) v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));


        try {
            CurrenciesPOJO pojo = new GetCurrencyTask().execute().get();
            BitcoinAdapter adapter = new BitcoinAdapter(pojo.getCurrencies());
            rv.setAdapter(adapter);

        }catch (Exception e){
            e.printStackTrace();
        }

        return v;
    }
}
