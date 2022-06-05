package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page6 extends AppCompatActivity {

    Button buttonb6;
    Button buttonn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        buttonb6 = (Button) findViewById(R.id.buttonb6);
        buttonn6 = (Button) findViewById(R.id.buttonn6);

        buttonb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page6.this, page5.class);
                startActivity(asean);
            }
        });

        buttonn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page6.this, page7.class);
                startActivity(asean);
            }
        });
    }
}