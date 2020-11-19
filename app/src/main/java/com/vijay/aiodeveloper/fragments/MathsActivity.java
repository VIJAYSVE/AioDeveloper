package com.vijay.aiodeveloper.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vijay.aiodeveloper.Activity.MathListActivity;
import com.vijay.aiodeveloper.R;

/**
 * Created by Nabeel-PC on 20-06-2017.
 */

public class MathsActivity extends Fragment implements View.OnClickListener {
    Button formulas, tutorials;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.maths_layout, null);
        formulas = (Button) view.findViewById(R.id.formulas);
        formulas.setOnClickListener(this);
        getActivity().setTitle("Maths Formulas");

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.formulas:
                Intent intentmaths = new Intent(getActivity(), MathListActivity.class);
                startActivity(intentmaths);
                break;
        }
    }
}
