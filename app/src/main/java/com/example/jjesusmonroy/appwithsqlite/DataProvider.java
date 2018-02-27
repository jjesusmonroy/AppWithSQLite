package com.example.jjesusmonroy.appwithsqlite;

/**
 * Created by jjesusmonroy on 27/02/18.
 */

public class DataProvider {
    private String nombre,nocontrol;
    public DataProvider(String nombre, String nocontrol) {
        this.nombre = nombre;
        this.nocontrol = nocontrol;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNocontrol() {
        return nocontrol;
    }
}
