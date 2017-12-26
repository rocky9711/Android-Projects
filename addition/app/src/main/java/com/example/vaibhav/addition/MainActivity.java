package com.example.vaibhav.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.editText1);
        et2= (EditText) findViewById(R.id.editText2);
        bt1= (Button) findViewById(R.id.button1);
        bt2= (Button) findViewById(R.id.button2);
        bt3= (Button) findViewById(R.id.button3);
        bt4= (Button) findViewById(R.id.button4);
       

    }

    public void onadd(View v){
        double num1,num2;

        num1=Double.parseDouble(et1.getText().toString());
        num2=Double.parseDouble(et2.getText().toString());

        switch(v.getId())
        {

            case R.id.button1 :
            {
                   double sum =num1+num2;
                Toast.makeText(this,"sum is "+sum,Toast.LENGTH_LONG).show();
                break;


            }
            case R.id.button2 :
            {
                double sum =num1-num2;
                Toast.makeText(this,"subtraction is "+sum,Toast.LENGTH_LONG).show();



                break;

            }

            case R.id.button3 :
            {

                   double sum =num1*num2;
                Toast.makeText(this,"multiplication is "+sum,Toast.LENGTH_LONG).show();
                break;

                }
            case R.id.button4 :
            {

                   double sum =num1/num2;
                Toast.makeText(this,"Division is "+sum,Toast.LENGTH_LONG).show();
                break;

                }

        }


    }

}
