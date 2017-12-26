package com.example.vaibhav.chronometer;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt1,bt2;
    Chronometer ch1;
    long time=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        bt1= (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);

         ch1 = (Chronometer) findViewById(R.id.chronometer1);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);


    }





    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button1:
                ch1.setBase(SystemClock.elapsedRealtime() + time);
                ch1.start();
                break;

            case R.id.button2:
                time=ch1.getBase()-SystemClock.elapsedRealtime();
                ch1.stop();
                break;



        }

    }
}
