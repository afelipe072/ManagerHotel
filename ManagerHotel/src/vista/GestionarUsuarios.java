/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControladorUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author user
 */
public class GestionarUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionarUsuarios
     */
    public GestionarUsuarios() {
        initComponents();
    }
    
    public void cargarUsuarios(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        ArrayList <Usuario> listadoUsuarios =new ArrayList();
        listadoUsuarios=ControladorUsuario.listadoUsuario("0");
        limpiarListadoTabla();
        for(int i= 0; i < listadoUsuarios.size(); i++){                       
              modelo.addRow(new Object[]{
              listadoUsuarios.get(i).getCodigo(),
              listadoUsuarios.get(i).getId(),
              listadoUsuarios.get(i).getNombre(),              
              listadoUsuarios.get(i).getApellido(),
              listadoUsuarios.get(i).getRol(),
              listadoUsuarios.get(i).getTelefono(),
              listadoUsuarios.get(i).getUser_name(),
              listadoUsuarios.get(i).getContraseña()                 
              });
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
        jlCodigo = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jlID = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jlRol = new javax.swing.JLabel();
        jcbRol = new javax.swing.JComboBox();
        jlTelefono = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();
        jlUser = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jlContraseña = new javax.swing.JLabel();
        jpContraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Gestionar Usuarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jlCodigo.setText("Codigo:");

        jtxtCodigo.setEnabled(false);

        jlID.setText("ID:");

        jtxtID.setEnabled(false);

        jlNombre.setText("Nombre:");

        jtxtNombre.setEnabled(false);

        jlApellido.setText("Apellido:");

        jtxtApellido.setEnabled(false);

        jlRol.setText("Rol:");

        jcbRol.setEnabled(false);
        jcbRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Admin", "Operativo" }));

        jlTelefono.setText("Telefono:");

        jtxtTelefono.setEnabled(false);

        jlUser.setText("UserName:");

        jtxtUser.setEnabled(false);

        jlContraseña.setText("Contraseña:");

        jpContraseña.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigo)
                    .addComponent(jlNombre)
                    .addComponent(jlRol)
                    .addComponent(jlUser))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtCodigo)
                    .addComponent(jtxtNombre)
                    .addComponent(jcbRol, 0, 100, Short.MAX_VALUE)
                    .addComponent(jtxtUser))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTelefono)
                    .addComponent(jlApellido)
                    .addComponent(jlContraseña)
                    .addComponent(jlID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtID, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jtxtApellido)
                    .addComponent(jtxtTelefono)
                    .addComponent(jpContraseña))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID)
                    .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellido)
                    .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRol)
                    .addComponent(jcbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefono)
                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUser)
                    .addComponent(jtxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContraseña)
                    .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Controles:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbRegistrar.setEnabled(false);
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Codigo", "ID", "Nombre", "Apellido","Rol","Telefono","User_Name","Contraseña"
            }
        ));
        cargarUsuarios();
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"No hay registros");
            }
            else{
                JOptionPane.showMessageDialog(this,"Seleccione una fila");
            }
        }else {
                                  
            jtxtCodigo.setText(modelo.getValueAt(jTable1.getSelectedRow(), 0).toString());            
            jtxtID.setText(modelo.getValueAt(jTable1.getSelectedRow(), 1).toString());
            jtxtNombre.setText(modelo.getValueAt(jTable1.getSelectedRow(),2).toString());
            jtxtApellido.setText(modelo.getValueAt(jTable1.getSelectedRow(),3).toString());
            jcbRol.setSelectedItem(modelo.getValueAt(jTable1.getSelectedRow(),4).toString());
            jtxtTelefono.setText(modelo.getValueAt(jTable1.getSelectedRow(),5).toString());
            jtxtUser.setText(modelo.getValueAt(jTable1.getSelectedRow(),6).toString());
            jpContraseña.setText(modelo.getValueAt(jTable1.getSelectedRow(),7).toString());   
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        
        limpiarCampos();  
        
        if(jbNuevo.getText().equals("Nuevo")){
            
            jbRegistrar.setEnabled(true);
            
            jtxtCodigo.setEnabled(true);
            jtxtID.setEnabled(true);
            jtxtNombre.setEnabled(true); 
            jtxtApellido.setEnabled(true);
            jcbRol.setEnabled(true);  
            jtxtTelefono.setEnabled(true);
            jtxtUser.setEnabled(true);
            jpContraseña.setEnabled(true);          
            
            jbModificar.setEnabled(false);
            jbNuevo.setText("Cancelar");
            jbBorrar.setEnabled(false);
            
            jTable1.setEnabled(false);
            jTable1.setVisible(false);
            jtxtCodigo.requestFocusInWindow();
        }
        else{   
            
            jbRegistrar.setEnabled(false);
            
            jtxtCodigo.setEnabled(false);
            jtxtID.setEnabled(false);
            jtxtNombre.setEnabled(false);                      
            jtxtApellido.setEnabled(false);
            jcbRol.setEnabled(false);
            jtxtTelefono.setEnabled(false);
            jtxtUser.setEnabled(false);
            jpContraseña.setEnabled(false);
            
            jbNuevo.setText("Nuevo");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
            
            jTable1.setEnabled(true);
            jTable1.setVisible(true);
            jbNuevo.requestFocusInWindow();
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        if(jtxtCodigo.getText().trim().equals(""))
            JOptionPane.showMessageDialog(this,"Ingrese el Codigo del Usuario");
        else{
            if (jcbRol.getSelectedItem().toString().trim().
                    equals("Seleccionar") ){
                JOptionPane.showMessageDialog(this,"Seleccione El ROL");
                jcbRol.requestFocusInWindow(); }               
            else {
                Usuario unUsuario=new Usuario();
                unUsuario.setCodigo(Integer.parseInt(jtxtCodigo.getText()));
                unUsuario.setId(jtxtID.getText());
                unUsuario.setNombre(jtxtNombre.getText());
                unUsuario.setApellido(jtxtApellido.getText());
                unUsuario.setRol(jcbRol.getSelectedItem().toString());
                unUsuario.setTelefono(jtxtTelefono.getText());
                unUsuario.setUser_name(jtxtUser.getText());
                unUsuario.setContraseña(jpContraseña.getText());               
                
                int tamaño;
                tamaño=ControladorUsuario.listadoUsuario(unUsuario.getCodigo()+"").size();
                
                if(tamaño==0){
                int resultado = 0;
                    resultado = ControladorUsuario.grabarUsuario(unUsuario);                    
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                "Registro Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }
                    cargarUsuarios();
                    
                    jbRegistrar.setEnabled(false);
                    
                    jtxtCodigo.setEnabled(false);
                    jtxtID.setEnabled(false);
                    jtxtNombre.setEnabled(false);                      
                    jtxtApellido.setEnabled(false);
                    jcbRol.setEnabled(false);
                    jtxtTelefono.setEnabled(false);
                    jtxtUser.setEnabled(false);
                    jpContraseña.setEnabled(false);     
            
                    jbNuevo.setText("Nuevo");
                    jbModificar.setEnabled(true);
                    jbBorrar.setEnabled(true);
            
                    jTable1.setEnabled(true);
                    jTable1.setVisible(true);
                    jbNuevo.requestFocusInWindow();
                    limpiarCampos();
                    
            }else{
                   JOptionPane.showMessageDialog(this,
                           "Codigo ya registrado","Confirmación",
                           JOptionPane.ERROR_MESSAGE); 
                   jtxtCodigo.requestFocusInWindow();
                }
                
          
            }
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        if(jbModificar.getText().equalsIgnoreCase("Modificar")){
            if(jTable1.getSelectedRow() == -1){
               if(jTable1.getRowCount() == 0){
                   JOptionPane.showMessageDialog(this,"No hay registros");
               }else{
                   JOptionPane.showMessageDialog(this,"Seleccione una fila");
               }
            }else{    
                
            jbNuevo.setEnabled(false);
            
            jtxtID.setEnabled(true);
            jtxtNombre.setEnabled(true); 
            jtxtApellido.setEnabled(true);
            jcbRol.setEnabled(true);  
            jtxtTelefono.setEnabled(true);
            jtxtUser.setEnabled(true);
            jpContraseña.setEnabled(true);      
            
            jbModificar.setText("Actualizar");
            jbBorrar.setEnabled(false);            
            jbCancelar.setEnabled(true);
           
             }
        }else {            
            jbNuevo.setEnabled(true);
            
            jtxtID.setEnabled(false);
            jtxtNombre.setEnabled(false);                      
            jtxtApellido.setEnabled(false);
            jcbRol.setEnabled(false);
            jtxtTelefono.setEnabled(false);
            jtxtUser.setEnabled(false);
            jpContraseña.setEnabled(false);  
            
            jbModificar.setText("Modificar");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);                                 
            jbCancelar.setEnabled(false);
            jTable1.setEnabled(true);
             
            //Se crea el objeto Usuario
            Usuario unUsuario = new Usuario();
             
            //Se configura los datos en el objeto unUsuario de la clase
            //Usuario
            unUsuario.setCodigo(Integer.parseInt(jtxtCodigo.getText()));
            unUsuario.setId(jtxtID.getText());
            unUsuario.setNombre(jtxtNombre.getText());
            unUsuario.setApellido(jtxtApellido.getText());
            unUsuario.setRol(jcbRol.getSelectedItem().toString());
            unUsuario.setTelefono(jtxtTelefono.getText());
            unUsuario.setUser_name(jtxtUser.getText());
            unUsuario.setContraseña(jpContraseña.getText());    
             
                         
             if(ControladorUsuario.modificarUsuario(unUsuario) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarUsuarios();
                 this.limpiarCampos(); 
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        if(jtxtCodigo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione un Usuario","Error", 
                    JOptionPane.ERROR_MESSAGE);
        }else{
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Desea Eliminar Al Usuario Con El Codigo : " +
                            jtxtCodigo.getText().trim()+
                    " ?", "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                String codigo = "";
                codigo  = jtxtCodigo.getText().trim();
                
                if(ControladorUsuario.borrarUsuario(codigo) == 1){
                    JOptionPane.showMessageDialog(this, 
                            "Registro Borrado con éxtio", 
                            "Confirmación de acción", 
                            JOptionPane.INFORMATION_MESSAGE);                    
                    cargarUsuarios();
                    limpiarCampos();  
                }
                else{
                    JOptionPane.showMessageDialog(this, 
                            "Error al borrar", "Confirmación de acción", 
                            JOptionPane.ERROR_MESSAGE);                    
                }
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        jtxtCodigo.setEnabled(false);
        jtxtID.setEnabled(false);
        jtxtNombre.setEnabled(false);                      
        jtxtApellido.setEnabled(false);
        jcbRol.setEnabled(false);
        jtxtTelefono.setEnabled(false);
        jtxtUser.setEnabled(false);
        jpContraseña.setEnabled(false); 
        
        jbBorrar.setEnabled(true);
        jbNuevo.setEnabled(true);
        jbRegistrar.setEnabled(false);
        jbModificar.setText("Modificar");
        jbCancelar.setEnabled(false);
        
        jTable1.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void limpiarListadoTabla(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        for(int i=modelo.getRowCount()-1; i>=0 ; i--){
            modelo.removeRow(i);
        }
    }
    
    private void limpiarCampos(){
        jtxtCodigo.setText("");
        jtxtID.setText("");
        jtxtNombre.setText(""); 
        jtxtApellido.setText("");
        jcbRol.setSelectedIndex(0);
        jtxtTelefono.setText("");
        jtxtUser.setText("");
        jpContraseña.setText("");  
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox jcbRol;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlRol;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlUser;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextField jtxtUser;
    // End of variables declaration//GEN-END:variables
}
