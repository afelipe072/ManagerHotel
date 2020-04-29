
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;


public class HabitacionDAO {
    
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
   
}
