/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;

/**
 *
 * @author Sebas
 */
public class FacturaDAO {
    
    public ArrayList<Factura> listadoFacturas(){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Factura> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="SELECT * FROM Facturas";          
                                    
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                      
            while(rs.next()){
                Factura factura = new Factura();
                factura.setNoFactura(rs.getInt("no_factura"));
                factura.setNombre(rs.getString("nombre"));               
                factura.setCedulaNit(rs.getInt("cedula_nit"));
                factura.setDireccion(rs.getString("direccion"));
                factura.setTelefono(rs.getString("telefono"));
                factura.setCiudad(rs.getString("ciudad"));
                factura.setOcupacion(rs.getString("ocupacion"));
                factura.setIva(rs.getDouble("iva"));
                factura.setTotal(rs.getDouble("total"));         
                      
                listado.add(factura);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
        return listado;
    }
    
    
        public int crearFactura(Factura factura){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
                String sql = "INSERT INTO factura (no_factura, nombre, cedula_nit, direccion, "
                    + "telefono, ciudad , ocupacion, iva, total )"
                    +    "VALUES (?,?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,factura.getNoFactura());
            pstm.setString(2,factura.getNombre());
            pstm.setInt(3,factura.getCedulaNit());
            pstm.setString(4,factura.getDireccion());
            pstm.setString(5,factura.getTelefono());
            pstm.setString(6,factura.getCiudad()    );
            pstm.setString(7,factura.getOcupacion());
            pstm.setDouble(8,factura.getIva());
            pstm.setDouble(9,factura.getTotal());
          
            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                
            }
        }
        return rtdo;
    }
    
        
        
        public int eliminarFactura(int noFactura){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM factura WHERE no_factura = ? ";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,noFactura);
            
            rtdo = pstm.executeUpdate(); 
            return rtdo;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        } 
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }
        
        
        public int modificarFactura(Factura factura){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE factura " +
                         "SET nombre= ?,"
                          + "cedula_nit=?,direccion=?,telefono=?, "
                          + "ciudad=?, ocupacion=?, iva=?,total=?"
                          + "WHERE no_factura= ?";
            
            pstm = con.prepareStatement(sql);            
            pstm.setString(1,factura.getNombre());
            pstm.setInt(2,factura.getCedulaNit());
            pstm.setString(3,factura.getDireccion() );
            pstm.setString(4,factura.getTelefono());
            pstm.setString(5,factura.getCiudad());
            pstm.setString(6,factura.getOcupacion());
            pstm.setDouble(7,factura.getIva());
            pstm.setDouble(8,factura.getTotal());
            
            pstm.setInt(9,factura.getNoFactura());
          
            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }
    
    
}
