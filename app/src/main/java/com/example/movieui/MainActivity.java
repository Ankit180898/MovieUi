package com.example.movieui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Slide> slideList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideList=new ArrayList<>();
        slideList.add(new Slide(R.drawable.slide_img1,"Suicide Squad"));
        slideList.add(new Slide(R.drawable.slide_img2,"Loneliness"));


    }
}