package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page8 extends AppCompatActivity {

    Button buttonb8;
    Button buttonn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        buttonb8 = (Button) findViewById(R.id.buttonb8);
        buttonn8 = (Button) findViewById(R.id.buttonn8);

        buttonb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page8.this, page7.class);
                startActivity(asean);
            }
        });

        buttonn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page8.this, page9.class);
                startActivity(asean);
            }
        });
    }
}