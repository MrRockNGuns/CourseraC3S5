package com.example.petagramasemana4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabMain;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbarAplicacion = findViewById(R.id.toolbarAplicacion);
        setSupportActionBar(toolbarAplicacion);
        getSupportActionBar().setIcon(R.drawable.foot);

        tabMain = findViewById(R.id.tabMain);
        viewPager = findViewById(R.id.viewPager);

        setUpViewPager();
        agregarFabCamara();
    }

    public void siguienteActivity(View view){
        Intent intent = new Intent(this, MascotasElegidas.class);
        startActivity(intent);
    }
    public void agregarFabCamara(){
        FloatingActionButton fabCamara = findViewById(R.id.fabCamara);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mContacto:
                Intent intentContacto = new Intent(this, FormularioEmail.class);
                startActivity(intentContacto);
                break;
            case R.id.mAcercaDe:
                Intent intentAcercaDe = new Intent(this,AcercaDe.class);
                startActivity(intentAcercaDe);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments= new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());
        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PaginaAdaptador(getSupportFragmentManager(), agregarFragments()));
        tabMain.setupWithViewPager(viewPager);
        tabMain.getTabAt(0).setIcon(R.drawable.home);
        tabMain.getTabAt(1).setIcon(R.drawable.wolf);
    }
}