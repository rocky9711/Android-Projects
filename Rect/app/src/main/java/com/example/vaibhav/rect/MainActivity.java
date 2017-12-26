package com.example.vaibhav.rect;

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
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Paint paint=new Paint();
        paint.setColor(Color.parseColor("#CD5C5C"));
        Bitmap bp=Bitmap.createBitmap(580,800, Bitmap.Config.ARGB_8888);
        Canvas canvas =new Canvas(bp);
        canvas.drawRect(50,50,200,200,paint);
        LinearLayout lt= (LinearLayout) findViewById(R.id.rect);
        lt.setBackgroundDrawable(new BitmapDrawable(bp));


    }


}
