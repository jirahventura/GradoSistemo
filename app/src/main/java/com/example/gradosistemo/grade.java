package com.example.gradosistemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class grade extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade);

        final EditText editidnum = (EditText) findViewById(R.id.editidnum);
        final EditText editgrade = (EditText) findViewById(R.id.editgrade);
        Button btnsave = (Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(),savedgrade.class);
               intent.putExtra("ID NUMBER", editidnum.getText().toString());
               intent.putExtra("GRADES", editgrade.getText().toString());
               startActivity(intent);
               finish();
    }

});

    }
}