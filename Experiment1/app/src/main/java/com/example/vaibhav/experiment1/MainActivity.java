package com.example.vaibhav.experiment1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
SeekBar sb1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sb1= (SeekBar) findViewById(R.id.seekBar1);
        sb1.setOnSeekBarChangeListener(this);
        t1= (TextView) findViewById(R.id.textView1);




    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


        t1.setText(String.valueOf(progress));
        Paint paint =new Paint();
        paint.setColor(Color.parseColor("#CD5C5C"));
        Bitmap bt=Bitmap.createBitmap(550,800, Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bt);
        canvas.drawCircle(bt.getWidth()/2,bt.getHeight()/2,progress,paint);
        RelativeLayout rt= (RelativeLayout) findViewById(R.id.rlt);
        rt.setBackgroundDrawable(new BitmapDrawable(bt));


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
