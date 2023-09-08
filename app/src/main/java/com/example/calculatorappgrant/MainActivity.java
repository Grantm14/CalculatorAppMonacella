package com.example.calculatorappgrant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String userInput1;
    String Operation;
    String userInput2;
    String appState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput1 = "";
        Operation = "";
        userInput2 = "";
        appState = "first";
    }

    public void setUserInput(View v){
        while(appState.equals("first")) {
            if (v.getId() == R.id.button1) {
                userInput1 += "1";
                updateView();
            }
            if (v.getId() == R.id.button2) {
                userInput1 += "2";
            }
            if (v.getId() == R.id.button3) {
                userInput1 += "3";
            }
            if (v.getId() == R.id.button4) {
                userInput1 += "4";
            }
            if (v.getId() == R.id.button5) {
                userInput1 += "5";
            }
            if (v.getId() == R.id.button6) {
                userInput1 += "6";
            }
            if (v.getId() == R.id.button7) {
                userInput1 += "7";
            }
            if (v.getId() == R.id.button8) {
                userInput1 += "8";
            }
            if (v.getId() == R.id.button9) {
                userInput1 += "9";
            }
            if (v.getId() == R.id.button0) {
                userInput1 += "0";
            }
            if (v.getId() == R.id.button_Addition) {

            }
            if (v.getId() == R.id.button_Division) {

            }
            if (v.getId() == R.id.button_Multiplication) {

            }
            if (v.getId() == R.id.button_Subtraction) {

            }

        }

    }

    public void updateView(View v){

    }
}