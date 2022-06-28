package com.example.ui_tasks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

//    ViewPager mViewPager;
//
//    // images array
//    int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a3,};
//
//    // Creating Object of ViewPagerAdapter
//    ViewPagerAdapter mViewPagerAdapter;

    public FirstFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_first, container, false);
        final ListView list = view.findViewById(R.id.list);

        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();
        arrayList.add(new SubjectData("JAVA", "https://www.tutorialspoint.com/java/", "https://www.tutorialspoint.com/java/images/java-mini-logo.jpg"));
        arrayList.add(new SubjectData("Python", "https://www.tutorialspoint.com/python/", "https://www.tutorialspoint.com/python/images/python-mini.jpg"));
        arrayList.add(new SubjectData("Javascript", "https://www.tutorialspoint.com/javascript/", "https://www.tutorialspoint.com/javascript/images/javascript-mini-logo.jpg"));
        arrayList.add(new SubjectData("Cprogramming", "https://www.tutorialspoint.com/cprogramming/", "https://www.tutorialspoint.com/cprogramming/images/c-mini-logo.jpg"));
        arrayList.add(new SubjectData("Cplusplus", "https://www.tutorialspoint.com/cplusplus/", "https://www.tutorialspoint.com/cplusplus/images/cpp-mini-logo.jpg"));
        arrayList.add(new SubjectData("Android", "https://www.tutorialspoint.com/android/", "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"));
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), arrayList);
        list.setAdapter(customAdapter);
//        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);
//
//        // Initializing the ViewPagerAdapter
//        mViewPagerAdapter = new ViewPagerAdapter(ViewPagers.this, images);
//
//        // Adding the Adapter to the ViewPager
//        mViewPager.setAdapter(mViewPagerAdapter);
        return view;
    }
}
