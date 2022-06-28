//package com.example.ui_tasks;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.viewpager.widget.ViewPager;
//
//import android.os.Bundle;
//
//public class FirstScreen extends AppCompatActivity {
//
//
//    ViewPager mViewPager;
//
//    // images array
//    int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a3,};
//
//    // Creating Object of ViewPagerAdapter
//    ViewPagerAdapter mViewPagerAdapter;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_first_screen);
//
//        // Initializing the ViewPager Object
//        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);
//
//        // Initializing the ViewPagerAdapter
//        mViewPagerAdapter = new ViewPagerAdapter(FirstScreen.this, images);
//
//        // Adding the Adapter to the ViewPager
//        mViewPager.setAdapter(mViewPagerAdapter);
//    }
//}