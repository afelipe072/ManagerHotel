
package modelo;


public class ServicioCliente {
    int idCliente, codServicio;
    
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
