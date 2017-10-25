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
        Button button = (Button) findViewById(R.id.horizontal_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open activity
                Intent intent = new Intent(MainActivity.this, HorizontalViewActivity.class);
                startActivity(intent);
            }
        });



    }
}
