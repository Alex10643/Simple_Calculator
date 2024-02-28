package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumberDecimal;

    private EditText editTextNumberDecimal2;
    private TextView textView;

    private Button button;

    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        editTextNumberDecimal2 = findViewById(R.id.editTextNumberDecimal2);
        textView = findViewById(R.id.textView);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (null = 0) {
//
//                }
                String inputStr1 = editTextNumberDecimal.getText().toString();
                int input1 = Integer.parseInt(inputStr1);
                String inputStr2 = editTextNumberDecimal2.getText().toString();
                int input2 = Integer.parseInt(inputStr2);
                int outputInt1 = input1 + input2 ;
                String output1 = Integer.toString(outputInt1);
                textView.setText(output1);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputStr1 = editTextNumberDecimal.getText().toString();
                int input1 = Integer.parseInt(inputStr1);
                String inputStr2 = editTextNumberDecimal2.getText().toString();
                int input2 = Integer.parseInt(inputStr2);
                int outputInt1 = input1 - input2 ;
                String output1 = Integer.toString(outputInt1);
                textView.setText(output1);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputStr1 = editTextNumberDecimal.getText().toString();
                int input1 = Integer.parseInt(inputStr1);
                String inputStr2 = editTextNumberDecimal2.getText().toString();
                int input2 = Integer.parseInt(inputStr2);
                int outputInt1 = input1 * input2 ;
                String output1 = Integer.toString(outputInt1);
                textView.setText(output1);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputStr1 = editTextNumberDecimal.getText().toString();
                int input1 = Integer.parseInt(inputStr1);
                String inputStr2 = editTextNumberDecimal2.getText().toString();
                int input2 = Integer.parseInt(inputStr2);
                int outputInt1 = input1 / input2 ;
                String output1 = Integer.toString(outputInt1);
                textView.setText(output1);

            }
        });

    }
}