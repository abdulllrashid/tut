package com.example.ubuntu.tut;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;


public class Main8Activity extends AppCompatActivity {
    protected  boolean _active=true;
    protected  int _splashTime=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        ImageView i1 = (ImageView)findViewById(R.id.i1);
        i1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);




        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(9000);   // set the duration of splash screen
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Main8Activity.this, Main7Activity.class);
                    startActivity(intent);

                }
            }
        };
        timer.start();

    }
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}