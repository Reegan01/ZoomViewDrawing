package com.kenturf.zoomviewdrawing;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ZoomView zoomView;
    Button btnSwitch;
    Canvas canvas;
    Paint mPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwitch = (Button) findViewById(R.id.switchBtn);
        zoomView = (ZoomView) findViewById(R.id.zoomView);
        
    }
}
