package com.prabirkundu.moduletestimg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prabirkundu.toastymessages.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.simpleMassages(MainActivity.this,"Hello Every one :)");
    }
}