package com.cash.gator.swampapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

//balanceOuput, type int/number
    //submitButton, type Button

    //java code
    int balance;

    //ties to XML
    EditText balanceOutput_;
    Button submitButton_;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //following 2 lines are must-have hard coded
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //actual edited code//

        //type editText
        balanceOutput_ = (EditText) findViewById(R.id.balanceOutput);

        submitButton_ = (Button) findViewById(R.id.submitButton);

            submitButton_.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    balance = Integer.valueOf(balanceOutput_.getText().toString());

                    Toast.makeText(getBaseContext(), "This is the balance inputted:" + balance,
                            Toast.LENGTH_SHORT).show();


                    openActivity();
                }

            });

        //intent bundle send over to next activity


    }

    public void openActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("Balance", balanceOutput_.getText().toString());
        startActivity(intent);
    }

}

