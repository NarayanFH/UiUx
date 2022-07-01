package com.example.ui_tasks;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ui_tasks.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    Fragment fragment;
    int position;
    // Make sure to be using androidx.appcompat.app.ActionBarDrawerToggle version.

    private ActionBarDrawerToggle drawerToggle;
    //    ActivityMainBinding binding;
    private BottomNavigationView mNavigationView;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getSupportActionBar().hide();
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.hamburg);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nvDrawer =  findViewById(R.id.nvView);
        // Setup drawer view
        setupDrawerContent(nvDrawer);

        mNavigationView = findViewById(R.id.bottomNavigationView);
        mViewPager = findViewById(R.id.viewpager);
        setUpViewPager();
        FragmentManager fragmentManager = getSupportFragmentManager();
        mNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    mViewPager.setCurrentItem(0);


                    fragmentManager.beginTransaction().replace(R.id.flContent, new FirstFragment()).commit();

                    position = 0;

                    break;
                case R.id.profile:

                    fragmentManager.beginTransaction().replace(R.id.flContent, new SecondFragment()).commit();
                    mViewPager.setCurrentItem(1);
                    fragment = new SecondFragment();
                    position = 1;
                    break;
                case R.id.list:
                    fragmentManager.beginTransaction().replace(R.id.flContent, new ThirdFragment()).commit();
                    mViewPager.setCurrentItem(2);
                    fragment = new ThirdFragment();
                    position = 2;
                    break;
                case R.id.upload:
                    fragmentManager.beginTransaction().replace(R.id.flContent, new FourthFragment()).commit();
                    mViewPager.setCurrentItem(3);
                    fragment = new FourthFragment();
                    position = 3;
                    break;
            }
            return true;
        });



        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Find our drawer view
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);


    }



    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });

    }

    public void selectDrawerItem(MenuItem menuItem) {

        // Create a new fragment and specify the fragment to show based on nav item clicked
//        Fragment fragment = null;
        Class fragmentClass;
        switch(menuItem.getItemId()) {
            case R.id.nav_first_fragment:
position=0;
                mViewPager.setCurrentItem(0);
                fragmentClass = FirstFragment.class;

                break;

            case R.id.nav_second_fragment:
                position=1;
                mViewPager.setCurrentItem(1);
                fragmentClass = SecondFragment.class;

                break;

            case R.id.nav_third_fragment:
                mViewPager.setCurrentItem(2);
position=2;
                fragmentClass = ThirdFragment.class;

                break;
            case R.id.nav_fourth_fragment:_fragment:
position=3;
                mViewPager.setCurrentItem(3);
                fragmentClass = FourthFragment.class;

                break;

            default:

                fragmentClass = FourthFragment.class;

        }



        try {

//            fragment = (Fragment) fragmentClass.newInstance();

        } catch (Exception e) {

            e.printStackTrace();

        }



        // Insert the fragment by replacing any existing fragment

        FragmentManager fragmentManager = getSupportFragmentManager();

//        if(position == 0) {
//            fragment = new FirstFragment();
//            mViewPager.setCurrentItem(0);
//        } else if (position ==1) {
//            fragment = new SecondFragment();
//            mViewPager.setCurrentItem(1);
//        }
//        else if (position ==2) {
//            fragment = new ThirdFragment();
//            mViewPager.setCurrentItem(2);
//        }
//        else if (position ==3) {
//            fragment = new FourthFragment();
//            mViewPager.setCurrentItem(3);
//        }


        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();



        // Highlight the selected item has been done by NavigationView

        menuItem.setChecked(true);

        // Set action bar title

        setTitle(menuItem.getTitle());

        // Close the navigation drawer

        mDrawer.closeDrawers();

    }







    @Override

    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;

        }

        return super.onOptionsItemSelected(item);

    }


//    private void replaceFragment(Fragment fragment) {
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.flFragment, fragment);
//        fragmentTransaction.commit();
//    }

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



