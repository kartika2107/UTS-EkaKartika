package com.example.eka.utsekakartika;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText username_ET, password_ET;
    private Button login_BTN;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username_ET = findViewById(R.id.username);
        password_ET = findViewById(R.id.password);
        login_BTN = findViewById(R.id.btn_login);

        login_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username_ET.getText().toString();
                String password = password_ET.getText().toString();

                if (username.length() == 0) {
                    username_ET.setError("Mohon isi username!");
                    username_ET.requestFocus();
                    return;
                }

                if (password.length() == 0) {
                    password_ET.setError("Mohon isi password!");
                    password_ET.requestFocus();
                    return;
                }

                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }
        });

        username_ET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                password_ET.requestFocus();
                return true;
            }
        });

        password_ET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                login_BTN.performClick();
                return true;
            }
        });
    }
}
