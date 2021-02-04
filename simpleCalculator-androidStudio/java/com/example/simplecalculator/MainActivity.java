package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3,b4;
    TextView rs;
    EditText n1,n2;

    float result;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =findViewById(R.id.btnPlus);
        b2 =findViewById(R.id.btnMin);
        b3 =findViewById(R.id.btnMulty);
        b4 =findViewById(R.id.btnDiv);

        rs = findViewById(R.id.result);

        n1 =findViewById(R.id.number1);
        n2=findViewById(R.id.number2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result = num1+num2;

                rs.setText(String.valueOf(result));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result = num1-num2;

                rs.setText(String.valueOf(result));

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result = num1*num2;

                rs.setText(String.valueOf(result));

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());

                result = num1/num2;

                rs.setText(String.valueOf(result));

            }
        });

    }
}