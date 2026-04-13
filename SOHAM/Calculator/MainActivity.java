package com.example.arithmeticapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editNum1);
        num2 = findViewById(R.id.editNum2);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);
        result = findViewById(R.id.txtResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    result.setText("Please enter both numbers");
                } else {
                    int a = Integer.parseInt(s1);
                    int b = Integer.parseInt(s2);
                    result.setText("Result: " + (a + b));
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    result.setText("Please enter both numbers");
                } else {
                    int a = Integer.parseInt(s1);
                    int b = Integer.parseInt(s2);
                    result.setText("Result: " + (a - b));
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    result.setText("Please enter both numbers");
                } else {
                    int a = Integer.parseInt(s1);
                    int b = Integer.parseInt(s2);
                    result.setText("Result: " + (a * b));

                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    result.setText("Please enter both numbers");
                } else {
                    int a = Integer.parseInt(s1);
                    int b = Integer.parseInt(s2);

                    if (b == 0) {
                        result.setText("Cannot divide by zero");
                    } else {
                        result.setText("Result: " + (a / b));
                    }
                }
            }
        });
    }
}