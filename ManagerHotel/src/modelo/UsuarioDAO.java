/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import static java.time.Instant.now;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import servicio.Fachada;
/**
 *
 * @author user
 */
public class UsuarioDAO {
    
    public ArrayList<Usuario> listadoUsuario(String c){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Usuario> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(c.equalsIgnoreCase("0")){
                sql = "SELECT * FROM usuario  ORDER BY codigo";            
            }else{
                sql = "SELECT * FROM usuario WHERE codigo="+c;     
            }                        
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setId(rs.getString("id"));               
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setRol(rs.getString("rol"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setUser_name(rs.getString("user_name"));
                usuario.setContraseña(rs.getString("contraseña"));         
                      
                listado.add(usuario);
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
    
    public int modificarContraseña(Usuario u){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE usuario " +
                         "SET contraseña = ?"
                    +    "WHERE codigo=?";
            pstm = con.prepareStatement(sql);            
            pstm.setString(1, u.getContraseña());
                       
            pstm.setInt(2,u.getCodigo());
            
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
    
    public int grabarUsuario(Usuario u ){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO usuario (codigo, id, nombre, apellido, rol, telefono, user_name, contraseña)"
                    +    "VALUES (?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,u.getCodigo());
            pstm.setString(2,u.getId());
            pstm.setString(3,u.getNombre());
            pstm.setString(4,u.getApellido());
            pstm.setString(5,u.getRol());
            pstm.setString(6,u.getTelefono());
            pstm.setString(7,u.getUser_name());
            pstm.setString(8,u.getContraseña());
          
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
    
    public int modificarUsuario(Usuario u){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE usuario " +
                         "SET codigo = ?,id = ?,nombre = ?,"
                         + "apellido=?,rol=?,telefono=?, user_name=?,contraseña=? "
                    +    "WHERE codigo=?";
            
            pstm = con.prepareStatement(sql);            
            pstm.setInt(1,u.getCodigo());
            pstm.setString(2,u.getId());
            pstm.setString(3,u.getNombre());
            pstm.setString(4,u.getApellido());
            pstm.setString(5,u.getRol());
            pstm.setString(6,u.getTelefono());
            pstm.setString(7,u.getUser_name());
            pstm.setString(8,u.getContraseña());
           
            pstm.setInt(9,u.getCodigo());
            
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
    
    public int borrarUsuario(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM usuario WHERE codigo = ? ";
            
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
