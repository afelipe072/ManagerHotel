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
public class Empleado {
    private String codigoEmpleado;
    private String id;
    private String nombreEmpleado;
    private String apellidosEmpleado;
    private String nombreUsuario;
    private String contraseña;

    public Empleado(String codigoEmpleado, String id, String nombreEmpleado, String apellidosEmpleado, String nombreUsuario, String contraseña) {
        this.codigoEmpleado = codigoEmpleado;
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
    
    
}
