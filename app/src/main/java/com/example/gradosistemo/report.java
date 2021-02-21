package com.example.gradosistemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class report extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);

        final EditText editFinishAct = findViewById(R.id.editFinishAct);
        final EditText editdatef = findViewById(R.id.editdatef);
        final EditText editlink = findViewById(R.id.editlink);
        Button buttonAdd2 = findViewById(R.id.buttonAdd2);

        buttonAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), finished.class);
                intent.putExtra("Activity Name", editFinishAct.getText().toString());
                intent.putExtra("Date", editdatef.getText().toString());
                intent.putExtra("Link", editlink.getText().toString());
                startActivity(intent);
                finish();
            }

        });

    }
}