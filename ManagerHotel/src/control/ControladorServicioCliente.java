
package control;

import java.sql.Date;
import java.util.ArrayList;
import modelo.ServicioCliente;
import modelo.ServicioClienteDAO;


public class ControladorServicioCliente {
    
    public static ArrayList<ServicioCliente> listaServicioCliente(){
        
        ArrayList<ServicioCliente> servicios;
        servicios = new ArrayList();
        ServicioClienteDAO serviciodao = new ServicioClienteDAO();
        servicios = serviciodao.listaServiciosClientes();
        return servicios;
    }
    
    public static int crearServicioCliente(ServicioCliente servicio){
        ServicioClienteDAO serviciodao = new ServicioClienteDAO();
        int resultado = serviciodao.crearServicioCliente(servicio);
        return resultado;
    }
    
     public static ArrayList<Double> listaValorServicios(int id_cliente, Date fechaIngreso, Date fechaSalida){
        
        ArrayList<Double> servicios;
        servicios = new ArrayList();
        ServicioClienteDAO serviciodao = new ServicioClienteDAO();
        servicios = serviciodao.listaValorServicios(id_cliente, fechaIngreso,fechaSalida);
        return servicios;
    }
     
     public static ArrayList<String> listaServicios(int id_cliente ,Date fechaIngreso, Date fechaSalida){
        
        ArrayList<String> descripciones;
        descripciones = new ArrayList();
        ServicioClienteDAO serviciodao = new ServicioClienteDAO();
        descripciones = serviciodao.listaServicios(id_cliente, fechaIngreso,fechaSalida);
        return descripciones;
    }
     
     
}
