package com.example.shenron.introapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroSliderActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        // Note here that we DO NOT use setContentView();

        addSlide(AppIntroFragment.newInstance("Slide 1", "Description 1",
                R.drawable.slider_one, ContextCompat.getColor(getApplicationContext(), R.color.slide_one)));

        addSlide(AppIntroFragment.newInstance("Slide 2", "Description 2",
                R.drawable.slider_two, ContextCompat.getColor(getApplicationContext(), R.color.slide_two)));

        addSlide(AppIntroFragment.newInstance("Slide 3", "Description 3",
                R.drawable.slider_three, ContextCompat.getColor(getApplicationContext(), R.color.slide_three)));

        addSlide(AppIntroFragment.newInstance("Slide 4", "Description 4",
                R.drawable.slider_four, ContextCompat.getColor(getApplicationContext(), R.color.slide_four)));


    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        finish();
        startActivity(new Intent(this,MainActivity.class));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        finish();
        startActivity(new Intent(this,MainActivity.class));
    }

}
