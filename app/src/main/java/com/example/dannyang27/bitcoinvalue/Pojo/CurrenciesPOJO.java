package com.example.dannyang27.bitcoinvalue.Pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dannyang27 on 28/11/17.
 */

public class CurrenciesPOJO {

        private JPY JPY;

        private CNY CNY;

        private SGD SGD;

        private HKD HKD;

        private CAD CAD;

        private NZD NZD;

        private AUD AUD;

        private CLP CLP;

        private GBP GBP;

        private DKK DKK;

        private SEK SEK;

        private ISK ISK;

        private BRL BRL;

        private CHF CHF;

        private EUR EUR;

        private RUB RUB;

        private PLN PLN;

        private INR INR;

        private THB THB;

        private USD USD;

        private KRW KRW;

        private TWD TWD;

        public JPY getJPY ()
        {
            return JPY;
        }

        public void setJPY (JPY JPY)
        {
            this.JPY = JPY;
        }

        public CNY getCNY ()
        {
            return CNY;
        }

        public void setCNY (CNY CNY)
        {
            this.CNY = CNY;
        }

        public SGD getSGD ()
        {
            return SGD;
        }

        public void setSGD (SGD SGD)
        {
            this.SGD = SGD;
        }

        public HKD getHKD ()
        {
            return HKD;
        }

        public void setHKD (HKD HKD)
        {
            this.HKD = HKD;
        }

        public CAD getCAD ()
        {
            return CAD;
        }

        public void setCAD (CAD CAD)
        {
            this.CAD = CAD;
        }

        public NZD getNZD ()
        {
            return NZD;
        }

        public void setNZD (NZD NZD)
        {
            this.NZD = NZD;
        }

        public AUD getAUD ()
        {
            return AUD;
        }

        public void setAUD (AUD AUD)
        {
            this.AUD = AUD;
        }

        public CLP getCLP ()
        {
            return CLP;
        }

        public void setCLP (CLP CLP)
        {
            this.CLP = CLP;
        }

        public GBP getGBP ()
        {
            return GBP;
        }

        public void setGBP (GBP GBP)
        {
            this.GBP = GBP;
        }

        public DKK getDKK ()
        {
            return DKK;
        }

        public void setDKK (DKK DKK)
        {
            this.DKK = DKK;
        }

        public SEK getSEK ()
        {
            return SEK;
        }

        public void setSEK (SEK SEK)
        {
            this.SEK = SEK;
        }

        public ISK getISK ()
        {
            return ISK;
        }

        public void setISK (ISK ISK)
        {
            this.ISK = ISK;
        }

        public BRL getBRL ()
        {
            return BRL;
        }

        public void setBRL (BRL BRL)
        {
            this.BRL = BRL;
        }

        public CHF getCHF ()
        {
            return CHF;
        }

        public void setCHF (CHF CHF)
        {
            this.CHF = CHF;
        }

        public EUR getEUR ()
        {
            return EUR;
        }

        public void setEUR (EUR EUR)
        {
            this.EUR = EUR;
        }

        public RUB getRUB ()
        {
            return RUB;
        }

        public void setRUB (RUB RUB)
        {
            this.RUB = RUB;
        }

        public PLN getPLN ()
        {
            return PLN;
        }

        public void setPLN (PLN PLN)
        {
            this.PLN = PLN;
        }

        public INR getINR ()
        {
            return INR;
        }

        public void setINR (INR INR)
        {
            this.INR = INR;
        }

        public THB getTHB ()
        {
            return THB;
        }

        public void setTHB (THB THB)
        {
            this.THB = THB;
        }

        public USD getUSD ()
        {
            return USD;
        }

        public void setUSD (USD USD)
        {
            this.USD = USD;
        }

        public KRW getKRW ()
        {
            return KRW;
        }

        public void setKRW (KRW KRW)
        {
            this.KRW = KRW;
        }

        public TWD getTWD ()
        {
            return TWD;
        }

        public void setTWD (TWD TWD)
        {
            this.TWD = TWD;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [JPY = "+JPY+", CNY = "+CNY+", SGD = "+SGD+", HKD = "+HKD+", CAD = "+CAD+", NZD = "+NZD+", AUD = "+AUD+", CLP = "+CLP+", GBP = "+GBP+", DKK = "+DKK+", SEK = "+SEK+", ISK = "+ISK+", BRL = "+BRL+", CHF = "+CHF+", EUR = "+EUR+", RUB = "+RUB+", PLN = "+PLN+", INR = "+INR+", THB = "+THB+", USD = "+USD+", KRW = "+KRW+", TWD = "+TWD+"]";
        }

        public List<AbstractCurrency> getCurrencies(){
            List<AbstractCurrency> result = new ArrayList<>();
            result.add(AUD);
            result.add(BRL);
            result.add(CAD);
            result.add(CHF);
            result.add(CLP);
            result.add(CNY);
            result.add(DKK);
            result.add(EUR);
            result.add(GBP);
            result.add(HKD);
            result.add(INR);
            result.add(ISK);
            result.add(JPY);
            result.add(KRW);
            result.add(NZD);
            result.add(PLN);
            result.add(RUB);
            result.add(SEK);
            result.add(SGD);
            result.add(THB);
            result.add(TWD);
            result.add(USD);
            return result;


        }

}
