package com.example.petagramasemana4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;

    public PerfilAdaptador(ArrayList<Mascota> listadoMascotas, Activity activity){
        this.mascotas=listadoMascotas;
        this.activity=activity;
    }

    @NonNull
    @Override
    public PerfilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil, parent, false);
        return new PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final PerfilViewHolder mascotaViewHolder, int position) {
        final Mascota mascota= mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvCantLikes2.setText(String.valueOf(mascota.getLikes()));

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView tvCantLikes2;
        public PerfilViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto=(ImageView)itemView.findViewById(R.id.imgFoto);
            tvCantLikes2=(TextView)itemView.findViewById(R.id.tvCantLikes2);

        }
    }
}


