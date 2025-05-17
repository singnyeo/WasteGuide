package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ClothesActivity extends AppCompatActivity {
    private ImageButton  Clothes3, Clothes4, Clothes5, Clothes6, Clothes7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        ImageButton clothes2 = (ImageButton) findViewById(R.id.im_gotoClothes2);
        clothes2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Clothes2Activity.class);
                startActivity(intent);
            }
        });
        Clothes3 = (ImageButton)findViewById(R.id.im_gotoClothes3);
        Clothes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Clothes3Activity.class);
                startActivity(intent);
            }
        });
        Clothes4 = (ImageButton)findViewById(R.id.im_gotoClothes4);
        Clothes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Clothes4Activity.class);
                startActivity(intent);
            }
        });
        Clothes5 = (ImageButton)findViewById(R.id.im_gotoClothes5);
        Clothes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Clothes5Activity.class);
                startActivity(intent);
            }
        });
        Clothes6 = (ImageButton)findViewById(R.id.im_gotoClothes6);
        Clothes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Clothes6Activity.class);
                startActivity(intent);
            }
        });
        Clothes7 = (ImageButton)findViewById(R.id.im_gotoClothes7);
        Clothes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Clothes7Activity.class);
                startActivity(intent);
            }
        });
    }
}