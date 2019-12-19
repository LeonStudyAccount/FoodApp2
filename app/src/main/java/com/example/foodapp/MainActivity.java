package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

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
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(this);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //DataBase.getAllRestaurants();

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
        LatLng Derendorf = new LatLng( 51.247952, 6.776465);
        map.addMarker(new MarkerOptions().position(Derendorf).title("Wilkommen in Derendorf"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Derendorf));

        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Derendorf, 18), 5000, null);

        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                marker.getTitle();
                marker.setTitle("Pin");
                Log.d("Marker Gesetzt",marker.getTitle());

                myDialog.setContentView(R.layout.popupmap);
                myDialog.show();


                return true;
            }
        });

    }
}

