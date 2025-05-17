package com.example.registerlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class CategoryActivity extends AppCompatActivity {

    TextView tx_else;
    TextView tx_book;
    TextView tx_cook;
    TextView tx_rock;
    TextView tx_gagu;
    TextView tx_elc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
//
//        NavigationView navigationView = findViewById(R.id.navigationView);
//        navigationView.setItemIconTintList(null);
//        NavController navController = Navigation.findNavController(this,R.id.navHostFragment);
//        NavigationUI.setupWithNavController(navigationView,navController);
//        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
//            @Override
//            public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {
//            }
//        });

        tx_else = (TextView) findViewById(R.id.tx_else);
        tx_book = (TextView) findViewById(R.id.tx_book);
        tx_cook = (TextView) findViewById(R.id.tx_cook);
        tx_rock = (TextView) findViewById(R.id.tx_rock);
        tx_gagu = (TextView) findViewById(R.id.tx_gagu);
        tx_elc = (TextView) findViewById(R.id.tx_elc);


        tx_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this,BookActivity.class);
                startActivity(intent);
            }
        });
        tx_else.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this,ClothesActivity.class);
                startActivity(intent);
            }
        });
        tx_cook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this,CreamActivity.class);
                startActivity(intent);
            }
        });
        tx_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this,ContainerActivity.class);
                startActivity(intent);
            }
        });
        tx_gagu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this,GaguActivity.class);
                startActivity(intent);
            }
        });
        tx_elc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this,ElecActivity.class);
                startActivity(intent);
            }
        });
    }
}
