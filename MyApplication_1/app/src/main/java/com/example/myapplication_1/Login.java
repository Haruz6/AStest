package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText editText_Username;
    private EditText editText_Password;
    private Button button_Login;
    private TextView textView_ReaminTimes;
    private int remainTimes = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText_Username = findViewById(R.id.editTextTextPassword);
        editText_Password = findViewById(R.id.editTextTextPassword2);
        button_Login = findViewById(R.id.button_Login);
        textView_ReaminTimes = findViewById(R.id.textView_Remain);

        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(editText_Username.getText().toString(),editText_Password.getText().toString());
            }
        });
    }

    protected void validate(String username, String password)
    {
        if(username.equals("haha") && password.equals("123546"))
        {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            remainTimes --;
            textView_ReaminTimes.setText("Remain Times is :" + String.valueOf(remainTimes));
            if(remainTimes == 0)
            {
                button_Login.setEnabled(false);
            }

        }
    }
}