package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page8 extends AppCompatActivity {

    Button buttonb8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        buttonb8 = (Button) findViewById(R.id.buttonb8);

        buttonb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page8.this, Homepage.class);
                startActivity(asean);
            }
        });

    }
}