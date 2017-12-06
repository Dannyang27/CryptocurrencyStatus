package com.example.dannyang27.bitcoinvalue.Util;

import com.example.dannyang27.bitcoinvalue.R;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public class Util {
    public static String getFullName(String currencyAbbr) {
        String res = "";
        if (currencyAbbr.equals("AUD")) {
            res = "Australian Dollar";
        } else if (currencyAbbr.equals("BRL")) {
            res = "Brazilian Real";
        } else if (currencyAbbr.equals("CAD")) {
            res = "Canadian Dollar";
        } else if (currencyAbbr.equals("CHF")) {
            res = "Switzerland Franc";
        } else if (currencyAbbr.equals("CLP")) {
            res = "Chilean Peso";
        } else if (currencyAbbr.equals("CNY")) {
            res = "China Yuan Renminbi";
        } else if (currencyAbbr.equals("DKK")) {
            res = "Denmark Krone";
        } else if (currencyAbbr.equals("EUR")) {
            res = "Euro";
        } else if (currencyAbbr.equals("GBP")) {
            res = "Great Britain Pounds";
        } else if (currencyAbbr.equals("HKD")) {
            res = "Hong Kong Dollar";
        } else if (currencyAbbr.equals("INR")) {
            res = "India Rupee";
        } else if (currencyAbbr.equals("ISK")) {
            res = "Icelandic Krona";
        } else if (currencyAbbr.equals("JPY")) {
            res = "Japan Yen";
        } else if (currencyAbbr.equals("KRW")) {
            res = "Korean Won";
        } else if (currencyAbbr.equals("NZD")) {
            res = "New Zealand Dollar";
        } else if (currencyAbbr.equals("PLN")) {
            res = "Poland Zloty";
        } else if (currencyAbbr.equals("RUB")) {
            res = "Russia Ruble";
        } else if (currencyAbbr.equals("SEK")) {
            res = "Sweden Krona";
        } else if (currencyAbbr.equals("SGD")) {
            res = "Singapore Dollar";
        } else if (currencyAbbr.equals("THB")) {
            res = "Thailand Baht";
        } else if (currencyAbbr.equals("TWD")) {
            res = "Taiwan New Dollar";
        } else if (currencyAbbr.equals("USD")) {
            res = "United State Dollar";
        }

        return res;
    }

    public static int getImgByName(String abbr){
        int drawable = R.drawable.empty;
        if (abbr.equals("AUD")) {
            drawable = R.drawable.aud;
        } else if (abbr.equals("BRL")) {
            drawable = R.drawable.brl;
        } else if (abbr.equals("CAD")) {
            drawable = R.drawable.cad;
        } else if (abbr.equals("CHF")) {
            drawable = R.drawable.chf;
        } else if (abbr.equals("CLP")) {
            drawable = R.drawable.clp;
        } else if (abbr.equals("CNY")) {
            drawable = R.drawable.cny;
        } else if (abbr.equals("DKK")) {
            drawable = R.drawable.dkk;
        } else if (abbr.equals("EUR")) {
            drawable = R.drawable.eur;
        } else if (abbr.equals("GBP")) {
            drawable = R.drawable.gbp;
        } else if (abbr.equals("HKD")) {
            drawable = R.drawable.hkd;
        } else if (abbr.equals("INR")) {
            drawable = R.drawable.inr;
        } else if (abbr.equals("ISK")) {
            drawable = R.drawable.isk;
        } else if (abbr.equals("JPY")) {
            drawable = R.drawable.jpy;
        } else if (abbr.equals("KRW")) {
            drawable = R.drawable.krw;
        } else if (abbr.equals("NZD")) {
            drawable = R.drawable.nzd;
        } else if (abbr.equals("PLN")) {
            drawable = R.drawable.pln;
        } else if (abbr.equals("RUB")) {
            drawable = R.drawable.rub;
        } else if (abbr.equals("SEK")) {
            drawable = R.drawable.sek;
        } else if (abbr.equals("SGD")) {
            drawable = R.drawable.sgd;
        } else if (abbr.equals("THB")) {
            drawable = R.drawable.thb;
        } else if (abbr.equals("TWD")) {
            drawable = R.drawable.twd;
        } else if (abbr.equals("USD")) {
            drawable = R.drawable.usd;
        }

        return drawable;
    }


}
