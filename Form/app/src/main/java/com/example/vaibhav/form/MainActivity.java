package com.example.vaibhav.form;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    RadioButton rb1,rb2;
    RadioGroup rg1;
    Button bt1;
    Spinner spin1;
    String[] country={"India","USA","France","australia"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        spin1= (Spinner) findViewById(R.id.spinner1);
        spin1.setOnItemSelectedListener(this);

        et1= (EditText) findViewById(R.id.editText1);
        et2= (EditText) findViewById(R.id.editText2);
        bt1= (Button) findViewById(R.id.button1);

        rg1= (RadioGroup) findViewById(R.id.radioGroup);

        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spin1.setAdapter(aa);

    }
public void show(View v)
{

    StringBuilder result= new StringBuilder();
    int selectedid=rg1.getCheckedRadioButtonId();
    rb1= (RadioButton) findViewById(selectedid);
    result.append("Name is: ").append(et1.getText());
    result.append("Email: ").append(et2.getText());
    result.append("\nGender: ").append(rb1.getText());
    Toast.makeText(this,result.toString(),Toast.LENGTH_LONG).show();

}

}
