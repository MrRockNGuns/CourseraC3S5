package com.example.petagramasemana4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    PerfilMascota perfilMascota;
    private RecyclerView rvPerfil;
    private ImageView imgFotoPerfil;
    private TextView tvNombrePerfil;
    public PerfilFragment() {

    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        rvPerfil = view.findViewById(R.id.rvPerfil);
        GridLayoutManager lm = new GridLayoutManager(getContext(),3);
        rvPerfil.setLayoutManager(lm);
        MascotaPerfiles();
        imgFotoPerfil = view.findViewById(R.id.imgFotoPerfil);
        tvNombrePerfil = view.findViewById(R.id.tvNombrePerfil);

        imgFotoPerfil.setImageResource(perfilMascota.getFotoPerfil());
        tvNombrePerfil.setText(perfilMascota.getNombre());

        inicializarAdaptador();
        return view;
    }

    public void inicializarAdaptador() {
        PerfilAdaptador adaptador = new PerfilAdaptador(perfilMascota.getFotosPerfil(), getActivity());
        rvPerfil.setAdapter(adaptador);
    }


    public void MascotaPerfiles() {
        perfilMascota= new PerfilMascota();
        perfilMascota.setFotoPerfil(R.drawable.perro4);
        perfilMascota.setFotosPerfil(new ArrayList<Mascota>());

        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 5));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 8));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 6));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 7));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 5));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 7));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 7));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 4));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 1));
        perfilMascota.getFotosPerfil().add(new Mascota("Rocky", R.drawable.perro4, 2));

    }
}