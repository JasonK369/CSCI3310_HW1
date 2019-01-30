package com.example.asg1;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    TextView title, address, detailName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle infoPrevious = getIntent().getExtras();
        String cuisineName = infoPrevious.getString("cuisineName");
        Log.d("cuisineName", cuisineName);

        title = findViewById(R.id.title);
        address = findViewById(R.id.address);
        detailName = findViewById(R.id.detailName);

        if(cuisineName.equals("kebab")){
            title.setText(R.string.kebab);
            detailName.setText(R.string.chunCanDetail);
            address.setText(R.string.chunCanAddr);
        }

        if(cuisineName.equals("pizza")){

        }

        if(cuisineName.equals("bbq")){

        }

        if(cuisineName.equals("fish")){

        }
    }

    public void cancelAction(View view){
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating(0);
    }

    public void saveAction(View view){

    }



}
