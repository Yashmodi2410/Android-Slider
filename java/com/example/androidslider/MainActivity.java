package com.example.androidslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidslider.adapter.ImageSlideAdapter;
import com.example.androidslider.slider.AutoSlideViewPager;

public class MainActivity extends AppCompatActivity {

    private AutoSlideViewPager mHomeBannerSlider;
    private ImageSlideAdapter mSliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHomeBannerSlider = findViewById(R.id.home_banner);

        autoSlider();
        
    }

    private void autoSlider() {

        //region banner
        mSliderAdapter = new ImageSlideAdapter(MainActivity.this, MainActivity.this);
        mHomeBannerSlider.setAdapter(mSliderAdapter);
        mHomeBannerSlider.setIntervalTime(2500);
        mHomeBannerSlider.setAutoScrollDurationFactor(8.0d);
        mHomeBannerSlider.setSwipeScrollDurationFactor(1.0d);
        mHomeBannerSlider.startSlide();
        //endregion

    }
}
