package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RatingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);
    }

    public void mapButtonClicked(View view) {

        startActivity(new Intent(this, MainActivity.class));
    }

    public void listButtonClicked(View view) {

        startActivity(new Intent(this,ListActivity.class));
    }

    public void filterButtonClicked(View view) {

        startActivity(new Intent(this, FilterActivity.class));
    }

    public void ratingsButtonClicked(View view) {

        startActivity(new Intent(this, RatingsActivity.class));
    }

    public void settingsButtonClicked(View view) {

        startActivity(new Intent(this, SettingsActivity.class));
    }
}
