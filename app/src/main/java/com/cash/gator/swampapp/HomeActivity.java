package com.cash.gator.swampapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    //total amount
    Button go2Main;
    Button go2Spending;
    TextView textDisplay;
    String value, amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textDisplay = (TextView) findViewById(R.id.textView2);

        Bundle bundle = getIntent().getBundleExtra("Balance");
        Bundle bundle2 = getIntent().getBundleExtra("Spent");

            if (bundle != null) {
                value = bundle.getString("Balance");
                textDisplay.setText(value);
            }
            else if(bundle2 != null){
                int temp = Integer.valueOf(value);
                amount = bundle.getString("Spent");
                int a = Integer.valueOf(amount);
                value = String.valueOf(temp - a);
                textDisplay.setText(value);
            }

            go2Main = (Button) findViewById(R.id.goMain);   //back button
            go2Spending = (Button) findViewById(R.id.spend);    //spend button

            //back button clicked
            go2Main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
            // spend button clicked
            go2Spending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity();
                }
            });
        }

        public void openActivity() {
            Intent intent = new Intent(this, SpendingActivity.class);
            startActivity(intent);
        }
}
