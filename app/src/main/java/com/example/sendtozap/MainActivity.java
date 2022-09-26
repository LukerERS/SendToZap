package com.example.sendtozap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    private TextInputEditText inputNumber;
    private TextInputEditText inputMessage;

    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputNumber = findViewById(R.id.numberInput);
        inputMessage = findViewById(R.id.messageInput);

        buttonSend = findViewById(R.id.buttonID);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageTxt = inputMessage.getText().toString();
                String numberTxt = inputNumber.getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone="+numberTxt+"&text="+messageTxt));

                startActivity(intent);

            }
        });
    }
}