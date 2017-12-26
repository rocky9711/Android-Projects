package com.example.vaibhav.toggle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton toggleButton1,toggleButton2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    toggleButton1= (ToggleButton) findViewById(R.id.tb1);
        toggleButton2= (ToggleButton) findViewById(R.id.tb2);
        button1= (Button) findViewById(R.id.button1);
    }

    public void a(View v){
        StringBuilder result = new StringBuilder();
        result.append("toggle button 1:").append(toggleButton1.getText());

        result.append("\ntoggle button 2:").append(toggleButton2.getText());

        Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();



    }
}
