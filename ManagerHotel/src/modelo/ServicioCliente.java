
package modelo;

import java.sql.Date;


public class ServicioCliente {
    int idCliente, codServicio;
    Date fecha_Servicio;

    public Date getFecha_Servicio() {
        return fecha_Servicio;
    }

    public void setFecha_Servicio(Date fecha_Servicio) {
        this.fecha_Servicio = fecha_Servicio;
    }
    
    public ServicioCliente(){}
    public ServicioCliente(int idCliente, int codServicio) {
        this.idCliente = idCliente;
        this.codServicio = codServicio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(int codServicio) {
        this.codServicio = codServicio;
    }
    
}
