package com.example.assignment_explicit_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNum = findViewById(R.id.firstNum);
        final EditText secNum = findViewById(R.id.secondNum);
        Button btnAdd = findViewById(R.id.addBtn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secNum.getText().toString());
                Intent intent = new Intent(MainActivity.this,result.class);
                intent.putExtra("SUM",num1+" + "+num2+" = "+(num1+num2));
                startActivity(intent);
            }
        });
    }
}


