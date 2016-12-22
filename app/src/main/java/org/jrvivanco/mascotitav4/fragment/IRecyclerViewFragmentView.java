package org.jrvivanco.mascotitav4.fragment;

import java.util.ArrayList;

import org.jrvivanco.mascotitav4.adapter.MascotaAdaptador;
import org.jrvivanco.mascotitav4.pojo.Mascota;

/**
 * Created by jrvivanco on 22/12/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRecyclerView(MascotaAdaptador adaptador);
}
