package com.example.vaibhav.twod;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));


    }

   public class MyView extends View{


       public MyView(Context context) {
           super(context);
       }
       protected void  onDraw(Canvas canvas)
       {
           super.onDraw(canvas);
           int y=getHeight();
           int x=getWidth();
           int radius;
           radius=100;
           Paint paint=new Paint();
           paint.setStyle(Paint.Style.FILL);
           paint.setColor(Color.WHITE);
           canvas.drawPaint(paint);
           paint.setColor(Color.parseColor("#2D5C5c"));
           canvas.drawCircle(x/2,y/2,radius,paint);
       }
   }
}
