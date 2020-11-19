package com.vijay.aiodeveloper.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vijay.aiodeveloper.Activity.DSProgramsListActivity;
import com.vijay.aiodeveloper.R;

/**
 * Created by Nabeel-PC on 03-07-2017.
 */

public class DsActivity extends Fragment implements View.OnClickListener {
    Button programs, tutorials;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_data_structure, null);
        tutorials = (Button) view.findViewById(R.id.tutorials);
        programs=(Button)view.findViewById(R.id.programs);
        tutorials.setOnClickListener(this);
        programs.setOnClickListener(this);
        getActivity().setTitle("Data Structures");

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tutorials:
                Intent intenttut = new Intent(getActivity(), DSProgramsListActivity.class);
                intenttut.putExtra("b1","tutorials");
                startActivity(intenttut);
                break;
            case R.id.programs:
                Intent intentpro = new Intent(getActivity(), DSProgramsListActivity.class);
                intentpro.putExtra("b2","programs");
                startActivity(intentpro);
                break;
        }
    }
}