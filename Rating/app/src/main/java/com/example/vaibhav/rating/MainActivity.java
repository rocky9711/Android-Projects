package com.example.vaibhav.rating;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    RatingBar rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bt1 = (Button) findViewById(R.id.button1);
        rb1= (RatingBar) findViewById(R.id.ratingBar1);

    }
public void rating(View v)
{
    String rating =String.valueOf(rb1.getRating());
    Toast.makeText(this,rating,Toast.LENGTH_LONG).show();

}

}
