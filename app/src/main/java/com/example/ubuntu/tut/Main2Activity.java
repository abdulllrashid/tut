package com.example.ubuntu.tut;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        String s=getIntent().getStringExtra("m");
        WebView w=(WebView)findViewById(R.id.web);
        w.loadUrl(s);

        WebSettings webSettings = w.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.video:
                Intent i1=new Intent(this,Main4Activity.class);
                startActivity(i1);
                break;
            case R.id.tutorial:
                Intent i2=new Intent(this,MainActivity.class);
                startActivity(i2);
                break;
            case R.id.events:
                Intent i3=new Intent(this,Main5Activity.class);
                startActivity(i3);
                break;
        }
        return false;
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(getApplication()).inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                Toast t = Toast.makeText(this, "future update", Toast.LENGTH_SHORT);
                t.show();
                break;
            case R.id.help:
                break;
            case R.id.about:
                Intent i3=new Intent(this,about.class);
                startActivity(i3);
                break;
            default:
                super.onOptionsItemSelected(item);
        }
        return true;
    }

}
