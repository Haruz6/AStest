package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstnumber;
    private EditText secondnumber;
    private Button calcubutton;
    private TextView resultview;
    private  Button tologinbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = findViewById(R.id.editText_first);
        secondnumber = findViewById(R.id.editText_second);
        calcubutton = findViewById(R.id.button_calculate);
        resultview = findViewById(R.id.textView_result);
        tologinbutton = findViewById(R.id.button_ToLogin);

        calcubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result = 0f;
                float n1,n2;
                n1 = Integer.parseInt(firstnumber.getText().toString());
                n2 = Integer.parseInt(secondnumber.getText().toString());
                result = n1 + n2;
                resultview.setText("Result is :" + String.valueOf(result));
            }

        });
        tologinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

    }
}