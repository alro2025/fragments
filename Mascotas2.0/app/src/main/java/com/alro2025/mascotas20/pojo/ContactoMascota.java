package com.alro2025.mascotas20.pojo;

/**
 * Created by kikipo on 12/02/2017.
 */

public class ContactoMascota {

    private int foto;
    private String nombre;
    private int numlikes ;



    public ContactoMascota(int foto, String nombre, int numlikes){
        this.foto = foto;
        this.nombre = nombre;
        this.numlikes = numlikes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNumlikes() {
        return numlikes;
    }

    public void setNumlikes(int numlikes) {
        this.numlikes = numlikes;
    }
}

