package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page6 extends AppCompatActivity {

    Button buttonb6;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        buttonb6 = (Button) findViewById(R.id.buttonb6);
        button = (Button) findViewById(R.id.button);

        buttonb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page6.this, Homepage.class);
                startActivity(asean);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page6.this, Asean.class);
                startActivity(asean);
            }
        });

    }
}