
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;


public class ClienteDAO {
    
    public ArrayList<Cliente> listadoClientes(){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Cliente> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="SELECT * FROM Cliente";          
                                    
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                      
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setCodUsuario(rs.getInt("cod_usuario"));               
                cliente.setNombre(rs.getString("nombre_cliente"));
                cliente.setApellido(rs.getString("apellido_cliente"));
                cliente.setCiudad(rs.getString("ciudad_cliente"));
                cliente.setDireccion(rs.getString("direccion_cliente"));
                cliente.setProfesion(rs.getString("profesion_cliente"));
                cliente.setTelefono(rs.getString("telefono_cliente"));
                cliente.setEmail(rs.getString("email_cliente"));         
                      
                listado.add(cliente);
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
    
    public int crearCliente(Cliente cliente){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO cliente (id_cliente, cod_usuario, nombre_cliente, apellido_cliente, "
                    + "ciudad_cliente, direccion_cliente, profesion_cliente, telefono_cliente, email_cliente)"
                    +    "VALUES (?,?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,cliente.getIdCliente());
            pstm.setInt(2,cliente.getCodUsuario());
            pstm.setString(3,cliente.getNombre());
            pstm.setString(4,cliente.getApellido());
            pstm.setString(5,cliente.getCiudad());
            pstm.setString(6,cliente.getDireccion());
            pstm.setString(7,cliente.getProfesion());
            pstm.setString(8,cliente.getTelefono());
            pstm.setString(9,cliente.getEmail());
          
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
    
    public int eliminarCliente(int id){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM cliente WHERE id_cliente = ? ";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,id);
            
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
    
    public int modificarCliente(Cliente cliente){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE cliente " +
                         "SET id_cliente= ?,nombre_cliente= ?,"
                          + "apellido_cliente=?,ciudad_cliente=?,direccion_cliente=?, "
                          + "profesion_cliente=?, telefono_cliente=?, email_cliente=?"
                          + "WHERE id_cliente=?";
            
            pstm = con.prepareStatement(sql);            
            pstm.setInt(1,cliente.getIdCliente());
            pstm.setString(2,cliente.getNombre());
            pstm.setString(3,cliente.getApellido());
            pstm.setString(4,cliente.getCiudad());
            pstm.setString(5,cliente.getDireccion());
            pstm.setString(6,cliente.getProfesion());
            pstm.setString(7,cliente.getTelefono());
            pstm.setString(8,cliente.getEmail());
            
            pstm.setInt(9,cliente.getIdCliente());
          
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
