
package modelo;


public class Habitacion {
    
    int numero;
    double valor;
    String tipoHabitacion, descripcion, estado;
    
    public Habitacion(){}
    public Habitacion(int numero, double valor, String tipoHabitacion, String descripcion, String estado) {
        this.numero = numero;
        this.valor = valor;
        this.tipoHabitacion = tipoHabitacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
