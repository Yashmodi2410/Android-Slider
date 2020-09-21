package com.example.androidslider.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.example.androidslider.R;
import com.example.androidslider.slider.AutoSlideViewPageAdapter;

import java.util.List;


public class ImageSlideAdapter extends AutoSlideViewPageAdapter {

    Activity activity;
    Context context;
    List<String> mBanners;

    public ImageSlideAdapter(Context c, Activity activity/*, List<String> mBanners*/) {
        this.activity = activity;
        /*this.mBanners = mBanners;*/
        this.context = c;
    }

    @Override
    public CharSequence getCurrentPageTitle(int i) {
        return null;
    }

    @Override
    public int getPageCount() {
        /*return mBanners.size();*/
        return 4;
    }

    @Override
    public View instantiatePageItem(final int i) {
        View view = ((LayoutInflater) this.activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.home_slider_image, null);
        ImageView mImageView = view.findViewById(R.id.image_display);

        if (i ==0){
            mImageView.setImageResource(R.drawable.msd);
        }else if (i==1){
            mImageView.setImageResource(R.drawable.virat);
        }else if (i==2){
            mImageView.setImageResource(R.drawable.jadeja);
        }
        /*Picasso.get()
                .load(mBanners.get(i).getPath() + mBanners.get(i).getImg())
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(mImageView);*/

        return view;
    }
}
