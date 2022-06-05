package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page10 extends AppCompatActivity {

    Button buttonb10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);

        buttonb10 = (Button) findViewById(R.id.buttonb10);


        buttonb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(page10.this, page9.class);
                startActivity(asean);
            }
        });


    }
}