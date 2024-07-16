package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textviewInput, textviewResult;
    private MaterialButton buttonC, buttonOpenBracket, buttonCloseBracket, buttonDivision;
    private MaterialButton button7, button8, button9, buttonMultiplication;
    private MaterialButton button4, button5, button6, buttonPlus;
    private MaterialButton button1, button2, button3, buttonMinus;
    private MaterialButton buttonAC, button0, buttonDot, buttonEqual;

    private String input = "";
    private String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewInput = findViewById(R.id.textviewInput);
        textviewResult = findViewById(R.id.textviewResult);
        buttonC = findViewById(R.id.buttonC);
        buttonOpenBracket = findViewById(R.id.buttonOpenBracket);
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
        buttonDot = findViewById(R.id.buttonDot);

        setListeners();
    }

    private void setListeners() {
        buttonC.setOnClickListener(this);
        buttonOpenBracket.setOnClickListener(this);
        buttonCloseBracket.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonMultiplication.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonAC.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        button9.setOnClickListener(this);
        button8.setOnClickListener(this);
        button7.setOnClickListener(this);
        button6.setOnClickListener(this);
        button5.setOnClickListener(this);
        button4.setOnClickListener(this);
        button3.setOnClickListener(this);
        button2.setOnClickListener(this);
        button1.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) v;
        String buttonText = button.getText().toString();

        switch (buttonText) {
            case "AC":
                input = "";
                result = "";
                break;
            case "=":
                result = evaluate(input);
                break;
            case "C":
                if (input.length() > 0) {
                    input = input.substring(0, input.length() - 1);
                }
                break;
            default:
                input += buttonText;
        }

        textviewInput.setText(input);
        textviewResult.setText(result);
    }

    private String evaluate(String input) {
        try {
            Expression expression = new ExpressionBuilder(input).build();
            double result = expression.evaluate();
            return String.valueOf(result);
        } catch (Exception e) {
            return "Error";
        }
    }
}
