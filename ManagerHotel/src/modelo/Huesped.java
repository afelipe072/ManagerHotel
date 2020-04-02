/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author user
 */
public class Huesped {
    private String idHuesped;
    private String nombreHuesped;
    private String apellidosHuesped;
    private int telefono;
    private String direccion;
    private String correoElectronico;
    private String ocupacion;

    public Huesped(String idHuesped, String nombreHuesped, String apellidosHuesped, int telefono, String direccion, String correoElectronico, String ocupacion) {
        this.idHuesped = idHuesped;
        this.nombreHuesped = nombreHuesped;
        this.apellidosHuesped = apellidosHuesped;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.ocupacion = ocupacion;
    }

    public String getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(String idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public String getApellidosHuesped() {
        return apellidosHuesped;
    }

    public void setApellidosHuesped(String apellidosHuesped) {
        this.apellidosHuesped = apellidosHuesped;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    
    
}
