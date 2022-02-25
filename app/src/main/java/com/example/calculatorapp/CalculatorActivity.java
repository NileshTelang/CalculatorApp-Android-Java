package com.example.calculatorapp;

public class CalculatorActivity {

    public static int addition(int val1,int val2){
        int val = val1 + val2;
        return val;
    }

    public static int subtraction(int val1,int val2){
        int val = val1 - val2;
        return val;
    }

    public static int multiplication(int val1,int val2){
        int val = val1 * val2;
        return val;
    }

    public static int division(int val1,int val2){
        int val = val1 / val2;
        return val;
    }

    public static int power(int val1,int val2){
        int val=val1;
        for(int i=1;i<val2;i++){

            int a =val*val1 ;
            val1 = a;


        }
        return val1;
    }

    public static int mod(int val1,int val2){
        int val = val1 % val2;
        return val;
    }

}
