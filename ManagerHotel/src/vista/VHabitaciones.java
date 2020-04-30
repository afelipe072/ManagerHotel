/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorHabitacion;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeArray;
import modelo.Habitacion;

/**
 *
 * @author USER
 */
public class VHabitaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form VHabitaciones
     */
    public VHabitaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbbuscar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNumero = new javax.swing.JTextField();
        jtxtValor = new javax.swing.JTextField();
        jtxtTipoHabitacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtaDescripcion = new javax.swing.JTextArea();
        jcEstado = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Opciones"));

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbbuscar)
                .addGap(35, 35, 35)
                .addComponent(jbCrear)
                .addGap(37, 37, 37)
                .addComponent(jbEliminar)
                .addGap(30, 30, 30)
                .addComponent(jbCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbbuscar)
                    .addComponent(jbCrear)
                    .addComponent(jbEliminar)
                    .addComponent(jbCancelar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Informacion Habitacion"));

        jLabel1.setText("Valor: ");

        jLabel2.setText("Tipo Habitacion: ");

        jLabel3.setText("Estado: ");

        jLabel5.setText("Numero: ");

        jtxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumeroActionPerformed(evt);
            }
        });
        jtxtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNumeroKeyTyped(evt);
            }
        });

        jtxtValor.setEnabled(false);
        jtxtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtValorKeyTyped(evt);
            }
        });

        jtxtTipoHabitacion.setEnabled(false);

        jtxtaDescripcion.setEditable(false);
        jtxtaDescripcion.setColumns(20);
        jtxtaDescripcion.setRows(5);
        jtxtaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion: "));
        jScrollPane1.setViewportView(jtxtaDescripcion);

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));
        jcEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtTipoHabitacion)
                        .addComponent(jtxtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //funcion camposVacios : verifica que los campos txt inportantes no sean nulos
    public boolean camposVacios() {
        if ("".equals(jtxtNumero.getText()) || "".equals(jtxtTipoHabitacion.getText()) || "".equals(jtxtValor.getText())) {
            return false;
        } else {
            return true;
        }
    }

    //funcion crearHabitacion : crea una habitacion con los datos ingresados
    public void crearHabitacion() {
        if (camposVacios()) {
            Habitacion unaHabitacion = new Habitacion();
            unaHabitacion.setNumero(parseInt(jtxtNumero.getText()));
            unaHabitacion.setTipoHabitacion(jtxtTipoHabitacion.getText());
            unaHabitacion.setValor(parseDouble(jtxtValor.getText()));
            unaHabitacion.setEstado(jcEstado.getSelectedItem().toString());
            unaHabitacion.setDescripcion(jtxtaDescripcion.getText());

            int resultado = 0;
            resultado = ControladorHabitacion.crearHabitacion(unaHabitacion);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this,
                        "Habitacion Creada Con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error Al Crear Habitacion",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los campos Numero, Tipo Habitacion y Valor son obligatorios.");
        }
    }

    //funcion buscarHabitacion : busca una habitacion con el numero de habitacion ingresado
    public void buscarHabitacion(int num) {
        boolean existe = false;
        ArrayList<Habitacion> listadoHabitaciones = new ArrayList<>();
        listadoHabitaciones = ControladorHabitacion.listadoHabitaciones();
        for (Habitacion h : listadoHabitaciones) {
            if (h.getNumero() == num) {
                jtxtTipoHabitacion.setText(h.getTipoHabitacion());
                jtxtValor.setText("" + h.getValor());
                jtxtaDescripcion.setText(h.getDescripcion());
                jcEstado.setSelectedItem(h.getEstado());
                existe = true;
                jbbuscar.setVisible(false);
                jbCrear.setText("Volver");
                jbEliminar.setText("Guardar Cambios");
                jbCancelar.setVisible(false);
                activarCampos();
            }
        }
        if (!existe) {
            JOptionPane.showMessageDialog(this, "No existe una habitacion con el numero : " + num);
        }
    }

    //funcion modificarHabitacion : modifica los atributos de la habitacion especificada  
    public void modificarHabitacion() {
        if (camposVacios()) {
            Habitacion unaHabitacion = new Habitacion();
            unaHabitacion.setNumero(parseInt(jtxtNumero.getText()));
            unaHabitacion.setTipoHabitacion(jtxtTipoHabitacion.getText());
            unaHabitacion.setValor(parseDouble(jtxtValor.getText()));
            unaHabitacion.setEstado(jcEstado.getSelectedItem().toString());
            unaHabitacion.setDescripcion(jtxtaDescripcion.getText());

            int resultado = 0;
            resultado = ControladorHabitacion.modificarHabitacion(unaHabitacion);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this,
                        "Habitacion Modificada Con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error Al Modificar Habitacion",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //funcion eliminarHabitacion : elimina la habitacion con el numero ingresado (num)
    public void eliminarHabitacion(int num) {
        if (jtxtNumero.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El numero de habitacion es obligatorio : ");
        } else {
            int opciones = JOptionPane.YES_NO_OPTION;
            int resultadoOpciones = JOptionPane.showConfirmDialog(this,
                    "Se eliminara la habitacion con numero : "+num+" desea continuar?","Informacion importante", opciones);
            if(resultadoOpciones == 0){
                int resultado = 0;
                resultado = ControladorHabitacion.eliminarHabitacion(num);
                datosOriginales();
                limpiarCampos();
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(this,
                            "Habitacion Eliminada Con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error Al Eliminar Habitacion",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Operacion cancelada");
                datosOriginales();
                limpiarCampos();
                desactivarCampos();
            }   
        }
    }

    //funcion limpiarCampos : cambia los campos de la vista por nulos o predeterminados.
    public void limpiarCampos() {
        jtxtNumero.setText("");
        jtxtTipoHabitacion.setText("");
        jtxtValor.setText("");
        jtxtaDescripcion.setText("");
        jcEstado.setSelectedItem(0);

    }

    //funcion datosOriginales: cambia los botones a las opciones de inicio
    public void datosOriginales() {
        jbbuscar.setVisible(true);
        jbCancelar.setVisible(true);
        jbCrear.setText("Crear");
        jbEliminar.setText("Eliminar");
    }

    //funcion activarCampos : activa los campos necesarios para la creacion o modificacion de una habitacion
    public void activarCampos() {
        jtxtTipoHabitacion.setEnabled(true);
        jtxtValor.setEnabled(true);
        jtxtaDescripcion.setEditable(true);
        jcEstado.setEnabled(true);
    }

    //funcion desactivarCampos : desactiva los campos txt y combobox (lo contrario a activarCampos).
    public void desactivarCampos() {
        jtxtTipoHabitacion.setEnabled(false);
        jtxtValor.setEnabled(false);
        jtxtaDescripcion.setEditable(false);
        jcEstado.setEnabled(false);
    }


    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed

        if (!jtxtNumero.getText().trim().isEmpty()) {
            buscarHabitacion(parseInt(jtxtNumero.getText()));
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe poner el numero de habitacion a buscar");
        }
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jtxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumeroActionPerformed

    private void jtxtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNumeroKeyTyped
        // codigo para no dejar escribir caracteres de tipo string en el campo txt
        char valor = evt.getKeyChar();
        if (!Character.isDigit(valor)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNumeroKeyTyped

    private void jtxtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtValorKeyTyped
        // codigo para no dejar escribir caracteres de tipo string en el campo txt
        char valor = evt.getKeyChar();
        if (!Character.isDigit(valor) || valor == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtValorKeyTyped

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed

        if (jbCrear.getText().equalsIgnoreCase("Crear")) {
            jbbuscar.setVisible(false);
            jbCancelar.setVisible(false);
            jbCrear.setText("Volver");
            jbEliminar.setText("Aceptar");
            activarCampos();
        } else {
            datosOriginales();
            limpiarCampos();
            desactivarCampos();
        }

    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jbEliminar.getText().equalsIgnoreCase("Eliminar")) {
            if (!jtxtNumero.getText().trim().isEmpty()) {
                eliminarHabitacion(parseInt(jtxtNumero.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "El campo Numero es obligatorio.");
            }
        } else if (jbEliminar.getText().equalsIgnoreCase("Aceptar")) {
            crearHabitacion();
            datosOriginales();
            limpiarCampos();
            desactivarCampos();
        } else {
            modificarHabitacion();
            datosOriginales();
            limpiarCampos();
            desactivarCampos();
        }


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JTextField jtxtNumero;
    private javax.swing.JTextField jtxtTipoHabitacion;
    private javax.swing.JTextField jtxtValor;
    private javax.swing.JTextArea jtxtaDescripcion;
    // End of variables declaration//GEN-END:variables
}