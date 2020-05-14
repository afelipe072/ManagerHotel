package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;

public class ServicioDAO{
    
    public ArrayList<Servicio> lista_servicios(){
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Servicio> servicios = new ArrayList<>();
        
        try{
            con = Fachada.getConnection();
            String sql="select * from servicio";
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Servicio servicio = new Servicio();
                servicio.set_codigo(rs.getInt("codigo_servicio"));
                servicio.set_valor(rs.getDouble("valor_servicio"));
                servicio.set_descripcion(rs.getString("descripcion"));
                servicios.add(servicio);
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
        return servicios;
    }
    
    public int crear_servicio(Servicio servicio){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
        con = Fachada.getConnection();
        String sql = "insert into servicio(codigo_servicio, valor_servicio, descripcion)" +
                "values (?,?,?)";
        
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, servicio.get_codigo());
        pstm.setDouble(2, servicio.get_valor());
        pstm.setString(3, servicio.get_descripcion());
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
    
    public int eliminar_servicio(int codigo){
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        
        try{
            con = Fachada.getConnection();
            String sql = "delete from servicio where codigo_servicio = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rtdo = pstm.executeUpdate();
            return rtdo;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try{
                if(pstm!=null) pstm.close();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return rtdo;
    }
    
    public int modificar_servicio(Servicio servicio){
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
           String sql = "UPDATE servicio set codigo_servicio=?,valor_servicio=?,descripcion=? where codigo_servicio=?";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, servicio.get_codigo());
            pstm.setDouble(2, servicio.get_valor());
            pstm.setString(3, servicio.get_descripcion());
            
            pstm.setInt(4, servicio.get_codigo());
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
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return rtdo;
    }
}

