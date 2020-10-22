package com.example.petagramasemana4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class MascotasElegidas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotasElegidas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_elegidas);

        Toolbar toolbarAplicacion = findViewById(R.id.toolbarAplicacion);
        setSupportActionBar(toolbarAplicacion);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.foot);

        rvMascotasElegidas =  findViewById(R.id.rvMascotasElegidas);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotasElegidas.setLayoutManager(llm);
        inicializarMascotas();
        inicializarAdaptador();

    }
    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        rvMascotasElegidas.setAdapter(adaptador);
    }

    public void inicializarMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Zeus", R.drawable.perro5, 7));
        mascotas.add(new Mascota("Rocky", R.drawable.perro4, 6));
        mascotas.add(new Mascota("Rex", R.drawable.perro3, 5));
        mascotas.add(new Mascota("Nala", R.drawable.perro2, 4));
        mascotas.add(new Mascota("Thor", R.drawable.perro1, 3));

    }
}