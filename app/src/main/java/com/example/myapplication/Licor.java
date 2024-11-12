package com.example.myapplication;

public class Licor extends Producto{
    private String tipoLicor;

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }

    public Licor(int codigoProducto, String nombreProducto, double precio, int cantidad, String tipoLicor) {
        super(codigoProducto, nombreProducto, precio, cantidad);
        this.tipoLicor = tipoLicor;
    }

    public Licor() {
    }
}
