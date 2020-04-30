package control;

import java.util.ArrayList;
import modelo.Habitacion;
import modelo.HabitacionDAO;

public class ControladorHabitacion {

    public static ArrayList<Habitacion> listadoHabitaciones() {
        ArrayList<Habitacion> listado;
        listado = new ArrayList();
        HabitacionDAO habitaciondao = new HabitacionDAO();
        listado = habitaciondao.listadoHabitaciones();
        return listado;
    }

    public static int crearHabitacion(Habitacion unHabitacion) {
        HabitacionDAO habitacionDAO = new HabitacionDAO();
        int resultado = habitacionDAO.crearHabitacion(unHabitacion);
        return resultado;
    }
    
    public static int modificarHabitacion(Habitacion unHabitacion){
        HabitacionDAO habitacionDAO = new HabitacionDAO();
        int resultado = habitacionDAO.modificarHabitacion(unHabitacion);
        return resultado;
    }

    public static int eliminarHabitacion(int num)
    {
        HabitacionDAO habitacionDAO = new HabitacionDAO();
        int resultado = habitacionDAO.eliminarHabitacion(num);
        return resultado;
    }
}
