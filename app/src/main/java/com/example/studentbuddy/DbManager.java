package com.example.studentbuddy;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper {

    private static final String dbname = "StudentDesc.db";
    public DbManager(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry = "create table tbl_student(id integer primary key autoincrement, classname text, rollno text, name text )";
        db.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop TABLE IF EXISTS tbl_student");
        onCreate(db);
    }

    public String addRecord (String p1, String p2, String p3) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("classname", p1);
        cv.put("rollno", p2);
        cv.put("name", p3);

        long res = db.insert("tbl_student", null, cv);

        if(res == -1){
            return "Failed To Record Attendance!!";
        }
        else{
            return "True";
        }
    }
}
