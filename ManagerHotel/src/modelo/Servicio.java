package modelo;

public class Servicio{
    
    int codigo;
    double valor;
    String descripcion;
    
    public Servicio(){
    }
    
    public Servicio(int codigo, double valor, String descripcion){
        this.codigo = codigo;
        this.valor = valor;
        this.descripcion = descripcion;
    }
    
    public int get_codigo(){
        return codigo;
    }
    
    public double get_valor(){
        return valor;
    }
    
    public String get_descripcion(){
        return descripcion;
    }
    
    public void set_codigo(int codigo){
        this.codigo = codigo;
    }
    
    public void set_valor(double valor){
        this.valor = valor;
    }
    
    public void set_descripcion(String descripcion){
        this.descripcion = descripcion;
    }
}