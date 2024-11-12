package com.example.myapplication;

public class Verdura extends Producto{
    private String temporada;

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public Verdura(int codigoProducto, String nombreProducto, double precio, int cantidad, String temporada) {
        super(codigoProducto, nombreProducto, precio, cantidad);
        this.temporada = temporada;
    }

    public Verdura() {

    }
}
