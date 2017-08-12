package com.example.shenron.introapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    boolean firstStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        for(int i=0;i<1700;i++)
        {
        }

        SharedPreferences settings = getSharedPreferences("PREFS",0);
        firstStart = settings.getBoolean("firs_time_start", true);

        if(firstStart)
        {
            SharedPreferences.Editor mEditor = settings.edit();
            mEditor.putBoolean("firs_time_start", false);
            mEditor.commit();
            startActivity(new Intent(this,IntroSliderActivity.class));
        }
        else
        {
            startActivity(new Intent(this,MainActivity.class));
        }


    }
}
