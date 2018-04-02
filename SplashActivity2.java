package com.example.android.shieldexams;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity2 extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash2);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        /* Duration of wait */
        int SPLASH_DISPLAY_LENGTH = 5000;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashActivity2.this,MainActivity.class);
                SplashActivity2.this.startActivity(mainIntent);
                SplashActivity2.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
