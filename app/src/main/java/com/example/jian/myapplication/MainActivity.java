package com.example.jian.myapplication;

import android.graphics.Point;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar mProgressBar;
    LinearLayout test;
    ImageView image;
    ViewPager viewPager;
    Adapter myAdapter;
    int currentPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image);

        viewPager = (ViewPager) findViewById(R.id.mypager);
        myAdapter = new Adapter(this, getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        final int widthsection = width/5;



        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                
                Log.e("testing", String.format("position: %s, positionoffset: %s, positionoffsetpixels: %s", position, positionOffset, positionOffsetPixels));
                    float pixellocation = (position * widthsection) + (widthsection * positionOffset);
                    image.setX(pixellocation);

            }

            @Override
            public void onPageSelected(int position) {
                currentPosition = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
