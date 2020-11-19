package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringRLanguage;

public class RWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rweb_view);
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
            myWebView.loadData(StringRLanguage.rlanguage1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringRLanguage.rlanguage2,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringRLanguage.rlanguage3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringRLanguage.rlanguage4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringRLanguage.rlanguage5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringRLanguage.rlanguage6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringRLanguage.rlanguage7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadUrl("file:///android_asset/rlanguage/rcontrol.html");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringRLanguage.rlanguage9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringRLanguage.rlanguage10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringRLanguage.rlanguage11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringRLanguage.rlanguage12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringRLanguage.rlanguage13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringRLanguage.rlanguage14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadUrl("file:///android_asset/rlanguage/3D plot.html");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadUrl("file:///android_asset/rlanguage/3D plot.html");
        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadUrl("file:///android_asset/rlanguage/3D plot.html");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadUrl("file:///android_asset/rlanguage/pie.html");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadUrl("file:///android_asset/rlanguage/3D plot.html");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadUrl("file:///android_asset/rlanguage/3D plot.html");
        }

    }
}
