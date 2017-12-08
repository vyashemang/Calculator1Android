package com.example.hemang.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    Button add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Welcome to calculator",Toast.LENGTH_SHORT).show();

        add = findViewById(R.id.addBtn);
        sub =  findViewById(R.id.subBtn);
        mult =  findViewById(R.id.mulBtn);
        div =  findViewById(R.id.divBtn);


        final EditText num1 = (EditText) findViewById(R.id.num1);
        final EditText num2 = (EditText) findViewById(R.id.num2);




        final TextView ans = (TextView) findViewById(R.id.ans);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final double a = parseDouble(num1.getText().toString());
                final double b = parseDouble(num2.getText().toString());
                if(num1.getText().toString() == "" || num2.getText().toString()==""){
                    Toast.makeText(getApplicationContext(),"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double c = a + b;
                    ans.setText(String.valueOf(c));
                }
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double a = parseDouble(num1.getText().toString());
                final double b = parseDouble(num2.getText().toString());
                if(num1.getText().toString() == "" || num2.getText().toString()==""){
                    Toast.makeText(getApplicationContext(),"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double c = a - b;
                    ans.setText(String.valueOf(c));
                }

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double a = parseDouble(num1.getText().toString());
                final double b = parseDouble(num2.getText().toString());
                if(num1.getText().toString() == "" || num2.getText().toString()==""){
                    Toast.makeText(getApplicationContext(),"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    double c = a * b;
                    ans.setText(String.valueOf(c));
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double a = parseDouble(num1.getText().toString());
                final double b = parseDouble(num2.getText().toString());
                if(num1.getText().toString() == "" || num2.getText().toString()==""){
                    Toast.makeText(getApplicationContext(),"Please enter the value",Toast.LENGTH_LONG).show();
                }
                else {
                    if(b!=0) {
                        double c = a / b;
                        ans.setText(String.valueOf(c));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Please enter the valid values!",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}