package com.example.android.coinbaseexchange;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by faymos on 11/4/2017.
 */

public class ConversionBTC {




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





    public List<ModelBTC> getCoinModelList() {
        List<ModelBTC> btcCoinModelList = new ArrayList<>();
        btcCoinModelList.add(new ModelBTC("AUD",getAUD(),"Australia",R.drawable.australiaflag));
        btcCoinModelList.add(new ModelBTC("USD", getUSD(),"United States Of America",R.drawable.usflag));
        btcCoinModelList.add(new ModelBTC("EUR", getEUR(),"Europian Union",R.drawable.europeimage));
        btcCoinModelList.add(new ModelBTC("GBP", getGBP(),"United Kingdom",R.drawable.ukflag));
        btcCoinModelList.add(new ModelBTC("NGN", getNGN(),"Nigeria",R.drawable.nigerianflag));
        btcCoinModelList.add(new ModelBTC("CAD", getCAD(),"Canada",R.drawable.canadaflag));
        btcCoinModelList.add(new ModelBTC("SGD", getSGD(),"Singapore",R.drawable.singapore));
        btcCoinModelList.add(new ModelBTC("CHF", getCHF(),"Switzerland",R.drawable.switzerlandflag));
        btcCoinModelList.add(new ModelBTC("MYR", getMYR(),"Malasia",R.drawable.malasiaflag));
        btcCoinModelList.add(new ModelBTC("JPY", getJPY(),"Japan",R.drawable.japanflag));
        btcCoinModelList.add(new ModelBTC("CNY", getCNY(),"China",R.drawable.chinaflag));
        btcCoinModelList.add(new ModelBTC("BRL", getBRL(),"Brazil",R.drawable.brazilflag));
        btcCoinModelList.add(new ModelBTC("EGP", getEGP(),"Egypt",R.drawable.egyptflag));
        btcCoinModelList.add(new ModelBTC("GHS", getGHS(),"Ghana",R.drawable.ghanaflag));
        btcCoinModelList.add(new ModelBTC("KRW", getKRW(),"SouthKorea",R.drawable.skoreaflag));
        btcCoinModelList.add(new ModelBTC("MXN", getMXN(),"Mexico",R.drawable.mexicoflage));
        btcCoinModelList.add(new ModelBTC("QAR", getQAR(),"Qatar",R.drawable.qatarflag));
        btcCoinModelList.add(new ModelBTC("RUB", getRUB(),"Russia",R.drawable.russia));
        btcCoinModelList.add(new ModelBTC("SAR", getSAR(),"Suadi Arebia",R.drawable.suadi));
        btcCoinModelList.add(new ModelBTC("ZAR", getZAR(),"South Africa",R.drawable.southafricanflag));

        return btcCoinModelList;
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