package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class BookActivity extends AppCompatActivity {
    private ImageButton  book3, book4, book5, book6, book7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ImageButton book2 = (ImageButton) findViewById(R.id.gotoBook2);
        book2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Book2Activity.class);
                startActivity(intent);
            }
        });
        book3 = (ImageButton)findViewById(R.id.magnetbtn);
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Book3Activity.class);
                startActivity(intent);
            }
        });
        book4 = (ImageButton)findViewById(R.id.cdbtn);
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Book4Activity.class);
                startActivity(intent);
            }
        });
        book5 = (ImageButton)findViewById(R.id.bookbtn);
        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Book5Activity.class);
                startActivity(intent);
            }
        });
        book6 = (ImageButton)findViewById(R.id.penbtn);
        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Book6Activity.class);
                startActivity(intent);
            }
        });
        book7 = (ImageButton)findViewById(R.id.cutterbtn);
        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Book7Activity.class);
                startActivity(intent);
            }
        });
    }
}