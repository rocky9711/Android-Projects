package com.example.vaibhav.tabview;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    TabHost tb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tb1= (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec tab1=tb1.newTabSpec("Home");
        TabHost.TabSpec tab2=tb1.newTabSpec("About Us");
        //tab1.setIndicator("One");
        tab1.setIndicator("Home",getResources().getDrawable(R.mipmap.ic_launcher));
        tab1.setContent(new Intent(this, One.class));
        //tab2.setIndicator("Two");
        tab2.setIndicator("", getResources().getDrawable(R.mipmap.ic_launcher));
        tab2.setContent(new Intent(this,Two.class));
        tb1.addTab(tab1);
        tb1.addTab(tab2);


    }



}
