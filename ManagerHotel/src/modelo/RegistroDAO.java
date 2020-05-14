
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicio.Fachada;


public class RegistroDAO {
    
    public ArrayList<Registro> listadoRegistro(){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Registro> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="SELECT * FROM registro";          
                                    
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
                      
            while(rs.next()){
                Registro registro = new Registro();              
                registro.setFechaEntrada(rs.getDate("fecha_entrada"));
                registro.setFechaSalida(rs.getDate("fecha_salida"));
                registro.setNumeroHabitacion(rs.getInt("numero_habitacion"));
                registro.setCantidadPersonas(rs.getInt("cantidad_personas"));
                registro.setCodigoRegistro(rs.getInt("codigo_registro"));
                registro.setCodCliente(rs.getInt("id_cliente"));     
                      
                listado.add(registro);
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
    
    
    public int crearRegistro(Registro registro){
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        
         try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO registro (codigo_registro, id_cliente,"
                    + "fecha_entrada, fecha_salida, numero_habitacion, cantidad_personas)"
                    +    "VALUES (?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1,registro.getCodigoRegistro());
            pstm.setInt(2,registro.getCodCliente());
            pstm.setDate(3,registro.getFechaEntrada());
            pstm.setDate(4,registro.getFechaSalida());
            pstm.setInt(5,registro.getNumeroHabitacion());
            pstm.setInt(6,registro.getCantidadPersonas());
  
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
    
}
