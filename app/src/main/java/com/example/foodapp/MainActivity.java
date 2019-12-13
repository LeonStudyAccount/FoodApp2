package com.example.foodapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Location;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {


    GoogleMap map;
    ImageButton imageButton;
    Location currentLocation;



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
        LatLng Derendorf = new LatLng( 51.2480097, 6.7922671);
        map.addMarker(new MarkerOptions().position(Derendorf).title("Willkommen in Derendorf"));

        map.moveCamera(CameraUpdateFactory.newLatLng(Derendorf));


        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Derendorf, 15), 3000, null);

        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {


                Log.d("Marker Gersetzt", marker.getTitle());
                marker.setTitle(marker.getTitle() + "1");

                return true;


            }
        });


    }


   /* public void whenMarkerClick(final MarkerOptions callback) {
        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                callback.invokedMarker(map, marker);

                return true;
            }
        });
    }


    */
}

