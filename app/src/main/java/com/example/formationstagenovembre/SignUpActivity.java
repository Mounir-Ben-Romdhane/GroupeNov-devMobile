package com.example.formationstagenovembre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    private EditText firstNumber, secondNumber;
    private Button btnSomme;
    private TextView result;
    private String firstNumberValue, secondNumberValue, resString;
    private int value1, value2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firstNumber = findViewById(R.id.first_number);
        secondNumber = findViewById(R.id.second_number);
        btnSomme = findViewById(R.id.btn_somme);
        result = findViewById(R.id.result);

        btnSomme.setOnClickListener(v -> {
            firstNumberValue = firstNumber.getText().toString();
            secondNumberValue = secondNumber.getText().toString();
            value1 = Integer.parseInt(firstNumberValue); // exemple "10" ==> 10
            value2 = Integer.parseInt(secondNumberValue);
            res = value1 + value2;
            resString = Integer.toString(res);
            result.setText("Res: " + resString);
        });

    }
}