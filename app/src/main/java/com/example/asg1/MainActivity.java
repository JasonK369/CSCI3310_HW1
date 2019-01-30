package com.example.asg1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void onClick(View view){
        Log.d("Content of img ", view.getContentDescription().toString());
        Intent intent = new Intent(MainActivity.this, DetailActivity.class); //intent that change to other view
        intent.putExtra("cuisineName", view.getContentDescription().toString()); //put the extra message to next activity
        startActivity(intent); //start change to next activity
    }
}
