package com.example.dannyang27.bitcoinvalue.Pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public abstract class AbstractCurrency {
    @SerializedName("15m")
    private String min;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("last")
    private String last;

    @SerializedName("sell")
    private String sell;

    @SerializedName("buy")
    private String buy;

    public String getMin ()
    {
        return min;
    }

    public void set15m (String min)
    {
        this.min = min;
    }

    public String getSymbol ()
    {
        return symbol;
    }

    public void setSymbol (String symbol)
    {
        this.symbol = symbol;
    }

    public String getLast ()
    {
        return last;
    }

    public void setLast (String last)
    {
        this.last = last;
    }

    public String getSell ()
    {
        return sell;
    }

    public void setSell (String sell)
    {
        this.sell = sell;
    }

    public String getBuy ()
    {
        return buy;
    }

    public void setBuy (String buy)
    {
        this.buy = buy;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [15m = "+min+", symbol = "+symbol+", last = "+last+", sell = "+sell+", buy = "+buy+"]";
    }
}
