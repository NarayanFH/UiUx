package com.example.ui_tasks;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.smarteist.autoimageslider.SliderView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class FirstFragment extends Fragment {


    String url1 = "https://www.fintoo.in/blog/wp-content/uploads/2022/01/Investment-options-for-the-Financial-year-2022-768x432.jpg";
    String url2 = "https://www.fintoo.in/blog/wp-content/uploads/2021/06/Wealth-Habits.jpg";
    String url3 = "https://img.kompass.com/sys-master-images/h06/hd2/9782160130078/financial-planning-tools-jpg";
//    int[] sampleImages = {
//            R.drawable.a1, R.drawable.a1, R.drawable.a1,
//    };
    public FirstFragment(){
        // require a empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_first, container, false);
        final ListView list = view.findViewById(R.id.list);

        ImageView c1 = view.findViewById(R.id.c1);
        ImageView c2 = view.findViewById(R.id.c2);
        ImageView c3 = view.findViewById(R.id.c3);
        ImageView c4 = view.findViewById(R.id.c4);

c1.setOnClickListener(new View.OnClickListener() {
    @SuppressLint("ResourceType")
    @Override
    public void onClick(View v) {
        v.setBackgroundColor(Color.rgb(255, 0, 0));
        c2.setBackgroundColor(Color.rgb(	255, 255, 255));
        c3.setBackgroundColor(Color.rgb(	255, 255, 255));
        c4.setBackgroundColor(Color.rgb(255, 255, 255));
    }
});
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setBackgroundColor(Color.rgb(255, 0, 0));
                c1.setBackgroundColor(Color.rgb(	255, 255, 255));
                c3.setBackgroundColor(Color.rgb(	255, 255, 255));
                c4.setBackgroundColor(Color.rgb(	255, 255, 255));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.rgb(255, 0, 0));
                c2.setBackgroundColor(Color.rgb(	255, 255, 255));
                c4.setBackgroundColor(Color.rgb(	255, 255, 255));
                c1.setBackgroundColor(Color.rgb(	255, 255, 255));
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.rgb(255, 0, 0));
                c2.setBackgroundColor(Color.rgb(	255, 255, 255));
                c3.setBackgroundColor(Color.rgb(	255, 255, 255));
                c1.setBackgroundColor(Color.rgb(	255, 255, 255));
            }
        });

//        if(c1.isPressed() == true) {
//            c1.setBackgroundColor(Color.rgb(200, 180, 50));
//        } else if (c2.isPressed() == true)  {
//            c2.setBackgroundColor(Color.rgb(200, 180, 50));
//        } else if (c3.isPressed() == true) {
//            c3.setBackgroundColor(Color.rgb(200, 180, 50));
//        }
//        else c4.setBackgroundColor(Color.rgb(200, 180, 50));



        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = view.findViewById(R.id.slider);

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(getActivity(), sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();


//        CarouselView carouselView = view.findViewById(R.id.carouselView);
//        carouselView.setPageCount(sampleImages.length);
//        carouselView.setImageListener(imageListener);

        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();
        arrayList.add(new SubjectData("JAVA", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/java/images/java-mini-logo.jpg"));
        arrayList.add(new SubjectData("Python", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/python/images/python-mini.jpg"));
        arrayList.add(new SubjectData("Javascript", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/javascript/images/javascript-mini-logo.jpg"));
        arrayList.add(new SubjectData("Cprogramming", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/cprogramming/images/c-mini-logo.jpg"));
        arrayList.add(new SubjectData("Cplusplus", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/cplusplus/images/cpp-mini-logo.jpg"));
        arrayList.add(new SubjectData("Android", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"));
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), arrayList);
        list.setAdapter(customAdapter);

        return view;
    }

//    ImageListener imageListener = (position, imageView) -> imageView.setImageResource(sampleImages[position]);

}
