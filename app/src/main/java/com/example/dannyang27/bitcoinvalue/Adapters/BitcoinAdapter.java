package com.example.dannyang27.bitcoinvalue.Adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dannyang27.bitcoinvalue.Pojo.AbstractCurrency;
import com.example.dannyang27.bitcoinvalue.R;
import com.example.dannyang27.bitcoinvalue.Util.Util;
import com.example.dannyang27.bitcoinvalue.ViewHolders.BitcoinViewholder;

import java.util.List;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public class BitcoinAdapter extends RecyclerView.Adapter<BitcoinViewholder> {

    List<AbstractCurrency> currencyList;


    public BitcoinAdapter(List<AbstractCurrency> lista) {
        super();
        this.currencyList = lista;
    }

    @Override
    public BitcoinViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_viewholder, parent, false);
        BitcoinViewholder bv = new BitcoinViewholder(v);
        return bv;
    }

    @Override
    public void onBindViewHolder(BitcoinViewholder holder, int position) {

        getImgByName(holder, currencyList.get(position).getClass().getSimpleName());
       // holder.img.setImageResource(Util.getImgByName(currencyList.get(position).getClass().getSimpleName()));
        holder.currency_abbr.setText(currencyList.get(position).getClass().getSimpleName());
        holder.currency_value.setText(currencyList.get(position).getLast() + currencyList.get(position).getSymbol());
        holder.currency_name.setText(Util.getFullName(currencyList.get(position).getClass().getSimpleName()));

    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    public int getImgByName(BitcoinViewholder holder, String abbr){
        int drawable = R.drawable.empty;
        if (abbr.equals("AUD")) {
            holder.img.setImageResource(R.drawable.aud);
        }else if (abbr.equals("BRL")) {
            holder.img.setImageResource(R.drawable.brl);
        } else if (abbr.equals("CAD")) {
            holder.img.setImageResource(R.drawable.cad);
        } else if (abbr.equals("CHF")) {
            holder.img.setImageResource(R.drawable.chf);
        } else if (abbr.equals("CLP")) {
            holder.img.setImageResource(R.drawable.clp);
        } else if (abbr.equals("CNY")) {
            holder.img.setImageResource(R.drawable.cny);
        } else if (abbr.equals("DKK")) {
            holder.img.setImageResource(R.drawable.dkk);
        } else if (abbr.equals("EUR")) {
            holder.img.setImageResource(R.drawable.eur);
        } else if (abbr.equals("GBP")) {
            holder.img.setImageResource(R.drawable.gbp);
        } else if (abbr.equals("HKD")) {
            holder.img.setImageResource(R.drawable.hkd);
        } else if (abbr.equals("INR")) {
            holder.img.setImageResource(R.drawable.inr);
        } else if (abbr.equals("ISK")) {
            holder.img.setImageResource(R.drawable.isk);
        } else if (abbr.equals("JPY")) {
            holder.img.setImageResource(R.drawable.jpy);
        } else if (abbr.equals("KRW")) {
            holder.img.setImageResource(R.drawable.krw);
        } else if (abbr.equals("NZD")) {
            holder.img.setImageResource(R.drawable.nzd);
        } else if (abbr.equals("PLN")) {
            holder.img.setImageResource(R.drawable.pln);
        } else if (abbr.equals("RUB")) {
            holder.img.setImageResource(R.drawable.rub);
        } else if (abbr.equals("SEK")) {
            holder.img.setImageResource(R.drawable.sek);
        } else if (abbr.equals("SGD")) {
            holder.img.setImageResource(R.drawable.sgd);
        } else if (abbr.equals("THB")) {
            holder.img.setImageResource(R.drawable.thb);
        } else if (abbr.equals("TWD")) {
            holder.img.setImageResource(R.drawable.twd);
        } else if (abbr.equals("USD")) {
            holder.img.setImageResource(R.drawable.usd);
        }

        return drawable;
    }
}
