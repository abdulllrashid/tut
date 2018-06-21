package com.example.ubuntu.tut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {
    Button butt1;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button b=(Button)findViewById(R.id.butt1);
        final EditText t1 = (EditText) findViewById(R.id.t1);
        EditText t2 = (EditText) findViewById(R.id.t2);
        t1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!Patterns.PHONE.matcher(t1.getText().toString()).matches()){
                    t1.setError("Invalid ID");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void login1(View v) {
        if (v == butt1) {
            if (t1.getText().toString().trim().length() > 0) {
                if (Patterns.EMAIL_ADDRESS.matcher(t1.getText().toString()).matches()) {
                    if (!t2.getText().toString().equals("")) {
                        // All good
                    } else {
                        t2.requestFocus();
                        t2.setError("Enter password");
                    }
                } else {
                    t1.requestFocus();
                    t1.setError("Invalid email");
                }
            } else {
                t1.requestFocus();
                t1.setError("Enter email");
            }
        }


        String s1 = t1.getText().toString().trim();
        String s2 = t2.getText().toString().trim();
        if (s1.equals("ouzo") && s2.equals("astrix")) {
            Toast t = Toast.makeText(this, "Succesfully logged in", Toast.LENGTH_SHORT);
            t.show();
        } else {
            Toast t3 = Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT);
            t3.show();
        }
       // Intent i=new Intent(this,Main9Activity.class);
       // startActivity(i);
    }
    public void onClicks(View v) {

        startActivity(new Intent(this,Main9Activity.class));
    }


    public void login(View v) {
       startActivity(new Intent(this,MainActivity.class));

    }
}