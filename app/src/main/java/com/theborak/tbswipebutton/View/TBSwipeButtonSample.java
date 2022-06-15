package com.theborak.tbswipebutton.View;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.theborak.tbswipebutton.Controller.OnSwipeCompleteListener;
import com.theborak.tbswipebutton.R;


/**
 * Created by Gratus on 02/10/18.
 */

public class TBSwipeButtonSample extends AppCompatActivity {
    private TBSwipeButton start,stop,start_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_button_sample);
        stop = findViewById(R.id.stop);
        start = findViewById(R.id.start);
        start_stop = findViewById(R.id.start_stop);
        start.setOnSwipeCompleteListener_forward_reverse(new OnSwipeCompleteListener() {
            @Override
            public void onSwipe_Forward(TBSwipeButton swipeView) {

            }

            @Override
            public void onSwipe_Reverse(TBSwipeButton swipeView) {

            }
        });
        stop.setOnSwipeCompleteListener_forward_reverse(new OnSwipeCompleteListener() {
            @Override
            public void onSwipe_Forward(TBSwipeButton swipeView) {

            }

            @Override
            public void onSwipe_Reverse(TBSwipeButton swipeView) {

            }
        });

        start_stop.setOnSwipeCompleteListener_forward_reverse(new OnSwipeCompleteListener() {
            @Override
            public void onSwipe_Forward(TBSwipeButton swipeView) {
                start_stop.setText("Stop");
                start_stop.setThumbBackgroundColor(ContextCompat.getColor(TBSwipeButtonSample.this, R.color.colorPrimary));
                start_stop.setSwipeBackgroundColor(ContextCompat.getColor(TBSwipeButtonSample.this, R.color.colorPrimary));
            }

            @Override
            public void onSwipe_Reverse(TBSwipeButton swipeView) {
                start_stop.setText("Start");
                start_stop.setThumbBackgroundColor(ContextCompat.getColor(TBSwipeButtonSample.this, R.color.colorAccent));
                start_stop.setSwipeBackgroundColor(ContextCompat.getColor(TBSwipeButtonSample.this, R.color.colorAccent));
            }
        });
    }
}
