package com.example.foodapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyFilterDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); //< Objekt von Dialog builder wird erstellt

        LayoutInflater inflater = getActivity().getLayoutInflater(); //< Objekt von Layout inflater wird erzeugt

        builder.setView(inflater.inflate(R.layout.custom_dialog_layout, null)); //< hier wird das Layout, bzw. die Activity zugewiesen


        return builder.create(); //< der builder, also die Activity wird zurückgegeben
    }
}
