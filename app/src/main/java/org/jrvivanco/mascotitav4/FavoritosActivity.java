package org.jrvivanco.mascotitav4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
//import android.widget.Toast;
import java.util.ArrayList;
import org.jrvivanco.mascotitav4.adapter.MascotaAdaptador;
import org.jrvivanco.mascotitav4.fragment.IRecyclerViewFragmentView;
import org.jrvivanco.mascotitav4.pojo.Mascota;
import org.jrvivanco.mascotitav4.presentador.IRecyclerViewFragmentPresenter;
import org.jrvivanco.mascotitav4.presentador.RecyclerViewFavoritosPresenter;

public class FavoritosActivity extends AppCompatActivity implements IRecyclerViewFragmentView {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private IRecyclerViewFragmentPresenter presenter;
    private RecyclerView.Adapter recyclerAdapterFav;
    private ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSub);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //Toast.makeText(FavoritosActivity.this, "Mensaje de prueba", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        recicladorFav = (RecyclerView) findViewById(R.id.rv_ReciclaFav);
        presenter = new RecyclerViewFavoritosPresenter(this, this);

        //recyclerAdapterFav = new MascotaAdaptador(mascotas);
        //recicladorFav.setAdapter(recyclerAdapterFav);
    }


    @Override
    public void generarLinearLayoutVertical() {
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recicladorFav.setLayoutManager(layoutManagerFav);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRecyclerView(MascotaAdaptador adaptador) {
        recicladorFav.setAdapter(adaptador);
    }
}
