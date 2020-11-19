package com.vijay.aiodeveloper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.vijay.aiodeveloper.fragments.AboutApp;
import com.vijay.aiodeveloper.fragments.AboutUs;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{
    Button aboutapp,aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        aboutapp=(Button)findViewById(R.id.aboutapp);
        aboutapp.setOnClickListener(this);
        aboutus=(Button)findViewById(R.id.aboutus);
        aboutus.setOnClickListener(this);

        onClick(aboutapp);
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        if(view == findViewById(R.id.aboutapp)){
            fragment = new AboutApp();
        } else {
            fragment = new AboutUs();
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_about, fragment);
        transaction.commit();
    }
}
