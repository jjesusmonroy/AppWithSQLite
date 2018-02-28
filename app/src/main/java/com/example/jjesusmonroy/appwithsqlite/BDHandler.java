package com.example.jjesusmonroy.appwithsqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jjesusmonroy on 26/02/18.
 */

public class BDHandler extends SQLiteOpenHelper {

    private static final String database = "Database.db";
    private SQLiteDatabase db;
    private final Context context;

    public BDHandler(Context context) {
        super(context, database, null, 1);
        db = getWritableDatabase();
        this.context=context;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE alumnos (idAlumno INT PRIMARY KEY,nombre VARCHAR(50),nocontrol VARCHAR(8))");
        sqLiteDatabase.execSQL("INSERT INTO alumnos VALUES (1,'Jesus Monroy','14400968')");
        sqLiteDatabase.execSQL("INSERT INTO alumnos VALUES (2,'Betsy Sanchez','14401007')");
        sqLiteDatabase.execSQL("INSERT INTO alumnos VALUES (3,'Bryan Gutierrez','14400945')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS alumnos");
        onCreate(sqLiteDatabase);
    }

    public String[][] consultar(String sql){
        Cursor c = db.rawQuery(sql,null);
        String [][] elementos = new String [c.getColumnCount()][c.getCount()];
        c.moveToFirst();
        for(int i=0; i<c.getCount();i++){
            elementos[i][0]=c.getString(0);
            elementos[i][1]=c.getString(1);
            elementos[i][2]=c.getString(2);
        }
        if(c!=null){c.close();}
        System.out.println(elementos[1][1]+"\n"+elementos[2][1]+"\n"+elementos[0][1]+"\n");
        return elementos;
    }
}
