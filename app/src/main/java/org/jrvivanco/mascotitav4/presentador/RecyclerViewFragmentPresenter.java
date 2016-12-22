package org.jrvivanco.mascotitav4.presentador;

import android.content.Context;
import java.util.ArrayList;
import org.jrvivanco.mascotitav4.adapter.MascotaAdaptador;
import org.jrvivanco.mascotitav4.db.ConstructorMascota;
import org.jrvivanco.mascotitav4.fragment.IRecyclerViewFragmentView;
import org.jrvivanco.mascotitav4.pojo.Mascota;

/**
 * Created by jrvivanco on 22/12/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascota constructorMascota;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascota = new ConstructorMascota(context);
        mascotas = constructorMascota.obtenerDatos();
        mostrarMascotasRecyclerView();
    }

    @Override
    public void mostrarMascotasRecyclerView() {
        iRecyclerViewFragmentView.inicializarAdaptadorRecyclerView(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
