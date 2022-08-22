package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double difference = num1 - num2;

        numberSumTV.setText("" + difference) ;
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double product = num1 * num2;

        numberSumTV.setText("" + product) ;
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double quotient = num1 / num2;

        numberSumTV.setText("" + quotient) ;
    }

}