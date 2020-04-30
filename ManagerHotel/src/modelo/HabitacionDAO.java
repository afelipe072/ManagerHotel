
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;


public class HabitacionDAO {
    
    //funcion listadoHabitaciones : retorna el listado de habitaciones existentes 
    public ArrayList<Habitacion> listadoHabitaciones(){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Habitacion> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="SELECT * FROM habitacion";          
                                    
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                      
            while(rs.next()){
                Habitacion habitacion = new Habitacion();
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setValor(rs.getDouble("valor"));               
                habitacion.setTipoHabitacion(rs.getString("tipo_habitacion"));
                habitacion.setDescripcion(rs.getString("descripcion_habitacion"));
                habitacion.setEstado(rs.getString("estado"));
                listado.add(habitacion);
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
    
    
    //funcion crearHabitacion : crea una habitacion y la guarda en la tabla habitacion
    public int crearHabitacion(Habitacion habitacion){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO habitacion (numero, valor, tipo_habitacion, descripcion_habitacion, estado)"
                    +"VALUES (?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,habitacion.getNumero());
            pstm.setDouble(2,habitacion.getValor());
            pstm.setString(3,habitacion.getTipoHabitacion());
            pstm.setString(4,habitacion.getDescripcion());
            pstm.setString(5,habitacion.getEstado());
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
    
    
    //funcion eliminarHabitacion : elimina la habitacion especificada (num : numero de habitacion)
    public int eliminarHabitacion(int num){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM habitacion WHERE numero = ? ";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,num);
            
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
    
    //funcion modificarHabitacion : edita las caracteristicas deuna habitacion en la tabla habitacion
    public int modificarHabitacion(Habitacion habitacion){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE habitacion " +
                         "SET  numero=?, valor=?, tipo_habitacion=?, descripcion_habitacion=?, estado=?" 
                          + "WHERE numero=?";
            
            pstm = con.prepareStatement(sql);            
            pstm.setInt(1,habitacion.getNumero());
            pstm.setDouble(2,habitacion.getValor());
            pstm.setString(3,habitacion.getTipoHabitacion());
            pstm.setString(4,habitacion.getDescripcion());
            pstm.setString(5,habitacion.getEstado());
            pstm.setInt(6,habitacion.getNumero());
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
