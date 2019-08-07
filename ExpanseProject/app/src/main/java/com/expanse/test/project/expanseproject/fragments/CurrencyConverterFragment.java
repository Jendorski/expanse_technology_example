package com.expanse.test.project.expanseproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.expanse.test.project.expanseproject.R;

public class CurrencyConverterFragment extends Fragment {

    // declare three arrays for content of spinner
    String[] strings = {"Inter Milan","AC Milan",
            "Manchester City", "Barcelona", "Valencia","Juventus", "Italia","Italia",
            "England", "Spain", "Spain","Italia"};

/*
    int arr_images[] = { R.drawable.pic1,
            R.drawable.pic2, R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5, R.drawable.pic6};
*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.currency_converter, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
