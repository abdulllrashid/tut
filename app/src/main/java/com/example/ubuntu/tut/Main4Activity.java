package com.example.ubuntu.tut;

import android.content.Intent;
import android.graphics.BitmapFactory;
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
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener,BottomNavigationView.OnNavigationItemSelectedListener{
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        c1=(CardView)findViewById(R.id.card_view4);
        c2=(CardView)findViewById(R.id.card_view5);
        c3=(CardView)findViewById(R.id.card_view6);
        c4=(CardView)findViewById(R.id.card_view7);
        c5=(CardView)findViewById(R.id.card_view8);
        c6=(CardView)findViewById(R.id.card_view9);
        c7=(CardView)findViewById(R.id.card_view10);
        c8=(CardView)findViewById(R.id.card_view11);
        c9=(CardView)findViewById(R.id.card_view12);
        c10=(CardView)findViewById(R.id.card_view13);
        c11=(CardView)findViewById(R.id.card_view14);
        c12=(CardView)findViewById(R.id.card_view15);
        c13=(CardView)findViewById(R.id.card_view16);
        c14=(CardView)findViewById(R.id.card_view17);
        c15=(CardView)findViewById(R.id.card_view18);




        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);
        c11.setOnClickListener(this);
        c12.setOnClickListener(this);
        c13.setOnClickListener(this);
        c14.setOnClickListener(this);
        c15.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.card_view4:
                Intent i = new Intent(this, Main2Activity.class);
                i.putExtra("m", "https://tubeunblock.info/watch?v=y3UH2gAhwPI");
                startActivity(i);
                break;
            case R.id.card_view5:
                Intent i1 = new Intent(this, Main2Activity.class);
                i1.putExtra("m", "https://tubeunblock.info/watch?v=r5cpmuLLmKs");
                startActivity(i1);
                break;
            case R.id.card_view6:
                Intent i2 = new Intent(this, Main2Activity.class);
                i2.putExtra("m", "https://tubeunblock.info/watch?v=yX8KuPZCAMo");
                startActivity(i2);
                break;
            case R.id.card_view7:
                Intent i3 = new Intent(this, Main2Activity.class);
                i3.putExtra("m", "https://tubeunblock.info/watch?v=qvHXRuGPHl0");
                startActivity(i3);
                break;
            case R.id.card_view8:
                Intent i4 = new Intent(this, Main2Activity.class);
                i4.putExtra("m", "https://tubeunblock.info/watch?v=7Vtl2WggqOg");
                startActivity(i4);
                break;
            case R.id.card_view9:
                Intent i5 = new Intent(this, Main2Activity.class);
                i5.putExtra("m", "https://tubeunblock.info/watch?v=2nKCO-Op68M");
                startActivity(i5);
                break;
            case R.id.card_view10:
                Intent i6 = new Intent(this, Main2Activity.class);
                i6.putExtra("m", "https://tubeunblock.info/watch?v=93E_GzvpMA0");
                startActivity(i6);
                break;
            case R.id.card_view11:
                Intent i7 = new Intent(this, Main2Activity.class);
                i7.putExtra("m", "https://tubeunblock.info/watch?v=i2DHWxtRqpE");
                startActivity(i7);
                break;
            case R.id.card_view12:
                Intent i8 = new Intent(this, Main2Activity.class);
                i8.putExtra("m", "https://tubeunblock.info/watch?v=i2DHWxtRqpE");
                startActivity(i8);
                break;
            case R.id.card_view13:
                Intent i9 = new Intent(this, Main2Activity.class);
                i9.putExtra("m", "https://tubeunblock.info/watch?v=FNkK3aquE1U");
                startActivity(i9);
                break;
            case R.id.card_view14:
                Intent i10 = new Intent(this, Main2Activity.class);
                i10.putExtra("m", "https://tubeunblock.info/watch?v=CEPCGXQ7IQg");
                startActivity(i10);
                break;
            case R.id.card_view15:
                Intent i11 = new Intent(this, Main2Activity.class);
                i11.putExtra("m", "https://tubeunblock.info/watch?v=nDkjpcvmZEI");
                startActivity(i11);
                break;
            case R.id.card_view16:
                Intent i12 = new Intent(this, Main2Activity.class);
                i12.putExtra("m", "https://tubeunblock.info/watch?v=UQ3_R0UwVJQ");
                startActivity(i12);
                break;
            case R.id.card_view17:
                Intent i13 = new Intent(this, Main2Activity.class);
                i13.putExtra("m", "https://tubeunblock.info/watch?v=HBNH8tzsfVM");
                startActivity(i13);
                break;
            case R.id.card_view18:
                Intent i14 = new Intent(this, Main2Activity.class);
                i14.putExtra("m", "https://tubeunblock.info/watch?v=HBNH8tzsfVM");
                startActivity(i14);
                break;


        }
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
