package com.example.petagramasemana4;

import java.util.ArrayList;

public class PerfilMascota {

    private int fotoPerfil;
    private String nombre;
    private ArrayList<Mascota> FotosPerfil;

    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mascota> getFotosPerfil() {
        return FotosPerfil;
    }

    public void setFotosPerfil(ArrayList<Mascota> fotosPerfil) {
        this.FotosPerfil = fotosPerfil;
    }
}
