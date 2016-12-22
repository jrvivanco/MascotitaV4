package org.jrvivanco.mascotitav4.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.jrvivanco.mascotitav4.R;
import org.jrvivanco.mascotitav4.adapter.PerfilAdaptador;
import org.jrvivanco.mascotitav4.pojo.Perfil;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private ArrayList<Perfil> datos;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        //ReciclerView
        datos = new ArrayList<Perfil>();
        datos.add(new Perfil(R.drawable.ashera,15));
        datos.add(new Perfil(R.drawable.ashera,12));
        datos.add(new Perfil(R.drawable.ashera,7));
        datos.add(new Perfil(R.drawable.ashera,9));
        datos.add(new Perfil(R.drawable.ashera,5));
        datos.add(new Perfil(R.drawable.ashera,11));
        datos.add(new Perfil(R.drawable.ashera,24));
        datos.add(new Perfil(R.drawable.ashera,8));
        datos.add(new Perfil(R.drawable.ashera,6));
        datos.add(new Perfil(R.drawable.ashera,1));
        datos.add(new Perfil(R.drawable.ashera,3));
        datos.add(new Perfil(R.drawable.ashera,17));
        datos.add(new Perfil(R.drawable.ashera,4));
        datos.add(new Perfil(R.drawable.ashera,30));
        datos.add(new Perfil(R.drawable.ashera,22));

        RecyclerView reciclador = (RecyclerView) v.findViewById(R.id.rv_gridPerfil);
        GridLayoutManager gridPerfil = new GridLayoutManager(getActivity(), 3);
        gridPerfil.setOrientation(GridLayoutManager.VERTICAL);
        reciclador.setLayoutManager(gridPerfil);
        PerfilAdaptador recyclerAdapter = new PerfilAdaptador(datos);
        reciclador.setAdapter(recyclerAdapter);

        return v;
    }
}