package com.example.opsysapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void renderMainPage(View view)
    {
        setContentView(R.layout.activity_main);
    }

    public void renderChap1(View view)
    {
        setContentView(R.layout.chapter_1);
    }
}