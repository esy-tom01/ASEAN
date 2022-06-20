package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page4 extends AppCompatActivity {

    Button buttonb4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        buttonb4 = (Button) findViewById(R.id.buttonb4);
        button = (Button) findViewById(R.id.button);

        buttonb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page4.this, Homepage.class);
                startActivity(asean);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page4.this, Asean.class);
                startActivity(asean);
            }
        });
    }
}