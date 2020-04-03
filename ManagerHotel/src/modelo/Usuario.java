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
public class Usuario {
    private String codigo;
    private String id;
<<<<<<< HEAD
    private String nombre;
=======
    private  String nombre;
>>>>>>> 9bc214546d8857a2601f420d40b681d25117230c
    private String apellido;
    private String rol;
    private String telefono;
    private String user_name;
    private String contraseña;

<<<<<<< HEAD
=======
    public Usuario (){}

>>>>>>> 9bc214546d8857a2601f420d40b681d25117230c
    public Usuario(String codigo, String id, String nombre, String apellido, String rol, String telefono, String user_name, String contraseña) {
        this.codigo = codigo;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.telefono = telefono;
        this.user_name = user_name;
        this.contraseña = contraseña;
    }
<<<<<<< HEAD
    
    public Usuario(){}

=======
        
>>>>>>> 9bc214546d8857a2601f420d40b681d25117230c
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
}
