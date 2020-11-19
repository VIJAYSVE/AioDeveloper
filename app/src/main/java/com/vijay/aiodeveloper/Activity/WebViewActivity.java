package com.vijay.aiodeveloper.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringCData;

public class WebViewActivity extends AppCompatActivity {
    private AdView adView;

    private WebView myWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
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

        MobileAds.initialize(this,
                "ca-app-pub-3940256099942544~3347511713");

        adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        Intent myIntent = getIntent();
        if (myIntent.hasExtra("p1")){

            myWebView.loadData(StringCData.program1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringCData.program2,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringCData.program3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringCData.program4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringCData.program5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringCData.program6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringCData.program7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadData(StringCData.program8,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringCData.program9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringCData.program10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringCData.program11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringCData.program12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringCData.program13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringCData.program14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadData(StringCData.program15,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadData(StringCData.program16,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadData(StringCData.program17,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadData(StringCData.program18,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadData(StringCData.program19,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadData(StringCData.program20,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p21")){
            myWebView.loadData(StringCData.program21,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p22")){
            myWebView.loadData(StringCData.program22,"text/html","UTF-8");
        }


    }
}
