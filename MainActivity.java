package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button equals =  findViewById(R.id.equals);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText =  findViewById(R.id.firstNumEditText);
                EditText operation =  findViewById(R.id.operation);
                EditText secondNumEditText =  findViewById(R.id.secondNumEditText);


                TextView resultTextView = findViewById(R.id.resultTextView);

                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                String op = operation.getText().toString();
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result=0;
                switch (op) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    case "%":
                        result = num1 % num2;
                        break;
                }
                resultTextView.setText(result+"");
            }
        });
    }
}
