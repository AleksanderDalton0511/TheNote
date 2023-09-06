package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {
    ViewFlipper viewFlipper;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
    }
    public void startGame(View v) {
        viewFlipper.setDisplayedChild(1);
    }
    public void stopGame(View v) {
        viewFlipper.setDisplayedChild(0);
    }

}