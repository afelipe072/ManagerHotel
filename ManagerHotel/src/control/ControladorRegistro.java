
package control;

import java.util.ArrayList;
import modelo.Registro;
import modelo.RegistroDAO;


public class ControladorRegistro {
    
    public static ArrayList<Registro> listadoRegistro ()
    {
        ArrayList<Registro> listado;
        listado = new ArrayList();
        RegistroDAO registroDAO = new RegistroDAO();
        listado = registroDAO.listadoRegistro();
        return listado; 
    }
    
     public static int crearRegistro(Registro unRegistro)
    {
        RegistroDAO registroDAO = new RegistroDAO();
        int resultado = registroDAO.crearRegistro(unRegistro);
        return resultado;
    }
    
     public static int borrarRegistro(String codigo)
    {
        RegistroDAO registroDAO = new RegistroDAO();
        int resultado = registroDAO.borrarRegistro(codigo);
        return resultado; 
    } 
     
     
     
}
