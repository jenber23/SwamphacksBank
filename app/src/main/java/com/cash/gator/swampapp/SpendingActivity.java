package com.cash.gator.swampapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SpendingActivity extends AppCompatActivity {

    int amountSpent = 0;
    EditText moneySpent;
    Button Spend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spending);

        moneySpent = (EditText) findViewById(R.id.amtSpent);
        Spend = (Button) findViewById(R.id.SpendButton);
        Spend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                amountSpent = Integer.valueOf(moneySpent.getText().toString());

                Toast.makeText(getBaseContext(), "This is the amount inputted:" + amountSpent,
                        Toast.LENGTH_SHORT).show();
                openActivity();
            }

        });
    }
    public void openActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("Spended",moneySpent.getText().toString());

        intent.putExtra("Spent", bundle);
        //intent.putExtra("Spent", moneySpent.getText().toString());
        startActivity(intent);
    }
}
