package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnClear,btnMod,btnCancel,btnDiv,btnMult,btnSub,
    btnDot,btnAdd,btnZeros,btnZero,btnEqual;
TextView textinput;
Float n1,n2;
boolean add,mul,sub,div,mod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            textinput = findViewById(R.id.textinput);
            btn1 = findViewById(R.id.btn1);
            btn2 = findViewById(R.id.btn2);
            btn3 = findViewById(R.id.btn3);
            btn4 = findViewById(R.id.btn4);
            btn5 = findViewById(R.id.btn5);
            btn6 = findViewById(R.id.btn6);
            btn7 = findViewById(R.id.btn7);
            btn8 = findViewById(R.id.btn8);
            btn9 = findViewById(R.id.btn9);
            btnClear=findViewById(R.id.btnClear);
            btnDot=findViewById(R.id.btnDot);
            btnZero = findViewById(R.id.btnZero);
            btnZeros = findViewById(R.id.btnZeros);
            btnAdd=findViewById(R.id.btnAdd);
            btnMult=findViewById(R.id.btnMult);
            btnSub=findViewById(R.id.btnSub);
             btnDiv=findViewById(R.id.btnDiv);
            btnMod=findViewById(R.id.btnMod);
            btnEqual=findViewById(R.id.btnEqual);
            btnCancel=findViewById(R.id.btnCancel);
            btn1.setOnClickListener(new btn1ClickListener());
        btn2.setOnClickListener(new btn2ClickListener());
        btn3.setOnClickListener(new btn3ClickListener());
        btnZero.setOnClickListener(new btnZeroClickListener());
        btnZeros.setOnClickListener(new btnZerosClickListener());
        btn4.setOnClickListener(new btn4ClickListener());
        btn5.setOnClickListener(new btn5ClickListener());
        btn6.setOnClickListener(new btn6ClickListener());
        btn7.setOnClickListener(new btn7ClickListener());
        btn8.setOnClickListener(new btn8ClickListener());
        btn9.setOnClickListener(new btn9ClickListener());
        btnAdd.setOnClickListener(new btnAddClickListener());
        btnEqual.setOnClickListener(new btnEqualClickListener());
        btnMult.setOnClickListener(new btnMultClickListener());
        btnDiv.setOnClickListener(new btnDivClickListener());
        btnMod.setOnClickListener(new btnModClickListener());
        btnClear.setOnClickListener(new btnClearClickListener());
        btnDot.setOnClickListener(new btnDotClickListener());
btnSub.setOnClickListener(new btnSubClickListener());

btnCancel.setOnClickListener(new btnCancelClickListener());
    }


    private class btn1ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"1");
        }
    }
    private class btn2ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"2");
        }
    }
    private class btn3ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"3");
        }
    }
    private class btn4ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"4");
        }
    }
    private class btn5ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"5");
        }
    }
    private class btn6ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"6");
        }
    }
    private class btn7ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"7");
        }
    }
    private class btn8ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"8");
        }
    }
    private class btn9ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"9");
        }
    }
    private class btnZeroClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"0");
        }
    }
    private class btnZerosClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+"00");
        }
    }
    private class btnDotClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v)
        {
            textinput.setText(textinput.getText()+".");
        }
    }


    private class btnAddClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (textinput == null) {
                textinput.setText("");
            } else {
                n1 = Float.parseFloat(textinput.getText().toString());
                add = true;
                textinput.setText(null);//if we dont set it as null it will take next number as string after pressing +
            }
        }
    }

    private class btnSubClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            n1 = Float.parseFloat(textinput.getText() + "");
            sub = true;
            textinput.setText(null);
        }
    }

    private class btnMultClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            n1 = Float.parseFloat(textinput.getText() + "");
            mul = true;
            textinput.setText(null);
        }
    }

    private class btnModClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            n1 = Float.parseFloat(textinput.getText() + "");
            div = true;
            textinput.setText(null);
        }

    }
    private class btnCancelClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
           n1 = Float.parseFloat(textinput.getText() + "");

            Float num;
            num=n1/10;
            textinput.setText(num+"");

        }

    }


    private class btnDivClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            n1 = Float.parseFloat(textinput.getText() + "");
            div = true;
            textinput.setText(null);
        }

    }


    private class btnEqualClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            n2 = Float.parseFloat(textinput.getText() + "");

            if (add == true) {
                textinput.setText(n1 + n2 + "");
                add = false;
            }
            if (sub == true) {
                textinput.setText(n1 - n2 + "");
                sub = false;
            }
            if (mul == true) {
                textinput.setText(n1 * n2 + "");
                mul = false;
            }
            if (div == true) {
                textinput.setText(n1 / n2 + "");
                div = false;
            }
            if (mod == true) {
                textinput.setText(n1 % n2 + "");
                mod = false;
            }
        }
    }

    private class btnClearClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textinput.setText("");
        }
    }
}
