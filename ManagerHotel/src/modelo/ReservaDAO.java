
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;


public class ReservaDAO {
    
    public ArrayList<Reserva> listadoReservas(){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Reserva> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="SELECT * FROM reserva";          
                                    
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                      
            while(rs.next()){
                Reserva reserva = new Reserva();              
                reserva.setFechaEntrada(rs.getDate("fecha_entrada"));
                reserva.setFechaSalida(rs.getDate("fecha_salida"));
                reserva.setNumeroHabitacion(rs.getInt("numero_habitacion"));
                reserva.setCantidadPersonas(rs.getInt("cantidad_personas"));
                reserva.setCodigoReserva(rs.getInt("codigo_reserva"));
                reserva.setCodCliente(rs.getInt("id_cliente"));     
                      
                listado.add(reserva);
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
    
    
    public int crearReserva(Reserva reserva){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO reserva (codigo_reserva, numero_habitacion, id_cliente,"
                    + "fecha_entrada, fecha_salida, cantidad_personas)"
                    +    "VALUES (?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,reserva.getCodigoReserva());
            pstm.setInt(2,reserva.getNumeroHabitacion());
            pstm.setInt(3,reserva.getCodCliente());
            pstm.setDate(4,reserva.getFechaEntrada());
            pstm.setDate(5,reserva.getFechaSalida());
            pstm.setInt(6,reserva.getCantidadPersonas());
  
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
    
    public int eliminarReserva(int cod){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM reserva WHERE codigo_reserva = ? ";
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,cod);
            
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
