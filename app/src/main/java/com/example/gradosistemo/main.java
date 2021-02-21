package com.example.gradosistemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void activity(View view) {
        Intent intent = new Intent(main.this, activities.class);
        startActivity(intent);
    }

    public void report(View view) {
        Intent intent = new Intent(main.this, report.class);
        startActivity(intent);
    }

    public void grade(View view) {
        Intent intent = new Intent(main.this, grade.class);
        startActivity(intent);
    }
}
