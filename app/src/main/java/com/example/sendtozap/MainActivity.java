package com.example.sendtozap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutNumber;
    private TextInputLayout inputLayoutMassagem;

    private TextInputEditText inputNumber;
    private TextInputEditText inputMassage;

    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutNumber = findViewById(R.id.InputLayoutNumber);
        inputLayoutMassagem = findViewById(R.id.InputLayoutMassage);

        inputNumber = findViewById(R.id.numberInput);
        inputMassage = findViewById(R.id.massageIput);

        buttonSend = findViewById(R.id.buttonID);
    }
}