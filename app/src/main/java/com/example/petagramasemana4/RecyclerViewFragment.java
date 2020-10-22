package com.example.petagramasemana4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvListaMascotas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container,false);
        rvListaMascotas = view.findViewById(R.id.rvListaMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvListaMascotas.setLayoutManager(llm);
        inicializarMascotas();
        inicializarAdaptador();
        return view;
    }

    public void inicializarMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Thor", R.drawable.perro1, 3));
        mascotas.add(new Mascota("Nala", R.drawable.perro2, 4));
        mascotas.add(new Mascota("Rex", R.drawable.perro3, 5));
        mascotas.add(new Mascota("Rocky", R.drawable.perro4, 6));
        mascotas.add(new Mascota("Zeus", R.drawable.perro5, 7));
        mascotas.add(new Mascota("Toby", R.drawable.perro6,8));
        mascotas.add(new Mascota("Lola", R.drawable.perro7,5));


    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        rvListaMascotas.setAdapter(adaptador);
    }
}