package com.example.android.coinbaseexchange.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.coinbaseexchange.ApiService.BtcItem;
import com.example.android.coinbaseexchange.ModelBTC;
import com.example.android.coinbaseexchange.R;

import java.util.List;



public class AdapterBTC extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<ModelBTC> btcCoinModels;
    private BtcItem btcCoinItem;

    public AdapterBTC(Context context, List<ModelBTC> btcCoinModels, BtcItem btcCoinItem) {
        this.context = context;
        this.btcCoinModels = btcCoinModels;
        this.btcCoinItem = btcCoinItem;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return btcCoinModels.size();
    }

    @Override
    public Object getItem(int position) {
        return btcCoinModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View btcCurrencyItemView = layoutInflater.inflate(R.layout.currency_item, null);
        TextView currencyName = (TextView) btcCurrencyItemView.findViewById(R.id.name_of_currency);
        TextView currencyAmount = (TextView) btcCurrencyItemView.findViewById(R.id.amount_of_currency);
        TextView countryName = (TextView) btcCurrencyItemView.findViewById(R.id.countrytextview);
        ImageView countryflag = (ImageView) btcCurrencyItemView.findViewById(R.id.countryflag);

        final ModelBTC btcCoinModel = btcCoinModels.get(position);
        currencyName.setText(btcCoinModel.getName());
        currencyAmount.setText(Double.toString(btcCoinModel.getRate()));
        countryName.setText(btcCoinModel.getCountryNames());
        countryflag.setImageResource(btcCoinModel.getImageview());

        btcCurrencyItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btcCoinItem.onBTCCurrencyItemClick(btcCoinModel);
            }
        });
        return btcCurrencyItemView;
    }

}