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
    /**
     * Called when the activity is first created.
     */

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
    }

    /**
     * Switches to the activity_start_menu LinearLayout
     * specified in the ViewFlipper.
     */
    public void startGame(View v) {

        //First way -- use showNext() & showPrevious()
        viewFlipper.showNext();

        //Second way -- use setDisplayedChild(int) where int is
        // the index of the view starting from 0
        //In this case, there are two. 0 is the button,
        // and 1 is the menu layout.
        viewFlipper.setDisplayedChild(1);

        //You can also do fancy animations to switch between views.
        // Check out the methods accessible and experiment with them!
    }
    public void stopGame(View v) {

        //First way -- use showNext() & showPrevious()

        //Second way -- use setDisplayedChild(int) where int is
        // the index of the view starting from 0
        //In this case, there are two. 0 is the button,
        // and 1 is the menu layout.
        viewFlipper.setDisplayedChild(0);

        //You can also do fancy animations to switch between views.
        // Check out the methods accessible and experiment with them!
    }
}