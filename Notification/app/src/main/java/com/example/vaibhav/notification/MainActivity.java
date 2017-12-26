package com.example.vaibhav.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Notify", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                PendingIntent pint = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
                Notification noti = new Notification.Builder(MainActivity.this)
                        .setTicker("Ticker title")
                        .setContentTitle("Content Title")
                        .setContentText("this is a test notification")
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentIntent(pint).getNotification();


                noti.flags = Notification.FLAG_AUTO_CANCEL;
                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nm.notify(0, noti);


            }
        });
    }


    }



