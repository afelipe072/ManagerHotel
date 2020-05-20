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
 * @author user
 */
public class PagoDAO {
    
    public ArrayList<Pago> listadoPago(String c){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Pago> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(c.equalsIgnoreCase("0")){
                sql = "SELECT * FROM pago  ORDER BY numero_pago";            
            }else{
                sql = "SELECT * FROM pago WHERE numero_pago="+c;     
            }                        
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Pago pago= new Pago();
                pago.setNumeroPago(rs.getInt("numero_pago"));
                pago.setIdCliente(rs.getInt("id_cliente"));
                pago.setValor(rs.getDouble("valor"));
                pago.setFechaPago(rs.getDate("fecha"));
                
                listado.add(pago);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listado;
    } 
    
    public int grabarPago(Pago p ){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO pago (numero_pago, id_cliente, valor, fecha)"
                    +    "VALUES (?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,p.getNumeroPago());
            pstm.setInt(2,p.getIdCliente());
            pstm.setDouble(3,p.getValor());
            pstm.setDate(4,p.getFechaPago());
            
          
            rtdo = pstm.executeUpdate();  
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
                
            }
        }
        return rtdo;
    }
    
    public int modificarPago (Pago p){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE pago " +
                         "SET numero_pago = ?,id_cliente = ?,valor = ?,"
                         + "fecha=? "
                    +    "WHERE numero_pago=?";
            
            pstm = con.prepareStatement(sql);            
            pstm.setInt(1,p.getNumeroPago());
            pstm.setInt(2,p.getIdCliente());
            pstm.setDouble(3,p.getValor());
            pstm.setDate(4,p.getFechaPago());
            
           
            pstm.setInt(5,p.getNumeroPago());
            
            rtdo = pstm.executeUpdate();  
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
    
    public int borrarPago(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM pago WHERE numero_pago = ? ";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,Integer.parseInt(codigo));
            
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
    
    
    
    
    
    
    
    
    
}
