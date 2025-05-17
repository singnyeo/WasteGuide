package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ContainerActivity extends AppCompatActivity {
    private ImageButton  ct3, ct4, ct5, ct6, ct7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        ImageButton ct2 = (ImageButton) findViewById(R.id.im_gotoContainer2);
        ct2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Container2Activity.class);
                startActivity(intent);
            }
        });
        ct3 = (ImageButton)findViewById(R.id.im_gotoContainer3);
        ct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Container3Activity.class);
                startActivity(intent);
            }
        });
        ct4 = (ImageButton)findViewById(R.id.im_gotoContainer4);
        ct4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Container4Activity.class);
                startActivity(intent);
            }
        });
        ct5 = (ImageButton)findViewById(R.id.im_gotoContainer5);
        ct5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Container5Activity.class);
                startActivity(intent);
            }
        });
        ct6 = (ImageButton)findViewById(R.id.im_gotoContainer6);
        ct6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Container6Activity.class);
                startActivity(intent);
            }
        });
        ct7 = (ImageButton)findViewById(R.id.im_gotoContainer7);
        ct7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Container7Activity.class);
                startActivity(intent);
            }
        });
    }
}