package com.example.vaibhav.moveimg;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    ImageView im1;
    float x,y=0.0f;
    boolean moving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        im1= (ImageView) findViewById(R.id.imageView1);
        im1.setOnTouchListener(this);



    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
         switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                moving=true;
                break;
            case MotionEvent.ACTION_MOVE:
                if (moving)
                {
                    x=event.getRawX()-im1.getWidth()/2;
                    y=event.getRawY()-im1.getHeight()*3/2;
                    im1.setX(x);
                    im1.setY(y);
                }
                break;
            case MotionEvent.ACTION_UP:
                moving=true;
                break;
        }




        return true;
    }
}
