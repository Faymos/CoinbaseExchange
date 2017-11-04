package com.example.android.coinbaseexchange;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class ConversionETH {

    @SerializedName("AUD")
    private double AUD;
    @SerializedName("USD")
    private double USD;
    @SerializedName("EUR")
    private double EUR;
    @SerializedName("GBP")
    private double GBP;
    @SerializedName("NGN")
    private double NGN;
    @SerializedName("CAD")
    private double CAD;
    @SerializedName("SGD")
    private double SGD;
    @SerializedName("CHF")
    private double CHF;
    @SerializedName("MYR")
    private double MYR;
    @SerializedName("JPY")
    private double JPY;
    @SerializedName("CNY")
    private double CNY;
    @SerializedName("BRL")
    private double BRL;
    @SerializedName("EGP")
    private double EGP;
    @SerializedName("GHS")
    private double GHS;
    @SerializedName("KRW")
    private double KRW;
    @SerializedName("MXN")
    private double MXN;
    @SerializedName("QAR")
    private double QAR;
    @SerializedName("RUB")
    private double RUB;
    @SerializedName("SAR")
    private double SAR;
    @SerializedName("ZAR")
    private double ZAR;





    public List<ModelETH> getCoinModelList() {
        List<ModelETH> ethCoinModelList = new ArrayList<>();

        ethCoinModelList.add(new ModelETH("ÄUD",getAUD(),"Australia",R.drawable.australiaflag));
        ethCoinModelList.add(new ModelETH("USD", getUSD(),"United States Of America",R.drawable.usflag));
        ethCoinModelList.add(new ModelETH("EUR", getEUR(),"Europian Union",R.drawable.europeimage));
        ethCoinModelList.add(new ModelETH("GBP", getGBP(),"United Kingdom",R.drawable.ukflag));
        ethCoinModelList.add(new ModelETH("NGN", getNGN(),"Nigeria",R.drawable.nigerianflag));
        ethCoinModelList.add(new ModelETH("CAD", getCAD(),"Canada",R.drawable.canadaflag));
        ethCoinModelList.add(new ModelETH("SGD", getSGD(),"Singapore",R.drawable.singapore));
        ethCoinModelList.add(new ModelETH("CHF", getCHF(),"Switzerland",R.drawable.switzerlandflag));
        ethCoinModelList.add(new ModelETH("MYR", getMYR(),"Malasia",R.drawable.malasiaflag));
        ethCoinModelList.add(new ModelETH("JPY", getJPY(),"Japan",R.drawable.japanflag));
        ethCoinModelList.add(new ModelETH("CNY", getCNY(),"China",R.drawable.chinaflag));
        ethCoinModelList.add(new ModelETH("BRL", getBRL(),"Brazil",R.drawable.brazilflag));
        ethCoinModelList.add(new ModelETH("EGP", getEGP(),"Egypt",R.drawable.egyptflag));
        ethCoinModelList.add(new ModelETH("GHS", getGHS(),"Ghana",R.drawable.ghanaflag));
        ethCoinModelList.add(new ModelETH("KRW", getKRW(),"South Korea",R.drawable.skoreaflag));
        ethCoinModelList.add(new ModelETH("MXN", getMXN(),"Mexico",R.drawable.mexicoflage));
        ethCoinModelList.add(new ModelETH("QAR", getQAR(),"Qatar",R.drawable.qatarflag));
        ethCoinModelList.add(new ModelETH("RUB", getRUB(),"Russia",R.drawable.russia));
        ethCoinModelList.add(new ModelETH("SAR", getSAR(),"Suadi Arebia",R.drawable.suadi));
        ethCoinModelList.add(new ModelETH("ZAR", getZAR(),"South Africa",R.drawable.southafricanflag));

        return ethCoinModelList;
    }


    public double getAUD() {
        return AUD;
    }

    public void setAUD(double AUD) {
        this.AUD = AUD;
    }
    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double getNGN() {
        return NGN;
    }

    public void setNGN(double NGN) {
        this.NGN = NGN;
    }

    public double getCAD() {
        return CAD;
    }

    public void setCAD(double CAD) {
        this.CAD = CAD;
    }

    public double getSGD() {
        return SGD;
    }

    public void setSGD(double SGD) {
        this.SGD = SGD;
    }

    public double getCHF() {
        return CHF;
    }

    public void setCHF(double CHF) {
        this.CHF = CHF;
    }

    public double getMYR() {
        return MYR;
    }

    public void setMYR(double MYR) {
        this.MYR = MYR;
    }

    public double getJPY() {
        return JPY;
    }

    public void setJPY(double JPY) {
        this.JPY = JPY;
    }

    public double getCNY() {
        return CNY;
    }

    public void setCNY(double CNY) {
        this.CNY = CNY;
    }

    public double getBRL() {
        return BRL;
    }

    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public double getEGP() {
        return EGP;
    }

    public void setEGP(double EGP) {
        this.EGP = EGP;
    }

    public double getGHS() {
        return GHS;
    }

    public void setGHS(double GHS) {
        this.GHS = GHS;
    }

    public double getKRW() {
        return KRW;
    }

    public void setKRW(double KRW) {
        this.KRW = KRW;
    }

    public double getMXN() {
        return MXN;
    }

    public void setMXN(double MXN) {
        this.MXN = MXN;
    }

    public double getQAR() {
        return QAR;
    }

    public void setQAR(double QAR) {
        this.QAR = QAR;
    }

    public double getRUB() {
        return RUB;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB;
    }

    public double getSAR() {
        return SAR;
    }

    public void setSAR(double SAR) {
        this.SAR = SAR;
    }

    public double getZAR() {
        return ZAR;
    }

    public void setZAR(double ZAR) {
        this.ZAR = ZAR;
    }
}