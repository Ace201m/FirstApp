package com.example.khush.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Apple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

        Bundle data = getIntent().getExtras();
        String message = data.getString("message");
        if(message=="" || message==null){

        }
        else{
            TextView abc = (TextView)findViewById(R.id.textView);
            abc.setText(message);
        }


    }

    public void changeKrde(View view){
        Intent i = new Intent(this, OverflowActivity.class);
        startActivity(i);
    }

    public void broadcast(View view){
        Log.i("i","broadcast hua");
        Intent i = new Intent();
        i.setAction("com.example.khush.myapplication");
      //  i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
        Log.i("i","broadcast hua");
    }
}
