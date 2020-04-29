
package control;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.ClienteDAO;

public class ControladorCliente {
    
    public static ArrayList<Cliente> listadoCliente ()
    {
        ArrayList<Cliente> listado;
        listado = new ArrayList();
        ClienteDAO clientedao = new ClienteDAO();
        listado = clientedao.listadoClientes();
        return listado; 
    }
    
    public static int crearCliente(Cliente unCliente)
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        int resultado = clienteDAO.crearCliente(unCliente);
        return resultado;
    }
    
    public static int eliminarCliente(int id)
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        int resultado = clienteDAO.eliminarCliente(id);
        return resultado;
    }
    
    public static int modificarCliente(Cliente cliente){
        ClienteDAO clienteDAO = new ClienteDAO();
        int resultado = clienteDAO.modificarCliente(cliente);
        return resultado;
    }
    
}
