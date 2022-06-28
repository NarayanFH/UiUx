//package com.example.ui_tasks;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//
//import com.example.ui_tasks.databinding.ActivityMainBinding;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationBarView;
//
//public class NavScreen extends AppCompatActivity  {
//
////    ActivityMainBinding binding;
////
////
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////
////        binding = ActivityMainBinding.inflate(getLayoutInflater());
////        setContentView(binding.mainF);
////        replaceFragment(new FirstFragment());
////
////        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
////            switch (item.getItemId()) {
////                case R.id.home:
////                    replaceFragment(new FirstFragment());
////                    break;
////                case R.id.profile:
////                    replaceFragment(new SecondFragment());
////                    break;
////                case R.id.list:
////                    replaceFragment(new ThirdFragment());
////                    break;
////                case R.id.upload:
////                    replaceFragment(new FourthFragment());
////                    break;
////            }
////            return true;
////        });
////
////    }
////    private void replaceFragment(Fragment fragment) {
////
////        FragmentManager fragmentManager = getSupportFragmentManager();
////        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
////        fragmentTransaction.replace(R.id.flFragment, fragment);
////        fragmentTransaction.commit();
////    }
//}
