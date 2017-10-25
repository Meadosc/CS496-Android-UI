package com.example.android.cs496androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;



public class GridViewActivity extends AppCompatActivity {
    //create list of integers to be displayed
    private ArrayList<Integer> gridNumbers = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        //Set up initial array of 5 elements
        for(int i=0; i<5; i++){
            gridNumbers.add(i);
        }

        //add elements to view with adapter
        final GridView gridList = (GridView) findViewById(R.id.grid_list_view);
        gridList.setAdapter(new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, gridNumbers));

        //Following code copied from justin wolford lecture video
        //Creates a button that adds numbers to the grid.
//        Button addButton = (Button) findViewById(R.id.grid_view_addButton); //assign button
        //set listener for click event
//        addButton.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gridNumbers.add(gridNumbers.size()); //update size of array
//                ((ArrayAdapter) gridList.getAdapter()).notifyDataSetChanged(); //update grid view
//            }
//        });
    }
}
