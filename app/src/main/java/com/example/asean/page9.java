package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page9 extends AppCompatActivity {

    Button buttonb9;
    Button buttonn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);

        buttonb9 = (Button) findViewById(R.id.buttonb9);
        buttonn9 = (Button) findViewById(R.id.buttonn9);

        buttonb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page9.this, page8.class);
                startActivity(asean);
            }
        });

        buttonn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page9.this, page10.class);
                startActivity(asean);
            }
        });
    }
}