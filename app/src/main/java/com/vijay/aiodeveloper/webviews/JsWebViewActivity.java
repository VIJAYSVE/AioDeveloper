package com.vijay.aiodeveloper.webviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.strings.StringJavascript;

public class JsWebViewActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_js_web_view);
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
            myWebView.loadData(StringJavascript.javascript1,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p2")){
            myWebView.loadData(StringJavascript.javascript2,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p3")){
            myWebView.loadData(StringJavascript.javascript3,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p4")){
            myWebView.loadData(StringJavascript.javascript4,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p5")){
            myWebView.loadData(StringJavascript.javascript5,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p6")){
            myWebView.loadData(StringJavascript.javascript6,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p7")){
            myWebView.loadData(StringJavascript.javascript7,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p8")){
            myWebView.loadData(StringJavascript.javascript8,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p9")){
            myWebView.loadData(StringJavascript.javascript9,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p10")){
            myWebView.loadData(StringJavascript.javascript10,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p11")){
            myWebView.loadData(StringJavascript.javascript11,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p12")){
            myWebView.loadData(StringJavascript.javascript12,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p13")){
            myWebView.loadData(StringJavascript.javascript13,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p14")){
            myWebView.loadData(StringJavascript.javascript14,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p15")){
            myWebView.loadData(StringJavascript.javascript15,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p16")){
            myWebView.loadData(StringJavascript.javascript16,"text/html","UTF-8");

        }
        else if (myIntent.hasExtra("p17")){
            myWebView.loadData(StringJavascript.javascript17,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p18")){
            myWebView.loadData(StringJavascript.javascript18,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p19")){
            myWebView.loadData(StringJavascript.javascript19,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p20")){
            myWebView.loadData(StringJavascript.javascript20,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p21")){
            myWebView.loadData(StringJavascript.javascript21,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p22")){
            myWebView.loadData(StringJavascript.javascript22,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p23")){
            myWebView.loadData(StringJavascript.javascript23,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p24")){
            myWebView.loadData(StringJavascript.javascript24,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p25")){
            myWebView.loadData(StringJavascript.javascript25,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p26")){
            myWebView.loadData(StringJavascript.javascript26,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p27")){
            myWebView.loadData(StringJavascript.javascript27,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p28")){
            myWebView.loadData(StringJavascript.javascript28,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p29")){
            myWebView.loadData(StringJavascript.javascript29,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p30")){
            myWebView.loadData(StringJavascript.javascript30,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p31")){
            myWebView.loadData(StringJavascript.javascript31,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p32")){
            myWebView.loadData(StringJavascript.javascript32,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p33")){
            myWebView.loadData(StringJavascript.javascript33,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p34")){
            myWebView.loadData(StringJavascript.javascript34,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p35")){
            myWebView.loadData(StringJavascript.javascript35,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p36")){
            myWebView.loadData(StringJavascript.javascript36,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p37")){
            myWebView.loadData(StringJavascript.javascript37,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p38")){
            myWebView.loadData(StringJavascript.javascript38,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p39")){
            myWebView.loadData(StringJavascript.javascript39,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p40")){
            myWebView.loadData(StringJavascript.javascript40,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p41")){
            myWebView.loadData(StringJavascript.javascript41,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p42")){
            myWebView.loadData(StringJavascript.javascript42,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p43")){
            myWebView.loadData(StringJavascript.javascript43,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p44")){
            myWebView.loadData(StringJavascript.javascript44,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p45")){
            myWebView.loadData(StringJavascript.javascript45,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p46")){
            myWebView.loadData(StringJavascript.javascript46,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p47")){
            myWebView.loadData(StringJavascript.javascript47,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p48")){
            myWebView.loadData(StringJavascript.javascript48,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p49")){
            myWebView.loadData(StringJavascript.javascript49,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p50")){
            myWebView.loadData(StringJavascript.javascript50,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p51")){
            myWebView.loadData(StringJavascript.javascript51,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p52")){
            myWebView.loadData(StringJavascript.javascript52,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p53")){
            myWebView.loadData(StringJavascript.javascript53,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p54")){
            myWebView.loadData(StringJavascript.javascript54,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p55")){
            myWebView.loadData(StringJavascript.javascript55,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p56")){
            myWebView.loadData(StringJavascript.javascript56,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p57")){
            myWebView.loadData(StringJavascript.javascript57,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p58")){
            myWebView.loadData(StringJavascript.javascript58,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p59")){
            myWebView.loadData(StringJavascript.javascript59,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p60")){
            myWebView.loadData(StringJavascript.javascript60,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p61")){
            myWebView.loadData(StringJavascript.javascript61,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p62")){
            myWebView.loadData(StringJavascript.javascript62,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p63")){
            myWebView.loadData(StringJavascript.javascript63,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p64")){
            myWebView.loadData(StringJavascript.javascript64,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p65")){
            myWebView.loadData(StringJavascript.javascript65,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p66")){
            myWebView.loadData(StringJavascript.javascript66,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p67")){
            myWebView.loadData(StringJavascript.javascript67,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p68")){
            myWebView.loadData(StringJavascript.javascript68,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p69")){
            myWebView.loadData(StringJavascript.javascript69,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p70")){
            myWebView.loadData(StringJavascript.javascript70,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p71")){
            myWebView.loadData(StringJavascript.javascript71,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p72")){
            myWebView.loadData(StringJavascript.javascript72,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p73")){
            myWebView.loadData(StringJavascript.javascript73,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p74")){
            myWebView.loadData(StringJavascript.javascript74,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p75")){
            myWebView.loadData(StringJavascript.javascript75,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p76")){
            myWebView.loadData(StringJavascript.javascript76,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p77")){
            myWebView.loadData(StringJavascript.javascript77,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p78")){
            myWebView.loadData(StringJavascript.javascript78,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p79")){
            myWebView.loadData(StringJavascript.javascript79,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p80")){
            myWebView.loadData(StringJavascript.javascript80,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p81")){
            myWebView.loadData(StringJavascript.javascript81,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p82")){
            myWebView.loadData(StringJavascript.javascript81,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p83")){
            myWebView.loadData(StringJavascript.javascript83,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p84")){
            myWebView.loadData(StringJavascript.javascript84,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p85")){
            myWebView.loadData(StringJavascript.javascript85,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p86")){
            myWebView.loadData(StringJavascript.javascript86,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p87")){
            myWebView.loadData(StringJavascript.javascript87,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p88")){
            myWebView.loadData(StringJavascript.javascript88,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p89")){
            myWebView.loadData(StringJavascript.javascript89,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p90")){
            myWebView.loadData(StringJavascript.javascript90,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p91")){
            myWebView.loadData(StringJavascript.javascript91,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p92")){
            myWebView.loadData(StringJavascript.javascript92,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p93")){
            myWebView.loadData(StringJavascript.javascript93,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p94")){
            myWebView.loadData(StringJavascript.javascript94,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p95")){
            myWebView.loadData(StringJavascript.javascript95,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p96")){
            myWebView.loadData(StringJavascript.javascript96,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p97")){
            myWebView.loadData(StringJavascript.javascript97,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p98")){
            myWebView.loadData(StringJavascript.javascript98,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p99")){
            myWebView.loadData(StringJavascript.javascript99,"text/html","UTF-8");
        }
        else if (myIntent.hasExtra("p100")){
            myWebView.loadData(StringJavascript.javascript100,"text/html","UTF-8");
        }



    }
}
