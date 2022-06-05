package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page5 extends AppCompatActivity {

    Button buttonb5;
    Button buttonn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        buttonb5 = (Button) findViewById(R.id.buttonb5);
        buttonn5 = (Button) findViewById(R.id.buttonn5);

        buttonb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page5.this, page4.class);
                startActivity(asean);
            }
        });

        buttonn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page5.this, page6.class);
                startActivity(asean);
            }
        });
    }
}