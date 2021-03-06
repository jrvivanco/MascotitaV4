package org.jrvivanco.mascotitav4.db;

import android.content.Context;

import java.util.ArrayList;

import org.jrvivanco.mascotitav4.pojo.Mascota;

/**
 * Created by jrvivanco on 22/12/2016.
 */
public class MascotasFavoritas {

    private Context context;

    public MascotasFavoritas(Context context){
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){

        BaseDatos db = new BaseDatos(context);

        return db.recuperarMascotasFavoritas();
    }
}
