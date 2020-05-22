/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorServicio;
import modelo.Servicio;
import modelo.Usuario;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VServicios extends javax.swing.JInternalFrame {

    Usuario un_usuario;
    /**
     * Creates new form VServicios2
     */
    public VServicios(Usuario u) {
        un_usuario = u;
        initComponents();
        cargar_servicios();
        desactivarCamposTxt();
    }
    
    private void limpiar_tabla(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        for(int i=modelo.getRowCount()-1; i>=0 ; i--){
            modelo.removeRow(i);
        }
    }
    
    public void cargar_servicios(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList<Servicio> lista_servicios = new ArrayList();
        lista_servicios = ControladorServicio.lista_servicio();
        limpiar_tabla();
        
        for(int i = 0; i < lista_servicios.size(); i++){
            modelo.addRow(new Object[]{
                lista_servicios.get(i).get_codigo(),
                lista_servicios.get(i).get_valor(),
                lista_servicios.get(i).get_descripcion(),
            });
        }
    }
    
     public void activarCamposTxt() {
        txt_cod.setEnabled(true);
        txt_valor.setEnabled(true);
        txt_desc.setEnabled(true);
    }

    public void desactivarCamposTxt() {
        txt_valor.setEnabled(false);
        txt_desc.setEnabled(false);
    }
    
     public void limpiarCampos() {
        txt_cod.setText("");
        txt_valor.setText("");
        txt_desc.setText("");
    }
   
    public void crear_servicio(){
        if(txt_cod.getText().trim().equals("") || txt_valor.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "¡El código del servicio y el valor son obligatorios!");
        }else{
            Servicio un_servicio = new Servicio();
                        
            un_servicio.set_codigo(Integer.parseInt(txt_cod.getText()));
            un_servicio.set_valor(Double.parseDouble(txt_valor.getText()));
            un_servicio.set_descripcion(txt_desc.getText());
            
            int resultado = 0;
            resultado = ControladorServicio.crear_servicio(un_servicio);
            
            if(resultado == 1){
                cargar_servicios();
                JOptionPane.showMessageDialog(this, "Servicio almacenado con exito");
            }else{
                JOptionPane.showMessageDialog(null, "¡Error, no se pudo crear el servicio!");
            }
        }
    }
    
    public void modificar_servicio(){
        
        if(txt_cod.getText().trim().equals("") || txt_valor.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "¡El código del servicio y el valor son obligatorios!");
        }else{
            Servicio un_servicio = new Servicio();
            
            un_servicio.set_codigo(Integer.parseInt(txt_cod.getText()));
            un_servicio.set_valor(Double.parseDouble(txt_valor.getText()));
            un_servicio.set_descripcion(txt_desc.getText());
            
           int resultado = 0;
           resultado = ControladorServicio.modificar_servicio(un_servicio);
           if(resultado == 1){
               cargar_servicios();
               JOptionPane.showMessageDialog(null, "Servicio modificado exitosamente");
           }else{
               JOptionPane.showMessageDialog(null, "¡Error en la modificación del servicio!");
           }
        }
    }
    
    public void buscar_servicio(int codigo){
        
       boolean existe = false;
        ArrayList<Servicio> lista_servicios = new ArrayList();
        lista_servicios = ControladorServicio.lista_servicio();
        for (int i = 0; i < lista_servicios.size(); i++) {
            if (lista_servicios.get(i).get_codigo() == codigo) {
                txt_cod.setText(lista_servicios.get(i).get_codigo()+"");
                txt_valor.setText(lista_servicios.get(i).get_valor()+"");
                txt_desc.setText(lista_servicios.get(i).get_descripcion());
                
                existe = true;
                break;
            }
        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "¡No hay ningún servicio con código " + codigo+"!");
            limpiarCampos();
        }
        
    }
    
    public void eliminar_servicio(int codigo){
        
         if (txt_cod.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "¡Debe indicar el código del servicio!");
        } else {
            int resultado = 0;
            resultado = ControladorServicio.eliminar_servicio(codigo);
            if (resultado == 1) {
                cargar_servicios();
                JOptionPane.showMessageDialog(null, "Servicio Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar el servicio!");
            }
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
        jLabel3 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_desc = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jb_eliminar = new javax.swing.JButton();
        jb_agregar = new javax.swing.JButton();
        jb_buscar = new javax.swing.JButton();
        jb_actualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Servicios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setName("panel_datos"); // NOI18N

        jLabel1.setText("Código de servicio");
        jLabel1.setName("lb_codigo"); // NOI18N

        jLabel2.setText("Valor del servicio");

        jLabel3.setText("Descripción");

        txt_cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codKeyTyped(evt);
            }
        });

        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });
        txt_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(txt_desc);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jb_eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        jb_agregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_agregar.setText("Agregar");
        jb_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarActionPerformed(evt);
            }
        });

        jb_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        jb_actualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jb_actualizar.setText("Actualizar");
        jb_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_agregar)
                    .addComponent(jb_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_actualizar)
                    .addComponent(jb_buscar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Valor", "Descripción"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Código");
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Valor");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Descripción");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarActionPerformed
        
        if(jb_agregar.getText().equalsIgnoreCase("Agregar")){
            limpiarCampos();
            jb_agregar.setText("Registrar");
            jb_eliminar.setText("Cancelar");
            activarCamposTxt();
            jb_actualizar.setVisible(false);
            jb_buscar.setVisible(false);
        }else if(jb_agregar.getText().equalsIgnoreCase("Finalizar")){
            jb_actualizar.setVisible(true);
            jb_buscar.setVisible(true);
            jb_agregar.setText("Agregar");
            jb_eliminar.setText("Eliminar");
            desactivarCamposTxt();
            modificar_servicio();
            limpiarCampos();
        }else{
            jb_agregar.setText("Agregar");
            jb_eliminar.setText("Eliminar");
            desactivarCamposTxt();
            jb_buscar.setVisible(true);
            jb_actualizar.setVisible(true);
            crear_servicio();
            limpiarCampos();
        }
        
    }//GEN-LAST:event_jb_agregarActionPerformed

    
    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        
        if(jb_eliminar.getText().equalsIgnoreCase("Cancelar")){
            
            jb_agregar.setText("Agregar");
            jb_eliminar.setText("Eliminar");
            limpiarCampos();
            desactivarCamposTxt();
            jb_buscar.setVisible(true);
            jb_actualizar.setVisible(true);
            
        }else{
            if(txt_cod.getText().trim().equals("")){
                 JOptionPane.showMessageDialog(null, "¡Es necesario el código del servicio!");
            }else{
                eliminar_servicio(Integer.parseInt(txt_cod.getText()));
            }
        } //*****
        
       
        
    }//GEN-LAST:event_jb_eliminarActionPerformed

    
    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed

    private void jb_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_actualizarActionPerformed
        if(jb_actualizar.getText().equalsIgnoreCase("Actualizar")){
            jb_actualizar.setVisible(false);
            jb_buscar.setVisible(false);
            jb_agregar.setText("Finalizar");
            jb_eliminar.setText("Cancelar");
            activarCamposTxt();
        }
    }//GEN-LAST:event_jb_actualizarActionPerformed

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
            txt_cod.setText(modelo.getValueAt(jTable1.getSelectedRow(), 0).toString());
            txt_valor.setText(modelo.getValueAt(jTable1.getSelectedRow(), 1).toString());
            txt_desc.setText(modelo.getValueAt(jTable1.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        
        if (txt_cod.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "¡Debe ingresar el código del servicio!");
        } else {
            buscar_servicio(Integer.parseInt(txt_cod.getText().trim()));
        }
        
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void txt_codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codKeyTyped
         char valor = evt.getKeyChar();
        if (!Character.isDigit(valor)){
            evt.consume();
        }
    }//GEN-LAST:event_txt_codKeyTyped

    private void txt_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorKeyTyped
         char valor = evt.getKeyChar();
        if (!Character.isDigit(valor)){
            evt.consume();
        }
    }//GEN-LAST:event_txt_valorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_actualizar;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextPane txt_desc;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
