package com.faw.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by LiuYP on 2018/1/3.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /**
     * Province表创建语句
     */
    public static final String CREATE_PROVINCE = "create table Province("
            + "id integer primary key autoincrement, "
            +"province_name text, "
            +"province_code text)";
    /**
     * City 表创建语句
     */
    public static final String  CREATE_CITY = "create table City("
            +"id integer primary key autoincrement, "
            +"city_name text, "
            +"cite_code text, "
            +"province_id integer)";
    /**
     * County 表创建语句
     */
    public static final String CREATE_COUNTY="create table County("
            +"id integer primary key autoincrement, "
            +"county_name text, "
            +"county_code text, "
            +"city_id integer)";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
