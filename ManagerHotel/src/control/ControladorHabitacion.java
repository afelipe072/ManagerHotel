
package control;

import java.util.ArrayList;
import modelo.Habitacion;
import modelo.HabitacionDAO;


public class ControladorHabitacion {
    
public static ArrayList<Habitacion> listadoHabitaciones()
    {
        ArrayList<Habitacion> listado;
        listado = new ArrayList();
        HabitacionDAO habitaciondao = new HabitacionDAO();
        listado = habitaciondao.listadoHabitaciones();
        return listado; 
    }




}
