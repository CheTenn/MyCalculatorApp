package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Please enter a number in each box");
        } else {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 + num2;

            if(sum > Integer.MAX_VALUE){
                makeToast("Answer is too large!");
            } else {
                numberSumTV.setText("" + sum);
            } ;
        }
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Please enter a number in each box");
        } else {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double difference = num1 - num2;

            if(difference > Integer.MAX_VALUE){
                makeToast("Answer is too large!");
            } else {
                numberSumTV.setText("" + difference);
            };
        }
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Please enter a number in each box");
        } else {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double product = num1 * num2;

            if(product > Integer.MAX_VALUE){
                makeToast("Answer is too large!");
            } else {
                numberSumTV.setText("" + product);
            }
        }
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Please enter a number in each box");
        } else if (Double.parseDouble(number2ET.getText().toString()) == 0) {
            numberSumTV.setText("Undefined");
        } else {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double quotient = num1 / num2;

            if(quotient > Integer.MAX_VALUE){
                makeToast("Answer is too large!");
            } else {
                numberSumTV.setText("" + quotient);
            };
        }
    }

    public void findPower(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        if(number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Please enter a number in each box");
        } else {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double power = Math.pow(num1, num2);

            if(power > Integer.MAX_VALUE){
                makeToast("Answer is too large!");
            } else {
                numberSumTV.setText("" + power);
            }
        }
    }

    public void clear(View view){
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);

        number1ET.setText("");
        number2ET.setText("");
    }

    public void useAnswer(View view){
        EditText number1ET = findViewById(R.id.firstNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        if(numberSumTV.getText().toString().equals("")){
            makeToast("Perform a calculation to use an answer");
        } else {
            number1ET.setText(numberSumTV.getText().toString());
        }
    }

    public void makeToast(String str){
        Toast toast = Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT);
        toast.show();
    }

}