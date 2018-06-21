package com.example.ubuntu.tut;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaCodec;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main9Activity extends AppCompatActivity implements View.OnFocusChangeListener {
    DbHelper db;
    int i=0;
    Pattern p, q, r;
    Matcher m, n, o;
    Spinner sp;
    int f = 0;
    String s[] = new String[5];
    EditText t1, t2, t3, t4;
    List<String> c1 = new ArrayList<String>();
    String[] sm = {"-SELECT DISTRICT-", "Malappuram", "Palakkad", "Kozhikkode", "Ernamkulam", "Thiruvanathapuram", "Kollam", "Pathanamthitta", "Kottayam", "Kasarkode", "kannur", "vayanad"};
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        db = new DbHelper(this);


        t1 = (EditText) findViewById(R.id.editText6);
        t2 = (EditText) findViewById(R.id.editText7);
        t3 = (EditText) findViewById(R.id.editText8);
        t4 = (EditText) findViewById(R.id.editText9);
        sp = (Spinner) findViewById(R.id.spinner);

        t1.setOnFocusChangeListener(this);
        t2.setOnFocusChangeListener(this);
        t3.setOnFocusChangeListener(this);
        t4.setOnFocusChangeListener(this);

        p = Pattern.compile("^[A-Za-z_-]{3,15}$");
        q = Pattern.compile("^[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+$");
        r = Pattern.compile("^[A-Za-z_-]{3,15}$");

        for (int i = 0; i < sm.length; i++) {
            c1.add(sm[i]);
        }

        ArrayAdapter<String> obj = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, c1);
        sp.setAdapter(obj);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(getApplication()).inflate(R.menu.menu, menu);
        return true;
    }

    public void clicks(View v) {

        s[0] = t1.getText().toString();
        s[1] = t2.getText().toString();
        s[2] = t3.getText().toString();
        s[3] = t4.getText().toString();
        s[4] = sp.getSelectedItem().toString();
        if (s[0].isEmpty() || s[1].isEmpty() || s[2].isEmpty() || s[3].isEmpty() || s[4].isEmpty()) {

            if (s[0].isEmpty()) {
                f = 1;
                t1.setError("Please fill");
                t1.requestFocus();
            }
            if (s[1].isEmpty()) {
                f = 1;
                t2.setError("Please fill");

            }

            if (s[3].isEmpty()) {
                f = 1;
                t4.setError("Please fill");

            }
            if (s[4].equals("-SELECT DISTRICT-")) {
                f = 1;
                Toast t4 = Toast.makeText(this, "Select Item", Toast.LENGTH_SHORT);
                t4.show();

            }
            boolean b = validate(s[0]);
            if (b == false) {
                f = 1;
                Toast t = Toast.makeText(this, "Enter valid name", Toast.LENGTH_SHORT);
                t.show();
            }
            boolean b1 = validating(s[1]);
            if (b1 == false) {
                f = 1;
                Toast t = Toast.makeText(this, "Enter valid email", Toast.LENGTH_SHORT);
                t.show();
            }
            if (s[2].isEmpty()) {
                f = 1;
                t3.setError("Please fill");

            } else {
                int l = s[2].length();
                if (l != 10) {
                    f = 1;
                    Toast t = Toast.makeText(this, "Enter valid Mobile no", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
            boolean b2 = validates(s[3]);
            if (b2 == false) {
                f = 1;
                Toast t = Toast.makeText(this, "Enter valid House name", Toast.LENGTH_SHORT);
                t.show();
            }
        }

        if (f == 0) {

            db.insert(i, s[0], s[1], s[2], s[3]);
//
            Intent i = new Intent(this, Main7Activity.class);
            i.putExtra("m0", s);
            startActivity(i);
            Cursor c = db.getData();
            StringBuffer b = new StringBuffer();
            while (c.moveToNext()) {
                b.append("Name:" + c.getString(0) + "\n");
                b.append("Email:" + c.getString(1) + "\n");
                b.append("Phone_No:" + c.getString(2) + "\n");
                b.append("house_name:" + c.getString(3) + "\n");
            }
            String title = "Student Management app";
            String m = b.toString();
            //AlertDialog.Builder bu=new AlertDialog.Builder(Main7Activity.this);
//        bu.setCancelable(true);
//        bu.setTitle(title);
//        bu.setMessage(m);
//        bu.show();
            //  }


        }}

    public boolean validate(String name) {

        m = p.matcher(name);
        return m.matches();
    }

    public boolean validating(String name) {

        n = q.matcher(name);
        return n.matches();
    }

    public boolean validates(String name) {

        o = r.matcher(name);
        return o.matches();
    }



    @Override
    public void onFocusChange(View v, boolean hasFocus) {


        s[0] = t1.getText().toString();
        s[1] = t2.getText().toString();
        s[2] = t3.getText().toString();
        s[3] = t4.getText().toString();
        s[4] = sp.getSelectedItem().toString();

        if (!hasFocus) {
            if (v.getId() == R.id.editText6) {
                boolean b = validate(s[0]);
                if (b == false) {
                    Toast t = Toast.makeText(this, "Enter valid name", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
            if (v.getId() == R.id.editText7) {
                boolean b1 = validating(s[1]);
                if (b1 == false) {
                    Toast t = Toast.makeText(this, "Enter valid email", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
            if (v.getId() == R.id.editText8) {
                if (s[2].isEmpty()) {
                    t3.setError("Please fill");

                } else {
                    int l = s[2].length();
                    if (l != 10) {
                        Toast t = Toast.makeText(this, "Enter valid Mobile no", Toast.LENGTH_SHORT);
                        t.show();
                    }
                }
            }
            if (v.getId() == R.id.editText9) {
                boolean b2 = validates(s[3]);
                if (b2 == false) {
                    Toast t = Toast.makeText(this, "Enter valid House name", Toast.LENGTH_SHORT);
                    t.show();
                }
            }



        }
    }



}
