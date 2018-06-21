package com.example.ubuntu.tut;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ubuntu on 23/5/18.
 */

public class DbHelper extends SQLiteOpenHelper {
    public static final  String DATABASE_NAME="database1";

    public DbHelper(Context c){
        super(c,DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE STUDENT"+"(Id INTEGER,Name TEXT,Email TEXT,Phone_NO TEXT,House_name TEXT);");
        db.execSQL("CREATE TABLE STUDENTLOGIN"+"(Id INTEGER,Name TEXT,Password TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert(int i,String name,String email,String p,String h)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cValues = new ContentValues();
        cValues.put("Name", name);
        cValues.put("Email", email);
        cValues.put("Phone_NO", p);
        cValues.put("House_name", h);
        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert("STUDENT",null, cValues);
        db.close();
        return true;
    }
    public Cursor getData()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor result=db.rawQuery("SELECT * FROM STUDENT",null);
        if(result!=null)
            result.moveToFirst();
        db.close();
        return result;
    }
    public boolean insertReg(String s1,String s2)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cbValues = new ContentValues();
        cbValues.put("Name", s1);
        cbValues.put("Password", s2);
        long newRowId = db.insert("STUDENTLOGIN",null, cbValues);
        db.close();
        return true;
    }
    public Cursor getl()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor result=db.rawQuery("SELECT  Name,Password FROM STUDENTLOGIN",null);
        if(result!=null)
            result.moveToFirst();
        db.close();
        return result;
    }

}
