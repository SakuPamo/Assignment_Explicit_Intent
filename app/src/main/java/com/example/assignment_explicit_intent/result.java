package com.example.assignment_explicit_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView result = findViewById(R.id.resultView);
        Intent intent = getIntent();
        String addition = (String)intent.getSerializableExtra("SUM");
        result.setText(addition);
    }
}


