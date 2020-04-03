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
    
    public ArrayList<Usuario> listadoUsuario(String codigo){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Usuario> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(codigo.equalsIgnoreCase("0")){
                sql = "SELECT * FROM usuario  ORDER BY codigo";            
            }else{
                sql = "SELECT * FROM usuario WHERE codigo="+codigo;     
            }                        
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                        
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setId(rs.getInt("id"));               
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setRol(rs.getString("rol"));
                usuario.setTelefono(rs.getInt("telefono"));
                usuario.setUser_name(rs.getString("user_name"));
                usuario.setContraseña(rs.getInt("contraseña"));         
                
                               
                
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
    
    
}
