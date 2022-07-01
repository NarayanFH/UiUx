package com.example.ui_tasks;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
//import androidx.fragment.app.Fragment;


public class SecondFragment extends Fragment {

    public SecondFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_second, container, false);
        final ListView list = view.findViewById(R.id.list);

        ImageView c1 = view.findViewById(R.id.c1);
        ImageView c2 = view.findViewById(R.id.c2);
        ImageView c3 = view.findViewById(R.id.c3);
        ImageView c4 = view.findViewById(R.id.c4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.rgb(255, 0, 0));
                c2.setBackgroundColor(Color.rgb(192, 192, 192));
                c3.setBackgroundColor(Color.rgb(192, 192, 192));
                c4.setBackgroundColor(Color.rgb(192, 192, 192));
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setBackgroundColor(Color.rgb(255, 0, 0));
                c1.setBackgroundColor(Color.rgb(192, 192, 192));
                c3.setBackgroundColor(Color.rgb(192, 192, 192));
                c4.setBackgroundColor(Color.rgb(192, 192, 192));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.rgb(255, 0, 0));
                c2.setBackgroundColor(Color.rgb(192, 192, 192));
                c4.setBackgroundColor(Color.rgb(192, 192, 192));
                c1.setBackgroundColor(Color.rgb(192, 192, 192));
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.rgb(255, 0, 0));
                c2.setBackgroundColor(Color.rgb(192, 192, 192));
                c3.setBackgroundColor(Color.rgb(192, 192, 192));
                c1.setBackgroundColor(Color.rgb(192, 192, 192));
            }
        });

        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();
        arrayList.add(new SubjectData("JAVA", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/java/images/java-mini-logo.jpg"));
        arrayList.add(new SubjectData("Python", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/python/images/python-mini.jpg"));
        arrayList.add(new SubjectData("Javascript", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/javascript/images/javascript-mini-logo.jpg"));
        arrayList.add(new SubjectData("Cprogramming", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/cprogramming/images/c-mini-logo.jpg"));
        arrayList.add(new SubjectData("Cplusplus", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/cplusplus/images/cpp-mini-logo.jpg"));
        arrayList.add(new SubjectData("Android", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"));
        arrayList.add(new SubjectData("Android", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"));
        arrayList.add(new SubjectData("Android", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"));
        arrayList.add(new SubjectData("Android", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"));
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), arrayList);
        list.setAdapter(customAdapter);



        return view;
    }
}