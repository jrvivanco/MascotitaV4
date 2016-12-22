package org.jrvivanco.mascotitav4.pojo;

/**
 * Created by jrvivanco on 16/12/2016.
 */
public class Mascota {

    private int id;
    private String nombre;
    private int foto;
    private int rating;

    public Mascota(int foto, String nombre, int rating)
    {
        this.nombre = nombre;
        this.foto = foto;
        this.rating = rating;
    }

    public Mascota(){

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

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
