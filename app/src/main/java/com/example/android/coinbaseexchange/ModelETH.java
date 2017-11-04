package com.example.android.coinbaseexchange;



public class ModelETH {

    private String name;
    private double rate;
    private String countryNames;

    private int imageview;

    public ModelETH(String name, double rate, String countryNames, int imageview) {
        this.name = name;
        this.rate = rate;
        this.countryNames = countryNames;
        this.imageview = imageview;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public String getCountryNames() {
        return countryNames;
    }



    public int getImageview() {
        return imageview;
    }
}