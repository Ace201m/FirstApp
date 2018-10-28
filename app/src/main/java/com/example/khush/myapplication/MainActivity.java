package com.example.khush.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {


    private TextView banner;
    private GestureDetectorCompat ges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        banner = findViewById(R.id.banner);
        ges = new GestureDetectorCompat(this,this);
        ges.setOnDoubleTapListener(this);

        Button toggler = (Button)findViewById(R.id.toggler);
        toggler.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        banner.setText("Yeh bhi chalta hai bc");
                       // return true;
                    }
                }
        );


/*
        // get button ref
        Button toggler = (Button)findViewById(R.id.toggler);

        // listner
        toggler.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        banner.setText("It works!!!!!!!!");
                    }

                }
        );
       toggler.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        banner.setText("Don't try and break it");
                        return true;
                    }

                }
        ); */
        Log.i("kyaChala","onCreate");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.ges.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        banner.setText("onSingleTapConfirmed");
        Log.i("kyaChala","onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        banner.setText("onDoubleTap");
        Log.i("kyaChala","onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        banner.setText("onDoubleTapEvent");
        return true;    }

    @Override
    public boolean onDown(MotionEvent e) {
        banner.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        banner.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        banner.setText("onSingleTapUp");
        return true;    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        banner.setText("onScroll");
        return true;    }

    @Override
    public void onLongPress(MotionEvent e) {
        banner.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        banner.setText("onFling");
        return true;
    }


}
