package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ElecActivity extends AppCompatActivity {
    private ImageButton  el3, el4, el5, el6, el7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elec);

        ImageButton el2 = (ImageButton) findViewById(R.id.im_elec2);
        el2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Elec2Activity.class);
                startActivity(intent);
            }
        });
        el3 = (ImageButton)findViewById(R.id.im_elec3);
        el3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Elec3Activity.class);
                startActivity(intent);
            }
        });
        el4 = (ImageButton)findViewById(R.id.im_elec4);
        el4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Elec4Activity.class);
                startActivity(intent);
            }
        });
        el5 = (ImageButton)findViewById(R.id.im_elec5);
        el5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Elec5Activity.class);
                startActivity(intent);
            }
        });
        el6 = (ImageButton)findViewById(R.id.im_elec6);
        el6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Elec6Activity.class);
                startActivity(intent);
            }
        });
        el7 = (ImageButton)findViewById(R.id.im_elec7);
        el7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Elec7Activity.class);
                startActivity(intent);
            }
        });
    }
}