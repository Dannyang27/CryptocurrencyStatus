package com.example.dannyang27.bitcoinvalue.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dannyang27.bitcoinvalue.R;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public class EthereumFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ethereum, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
