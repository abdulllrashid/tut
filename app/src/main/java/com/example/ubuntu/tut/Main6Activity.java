package com.example.ubuntu.tut;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    public String[] s;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        Intent i=getIntent();
        s=i.getStringArrayExtra("msg");

        t1=(TextView)findViewById(R.id.captext);
        t1.setText(s[0]);


        t2=(TextView)findViewById(R.id.date);
        t2.setText(s[1]);

        t3=(TextView)findViewById(R.id.location);
        t3.setText(s[2]);

        t4=(TextView)findViewById(R.id.descption);
        t4.setText(s[3]);


    }
    public void submit(View v){
        String url = s[4];
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}

