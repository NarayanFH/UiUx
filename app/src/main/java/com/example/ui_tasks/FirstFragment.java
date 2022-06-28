package com.example.ui_tasks;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class FirstFragment<CarouselView> extends Fragment {

//    ViewPager mViewPager;
//
//    // images array
//    int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a3,};
//
//    // Creating Object of ViewPagerAdapter
//    ViewPagerAdapter mViewPagerAdapter;
    private Context mContext;
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.a1, R.drawable.a2, R.drawable.a3,};

    public FirstFragment(){
        // require a empty public constructor
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);



    }
}
