package com.cash.gator.swampapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    //total amount
    Button go2Main;

    MainActivity mainAct = new MainActivity();
    int currbalance = mainAct.getBalance();
    TextView textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textDisplay = (TextView) findViewById(R.id.textView2);
        textDisplay.setText(""+currbalance);

        // back button
        go2Main = (Button) findViewById(R.id.goMain);
        go2Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
