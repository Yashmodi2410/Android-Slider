package com.example.androidslider.slider;

import android.view.View;

public interface IAutoSlideViewPagerAdapter {
    CharSequence getCurrentPageTitle(int i);

    int getPageCount();

    View instantiatePageItem(int i);
}
