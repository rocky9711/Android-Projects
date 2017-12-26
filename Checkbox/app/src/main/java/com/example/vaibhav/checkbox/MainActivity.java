package com.example.vaibhav.checkbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox pizza,coffee,burger;
    Button buttonOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pizza= (CheckBox) findViewById(R.id.cb1);
       coffee= (CheckBox) findViewById(R.id.cb2);
        burger= (CheckBox) findViewById(R.id.cb3);
       buttonOrder= (Button) findViewById(R.id.bt1);
    }
public void onCheck(View v){
    int totalamount=0;
    StringBuilder result=new StringBuilder();
    result.append("SElected Items:");
    if(pizza.isChecked()) {
        result.append("\n Pizza Rs100");
        totalamount+= 100;
    }
    if(coffee.isChecked()) {
        result.append("\n Coffee Rs50");
        totalamount+= 50;
    }
    if(burger.isChecked()) {
        result.append("\n Burger Rs35");
        totalamount+= 35;
    }
    result.append("\n Total:"+totalamount+"Rs");
    Toast.makeText(this,result.toString(),Toast.LENGTH_LONG).show();
    }
}


