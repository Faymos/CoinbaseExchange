package com.example.android.coinbaseexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class BtcToCurrencyActivity extends AppCompatActivity {
    private TextView coinTitle;
    private TextView coinsub;
    private TextView coinOutputName;
    private TextView coinOutputRate;
    private EditText editText;
    private String nameOfCurrency;
    private Double rateOfCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_btc_to_currency);

        coinTitle = (TextView) findViewById(R.id.cointitle);
        coinsub = (TextView) findViewById(R.id.coinrate);
        coinOutputName = (TextView) findViewById(R.id.coin_name_output);
        coinOutputRate = (TextView) findViewById(R.id.coin_rate_output);
        editText = (EditText) findViewById(R.id.coin_input);


        Intent myIntent = getIntent();
        nameOfCurrency = myIntent.getStringExtra("name_of_currency");
        rateOfCurrency = myIntent.getDoubleExtra("rate_of_currency", 0);

        coinTitle.setText("BTC to " + nameOfCurrency.toUpperCase());
        coinsub.setText("1 BTC:" + rateOfCurrency);
        coinOutputName.setText(nameOfCurrency.toUpperCase() + ": ");


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (editText.getText().toString().isEmpty()) {
                    coinOutputRate.setText("noting to convert ");
                }

                coincalculate();


            }

            @Override
            public void afterTextChanged(Editable editable) {
//                if (TextUtils.isEmpty(editable.toString().trim())) {
//
//                } else {
//
//                }
            }


        });
    }

    public void coincalculate(){
        if(editText.getText().toString().length() == 0) {
            return;
        }
        double coinInput;
        coinInput = Double.parseDouble(editText.getText().toString());
        double coinOutput = coinInput * rateOfCurrency;
        java.text.DecimalFormat coinDecimalFormat = new java.text.DecimalFormat("#,###,###");
        coinOutputRate.setText(coinDecimalFormat.format(coinOutput));

    }
}