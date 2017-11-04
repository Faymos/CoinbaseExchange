package com.example.android.coinbaseexchange.ApiService;

import com.example.android.coinbaseexchange.ConversionBTC;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by faymos on 11/4/2017.
 */


public interface BtcApiService {

    @GET("data/price?")
    Call<ConversionBTC> loadETHExchange(@Query("fsym") String coins, @Query("tsyms") String currency);
}