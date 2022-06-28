package com.example.ui_tasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ui_tasks.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new FirstFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new FirstFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new SecondFragment());
                    break;
                case R.id.list:
                    replaceFragment(new ThirdFragment());
                    break;
                case R.id.upload:
                    replaceFragment(new FourthFragment());
                    break;
            }
            return true;
        });

    }
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, fragment);
        fragmentTransaction.commit();
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
}