package com.vijay.aiodeveloper.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.vijay.aiodeveloper.R;

/**
 * Created by Nabeel-PC on 11-07-2017.
 */

public class AboutUs extends Fragment implements View.OnClickListener{
    RelativeLayout rl1,rl2,rl3,rl4,rl5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us, null);
        rl1=(RelativeLayout)view.findViewById(R.id.rl1);
        rl1.setOnClickListener(this);
        rl2=(RelativeLayout)view.findViewById(R.id.rl2);
        rl2.setOnClickListener(this);
        rl3=(RelativeLayout)view.findViewById(R.id.rl3);
        rl3.setOnClickListener(this);
        rl4=(RelativeLayout)view.findViewById(R.id.rl4);
        rl4.setOnClickListener(this);
        rl5=(RelativeLayout)view.findViewById(R.id.rl5);
        rl5.setOnClickListener(this);
        getActivity().setTitle("About Us");

        return view;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl1:
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/viju.varma.7"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/viju.varma.7")));

                }
                break;
            case R.id.rl2:
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003979405830"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100003979405830")));
                }
                break;
            case R.id.rl3:
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100010738450126"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100010738450126")));
                }
                break;
            case R.id.rl4:
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100009316624712"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100009316624712")));
                }
                break;
            case R.id.rl5:
                try{
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100004361826792"));
                    startActivity(intent);

                }catch(Exception e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100004361826792")));
                }
                break;
        }

    }
}
