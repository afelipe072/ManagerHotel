/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Pago;
import modelo.PagoDAO;

/**
 *
 * @author user
 */
public class ControladorPago {
    
    public static ArrayList<Pago> listadoPago (String codigo)
    {
        ArrayList<Pago> listado;
        listado = new ArrayList();
        PagoDAO pagodao = new PagoDAO();
        listado = pagodao.listadoPago(codigo);
        return listado; 
    }
     
    public static int grabarPago(Pago p)
    {
        PagoDAO pagoDAO = new PagoDAO();
        int resultado = pagoDAO.grabarPago(p);
        return resultado; 
    }
    
     public static int modificarPago(Pago p )
    {
        PagoDAO pagoDAO = new PagoDAO();
        int resultado = pagoDAO.modificarPago(p);
        return resultado; 
    }
     
     public static int borrarPago(String codigo)
    {
        PagoDAO pagoDAO = new PagoDAO();
        int resultado = pagoDAO.borrarPago(codigo);
        return resultado; 
    }
     
    
}
