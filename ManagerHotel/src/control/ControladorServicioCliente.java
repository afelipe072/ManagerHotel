
package control;

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
}
