package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page9 extends AppCompatActivity {

    Button buttonb9;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);

        buttonb9 = (Button) findViewById(R.id.buttonb9);
        button = (Button) findViewById(R.id.button);

        buttonb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page9.this, Homepage.class);
                startActivity(asean);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page9.this, Asean.class);
                startActivity(asean);
            }
        });

    }
}