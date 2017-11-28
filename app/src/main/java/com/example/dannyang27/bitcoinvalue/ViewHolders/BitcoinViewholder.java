package com.example.dannyang27.bitcoinvalue.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dannyang27.bitcoinvalue.R;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public class BitcoinViewholder extends RecyclerView.ViewHolder {

    public ImageView img;
    public TextView currency_abbr;
    public TextView currency_name;
    public TextView currency_value;
    public TextView currency_increase;
    public View v;
    public BitcoinViewholder(View itemView) {
        super(itemView);

        v = itemView;
        img = (ImageView) itemView.findViewById(R.id.currency_img);
        currency_abbr = (TextView) itemView.findViewById(R.id.currency_abbr);
        currency_name = (TextView) itemView.findViewById(R.id.currency_name);
        currency_value = (TextView) itemView.findViewById(R.id.currency_value);
        currency_increase = (TextView) itemView.findViewById(R.id.currency_increase);


    }
}
