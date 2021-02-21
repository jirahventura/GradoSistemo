package com.example.gradosistemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editNum = (EditText) findViewById(R.id.editidNumber);
        final EditText editPassword = (EditText) findViewById(R.id.editPass);
        Button btnLogin = (Button) findViewById(R.id.btnlogin);
        Button btnSignup = (Button) findViewById(R.id.btnSignUp);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = editNum.getText().toString();
                String password = editPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String userDetails = preferences.getString( user + password + "data", "Username or Password is incorrect.");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("display", userDetails);
                editor.commit();


                Intent intent = new Intent(MainActivity.this, main.class);
                startActivity(intent);
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(MainActivity.this, signup.class);
                startActivity(signup);
            }
        });

    }
}