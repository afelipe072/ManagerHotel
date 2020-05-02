package control;

import java.util.ArrayList;
import modelo.Servicio;
import modelo.ServicioDAO;

public class ControladorServicio{
    
    public static ArrayList<Servicio> lista_servicio(){
        
        ArrayList<Servicio> servicios;
        servicios = new ArrayList();
        ServicioDAO serviciodao = new ServicioDAO();
        servicios = serviciodao.lista_servicios();
        return servicios;
    }
    
    public static int crear_servicio(Servicio servicio){
        
        ServicioDAO serviciodao = new ServicioDAO();
        int resultado = serviciodao.crear_servicio(servicio);
        return resultado;
    }
    
    public static int eliminar_servicio(int codigo){
        
        ServicioDAO serviciodao = new ServicioDAO();
        int resultado = serviciodao.eliminar_servicio(codigo);
        return resultado;
    }
    
    public static int modificar_servicio(Servicio servicio){
        
        ServicioDAO serviciodao = new ServicioDAO();
        int resultado = serviciodao.modificar_servicio(servicio);
        return resultado;
    }
}