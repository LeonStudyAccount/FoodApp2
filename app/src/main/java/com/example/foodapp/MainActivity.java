package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {


    GoogleMap map;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map= googleMap;
        LatLng Maharashtra = new LatLng( 19.169257, 73.341601);
        map.addMarker(new MarkerOptions().position(Maharashtra).title("Maharashtra"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Maharashtra));


    }
}

