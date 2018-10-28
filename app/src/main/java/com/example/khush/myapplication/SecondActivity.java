package com.example.khush.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity implements topSectionFragment.topSectionListner {

    @Override
    public void createMeme(String top, String bottom) {
        bottomSectionFragment temp = (bottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFragment);
        temp.makeMeme(top,bottom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
