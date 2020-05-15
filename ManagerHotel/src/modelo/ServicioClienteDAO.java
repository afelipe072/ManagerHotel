
package modelo;

import java.sql.Connection;
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
            String sql="select * from servicio_cliente";
            
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
        String sql = "insert into servicio_cliente(id_cliente, codigo_servicio)" +
                "values (?,?)";
        
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, servicio.getIdCliente());
        pstm.setDouble(2, servicio.getCodServicio());
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
    
}
