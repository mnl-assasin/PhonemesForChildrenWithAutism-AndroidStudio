package com.pguese.pfcwa.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mykel Leano on 24/10/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "DB_PFCWA";
    private static final int DB_VERSION = 6;

    public static final String TBL_FLASHCARDS = "tbl_flashcards";

    private static DatabaseHelper mInstance = null;

    private DatabaseHelper(Context mContext) {
        super(mContext, DB_NAME, null, DB_VERSION);
    }

    public static DatabaseHelper getInstance(Context mContext) {
        if (mInstance == null)
            mInstance = new DatabaseHelper(mContext);

        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TBL_FLASHCARDS + "(id integer, name varchar)");
        populateData(db);
    }

    private void populateData(SQLiteDatabase db) {

        db.execSQL("INSERT INTO " + TBL_FLASHCARDS + "(id, name) VALUES (0, 'apple')");
        db.execSQL("INSERT INTO " + TBL_FLASHCARDS + "(id, name) VALUES (0, 'arrow')");
        db.execSQL("INSERT INTO " + TBL_FLASHCARDS + "(id, name) VALUES (0, 'ant')");
        db.execSQL("INSERT INTO " + TBL_FLASHCARDS + "(id, name) VALUES (1, 'ball')");
        db.execSQL("INSERT INTO " + TBL_FLASHCARDS + "(id, name) VALUES (1, 'basket')");
        db.execSQL("INSERT INTO " + TBL_FLASHCARDS + "(id, name) VALUES (1, 'bell')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TBL_FLASHCARDS);
        onCreate(db);
    }
}
