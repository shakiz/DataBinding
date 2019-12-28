package com.shakil.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.shakil.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.tv1.setText("Whooooo !!! Its working");
        activityMainBinding.tv2.setText("Whooooo !!! Its working");
        activityMainBinding.tv3.setText("Whooooo !!! Its working");
    }
}
