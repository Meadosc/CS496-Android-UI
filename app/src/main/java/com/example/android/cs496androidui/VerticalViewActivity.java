package com.example.android.cs496androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class VerticalViewActivity extends AppCompatActivity {

    //create list of integers to be displayed
    private ArrayList<Integer> vertNumbers = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_view);

        //Set up initial array of 5 elements
        for(int i=0; i<20; i++){
            vertNumbers.add(i);
        }

        //add elements to view with adapter
        final ListView numberList = (ListView) findViewById(R.id.vert_list_view);
        numberList.setAdapter(new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, vertNumbers));


    }
}
