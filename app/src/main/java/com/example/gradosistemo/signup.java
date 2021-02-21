package com.example.gradosistemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        final EditText userName = (EditText) findViewById(R.id.editTextUserName);
        final EditText password = (EditText) findViewById(R.id.editTextNewPassword);
        final EditText idNum = (EditText) findViewById(R.id.editTextNewId);
        Button btnSignup = (Button) findViewById(R.id.btnNewSignUp);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS",MODE_PRIVATE);
                String newUser = userName.getText().toString();
                String newPassword = password.getText().toString();
                String newId = idNum.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString(newUser + newPassword + "data", newUser + "\n" + newId);
                editor.commit();

                Intent intent= new Intent(signup.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
