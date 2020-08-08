package com.example.gridtry;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefConfig {

    private static final String MY_PREFERENCE_NAME = "package com.example.gridtry";
    private static final String PREF_TOTAL_KEY = "pref_total_key";


    public static void saveTotalInPref(Context context, int totali){
        SharedPreferences pref=context.getSharedPreferences(MY_PREFERENCE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putInt(PREF_TOTAL_KEY,totali);
        editor.apply();
    }

    public static int loadTotalFromPref(Context context){
        SharedPreferences pref=context.getSharedPreferences(MY_PREFERENCE_NAME,Context.MODE_PRIVATE);
        return pref.getInt(PREF_TOTAL_KEY,0);
    }

}
