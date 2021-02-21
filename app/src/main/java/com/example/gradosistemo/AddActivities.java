package com.example.gradosistemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivities extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addact);

        TextView txtAct = findViewById(R.id.txtAct);
        TextView  txtdate = findViewById(R.id.txtdate);
        Button buttonback = findViewById(R.id.buttonback);
        String Messagefromgrades = getIntent().getExtras().getString("Activity Name");
        String Messagefromgrades2 = getIntent().getExtras().getString("Date");

        txtAct.setText(Messagefromgrades);
        txtdate.setText(Messagefromgrades2);


        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activities.class);
                finish();
            }
        });
    }
}