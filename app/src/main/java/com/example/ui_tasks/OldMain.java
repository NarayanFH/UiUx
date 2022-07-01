//package com.example.ui_tasks;
//
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentStatePagerAdapter;
//import androidx.fragment.app.FragmentTransaction;
//import androidx.viewpager.widget.ViewPager;
//
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//
//import com.example.ui_tasks.databinding.ActivityMainBinding;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.navigation.NavigationView;
//import com.google.android.material.snackbar.Snackbar;
//
//
//public class MainActivity extends AppCompatActivity{
//
//    private DrawerLayout mDrawer;
//    private Toolbar toolbar;
//    private NavigationView nvDrawer;
//    Fragment fragment;
//    // Make sure to be using androidx.appcompat.app.ActionBarDrawerToggle version.
//
//    private ActionBarDrawerToggle drawerToggle;
//    //    ActivityMainBinding binding;
//    private BottomNavigationView mNavigationView;
//    private ViewPager mViewPager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
////        getSupportActionBar().hide();
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        nvDrawer = (NavigationView) findViewById(R.id.nvView);
//
//
//        // Setup drawer view
//
//        setupDrawerContent(nvDrawer);
//
////        binding = ActivityMainBinding.inflate(getLayoutInflater());
////        setContentView(binding.getRoot());
////        replaceFragment(new FirstFragment());
//        mNavigationView = findViewById(R.id.bottomNavigationView);
//        mViewPager = findViewById(R.id.viewpager);
//
//        setUpViewPager();
//
//        mNavigationView.setOnItemSelectedListener(item -> {
//            switch (item.getItemId()) {
//                case R.id.home:
//                    mViewPager.setCurrentItem(0);
//                    break;
//                case R.id.profile:
//                    mViewPager.setCurrentItem(1);
//                    break;
//                case R.id.list:
//                    mViewPager.setCurrentItem(2);
//                    break;
//                case R.id.upload:
//                    mViewPager.setCurrentItem(3);
//                    break;
//            }
//            return true;
//        });
//
//
//
////        Toolbar toolbar = findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
////
//////        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//////        fab.setOnClickListener(new View.OnClickListener() {
//////            @Override
//////            public void onClick(View view) {
//////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//////                        .setAction("Action", null).show();
//////            }
//////        });
////
////        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
////        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
////                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
////        drawer.addDrawerListener(toggle);
////        toggle.syncState();
////
////        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
////        navigationView.setNavigationItemSelectedListener(this);
////        navigationView.setCheckedItem(R.id.nav_home);
////
////        FragmentManager fragmentManager = getSupportFragmentManager();
////        FirstFragment fragment = new FirstFragment();
////        fragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit();
////    }
////
////    @Override
////    public void onBackPressed() {
////        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
////        if (drawer.isDrawerOpen(GravityCompat.START)) {
////            drawer.closeDrawer(GravityCompat.START);
////        } else {
////            super.onBackPressed();
////        }
////    }
////
////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        // Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.main, menu);
////        return true;
////    }
////
////    @Override
////    public boolean onOptionsItemSelected(MenuItem item) {
////        // Handle action bar item clicks here. The action bar will
////        // automatically handle clicks on the Home/Up button, so long
////        // as you specify a parent activity in AndroidManifest.xml.
////        int id = item.getItemId();
////
////        //noinspection SimplifiableIfStatement
////        if (id == R.id.action_settings) {
////            return true;
////        }
////
////        return super.onOptionsItemSelected(item);
////    }
////
////    @SuppressWarnings("StatementWithEmptyBody")
////    @Override
////    public boolean onNavigationItemSelected(MenuItem item) {
////        // Handle navigation view item clicks here.
////        int id = item.getItemId();
////
////        Fragment fragment = null;
////        FragmentManager fragmentManager = getSupportFragmentManager();
////
////        if (id == R.id.nav_home) {
////            fragment = new FirstFragment();
////        } else if (id == R.id.nav_profile) {
////            fragment = new SecondFragment();
////        } else if (id == R.id.list) {
////            fragment = new ThirdFragment();
////        } else if (id == R.id.upload) {
////            fragment = new FourthFragment();
////        } else if (id == R.id.email) {
////
////        } else if (id == R.id.nav_send) {
////
////        }
////        fragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit();
////        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
////        drawer.closeDrawer(GravityCompat.START);
////        return true;
//
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//
////        setSupportActionBar(toolbar);
//
//        // This will display an Up icon (<-), we will replace it with hamburger later
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        // Find our drawer view
//
//        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//
//
//    }
//
//
//
//    private void setupDrawerContent(NavigationView navigationView) {
//
//        navigationView.setNavigationItemSelectedListener(
//
//                new NavigationView.OnNavigationItemSelectedListener() {
//
//                    @Override
//
//                    public boolean onNavigationItemSelected(MenuItem menuItem) {
//
//                        selectDrawerItem(menuItem);
//
//                        return true;
//
//                    }
//
//                });
//
//    }
//
//
//    public void selectDrawerItem(MenuItem menuItem) {
//
//        // Create a new fragment and specify the fragment to show based on nav item clicked
//
////        Fragment fragment = null;
//
//        Class fragmentClass;
//
//        switch(menuItem.getItemId()) {
//
//            case R.id.nav_first_fragment:
//
//                fragmentClass = FirstFragment.class;
//
//                break;
//
//            case R.id.nav_second_fragment:
//
//                fragmentClass = SecondFragment.class;
//
//                break;
//
//            case R.id.nav_third_fragment:
//
//                fragmentClass = ThirdFragment.class;
//
//                break;
//            case R.id.nav_fourth_fragment:_fragment:
//
//            fragmentClass = FourthFragment.class;
//
//                break;
//
//            default:
//
//                fragmentClass = FourthFragment.class;
//
//        }
//
//
//
//        try {
//
//            fragment = (Fragment) fragmentClass.newInstance();
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//
//
//
//        // Insert the fragment by replacing any existing fragment
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//
//        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
//
//
//
//        // Highlight the selected item has been done by NavigationView
//
//        menuItem.setChecked(true);
//
//        // Set action bar title
//
//        setTitle(menuItem.getTitle());
//
//        // Close the navigation drawer
//
//        mDrawer.closeDrawers();
//
//    }
//
//
//
//
//
//
//
//    @Override
//
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        // The action bar home/up action should open or close the drawer.
//
//        switch (item.getItemId()) {
//
//            case android.R.id.home:
//
//                mDrawer.openDrawer(GravityCompat.START);
//
//                return true;
//
//        }
//
//        return super.onOptionsItemSelected(item);
//
//    }
//
//
//    private void replaceFragment(Fragment fragment) {
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.flFragment, fragment);
//        fragmentTransaction.commit();
//    }
//
//    private void setUpViewPager() {
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        mViewPager.setAdapter(viewPagerAdapter);
//
//        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                switch (position) {
//                    case 0:
//                        mNavigationView.getMenu().findItem(R.id.home).setChecked(true);
//                        break;
//                    case 1:
//                        mNavigationView.getMenu().findItem(R.id.profile).setChecked(true);
//                        break;
//                    case 2:
//                        mNavigationView.getMenu().findItem(R.id.list).setChecked(true);
//                        break;
//                    case 3:
//                        mNavigationView.getMenu().findItem(R.id.upload).setChecked(true);
//                        break;
//                }
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//    }
//
//}
//
//
//
////    Button login;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
////
////        login = findViewById(R.id.login);
////
////        login.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////
//////                Fragment fragment = new Fragment();
//////                FragmentManager fragmentManager = getSupportFragmentManager();
//////                fragmentManager.beginTransaction().replace(R.id.main_flow, fragment).commit();
////
////                Intent i =  new Intent(MainActivity.this,FirstScreen.class);
////                startActivity(i);
//////                finish();
////            }
////        });
////    }

// Toolbar toolbar = findViewById(R.id.toolbar);
//         setSupportActionBar(toolbar);
//
//         DrawerLayout drawer = findViewById(R.id.drawer_layout);
//         NavigationView navigationView= findViewById(R.id.nav_view);
//
//
//         mAppBarConfiguration = new AppBarConfiguration.Builder(
//         R.id.nav_home,R.id.nav_profile,R.id.list,R.id.upload).setDrawerLayout(drawer).build();
//
//         NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_nav_draw);
//         NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//         NavigationUI.setupWithNavController(navigationView, navController);
//
//         BottomNavigationView bottom_nav_view = findViewById(R.id.bottom_nav_view);
//         NavigationUI.setupWithNavController(bottom_nav_view,navController);
//         }
//         }