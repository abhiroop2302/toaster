package com.example.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.simple_toast.Toaster;

public class MainActivity extends AppCompatActivity {

    private Toaster toaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toaster = new Toaster(this);
        toaster.showToast();
    }
}