package com.vijay.aiodeveloper.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vijay.aiodeveloper.R;

/**
 * Created by Nabeel-PC on 11-07-2017.
 */

public class AboutApp extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_app, null);
        getActivity().setTitle("About App");

        return view;
    }

}