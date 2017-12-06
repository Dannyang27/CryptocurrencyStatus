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

        holder.img.setImageResource(Util.getImgByName(currencyList.get(position).getClass().getSimpleName()));
        holder.currency_abbr.setText(currencyList.get(position).getClass().getSimpleName());
        holder.currency_value.setText(currencyList.get(position).getLast() + currencyList.get(position).getSymbol());
        holder.currency_name.setText(Util.getFullName(currencyList.get(position).getClass().getSimpleName()));

    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

}
