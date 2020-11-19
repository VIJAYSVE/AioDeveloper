package com.vijay.aiodeveloper.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vijay.aiodeveloper.Activity.MicroListActivity;
import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.webviews.MicroWebViewActivity;

/**
 * Created by Nabeel-PC on 20-06-2017.
 */

public class MicroProcessorFragment extends Fragment implements View.OnClickListener{
    Button assemblyprograms, theory;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.microprocessor_layout,null);
        assemblyprograms = (Button) view.findViewById(R.id.assemblyprograms);
        theory=(Button)view.findViewById(R.id.theory);
        assemblyprograms.setOnClickListener(this);
        theory.setOnClickListener(this);
        getActivity().setTitle("Microprocessor");
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.assemblyprograms:
                Intent intentpro = new Intent(getActivity(), MicroListActivity.class);
                startActivity(intentpro);
                break;
            case R.id.theory:
                Intent intenttheo=new Intent(getActivity(), MicroWebViewActivity.class);
                intenttheo.putExtra("theory", "theory1");
                startActivity(intenttheo);
        }

    }
}
