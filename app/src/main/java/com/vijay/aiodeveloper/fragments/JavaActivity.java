package com.vijay.aiodeveloper.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.vijay.aiodeveloper.Activity.CListActivity;
import com.vijay.aiodeveloper.Activity.CPlusActivity;
import com.vijay.aiodeveloper.Activity.CssActivity;
import com.vijay.aiodeveloper.Activity.HtmlActivity;
import com.vijay.aiodeveloper.Activity.JavaListActivity;
import com.vijay.aiodeveloper.Activity.JavaScriptActivity;
import com.vijay.aiodeveloper.Activity.MySqlActivity;
import com.vijay.aiodeveloper.Activity.PythonActivity;
import com.vijay.aiodeveloper.Activity.RListActivity;
import com.vijay.aiodeveloper.Activity.SqlActivity;
import com.vijay.aiodeveloper.R;

/**
 * Created by Nabeel-PC on 20-06-2017.
 */

public class JavaActivity extends Fragment implements View.OnClickListener{
    ImageView java, c, ds, python,cplus,sql,html,javascript,css,mysql,rlang;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.subjects_layout, null);
        java = (ImageView)view.findViewById(R.id.java);
        c = (ImageView)view.findViewById(R.id.c);
        python = (ImageView)view.findViewById(R.id.python);
        cplus = (ImageView)view.findViewById(R.id.cplus);
        sql = (ImageView)view.findViewById(R.id.sql);
        html = (ImageView)view.findViewById(R.id.html);
        javascript = (ImageView)view.findViewById(R.id.javascript);
        css = (ImageView)view.findViewById(R.id.css);
        mysql = (ImageView)view.findViewById(R.id.mysql);
        rlang = (ImageView)view.findViewById(R.id.rlang);
        java.setOnClickListener(this);
        c.setOnClickListener(this);
        python.setOnClickListener(this);
        cplus.setOnClickListener(this);
        sql.setOnClickListener(this);
        html.setOnClickListener(this);
        javascript.setOnClickListener(this);
        css.setOnClickListener(this);
        mysql.setOnClickListener(this);
        rlang.setOnClickListener(this);
        getActivity().setTitle("Languages");
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.java:
               Intent intentjava=new Intent(getActivity(), JavaListActivity.class);
               startActivity(intentjava);
//                Fragment fragment = new EnglishActivity();
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_window, fragment);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
                break;
            case R.id.c:
                Intent intentc=new Intent(getActivity(), CListActivity.class);
                startActivity(intentc);
                break;
            case R.id.python:
                Intent intentpython=new Intent(getActivity(), PythonActivity.class);
                startActivity(intentpython);
                break;
            case R.id.cplus:
                Intent intentcplus=new Intent(getActivity(), CPlusActivity.class);
                startActivity(intentcplus);
                break;
            case R.id.sql:
                Intent intentsql=new Intent(getActivity(), SqlActivity.class);
                startActivity(intentsql);
                break;
            case R.id.html:
                Intent intenthtml=new Intent(getActivity(), HtmlActivity.class);
                startActivity(intenthtml);
                break;
            case R.id.javascript:
                Intent intentjavascript=new Intent(getActivity(), JavaScriptActivity.class);
                startActivity(intentjavascript);
                break;
            case R.id.css:
                Intent intentcss=new Intent(getActivity(), CssActivity.class);
                startActivity(intentcss);
                break;
            case R.id.mysql:
                Intent intentmysql =new Intent(getActivity(), MySqlActivity.class);
                startActivity(intentmysql);
                break;
            case R.id.rlang:
                Intent intentrlang=new Intent(getActivity(), RListActivity.class);
                startActivity(intentrlang);
                break;
        }
    }
}


