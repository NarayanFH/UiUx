package com.example.ui_tasks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
//import androidx.fragment.app.Fragment;


public class FourthFragment extends Fragment {

    public FourthFragment(){
        // require a empty public constructor
    }

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_fourth, container, false);

        tabLayout = view.findViewById(R.id.tabLay);
        viewPager =view.findViewById(R.id.viewpager2);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getActivity().getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new TabFrag1(), "TAB1");
        vpAdapter.addFragment(new TabFrag2(), "TAB2");
        vpAdapter.addFragment(new TabFrag3(), "TAB3");
        viewPager.setAdapter(vpAdapter);



        return view;
    }
}
