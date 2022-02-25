package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum ;
    private EditText secondNum ;
    private Button add;
    private Button sub;
    private Button multi;
    private Button div;
    private Button pow;
    private Button mod;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.editTextTextPersonName);
        secondNum = findViewById(R.id.editTextTextPersonName2);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        multi = findViewById(R.id.button3);
        div = findViewById(R.id.button5);
        pow = findViewById(R.id.button6);
        mod = findViewById(R.id.button4);
        result = findViewById(R.id.textView);

    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            String r = Integer.toString(CalculatorActivity.addition(a,b));
            result.setText(r);
        }
    });

    sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            String r = Integer.toString(CalculatorActivity.subtraction(a,b));
            result.setText(r);
        }
    });

    multi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            String r = Integer.toString(CalculatorActivity.multiplication(a,b));
            result.setText(r);
        }
    });

    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            String r = Integer.toString(CalculatorActivity.division(a,b));
            result.setText(r);
        }
    });

    pow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            String r = Integer.toString(CalculatorActivity.power(a,b));
            result.setText(r);
        }
    });

    mod.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            String r = Integer.toString(CalculatorActivity.mod(a,b));
            result.setText(r);
        }
    });

    }
}
