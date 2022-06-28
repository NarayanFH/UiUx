
package com.example.ui_tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
//    private final List<Fragment> mFragmentList = new ArrayList<>(); // this line can cause crashes

    public ViewPagerAdapter(FragmentManager manager, int behavior) {

        super(manager,behavior);
    }
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new FourthFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getCount() {

        return 4;
    }

//    public void addFragment(Fragment fragment) {
//        mFragmentList.add(fragment);  // this line can cause crashes
//    }
}