package com.example.ubuntu.tut;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,BottomNavigationView.OnNavigationItemSelectedListener{
    CardView c1,c2,c3,c4;
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CardView)findViewById(R.id.card_view);
        c2=(CardView)findViewById(R.id.card_view1);
        c3=(CardView)findViewById(R.id.card_view2);
        c4=(CardView)findViewById(R.id.card_view3);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.card_view:
                Intent i=new Intent(this,Main2Activity.class);
                i.putExtra("m","https://www.w3schools.com/Html/");
                startActivity(i);
                break;
            case R.id.card_view1:
                Intent i1=new Intent(this,Main2Activity.class);
                i1.putExtra("m","https://www.w3schools.com/jS/default.asp");
                startActivity(i1);
                break;
            case R.id.card_view2:
                Intent i2=new Intent(this,Main2Activity.class);
                i2.putExtra("m","https://www.w3schools.com/python/");
                startActivity(i2);
                break;
            case R.id.card_view3:
                Intent i3=new Intent(this,Main2Activity.class);
                i3.putExtra("m","https://www.w3schools.com/w3css/w3css_templates.asp");
                startActivity(i3);
                break;
            default:
                Toast t=Toast.makeText(this,"No operation",Toast.LENGTH_SHORT);
                t.show();

        }

    }
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
