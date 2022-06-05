package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {
    Button buttonb2;
    Button buttonn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        buttonb2 = (Button) findViewById(R.id.buttonb2);
        buttonn2 = (Button) findViewById(R.id.buttonn2);

        buttonb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page2.this, page1.class);
                startActivity(asean);
            }
        });

        buttonn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page2.this, page3.class);
                startActivity(asean);
            }
        });
    }
}