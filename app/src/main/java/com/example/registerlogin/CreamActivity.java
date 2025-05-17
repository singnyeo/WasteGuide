package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class CreamActivity extends AppCompatActivity {
    private ImageButton  cr3, cr4, cr5, cr6, cr7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cream);

        ImageButton cr2 = (ImageButton) findViewById(R.id.im_Cream2);
        cr2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Cream2Activity.class);
                startActivity(intent);
            }
        });
        cr3 = (ImageButton)findViewById(R.id.im_Cream3);
        cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cream3Activity.class);
                startActivity(intent);
            }
        });
        cr4 = (ImageButton)findViewById(R.id.im_Cream4);
        cr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cream4Activity.class);
                startActivity(intent);
            }
        });
        cr5 = (ImageButton)findViewById(R.id.im_Cream5);
        cr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cream5Activity.class);
                startActivity(intent);
            }
        });
        cr6 = (ImageButton)findViewById(R.id.im_Cream6);
        cr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cream6Activity.class);
                startActivity(intent);
            }
        });
        cr7 = (ImageButton)findViewById(R.id.im_Cream7);
        cr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cream7Activity.class);
                startActivity(intent);
            }
        });
    }
}