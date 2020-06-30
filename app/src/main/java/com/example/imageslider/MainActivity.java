package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.imageslider.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);


        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}