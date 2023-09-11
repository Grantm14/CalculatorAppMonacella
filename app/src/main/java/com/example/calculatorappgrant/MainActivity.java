package com.example.calculatorappgrant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String userInput1;
    String operation;
    String userInput2;
    String appState;
    String appHistory;
    TextView current ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        current = (TextView)findViewById(R.id.textView_current);
        userInput1 = "";
        operation = "";
        userInput2 = "";
        appState = "first";
        appHistory = "";
    }

    public void setUserInput(View v){
        while(appState.equals("first")) {

            if (v.getId() == R.id.button1) {
                userInput1 += "1";
                updateView();
                v = null;
            }
            if (v.getId() == R.id.button2) {
                userInput1 += "2";
                updateView();
                v = null;
            }
            if (v.getId() == R.id.button3) {
                userInput1 += "3";
                updateView();
            }
            if (v.getId() == R.id.button4) {
                userInput1 += "4";
                updateView();
            }
            if (v.getId() == R.id.button5) {
                userInput1 += "5";
                updateView();
            }
            if (v.getId() == R.id.button6) {
                userInput1 += "6";
                updateView();
            }
            if (v.getId() == R.id.button7) {
                userInput1 += "7";
                updateView();
            }
            if (v.getId() == R.id.button8) {
                userInput1 += "8";
                updateView();
            }
            if (v.getId() == R.id.button9) {
                userInput1 += "9";
                updateView();
            }
            if (v.getId() == R.id.button0) {
                userInput1 += "0";
                updateView();
            }
            if (v.getId() == R.id.button_Addition) {
                operation = "+";
                appState = "second";
                updateView();
            }
            if (v.getId() == R.id.button_Division) {
                operation = "÷";
                appState = "second";
                updateView();
            }
            if (v.getId() == R.id.button_Multiplication) {
                operation = "x";
                appState = "second";
                updateView();
            }
            if (v.getId() == R.id.button_Subtraction) {
                operation = "-";
                appState = "second";
                updateView();
            }
        }
        while(appState.equals("second")) {
            if (v.getId() == R.id.button1) {
                userInput1 += "1";
                updateView();
            }
            if (v.getId() == R.id.button2) {
                userInput1 += "2";
                updateView();
            }
            if (v.getId() == R.id.button3) {
                userInput1 += "3";
                updateView();
            }
            if (v.getId() == R.id.button4) {
                userInput1 += "4";
                updateView();
            }
            if (v.getId() == R.id.button5) {
                userInput1 += "5";
                updateView();
            }
            if (v.getId() == R.id.button6) {
                userInput1 += "6";
                updateView();
            }
            if (v.getId() == R.id.button7) {
                userInput1 += "7";
                updateView();
            }
            if (v.getId() == R.id.button8) {
                userInput1 += "8";
                updateView();
            }
            if (v.getId() == R.id.button9) {
                userInput1 += "9";
                updateView();
            }
            if (v.getId() == R.id.button0) {
                userInput1 += "0";
                updateView();
            }
            if(v.getId() == R.id.button_Solve){
                appState = "solved";
                solveEquation();
            }
        }

    }

    public void updateView(){
       String S = userInput1 + operation + userInput2;
        current.setText(S);
    }
    public void solveEquation(){
        //set history
    }


}