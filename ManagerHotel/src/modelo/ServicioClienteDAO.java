
package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;


public class ServicioClienteDAO {
    
    public ArrayList<ServicioCliente> listaServiciosClientes(){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<ServicioCliente> serviciosCliente = new ArrayList<>();
        
        try{
            con = Fachada.getConnection();
            String sql= "select * from servicio_cliente ";
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ServicioCliente servicioCliente = new ServicioCliente();
                servicioCliente.setIdCliente(rs.getInt("id_cliente"));
                servicioCliente.setCodServicio(rs.getInt("codigo_servicio"));
                serviciosCliente.add(servicioCliente);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close(); 
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return serviciosCliente;
    }
    
    
     public int crearServicioCliente(ServicioCliente servicio){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
        con = Fachada.getConnection();
        String sql = "insert into servicio_cliente(id_cliente, codigo_servicio, fecha_servicio)" +
                "values (?,?,?)";
        
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, servicio.getIdCliente());
        pstm.setDouble(2, servicio.getCodServicio());
        pstm.setDate(3, servicio.getFecha_Servicio());
        rtdo = pstm.executeUpdate();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try{
                if(pstm != null) pstm.close();
            }
            catch(SQLException e){
            }
        }
        return rtdo;
    }
    
   public ArrayList<Double> listaValorServicios(int id_cliente, Date fechaIngreso, Date fechaSalida){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Double> valores=new ArrayList();
        
        
        try{
            con = Fachada.getConnection();
            String sql= "select valor_servicio from servicio_cliente natural join servicio "
                      +"where id_cliente = ' " +id_cliente +"' and fecha_servicio >= '"+fechaIngreso +"' and "+"fecha_servicio <= '"+fechaSalida+"'";
                    
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                valores.add(rs.getDouble("valor_servicio"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close(); 
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return valores;
    }  
   
   public ArrayList<String> listaServicios(int id_cliente ,Date fechaIngreso, Date fechaSalida){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<String> descripciones=new ArrayList();
        
        
        try{
            con = Fachada.getConnection();
            String sql= "select descripcion from servicio_cliente natural join servicio "
                      +"where id_cliente = ' " +id_cliente +"' and fecha_servicio >= '"+fechaIngreso +"' and "+"fecha_servicio <= '"+fechaSalida+"'";
                    
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                descripciones.add(rs.getString("descripcion"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close(); 
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return descripciones;
    }
     
     
     
    
}
