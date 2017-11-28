package com.example.dannyang27.bitcoinvalue.Util;

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

}
