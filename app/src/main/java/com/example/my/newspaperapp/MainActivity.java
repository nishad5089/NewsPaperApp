package com.example.my.newspaperapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private CardView bangla,english,sports,tech,other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        bangla = findViewById(R.id.bangla);
        english = findViewById(R.id.english);
        sports = findViewById(R.id.sport);
        tech = findViewById(R.id.tech);
        other = findViewById(R.id.other);

        bangla.setOnClickListener(this);
        english.setOnClickListener(this);
        sports.setOnClickListener(this);
        tech.setOnClickListener(this);
        other.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.bangla:
                i = new Intent(this,BanglaNewsActivity.class);startActivity(i); break;
            case R.id.english:
                i = new Intent(this,EnglishNewsActivity.class);startActivity(i);break;
            case R.id.sport:
                i = new Intent(this,SportsNewsActivity.class);startActivity(i); break;
            case R.id.tech:
                i = new Intent(this,TechNewsActivity.class);startActivity(i);break;
            case R.id.other:
                i = new Intent(this,OthersActivity.class);startActivity(i);break;

        }
    }
}
