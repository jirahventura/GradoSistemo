package com.example.gradosistemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activities extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities);

        final EditText editActname = (EditText) findViewById(R.id.editActname);
        final EditText editDate = (EditText) findViewById(R.id.editDate);
        Button buttonAdd = findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddActivities.class);
                intent.putExtra("Activity Name", editActname.getText().toString());
                intent.putExtra("Date", editDate.getText().toString());
                startActivity(intent);
                finish();
            }

        });

    }
}