/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorCliente;
import control.ControladorReserva;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Reserva;

/**
 *
 * @author USER
 */
public class VConsultarReservas extends javax.swing.JInternalFrame {

    /**
     * Creates new form vCancelarReserva
     */
    public VConsultarReservas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtcodReserva = new javax.swing.JTextField();
        jtxtHabitacion = new javax.swing.JTextField();
        jtxtFechSalida = new javax.swing.JTextField();
        jtxtFechIngreso = new javax.swing.JTextField();
        jtxtCantPersonas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtIdCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Reserva");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu"));

        jbBuscar.setText("Buscar Reserva");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar Reserva");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar)
                .addGap(61, 61, 61)
                .addComponent(jbCancelar)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbBuscar)
                    .addComponent(jbCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos Reserva"));

        jLabel1.setText("Codigo Reserva: ");

        jLabel2.setText("Habitacion: ");

        jLabel4.setText("Fecha Ingreso:");

        jLabel5.setText("Fecha Salida: ");

        jLabel6.setText("Cantidad Personas: ");

        jtxtHabitacion.setEnabled(false);

        jtxtFechSalida.setEnabled(false);

        jtxtFechIngreso.setEnabled(false);

        jtxtCantPersonas.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(jtxtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtcodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtFechIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFechSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtcodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jtxtFechIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jtxtFechSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jtxtcodReserva.getAccessibleContext().setAccessibleName("jtxtcodReserva");
        jtxtHabitacion.getAccessibleContext().setAccessibleName("jtxtHabitacion");
        jtxtFechSalida.getAccessibleContext().setAccessibleName("jtxtFechSalida");
        jtxtFechIngreso.getAccessibleContext().setAccessibleName("jtxtFechIngreso");
        jtxtCantPersonas.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos Cliente"));

        jLabel3.setText("Identificacion: ");

        jtxtIdCliente.setEnabled(false);

        jLabel7.setText("Nombre: ");

        jtxtNombre.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jtxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jtxtIdCliente.getAccessibleContext().setAccessibleName("jtxtIdCliente");
        jtxtNombre.getAccessibleContext().setAccessibleName("jtxtNombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (verificarCampoCod()) {
            int cod = Integer.parseInt(jtxtcodReserva.getText());
            if (buscarReserva(cod)) {
                llenarCampos(cod);
            } else {
                JOptionPane.showMessageDialog(this, "La Reserva Con Codigo : " + cod + " No Existe...");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese El Codigo De La Reserva");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarReserva();
    }//GEN-LAST:event_jbEliminarActionPerformed

    //eliminarreserva : elimina la reserva que tenga el codigo ingresado
    public void eliminarReserva() {
        if (jtxtcodReserva.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese El Codigo De La Reserva");
        } else {
            int cod = Integer.parseInt(jtxtcodReserva.getText());
            if (buscarReserva(cod)) {
                int resultado = 0;
                resultado = ControladorReserva.eliminarReserva(cod);
                limpiarCampos();
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(this,
                            "Reserva Eliminada Con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error Al Eliminar Reserva",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "La Reserva Con Codigo : " + cod + " No Existe...");
            }

        }
    }

    //limpiarCampos : borra toda la inforamcion de los cuadros textfield
    public void limpiarCampos() {
        jtxtCantPersonas.setText("");
        jtxtFechIngreso.setText("");
        jtxtFechSalida.setText("");
        jtxtcodReserva.setText("");
        jtxtIdCliente.setText("");
        jtxtNombre.setText("");
        jtxtHabitacion.setText("");
    }

    //buscarReserva : retorna true si la reserva ingresada existe en la base de datos o false si no
    public boolean buscarReserva(int cod) {
        ArrayList<Reserva> listadoReservas = new ArrayList();
        listadoReservas = ControladorReserva.listadoReserva();
        for (int i = 0; i < listadoReservas.size(); i++) {
            if (listadoReservas.get(i).getCodigoReserva() == cod) {
                return true;
            }
        }
        return false;
    }

    //llenarCampos : completa los campos de la informacion de la resreva
    public void llenarCampos(int cod) {
        int id;
        ArrayList<Reserva> listadoReservas = new ArrayList();
        listadoReservas = ControladorReserva.listadoReserva();
        for (int i = 0; i < listadoReservas.size(); i++) {
            if (listadoReservas.get(i).getCodigoReserva() == cod) {
                id = listadoReservas.get(i).getCodCliente();
                jtxtFechIngreso.setText(listadoReservas.get(i).getFechaEntrada().toString());
                jtxtFechSalida.setText(listadoReservas.get(i).getFechaSalida().toString());
                jtxtCantPersonas.setText("" + listadoReservas.get(i).getCantidadPersonas());
                jtxtHabitacion.setText("" + listadoReservas.get(i).getNumeroHabitacion());
                jtxtIdCliente.setText("" + listadoReservas.get(i).getCodCliente());
                buscarCliente(id);
            }
        }
    }

    //buscarCliente : busca el nombre del cliente, si este existe en la base de datos
    public void buscarCliente(int id) {
        String nombre = "";
        ArrayList<Cliente> listadoClientes = new ArrayList();
        listadoClientes = ControladorCliente.listadoCliente();
        for (int i = 0; i < listadoClientes.size(); i++) {
            if (listadoClientes.get(i).getIdCliente() == id) {
                nombre = listadoClientes.get(i).getNombre() + " " + listadoClientes.get(i).getApellido();
                jtxtNombre.setText(nombre);
                break;
            }
        }
    }

    // verificarCampoCod : verifica si el campo codReserva se encuentra vacio
    public boolean verificarCampoCod() {
        if (jtxtcodReserva.getText().trim().equalsIgnoreCase("")) {
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JTextField jtxtCantPersonas;
    private javax.swing.JTextField jtxtFechIngreso;
    private javax.swing.JTextField jtxtFechSalida;
    private javax.swing.JTextField jtxtHabitacion;
    private javax.swing.JTextField jtxtIdCliente;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtcodReserva;
    // End of variables declaration//GEN-END:variables
}