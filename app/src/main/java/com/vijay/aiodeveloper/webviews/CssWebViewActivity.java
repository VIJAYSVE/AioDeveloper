package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringCss;

public class CssWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_web_view);
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

            myWebView.loadData(StringCss.program1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringCss.program2,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringCss.program3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringCss.program4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringCss.program5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringCss.program6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringCss.program7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadData(StringCss.program8,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringCss.program9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringCss.program10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringCss.program11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringCss.program12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringCss.program13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringCss.program14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadData(StringCss.program15,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadData(StringCss.program16,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadData(StringCss.program17,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadData(StringCss.program18,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadData(StringCss.program19,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadData(StringCss.program20,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p21")){
            myWebView.loadData(StringCss.program21,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p22")){
            myWebView.loadData(StringCss.program22,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p23")){
            myWebView.loadData(StringCss.program23,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p24")){
            myWebView.loadData(StringCss.program24,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p25")){
            myWebView.loadData(StringCss.program25,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p26")){
            myWebView.loadData(StringCss.program26,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p27")){
            myWebView.loadData(StringCss.program27,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p28")){
            myWebView.loadData(StringCss.program28,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p29")){
            myWebView.loadData(StringCss.program29,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p30")){
            myWebView.loadData(StringCss.program30,"text/html","UTF-8");

        }
    }
}
