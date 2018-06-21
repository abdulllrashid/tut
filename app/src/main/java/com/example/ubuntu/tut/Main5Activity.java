package com.example.ubuntu.tut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);




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

    public void gdgkozhikode(View v)
    {
        String s[]=new String[5];
        s[0]="GDG Kozhikode";
        s[1]="Saturday, June 23, 2018";
        s[2]="UL CyberPark";
        s[3]= "Hangout with local developers and experience Google I/O together" +
                "Google I/O Extended events help developers from around the world take part in the Google I/O experience.";
        s[4]="https://www.meetup.com/GDG-Kozhikode/events/248914711/";
        Intent i=new Intent(this,Main6Activity.class);
        i.putExtra("msg",s);
        startActivity(i);
    }



    public void Techmeet(View v)
    {
        String s[]=new String[5];
        s[0]="TechMeet360";
        s[1]="Saturday, July 7, 2018";
        s[2]="Hubfly\n" +
                "Veejay Centre Race Course Road · Coimbatore";
        s[3]= "TechMeet360 is a monthly technology meetup event in Coimbatore for technology enthusiasts who are keen to make a mark in the technology arena. With TechMeet360, there are endless possibilities to explore different technologies and learn from the industry experts. Join us for these events and build your technology expertise.";
        s[4]="https://www.meetup.com/TechMeet360-A-BizTalk360-Community-Initiative/";
        Intent i=new Intent(this,Main6Activity.class);
        i.putExtra("msg",s);
        startActivity(i);
    }

    public void CBE(View v)

    {

        String s[]=new String[5];
        s[0]="Geeknight Coimbatore";
        s[1]="Thursday, June 21, 2018";
        s[2]="\n" +
                "ThoughtWorks Technologies\n" +
                "KCT Tech Park, First Floor Thudiyalur Rd, Saravanampatty · Coimbatore";
        s[3]= "Geek Night Coimbatore is a monthly event to promote sharing of technical knowledge and increase collaboration between geeks in Coimbatore. It is organized by a passionate group of programmers and sponsored by ThoughtWorks.";
        s[4]="https://www.meetup.com/Geeknight-Coimbatore/";
        Intent i=new Intent(this,Main6Activity.class);
        i.putExtra("msg",s);
        startActivity(i);
    }

    public void kochipython(View v)
    {
        String s[]=new String[5];
        s[0]="Kochi Python";
        s[1]="Saturday, July 14, 2018\n";
        s[2]="Kerala Startup Mission, Kerala Technology Innovation Zone (KTIZ)\n" +
                "Kalamasseri, near Kakkanad · Cochin\n";
        s[3]= "KochiPython is where Pythonistas of Kochi come together and share what we love the most, experiences.";
        s[4]="https://www.meetup.com/KochiPython/events/xjqtrpyxkbsb/";
        Intent i=new Intent(this,Main6Activity.class);
        i.putExtra("msg",s);
        startActivity(i);
    }
    public void microsoft(View v)
    {
        String s[]=new String[5];
        s[0]="K-MUG";
        s[1]="Saturday, June 23, 2018";
        s[2]="ORION INDIA SYSTEMS PVT. LTD" +
                "2nd FLOOR, LULU CYBER TOWER - 1 · INFOPARK, KOCHI";
        s[3]= "Ionic, React Native, Azure";
        s[4]="https://www.meetup.com/KMUG-MEETUP/events/251745794/";
        Intent i=new Intent(this,Main6Activity.class);
        i.putExtra("msg",s);
        startActivity(i);
    }
    public void datascience(View v)
    {
        String s[]=new String[5];
        s[0]="Introduction To Software Testing";
        s[1]="Saturday, June 23, 2018";
        s[2]="Software testing is an emerging field.In this meet-up We will discuss What is Software Testing, Types of Testing, Test case preparation etc. Please contact to the below number for more details.\n" +
                "\" +\n" +
                "                \"Vishal :[masked]\n";                ;
        s[3]= "Software testing is an emerging field.In this meet-up We will discuss What is Software Testing, Types of Testing, Test case preparation etc. Please contact to the below number for more details.\n" +
                "\" +\n" +
                "                \"Vishal :[masked]\n";
        s[4]="https://www.meetup.com/Data-Science-Workshops/events/251548290/";
        Intent i=new Intent(this,Main6Activity.class);
        i.putExtra("msg",s);
        startActivity(i);
    }
}

