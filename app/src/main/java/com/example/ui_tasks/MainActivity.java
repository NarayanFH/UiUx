package com.example.ui_tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.ui_tasks.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //    ActivityMainBinding binding;
    private BottomNavigationView mNavigationView;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        replaceFragment(new FirstFragment());
        mNavigationView = findViewById(R.id.bottomNavigationView);
        mViewPager = findViewById(R.id.viewpager);

        setUpViewPager();

        mNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    mViewPager.setCurrentItem(0);
                    break;
                case R.id.profile:
                    mViewPager.setCurrentItem(1);
                    break;
                case R.id.list:
                    mViewPager.setCurrentItem(2);
                    break;
                case R.id.upload:
                    mViewPager.setCurrentItem(3);
                    break;
            }
            return true;
        });

//        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
//            switch (item.getItemId()) {
//                case R.id.home:
//                    replaceFragment(mViewPager.setCurrentItem(0););
//                    break;
//                case R.id.profile:
//                    replaceFragment(new SecondFragment());
//                    break;
//                case R.id.list:
//                    replaceFragment(new ThirdFragment());
//                    break;
//                case R.id.upload:
//                    replaceFragment(new FourthFragment());
//                    break;
//            }
//            return true;
//        });

    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, fragment);
        fragmentTransaction.commit();
    }

    private void setUpViewPager() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        mNavigationView.getMenu().findItem(R.id.home).setChecked(true);
                        break;
                    case 1:
                        mNavigationView.getMenu().findItem(R.id.profile).setChecked(true);
                        break;
                    case 2:
                        mNavigationView.getMenu().findItem(R.id.list).setChecked(true);
                        break;
                    case 3:
                        mNavigationView.getMenu().findItem(R.id.upload).setChecked(true);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}


//    Button login;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        login = findViewById(R.id.login);
//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
////                Fragment fragment = new Fragment();
////                FragmentManager fragmentManager = getSupportFragmentManager();
////                fragmentManager.beginTransaction().replace(R.id.main_flow, fragment).commit();
//
//                Intent i =  new Intent(MainActivity.this,FirstScreen.class);
//                startActivity(i);
////                finish();
//            }
//        });
//    }