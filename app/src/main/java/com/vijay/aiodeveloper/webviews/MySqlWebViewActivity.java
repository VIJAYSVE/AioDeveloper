package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringMySql;

public class MySqlWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sql_web_view);
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
            myWebView.loadData(StringMySql.mysql1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringMySql.mysql2,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringMySql.mysql3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringMySql.mysql4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringMySql.mysql5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringMySql.mysql6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringMySql.mysql7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadData(StringMySql.mysql8,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringMySql.mysql9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringMySql.mysql10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringMySql.mysql11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringMySql.mysql12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringMySql.mysql13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringMySql.mysql14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadData(StringMySql.mysql15,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadData(StringMySql.mysql16,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadData(StringMySql.mysql17,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadData(StringMySql.mysql18,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadData(StringMySql.mysql19,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadData(StringMySql.mysql20,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p21")){
            myWebView.loadData(StringMySql.mysql21,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p22")){
            myWebView.loadUrl("file:///android_asset/mysql/sqljoin.html");
        }
        else if (myIntent.hasExtra("p23")){
            myWebView.loadUrl("file:///android_asset/mysql/sqlleftjoin.html");
        }
        else if (myIntent.hasExtra("p24")){
            myWebView.loadUrl("file:///android_asset/mysql/sqlrightjoin.html");
        }
        else if (myIntent.hasExtra("p25")){
            myWebView.loadUrl("file:///android_asset/mysql/sqlfulljoin.html");
        }
        else if (myIntent.hasExtra("p26")){
            myWebView.loadData(StringMySql.mysql26,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p27")){
            myWebView.loadUrl("file:///android_asset/mysql/sqlunionclause.html");
        }
        else if (myIntent.hasExtra("p28")){
            myWebView.loadData(StringMySql.mysql28,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p29")){
            myWebView.loadData(StringMySql.mysql29,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p30")){
            myWebView.loadData(StringMySql.mysql30,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p31")){
            myWebView.loadData(StringMySql.mysql31,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p32")){
            myWebView.loadData(StringMySql.mysql32,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p33")){
            myWebView.loadData(StringMySql.mysql33,"text/html","UTF-8");
        }

    }
}
