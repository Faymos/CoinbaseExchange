package com.example.android.coinbaseexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.android.coinbaseexchange.Adapter.AdapterBTC;
import com.example.android.coinbaseexchange.ApiService.BtcApiService;
import com.example.android.coinbaseexchange.ApiService.BtcItem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityBTC extends AppCompatActivity implements Callback<ConversionBTC>, BtcItem{

    private ListView currencyList;
    private ProgressBar progressBar;
    String fsym = "BTC";
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
        setContentView(R.layout.activity_btc);

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

        BtcApiService service = retrofit.create(BtcApiService.class);
        Call<ConversionBTC> call = service.loadETHExchange(fsym,tsyms);
        call.enqueue(this);
    }


    @Override
    public void onBTCCurrencyItemClick(ModelBTC btcCoinModel) {
        Intent myIntent = new Intent(this, BtcToCurrencyActivity.class);
        myIntent.putExtra("name_of_currency", btcCoinModel.getName());
        myIntent.putExtra("rate_of_currency", btcCoinModel.getRate());
        startActivity(myIntent);
    }

    @Override
    public void onResponse(Call<ConversionBTC> call, Response<ConversionBTC> response) {
        progressBar.setVisibility(View.INVISIBLE);
        ConversionBTC btcCoinConversion = response.body();
        currencyList.setAdapter(new AdapterBTC(this, btcCoinConversion.getCoinModelList(), this));

    }

    @Override
    public void onFailure(Call<ConversionBTC> call, Throwable t) {

    }
}