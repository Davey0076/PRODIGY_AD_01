package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    //declaration of elements in the calculator

    private TextView textviewInput, textviewResult;
    private MaterialButton buttonC, buttonOPenBracket, buttonCloseBracket, buttonDivision, button7, button8, button9, buttonMultiplication;
    private MaterialButton button4, button5, button6, buttonPlus, button1, button2, button3, buttonMinus, buttonAC, button0, buttonDot, buttonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialization
        textviewInput = findViewById(R.id.textviewInput);
        textviewResult = findViewById(R.id.textviewResult);
        buttonC = findViewById(R.id.buttonC);
        buttonOPenBracket = findViewById(R.id.buttonOpenBracket);
        buttonCloseBracket = findViewById(R.id.buttonCloseBracket);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonAC = findViewById(R.id.buttonAC);
        buttonEqual = findViewById(R.id.buttonEqual);
        button9 = findViewById(R.id.button9);
        button8 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button7);
        button6 = findViewById(R.id.button6);
        button5 = findViewById(R.id.button5);
        button4 = findViewById(R.id.button4);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button1 = findViewById(R.id.button1);
        button0 = findViewById(R.id.button0);


    }
}