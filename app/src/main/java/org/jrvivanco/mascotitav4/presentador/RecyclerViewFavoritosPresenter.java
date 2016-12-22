package org.jrvivanco.mascotitav4.presentador;

import android.content.Context;

import java.util.ArrayList;

import org.jrvivanco.mascotitav4.db.ConstructorMascota;
import org.jrvivanco.mascotitav4.db.MascotasFavoritas;
import org.jrvivanco.mascotitav4.fragment.IRecyclerViewFragmentView;
import org.jrvivanco.mascotitav4.pojo.Mascota;

/**
 * Created by jrvivanco on 22/12/2016.
 */
public class RecyclerViewFavoritosPresenter implements IRecyclerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private MascotasFavoritas mascotasFavoritas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFavoritosPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        mascotasFavoritas = new MascotasFavoritas(context);
        mascotas = mascotasFavoritas.obtenerDatos();
        mostrarMascotasRecyclerView();
    }

    @Override
    public void mostrarMascotasRecyclerView() {
        iRecyclerViewFragmentView.inicializarAdaptadorRecyclerView(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
