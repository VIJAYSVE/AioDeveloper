package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringJavaList;

public class JavaWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_web_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        myWebView=(WebView)findViewById(R.id.webview);

        WebSettings settings = myWebView.getSettings();
        // settings.setUseWideViewPort(true);
        // settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        // settings.setDefaultZoom(WebSettings.ZoomDensity.FAR);

        Intent myIntent = getIntent();
        if (myIntent.hasExtra("p1")){

            myWebView.loadData(StringJavaList.program1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringJavaList.program2,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringJavaList.program3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringJavaList.program4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringJavaList.program5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringJavaList.program6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringJavaList.program7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadData(StringJavaList.program8,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringJavaList.program9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringJavaList.program10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringJavaList.program11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringJavaList.program12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringJavaList.program13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringJavaList.program14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadData(StringJavaList.program15,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadData(StringJavaList.program16,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadData(StringJavaList.program17,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadData(StringJavaList.program18,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadData(StringJavaList.program19,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadData(StringJavaList.program20,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p21")){
            myWebView.loadData(StringJavaList.program21,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p22")){
            myWebView.loadData(StringJavaList.program22,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p23")){
            myWebView.loadUrl("file:///android_asset/java/helloworldapplet.html");
        }
        else if (myIntent.hasExtra("p24")){
            myWebView.loadData(StringJavaList.program24,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p25")){
            myWebView.loadData(StringJavaList.program25,"text/html","UTF-8");
        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
