package com.example.jjesusmonroy.appwithsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BDHandler db= new BDHandler(this);
        db.consultar("Select * from alumnos");
    }
}
