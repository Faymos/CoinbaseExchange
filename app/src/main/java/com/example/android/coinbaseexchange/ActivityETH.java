package com.example.android.coinbaseexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.android.coinbaseexchange.Adapter.AdapterETH;
import com.example.android.coinbaseexchange.ApiService.EthCoinApiService;
import com.example.android.coinbaseexchange.ApiService.EthItem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ActivityETH extends AppCompatActivity implements Callback<ConversionETH>, EthItem {

    private ListView currencyList;
    private ProgressBar progressBar;
    String fsym = "ETH";
    String tsyms = "USD" + "," + "EUR" +
            "," + "GBP" + "," + "NGN" + "," +
            "CAD" + "," + "SGD" + "," + "CHF" + "," +
            "MYR" + "," + "JPY" + "," + "CNY" + "," +
            "BRL" + "," + "EGP" + "," + "GHS" + "," +
            "KRW" + "," + "MXN" + "," + "QAR" + "," +
            "RUB" + "," + "SAR" + "," + "ZAR" + "," + "AUD";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eth);

        currencyList = (ListView) findViewById(R.id.currency_list);
        loadETHExchangeData();
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

    }

    @Override
    protected void onStart() {
        super.onStart();
        progressBar.setVisibility(View.VISIBLE);
        loadETHExchangeData();
    }

    private void loadETHExchangeData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EthCoinApiService service = retrofit.create(EthCoinApiService.class);
        Call<ConversionETH> call = service.loadETHExchange(fsym,tsyms);
        call.enqueue(this);
    }


    @Override
    public void onETHCurrencyItemClick(ModelETH ethCoinModel) {
        Intent myIntent = new Intent(this, EthToCurrencyActivity
                .class);
        myIntent.putExtra("name_of_currency", ethCoinModel.getName());
        myIntent.putExtra("rate_of_currency", ethCoinModel.getRate());
        startActivity(myIntent);

    }

    @Override
    public void onResponse(Call<ConversionETH> call, Response<ConversionETH> response) {
        progressBar.setVisibility(View.INVISIBLE);
        ConversionETH ethCoinConversion = response.body();
        currencyList.setAdapter(new AdapterETH(this, ethCoinConversion.getCoinModelList(), this));
    }

    @Override
    public void onFailure(Call<ConversionETH> call, Throwable t) {

    }
}