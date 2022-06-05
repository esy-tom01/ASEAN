package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Asean extends AppCompatActivity {

    Button button_asean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asean);

        button_asean = (Button) findViewById(R.id.button_asean);

        button_asean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Asean.this, page1.class);
                startActivity(asean);
            }
        });
    }
}