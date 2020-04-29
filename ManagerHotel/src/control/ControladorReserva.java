
package control;

import java.util.ArrayList;
import modelo.Reserva;
import modelo.ReservaDAO;



public class ControladorReserva {
    
     public static ArrayList<Reserva> listadoReserva ()
    {
        ArrayList<Reserva> listado;
        listado = new ArrayList();
        ReservaDAO reservaDAO = new ReservaDAO();
        listado = reservaDAO.listadoReservas();
        return listado; 
    }
    
     public static int crearReserva(Reserva unReserva)
    {
        ReservaDAO reservaDAO = new ReservaDAO();
        int resultado = reservaDAO.crearReserva(unReserva);
        return resultado;
    }
     
    public static int eliminarReserva(int cod)
    {
        ReservaDAO reservaDAO = new ReservaDAO();
        int resultado = reservaDAO.eliminarReserva(cod);
        return resultado;
    }
}
