package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class GaguActivity extends AppCompatActivity {
    private ImageButton  gg3, gg4, gg5, gg6, gg7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gagu);

        ImageButton gg2 = (ImageButton) findViewById(R.id.im_gagu2);
        gg2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Gagu2Activity.class);
                startActivity(intent);
            }
        });
        gg3 = (ImageButton)findViewById(R.id.im_gagu3);
        gg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gagu3Activity.class);
                startActivity(intent);
            }
        });
        gg4 = (ImageButton)findViewById(R.id.im_gagu4);
        gg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gagu4Activity.class);
                startActivity(intent);
            }
        });
        gg5 = (ImageButton)findViewById(R.id.im_gagu5);
        gg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gagu5Activity.class);
                startActivity(intent);
            }
        });
        gg6 = (ImageButton)findViewById(R.id.im_gagu6);
        gg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gagu6Activity.class);
                startActivity(intent);
            }
        });
        gg7 = (ImageButton)findViewById(R.id.im_gagu7);
        gg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gagu7Activity.class);
                startActivity(intent);
            }
        });
    }
}