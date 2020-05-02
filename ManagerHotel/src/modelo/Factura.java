/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sebas
 */
public class Factura {
    int noFactura,cedulaNit;
    double iva,total;
    String nombre,direccion,ciudad,ocupacion,telefono;

    public Factura() {
    }

    public Factura(int noFactura, double iva, double total, String nombre, int cedulaNit, String direccion, String ciudad, String ocupacion, String telefono) {
        this.noFactura = noFactura;
        this.iva = iva;
        this.total = total;
        this.nombre = nombre;
        this.cedulaNit = cedulaNit;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
    }

    public int getNoFactura() {
        return noFactura;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedulaNit() {
        return cedulaNit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedulaNit(int cedulaNit) {
        this.cedulaNit = cedulaNit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
}
