/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Factura;
import modelo.FacturaDAO;
/**
 *
 * @author Sebas
 */
public class ControladorFactura {
    
    public static ArrayList<Factura> listadoFactura ()
    {
        ArrayList<Factura> listado;
        listado = new ArrayList();
        FacturaDAO facturaDAO = new FacturaDAO();
        listado = facturaDAO.listadoFacturas();
        return listado; 
    }
    
    
    public static int crearFactura(Factura unaFactura)
    {
        FacturaDAO facturaDAO = new FacturaDAO();
        int resultado = facturaDAO.crearFactura(unaFactura);
        return resultado;
    }
    
    public static int eliminarFactura(int noFactura)
    {
        FacturaDAO facturaDAO = new FacturaDAO();
        int resultado = facturaDAO.eliminarFactura(noFactura);
        return resultado;
    }
    
    public static int modificarFactura(Factura factura){
        FacturaDAO facturaDAO = new FacturaDAO();
        int resultado = facturaDAO.modificarFactura(factura);
        return resultado;
    }
    
    
}
