package com.example.asean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

public class Homepage extends AppCompatActivity {

    ImageView imageView23;
    ImageView imageView24;
    ImageView imageView25;
    ImageView imageView26;
    ImageView imageView27;
    ImageView imageView28;
    ImageView imageView29;
    ImageView imageView30;
    ImageView imageView31;
    ImageView imageView32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24 = (ImageView) findViewById(R.id.imageView25);
        imageView24 = (ImageView) findViewById(R.id.imageView26);
        imageView24 = (ImageView) findViewById(R.id.imageView27);
        imageView24 = (ImageView) findViewById(R.id.imageView28);
        imageView24 = (ImageView) findViewById(R.id.imageView29);
        imageView24 = (ImageView) findViewById(R.id.imageView30);
        imageView24 = (ImageView) findViewById(R.id.imageView31);
        imageView24 = (ImageView) findViewById(R.id.imageView32);

        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page1.class);
                startActivity(asean);
            }
        });

        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page2.class);
                startActivity(asean);
            }
        });

        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page3.class);
                startActivity(asean);
            }
        });

        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page4.class);
                startActivity(asean);
            }
        });

        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page5.class);
                startActivity(asean);
            }
        });

        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page6.class);
                startActivity(asean);
            }
        });

        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page7.class);
                startActivity(asean);
            }
        });
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page8.class);
                startActivity(asean);
            }
        });

        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page9.class);
                startActivity(asean);
            }
        });

        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asean = new Intent(Homepage.this, page10.class);
                startActivity(asean);
            }
        });
    }
}