package com.developerluisfm.mdapplication;

/**
 * Created by LuisFM on 28/05/16.
 */
public class Mascota {

    public int id;
    public String nombre;
    public int edad;
    public int foto;
    public int puntos;

    public Mascota(int id, String nombre, int edad, int foto, int puntos){

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
        this.puntos = puntos;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
