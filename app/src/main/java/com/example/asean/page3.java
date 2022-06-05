package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page3 extends AppCompatActivity {

    Button buttonb3;
    Button buttonn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        buttonb3 = (Button) findViewById(R.id.buttonb3);
        buttonn3 = (Button) findViewById(R.id.buttonn3);

        buttonb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page3.this, page2.class);
                startActivity(asean);
            }
        });

        buttonn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page3.this, page4.class);
                startActivity(asean);
            }
        });
    }
}