package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RatingsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);

    }

/**
 * Die Methode: "displayFilterDialog" ist für den Sortieren Button,
 * dieser soll die erstellten Kommentare entweder nach (1) Alphabet oder (2) Datum sortieren.
 * Es wird ein Dialogfenster aufgerufen, indem ein TextView (Sortieren nach), sowie
 * zwei Checkboxen (Alphabet & Datum) vorhanden ist.
 * Die Klasse MyFilterDialog erstellt diese Auswahl
 *
 */


    public void displayFilterDialog(View view){

        MyFilterDialog myFilterDialog = new MyFilterDialog();//< Ein Objekt der Klasse MyFilterDialog wird erstellt

        myFilterDialog.show(getSupportFragmentManager(),"my_filter_dialog");//< hier wird das eben erstellte Objekt (der Dialog) gezeigt; tag ist für die Fragment Section in der Klasse
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
