package com.example.myapplication;

public class Lacteo extends Producto{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Lacteo(int codigoProducto, String nombreProducto, double precio, int cantidad, String tipo) {
        super(codigoProducto, nombreProducto, precio, cantidad);
        this.tipo = tipo;
    }

    public Lacteo() {
    }
}
