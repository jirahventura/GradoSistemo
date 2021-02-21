package com.example.gradosistemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class savedgrade extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedgrade);

        TextView txtId = findViewById(R.id.txtId);
        TextView  txtGrd = findViewById(R.id.txtGrd);
        Button btnback = findViewById(R.id.btnback);
        String Messagefromgrades = getIntent().getExtras().getString("ID NUMBER");
        String Messagefromgrades2 = getIntent().getExtras().getString("GRADES");
        
        txtId.setText(Messagefromgrades);
        txtGrd.setText(Messagefromgrades2);
        

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), grade.class);
                finish();
            }
        });
    }
}