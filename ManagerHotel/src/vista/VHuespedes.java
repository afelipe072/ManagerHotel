/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorCliente;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author user
 */
public class VHuespedes extends javax.swing.JInternalFrame {

    Usuario unUsuario;

    /**
     * Creates new form VHuespedes
     */
    public VHuespedes(Usuario u) {
        unUsuario = u;
        initComponents();
    }

    public void cargarClientes() {
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList<Cliente> listadoClientes = new ArrayList();
        listadoClientes = ControladorCliente.listadoCliente();
        //limpiarListadoTabla();
        for (int i = 0; i < listadoClientes.size(); i++) {
            modelo.addRow(new Object[]{
                listadoClientes.get(i).getIdCliente(),
                listadoClientes.get(i).getNombre(),
                listadoClientes.get(i).getApellido(),
                listadoClientes.get(i).getCiudad(),
                listadoClientes.get(i).getDireccion(),
                listadoClientes.get(i).getProfesion(),
                listadoClientes.get(i).getTelefono(),
                listadoClientes.get(i).getEmail(),});
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtId = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtOcupacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbRegistrar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Huespedes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos Personales:"));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Correo:");

        jLabel6.setText("Ocupación:");

        jtxtNombre.setEnabled(false);

        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });

        jtxtApellido.setEnabled(false);

        jtxtTelefono.setEnabled(false);
        jtxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefonoActionPerformed(evt);
            }
        });

        jtxtOcupacion.setEnabled(false);

        jLabel3.setText("Apellido:");

        jtxtCorreo.setEnabled(false);

        jLabel7.setText("Ciudad:");

        jtxtCiudad.setEnabled(false);

        jLabel8.setText("Direccion:");

        jtxtDireccion.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(46, 46, 46)
                            .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(46, 46, 46)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jtxtDireccion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Controles:"));

        jbRegistrar.setText("Registrar Nuevo Cliente");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar Cliente");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar Cliente");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar)
                .addGap(34, 34, 34)
                .addComponent(jbEditar)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbRegistrar)
                        .addComponent(jbEliminar)
                        .addComponent(jbEditar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbEditar.getAccessibleContext().setAccessibleName("Editar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Ciudad", "Direccion", "Ocupasion", "Telefono", "Email"
            }
        ));
        cargarClientes();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void activarCamposTxt() {
        jtxtApellido.setEnabled(true);
        jtxtCiudad.setEnabled(true);
        jtxtCorreo.setEnabled(true);
        jtxtDireccion.setEnabled(true);
        jtxtId.setEnabled(true);
        jtxtNombre.setEnabled(true);
        jtxtOcupacion.setEnabled(true);
        jtxtTelefono.setEnabled(true);
    }

    public void desactivarCamposTxt() {
        jtxtApellido.setEnabled(false);
        jtxtCiudad.setEnabled(false);
        jtxtCorreo.setEnabled(false);
        jtxtDireccion.setEnabled(false);
        jtxtNombre.setEnabled(false);
        jtxtOcupacion.setEnabled(false);
        jtxtTelefono.setEnabled(false);
    }

    public void limpiarCampos() {
        jtxtId.setText("");
        jtxtApellido.setText("");
        jtxtCiudad.setText("");
        jtxtCorreo.setText("");
        jtxtDireccion.setText("");
        jtxtId.setText("");
        jtxtNombre.setText("");
        jtxtOcupacion.setText("");
        jtxtTelefono.setText("");
    }

    public void eliminarCliente(int id) {
        if (jtxtId.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El Id de usuario es obligatorio : ");
        } else {
            int resultado = 0;
            resultado = ControladorCliente.eliminarCliente(id);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this,
                        "Cliente Eliminado Con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error Al Eliminar Cliente",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void crearCliente() {
        if (jtxtId.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El Id de usuario es obligatorio : ");
        } else {
            Cliente unCliente = new Cliente();
            unCliente.setIdCliente(parseInt(jtxtId.getText()));
            unCliente.setCodUsuario(unUsuario.getCodigo());
            unCliente.setNombre(jtxtNombre.getText());
            unCliente.setApellido(jtxtApellido.getText());
            unCliente.setCiudad(jtxtCiudad.getText());
            unCliente.setDireccion(jtxtDireccion.getText());
            unCliente.setProfesion(jtxtOcupacion.getText());
            unCliente.setTelefono(jtxtTelefono.getText());
            unCliente.setEmail(jtxtCorreo.getText());

            int resultado = 0;
            resultado = ControladorCliente.crearCliente(unCliente);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this,
                        "Cliente Creado Con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error Al Crear Cliente",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void modificarCliente() {
        if (jtxtId.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El Id de usuario es obligatorio : ");
        } else {
            Cliente unCliente = new Cliente();
            unCliente.setIdCliente(parseInt(jtxtId.getText()));
            unCliente.setNombre(jtxtNombre.getText());
            unCliente.setApellido(jtxtApellido.getText());
            unCliente.setCiudad(jtxtCiudad.getText());
            unCliente.setDireccion(jtxtDireccion.getText());
            unCliente.setProfesion(jtxtOcupacion.getText());
            unCliente.setTelefono(jtxtTelefono.getText());
            unCliente.setEmail(jtxtCorreo.getText());

            int resultado = 0;
            resultado = ControladorCliente.modificarCliente(unCliente);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this,
                        "Cliente Modificado Con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error Al Modificar Cliente",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void buscarCliente(int id) {

        boolean existe = false;
        ArrayList<Cliente> listadoClientes = new ArrayList();
        listadoClientes = ControladorCliente.listadoCliente();
        for (int i = 0; i < listadoClientes.size(); i++) {
            if (listadoClientes.get(i).getIdCliente() == id) {
                jtxtNombre.setText(listadoClientes.get(i).getNombre());
                jtxtApellido.setText(listadoClientes.get(i).getApellido());
                jtxtCiudad.setText(listadoClientes.get(i).getCiudad());
                jtxtDireccion.setText(listadoClientes.get(i).getDireccion());
                jtxtOcupacion.setText(listadoClientes.get(i).getProfesion());
                jtxtTelefono.setText(listadoClientes.get(i).getTelefono());
                jtxtCorreo.setText(listadoClientes.get(i).getEmail());
                existe = true;
                break;
            }
        }

        if (!existe) {
            JOptionPane.showMessageDialog(this, "No existe un cliente con el numero de identificacion: " + id);
            limpiarCampos();
        }

    }

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed

    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jtxtId.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El Id de usuario es obligatorio ");
        } else {
            buscarCliente(parseInt(jtxtId.getText().trim()));
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelefonoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        if (jbRegistrar.getText().equalsIgnoreCase("Registrar Nuevo Cliente")) {
            limpiarCampos();
            jbRegistrar.setText("Registrar");
            jbEliminar.setText("Cancelar");
            activarCamposTxt();
            jbBuscar.setVisible(false);
            jbEditar.setVisible(false);

        } else if (jbRegistrar.getText().equalsIgnoreCase("Finalizar Edicion")) {
            jbEditar.setVisible(true);
            jbBuscar.setVisible(true);
            jbRegistrar.setText("Registrar Nuevo Cliente");
            jbEliminar.setText("Eliminar Cliente");
            desactivarCamposTxt();
            modificarCliente();
            limpiarCampos();
        } else {
            jbRegistrar.setText("Registrar Nuevo Cliente");
            jbEliminar.setText("Eliminar Cliente");
            desactivarCamposTxt();
            jbBuscar.setVisible(true);
            jbEditar.setVisible(true);
            crearCliente();
            limpiarCampos();
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (jbEditar.getText().equalsIgnoreCase("Editar Cliente")) {
            jbEditar.setVisible(false);
            jbBuscar.setVisible(false);
            jbRegistrar.setText("Finalizar Edicion");
            jbEliminar.setText("Cancelar");
            activarCamposTxt();
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jbEliminar.getText().equalsIgnoreCase("Cancelar")) {
            jbRegistrar.setText("Registrar Nuevo Cliente");
            jbEliminar.setText("Eliminar Cliente");
            desactivarCamposTxt();
            jbBuscar.setVisible(true);
            jbEditar.setVisible(true);
        } else {
            eliminarCliente(parseInt(jtxtId.getText()));
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No hay registros");
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fila");
            }
        } else {
            jtxtId.setText(modelo.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jtxtNombre.setText(modelo.getValueAt(jTable1.getSelectedRow(), 1).toString());
            jtxtApellido.setText(modelo.getValueAt(jTable1.getSelectedRow(), 2).toString());
            jtxtCiudad.setText(modelo.getValueAt(jTable1.getSelectedRow(), 3).toString());
            jtxtDireccion.setText(modelo.getValueAt(jTable1.getSelectedRow(), 4).toString());
            jtxtOcupacion.setText(modelo.getValueAt(jTable1.getSelectedRow(), 5).toString());
            jtxtTelefono.setText(modelo.getValueAt(jTable1.getSelectedRow(), 6).toString());
            jtxtCorreo.setText(modelo.getValueAt(jTable1.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCiudad;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtOcupacion;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
