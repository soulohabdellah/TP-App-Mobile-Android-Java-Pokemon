package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview1;
    ImageView imageview2;
    ImageView imageview3;
    ImageView imageview4;
    ImageView imageview5;
    ImageView imageview6;
    ImageView imageview7;
    ImageView imageview8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview8=(ImageView) findViewById(R.id.image8);
        imageview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1008);
            }
        });
        imageview7=(ImageView) findViewById(R.id.image7);
        imageview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1007);
            }
        });
        imageview6=(ImageView) findViewById(R.id.image6);
        imageview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1006);
            }
        });

        imageview5=(ImageView) findViewById(R.id.image5);
        imageview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1005);
            }
        });
        imageview4=(ImageView) findViewById(R.id.image4);
        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1004);
            }
        });
        imageview3=(ImageView) findViewById(R.id.image3);
        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1003);
            }
        });
        imageview2=(ImageView) findViewById(R.id.image2);
        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1002);
            }
        });
        imageview1=(ImageView) findViewById(R.id.image1);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil(1001);
            }
        });}

        void Profil(int id){
            Intent intent = new Intent(MainActivity.this, PokemonProfil.class);
            intent.putExtra("Id", id);
            startActivity(intent);
        }

}