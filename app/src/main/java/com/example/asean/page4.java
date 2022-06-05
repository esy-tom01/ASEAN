package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page4 extends AppCompatActivity {

    Button buttonb4;
    Button buttonn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        buttonb4 = (Button) findViewById(R.id.buttonb4);
        buttonn4 = (Button) findViewById(R.id.buttonn4);

        buttonb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page4.this, page3.class);
                startActivity(asean);
            }
        });

        buttonn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page4.this, page5.class);
                startActivity(asean);
            }
        });
    }
}