package com.vijay.aiodeveloper;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.vijay.aiodeveloper.fragments.DsActivity;
import com.vijay.aiodeveloper.fragments.JavaActivity;
import com.vijay.aiodeveloper.fragments.MathsActivity;
import com.vijay.aiodeveloper.fragments.MicroProcessorFragment;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{
    private InterstitialAd mInterstitialAd;

    RelativeLayout item_languages,item_ds,item_micro,item_maths,item_about,item_logout;
    final Context context=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        item_languages=(RelativeLayout)  findViewById(R.id.item_languages);
        item_ds=(RelativeLayout)  findViewById(R.id.item_ds);
        item_micro=(RelativeLayout)  findViewById(R.id.item_micro);
        item_maths=(RelativeLayout)findViewById(R.id.item_maths);
        item_about=(RelativeLayout)findViewById(R.id.item_about);
        item_logout=(RelativeLayout)findViewById(R.id.item_logout);
        item_languages.setOnClickListener(this);
        item_ds.setOnClickListener(this);
        item_micro.setOnClickListener(this);
        item_maths.setOnClickListener(this);
        item_about.setOnClickListener(this);
        item_logout.setOnClickListener(this);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);

        onClick(item_languages);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            //
        }

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_layout);

        Button no = (Button) dialog.findViewById(R.id.dialogButtonNO);
        // if button is clicked, exit the custom dialog
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button exit = (Button) dialog.findViewById(R.id.dialogButtonYES);
        // if button is clicked, close the custom dialog
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        Button rate = (Button) dialog.findViewById(R.id.dialogButtonrate);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                }
            }
        });
        dialog.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.rateus) {
            try {
                Intent rateIntent = rateIntentForUrl("market://details");
                startActivity(rateIntent);
            } catch (ActivityNotFoundException e) {
                Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
                startActivity(rateIntent);
            }
            return true;
        }
        else if (id==R.id.shareus){
            //sharing implementation here
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Programming KIT");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Now Learn All Programming Languages easily click here to visit https://play.google.com/store/apps/details?id=com.vijay.aiodeveloper&hl=en");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
            return true;
        }
        else if (id==R.id.action_settings){
            finish();
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private Intent rateIntentForUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
        int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
        if (Build.VERSION.SDK_INT >= 21) {
            flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        } else {
            //noinspection deprecation
            flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
        }
        intent.addFlags(flags);
        return intent;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.item_languages:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_window, new JavaActivity())
                        .addToBackStack(null).commit();
                break;
            case R.id.item_ds:
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_window, new DsActivity())
                        .addToBackStack(null).commit();
                break;

            case R.id.item_micro:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_window, new MicroProcessorFragment())
                        .addToBackStack(null).commit();
                break;
            case R.id.item_maths:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_window, new MathsActivity())
                        .addToBackStack(null).commit();
                break;
            case R.id.item_about:
                Intent about=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(about);
                break;
            case R.id.item_logout:
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
//                finish();
//                System.exit(0);
                break;

            default:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_window, new JavaActivity())
                        .addToBackStack(null).commit();
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
    }
  //  DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
  //  drawer.closeDrawer(GravityCompat.START);
  //  return true;
}
