package org.jrvivanco.mascotitav4.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.jrvivanco.mascotitav4.R;
import org.jrvivanco.mascotitav4.db.ConstructorMascota;
import org.jrvivanco.mascotitav4.pojo.Mascota;
import java.util.ArrayList;

/**
 * Created by jrvivanco on 22/12/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<mascotaViewHolder>{

    private ArrayList<Mascota> item;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> item, Activity activity){
        this.item = item;
        this.activity = activity;
    }

    public MascotaAdaptador(ArrayList<Mascota> item){
        this.item = item;
    }


    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        mascotaViewHolder mascota = new mascotaViewHolder(v);
        return mascota;
    }

    @Override
    public void onBindViewHolder(final mascotaViewHolder mascotaHolder, int position) {
        final Mascota mascota = item.get(position);

        mascotaHolder.nombre.setText(this.item.get(position).getNombre());
        mascotaHolder.foto.setImageResource(this.item.get(position).getFoto());
        mascotaHolder.rating.setText(String.valueOf(this.item.get(position).getRating()));

        mascotaHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(activity, "Diste like a "+mascota.getNombre(), Toast.LENGTH_SHORT).show();
                ConstructorMascota constructorMascota = new ConstructorMascota(activity);
                constructorMascota.darLikeMascota(mascota);
                mascotaHolder.rating.setText(String.valueOf(constructorMascota.obtenerLikesMascota(mascota)));
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.item.size();
    }
}
