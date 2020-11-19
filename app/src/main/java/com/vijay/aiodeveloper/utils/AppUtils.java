package com.vijay.aiodeveloper.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by Nabeel-PC on 19-06-2017.
 */

public class AppUtils {
    public static void toast(Context ctx,String msg){
        Toast.makeText(ctx,msg,Toast.LENGTH_SHORT).show();
    }

    public static int checkLogin(Context ctx, String email, String password){
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(ctx);
        String pemail=preferences.getString(Contstans.KEY_UNM,"");
        String ppassword=preferences.getString(Contstans.KEY_PWD,"");

        if (pemail.length()==0){
            return 0;
        }
        else if(pemail.equals(email)&&ppassword.equals(password)){
            return 1;
        }
        else{
            return 2;
        }
    }
}
