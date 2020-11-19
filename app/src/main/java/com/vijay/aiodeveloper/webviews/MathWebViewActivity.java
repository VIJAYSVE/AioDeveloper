package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;

public class MathWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_web_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        myWebView = (WebView) findViewById(R.id.webview);
        WebSettings settings = myWebView.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        // settings.setDefaultZoom(WebSettings.ZoomDensity.FAR);

        Intent myIntent = getIntent();
        if (myIntent.hasExtra("p1")){

            myWebView.loadUrl("file:///android_asset/math/Algebra/algebra.html");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadUrl("file:///android_asset/math/geo/geometry.html");
        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadUrl("file:///android_asset/math/Anageo/Anageo.html");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadUrl("file:///android_asset/math/Trign/Trignometry.html");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadUrl("file:///android_asset/math/Deriv/Deriv.html");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadUrl("file:///android_asset/math/Integ/Integ.html");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadUrl("file:///android_asset/math/Lapla/Lapla.html");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadUrl("file:///android_asset/math/Four/Four.html");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadUrl("file:///android_asset/math/Series/Series.html");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadUrl("file:///android_asset/math/Num_method/Num_method.html");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadUrl("file:///android_asset/math/VectCal/VectCal.html");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadUrl("file:///android_asset/math/beta/beta.html");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadUrl("file:///android_asset/math/zTrans/zTrans.html");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadUrl("file:///android_asset/math/Prob/Prob.html");
        }
    }
}
