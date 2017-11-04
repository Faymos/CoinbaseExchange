package com.example.android.coinbaseexchange.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.coinbaseexchange.ApiService.EthItem;
import com.example.android.coinbaseexchange.ModelETH;
import com.example.android.coinbaseexchange.R;

import java.util.List;


public class AdapterETH extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<ModelETH> ethCoinModels;
    private EthItem ethCoinItem;

    public AdapterETH(Context context, List<ModelETH> ethCoinModels, EthItem ethCoinItem) {
        this.context = context;
        this.ethCoinModels = ethCoinModels;
        this.ethCoinItem = ethCoinItem;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return ethCoinModels.size();
    }

    @Override
    public Object getItem(int position) {
        return ethCoinModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View ethCurrencyItemView = layoutInflater.inflate(R.layout.currency_item, null);
        TextView currencyName = (TextView) ethCurrencyItemView.findViewById(R.id.name_of_currency);
        TextView currencyAmount = (TextView) ethCurrencyItemView.findViewById(R.id.amount_of_currency);
        TextView countryName = (TextView) ethCurrencyItemView.findViewById(R.id.countrytextview);
        ImageView countryflag = (ImageView) ethCurrencyItemView.findViewById(R.id.countryflag);

        final ModelETH ethCoinModel = ethCoinModels.get(position);
        currencyName.setText(ethCoinModel.getName());
        currencyAmount.setText(Double.toString(ethCoinModel.getRate()));
        countryName.setText(ethCoinModel.getCountryNames());
        countryflag.setImageResource(ethCoinModel.getImageview());

        ethCurrencyItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ethCoinItem.onETHCurrencyItemClick(ethCoinModel);
            }
        });
        return ethCurrencyItemView;
    }
}
