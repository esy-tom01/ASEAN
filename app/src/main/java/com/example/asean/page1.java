package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity {
    Button buttonb1;
    Button buttonn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        buttonb1 = (Button) findViewById(R.id.buttonb1);
        buttonn1 = (Button) findViewById(R.id.buttonn1);

        buttonb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page1.this, Asean.class);
                startActivity(asean);
            }
        });

        buttonn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page1.this, page2.class);
                startActivity(asean);
            }
        });
    }
}