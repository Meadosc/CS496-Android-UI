package com.example.android.cs496androidui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Horiztontal button click listener and onClick activity opener
        Button horButton = (Button) findViewById(R.id.horizontal_button);
        horButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open activity
                Intent intent = new Intent(MainActivity.this, HorizontalViewActivity.class);
                startActivity(intent);
            }
        });

        //vertical button click listener and onClick activity opener
        Button vertButton = (Button) findViewById(R.id.vertical_button);
        vertButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open activity
                Intent intent = new Intent(MainActivity.this, VerticalViewActivity.class);
                startActivity(intent);
            }
        });

        //grid button click listener and onClick activity opener
        Button gridButton = (Button) findViewById(R.id.grid_button);
        gridButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open activity
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        //relative button click listener and onClick activity opener
        Button relButton = (Button) findViewById(R.id.relative_button);
        relButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open activity
                Intent intent = new Intent(MainActivity.this, relativeViewActivity.class);
                startActivity(intent);
            }
        });



    }
}
