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

    public void renderChap2(View view)
    {
        setContentView(R.layout.chapter_2);
    }

    public void renderChap3(View view)
    {
        setContentView(R.layout.chapter_3);
    }

    public void renderChap4(View view)
    {
        setContentView(R.layout.chapter_4);
    }

    public void renderChap5(View view)
    {
        setContentView(R.layout.chapter_5);
    }

    public void renderChap6(View view)
    {
        setContentView(R.layout.chapter_6);
    }

    public void renderChap7(View view)
    {
        setContentView(R.layout.chapter_7);
    }

    public void renderChap8(View view)
    {
        setContentView(R.layout.chapter_8);
    }

    public void renderChap12(View view)
    {
        setContentView(R.layout.chapter_12);
    }
}