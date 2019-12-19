package com.example.foodapp;

import android.view.Menu;

import java.util.Date;
import com.google.android.gms.maps.model.LatLng;

public class Lokal {

    private int lokalID;
    private String name;
    private String strasse;
    private int hausnummer;
    private int lokalart;
    private int nation;
    private int spez;
    private Angebot menu;
    private Date menustand;
    private Date eroeffungsdatum;
    private LatLng koordinaten;
    private Kommentar kommentar;


    public Lokal(int lokalID, String name, String strasse, int hausnummer, int lokalart, int nation, int spez, Angebot menu, Date menustand, Date eroeffungsdatum, LatLng koordinaten) {
        this.lokalID = lokalID;
        this.name = name;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.lokalart = lokalart;
        this.nation = nation;
        this.spez = spez;
        this.menu = menu;
        this.menustand = menustand;
        this.eroeffungsdatum = eroeffungsdatum;
        this.koordinaten = koordinaten;


    }
}
