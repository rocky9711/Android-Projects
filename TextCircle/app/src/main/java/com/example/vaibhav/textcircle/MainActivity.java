package com.example.vaibhav.textcircle;

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
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
    EditText et1;
    int radius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1= (Button) findViewById(R.id.button1);
        et1= (EditText) findViewById(R.id.editText1);

    }

    public void draw(View v)
    {


        radius=Integer.parseInt(et1.getText().toString());
        Paint paint =new Paint();
        paint.setColor(Color.parseColor("#CD5C5C"));
        Bitmap bt=Bitmap.createBitmap(550,800, Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bt);
        canvas.drawCircle(bt.getWidth()/2,bt.getHeight()/2,radius,paint);
        RelativeLayout rt= (RelativeLayout) findViewById(R.id.layout);
        rt.setBackgroundDrawable(new BitmapDrawable(bt));

    }
}
