package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringCplus;

public class CPlusWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_web_view);
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

            myWebView.loadData(StringCplus.cplusprogram1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringCplus.cplusprogram2,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringCplus.cplusprogram3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringCplus.cplusprogram4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringCplus.cplusprogram5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringCplus.cplusprogram6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringCplus.cplusprogram7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadData(StringCplus.cplusprogram8,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringCplus.cplusprogram9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringCplus.cplusprogram10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringCplus.cplusprogram11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringCplus.cplusprogram12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringCplus.cplusprogram13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringCplus.cplusprogram14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadData(StringCplus.cplusprogram15,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadData(StringCplus.cplusprogram16,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadData(StringCplus.cplusprogram17,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadData(StringCplus.cplusprogram18,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadData(StringCplus.cplusprogram19,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadData(StringCplus.cplusprogram20,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p21")){
            myWebView.loadData(StringCplus.cplusprogram21,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p22")){
            myWebView.loadData(StringCplus.cplusprogram22,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p23")){
            myWebView.loadData(StringCplus.cplusprogram23,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p24")){
            myWebView.loadData(StringCplus.cplusprogram24,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p25")){
            myWebView.loadData(StringCplus.cplusprogram25,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p26")){
            myWebView.loadData(StringCplus.cplusprogram26,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p27")){
            myWebView.loadData(StringCplus.cplusprogram27,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p28")){
            myWebView.loadData(StringCplus.cplusprogram28,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p29")){
            myWebView.loadData(StringCplus.cplusprogram29,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p30")){
            myWebView.loadData(StringCplus.cplusprogram30,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p31")){
            myWebView.loadData(StringCplus.cplusprogram31,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p32")){
            myWebView.loadData(StringCplus.cplusprogram32,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p33")){
            myWebView.loadData(StringCplus.cplusprogram33,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p34")){
            myWebView.loadData(StringCplus.cplusprogram34,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p35")){
            myWebView.loadData(StringCplus.cplusprogram35,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p36")){
            myWebView.loadData(StringCplus.cplusprogram36,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p37")){
            myWebView.loadData(StringCplus.cplusprogram37,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p38")){
            myWebView.loadData(StringCplus.cplusprogram38,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p39")){
            myWebView.loadData(StringCplus.cplusprogram39,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p40")){
            myWebView.loadData(StringCplus.cplusprogram40,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p41")){
            myWebView.loadData(StringCplus.cplusprogram41,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p42")){
            myWebView.loadData(StringCplus.cplusprogram42,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p43")){
            myWebView.loadData(StringCplus.cplusprogram43,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p44")){
            myWebView.loadData(StringCplus.cplusprogram44,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p45")){
            myWebView.loadData(StringCplus.cplusprogram45,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p46")){
            myWebView.loadData(StringCplus.cplusprogram46,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p47")){
            myWebView.loadData(StringCplus.cplusprogram47,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p48")){
            myWebView.loadData(StringCplus.cplusprogram48,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p49")){
            myWebView.loadData(StringCplus.cplusprogram49,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p50")){
            myWebView.loadData(StringCplus.cplusprogram50,"text/html","UTF-8");
        }


    }
}
