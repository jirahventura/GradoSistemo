package com.example.gradosistemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class finished extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finished);

        TextView txtFinishAct = findViewById(R.id.txtFinishAct);
        TextView  txtdatef = findViewById(R.id.txtdatef);
        TextView txtlink = findViewById(R.id.txtlink);
        Button buttonback2 = findViewById(R.id.buttonback2);
        String Messagefromgrades = getIntent().getExtras().getString("Finished Activity");
        String Messagefromgrades2 = getIntent().getExtras().getString("Date");
        String Messagefromgrades3 = getIntent().getExtras().getString("Link");

        txtFinishAct.setText(Messagefromgrades);
        txtdatef.setText(Messagefromgrades2);
        txtlink.setText(Messagefromgrades3);


        buttonback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), report.class);
                finish();
            }
        });
    }
}