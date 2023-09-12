package com.example.calculatorappgrant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String userInput1;
    String operation;
    String userInput2;
    String appState;
    String appHistory;
    TextView current ;
    TextView history;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        current = (TextView)findViewById(R.id.textView_current);
        history = (TextView)findViewById(R.id.textView_History);
        userInput1 = "";
        operation = "";
        userInput2 = "";
        appState = "first";
        appHistory = "";
    }

    public void button1(View v){
        if(appState.equals("first")){
            userInput1+="1";
            updateView();
        }
        else {
            userInput2+="1";
            updateView();
        }
    }
    public void button2(View v){
        if(appState.equals("first")){
            userInput1+="2";
            updateView();
        }
        else {
            userInput2+="2";
            updateView();
        }
    }
    public void button3(View v){
        if(appState.equals("first")){
            userInput1+="3";
            updateView();
        }
        else {
            userInput2+="3";
            updateView();
        }
    }
    public void button4(View v){
        if(appState.equals("first")){
            userInput1+="4";
            updateView();
        }
        else {
            userInput2+="4";
            updateView();
        }
    }
    public void button5(View v){
        if(appState.equals("first")){
            userInput1+="5";
            updateView();
        }
        else {
            userInput2+="5";
            updateView();
        }
    }
    public void button6(View v){
        if(appState.equals("first")){
            userInput1+="6";
            updateView();
        }
        else {
            userInput2+="6";
            updateView();
        }
    }
    public void button7(View v){
        if(appState.equals("first")){
            userInput1+="7";
            updateView();
        }
        else {
            userInput2+="7";
            updateView();
        }
    }
    public void button8(View v){
        if(appState.equals("first")){
            userInput1+="8";
            updateView();
        }
        else {
            userInput2+="8";
            updateView();
        }
    }
    public void button9(View v){
        if(appState.equals("first")){
            userInput1+="9";
            updateView();
        }
        else {
            userInput2+="9";
            updateView();
        }
    }
    public void button0(View v){
        if(appState.equals("first")){
            userInput1+="0";
            updateView();
        }
        else {
            userInput2+="0";
            updateView();
        }
    }
    public void buttonAdd(View v){
        if(appState.equals("first")){
            operation = "+";
            updateView();
            appState = "second";
        }
    }
    public void buttonSubtract(View v){
        if(appState.equals("first")){
            operation = "-";
            updateView();
            appState = "second";
        }
    }
    public void buttonMultiply(View v){
        if(appState.equals("first")){
            operation = "x";
            updateView();
            appState = "second";
        }
    }
    public void buttonDivide(View v){
        if(appState.equals("first")){
            operation = "÷";
            updateView();
            appState = "second";
        }
    }
    public void buttonSolve(View v){
        if(appState.equals("second")){
            solveEquation();
        }
    }
    public void buttonReset(View v){
        userInput1 = "";
        operation = "";
        userInput2 = "";
        appState = "first";
        updateView();
    }



    public void updateView(){
       String S = userInput1 + operation + userInput2;
        current.setText(S);
    }
    public void solveEquation(){
        double solution= 0;
        if(operation.equals("+")){
            solution = (double)Integer.parseInt(userInput1) + Integer.parseInt(userInput2);
        }
        else if(operation.equals("-")){
            solution = (double)Integer.parseInt(userInput1) - Integer.parseInt(userInput2);
        }
        else if(operation.equals("x")){
            solution = (double)Integer.parseInt(userInput1) * Integer.parseInt(userInput2);
        }
        else if(operation.equals("÷")){
            solution = (double)Integer.parseInt(userInput1) / Integer.parseInt(userInput2);
        }
        String S = userInput1 + operation + userInput2 + "="+ String.valueOf(Math.round(solution*100)/100);
        current.setText(S);
        appHistory+=S + "\n";
        history.setText(appHistory);
    }


}