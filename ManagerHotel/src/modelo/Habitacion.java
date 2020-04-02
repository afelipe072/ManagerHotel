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
public class Habitacion {
    private int numero;
    private String tipo;
    private double valorNoche;
    private String estado;
    private int capacidad;
    
    public Habitacion( int numero, String tipo, double valor,String estado, int capacidad){
        numero=this.numero;
        tipo=this.tipo;
        valorNoche=valor;
        estado=this.estado;
        capacidad=this.capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(double valorNoche) {
        this.valorNoche = valorNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }  
    
}
