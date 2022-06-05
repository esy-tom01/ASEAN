package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page7 extends AppCompatActivity {

    Button buttonb7;
    Button buttonn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);

        buttonb7 = (Button) findViewById(R.id.buttonb7);
        buttonn7 = (Button) findViewById(R.id.buttonn7);

        buttonb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page7.this, page6.class);
                startActivity(asean);
            }
        });

        buttonn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page7.this, page8.class);
                startActivity(asean);
            }
        });
    }
}