package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringPython;

public class PythonWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_web_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        myWebView = (WebView) findViewById(R.id.webview);
        WebSettings settings = myWebView.getSettings();
        // settings.setUseWideViewPort(true);
        // settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        // settings.setDefaultZoom(WebSettings.ZoomDensity.FAR);

        Intent myIntent = getIntent();
        if (myIntent.hasExtra("p1")){

            myWebView.loadData(StringPython.python1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringPython.python2,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringPython.python3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringPython.python4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringPython.python5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringPython.python6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringPython.python7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadData(StringPython.python8,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringPython.python9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringPython.python10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringPython.python11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringPython.python12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringPython.python13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringPython.python14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadData(StringPython.python15,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadData(StringPython.python16,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadData(StringPython.python17,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadData(StringPython.python18,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadData(StringPython.python19,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadData(StringPython.python20,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p21")){
            myWebView.loadData(StringPython.python21,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p22")){
            myWebView.loadData(StringPython.python22,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p23")){
            myWebView.loadData(StringPython.python23,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p24")){
            myWebView.loadData(StringPython.python24,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p25")){
            myWebView.loadData(StringPython.python25,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p26")){
            myWebView.loadData(StringPython.python26,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p27")){
            myWebView.loadData(StringPython.python27,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p28")){
            myWebView.loadData(StringPython.python28,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p29")){
            myWebView.loadData(StringPython.python29,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p30")){
            myWebView.loadData(StringPython.python30,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p31")){
            myWebView.loadData(StringPython.python31,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p32")){
            myWebView.loadData(StringPython.python32,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p33")){
            myWebView.loadData(StringPython.python33,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p34")){
            myWebView.loadData(StringPython.python34,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p35")){
            myWebView.loadData(StringPython.python35,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p36")){
            myWebView.loadData(StringPython.python36,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p37")){
            myWebView.loadData(StringPython.python37,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p38")){
            myWebView.loadData(StringPython.python38,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p39")){
            myWebView.loadData(StringPython.python39,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p40")){
            myWebView.loadData(StringPython.python40,"text/html","UTF-8");
        }
//        else if (myIntent.hasExtra("p41")){
//            myWebView.loadData(StringPython.program41,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p42")){
//            myWebView.loadData(StringPython.program42,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p43")){
//            myWebView.loadData(StringPython.program43,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p44")){
//            myWebView.loadData(StringPython.program44,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p45")){
//            myWebView.loadData(StringPython.program45,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p46")){
//            myWebView.loadData(StringPython.program46,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p47")){
//            myWebView.loadData(StringPython.program47,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p48")){
//            myWebView.loadData(StringCplus.program48,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p49")){
//            myWebView.loadData(StringPython.program49,"text/html","UTF-8");
//        }
//        else if (myIntent.hasExtra("p50")){
//            myWebView.loadData(StringCplus.program50,"text/html","UTF-8");
//        }
    }
}
