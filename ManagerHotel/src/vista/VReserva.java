/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import Herramientas.TextPrompt;
import control.ControladorCliente;
import control.ControladorHabitacion;
import control.ControladorRegistro;
import control.ControladorReserva;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import static java.lang.Integer.parseInt;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Cliente;
import modelo.Habitacion;
import modelo.Registro;
import modelo.Reserva;
import modelo.Usuario;


public class VReserva extends javax.swing.JInternalFrame {

    Usuario unUsuario;
    JInternalFrame vistaHuesped;
    JDesktopPane JDpanel;

    public VReserva(Usuario u, JInternalFrame vHuesped, JDesktopPane panel) {
        unUsuario = u;
        vistaHuesped = vHuesped;
        JDpanel = panel;
        initComponents();
        generarNumReserva();
        numHabitaciones(jcbNumHabitacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNumPersonas = new javax.swing.JTextField();
        jcbNumHabitacion = new javax.swing.JComboBox();
        jlabel093 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlReserva = new javax.swing.JLabel();
        jDIngreso = new com.toedter.calendar.JDateChooser();
        jDSalida = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaDescripcion = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbReservar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Reservar");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.jpg"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos Reserva:"));

        jlabel.setText("Fecha Ingreso: ");

        jLabel4.setText("Numero Habitacion:");

        jLabel5.setText("Numero de Personas:");

        jcbNumHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNumHabitacionActionPerformed(evt);
            }
        });

        jlabel093.setText("Fecha Salida: ");

        jLabel6.setText("Reserva:");

        jlReserva.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlabel093)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlReserva)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jlabel))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jcbNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jtxtNumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jlReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(jlabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlabel093)
                    .addComponent(jDSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtNumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Informacion Habitación:"));

        jtxtAreaDescripcion.setEditable(false);
        jtxtAreaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));
        jScrollPane1.setViewportView(jtxtAreaDescripcion);

        jLabel2.setText("Estado:");

        jlEstado.setText("...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jlEstado)
                .addGap(55, 55, 55))
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlEstado))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu"));

        jbReservar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbReservar.setText("Reservar");
        jbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jbReservar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addGap(100, 100, 100))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbReservar)
                    .addComponent(jbCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos Huesped:"));

        jLabel1.setText("ID:");

        jtxtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxtIdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtIdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtxtIdMouseReleased(evt);
            }
        });
        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });
        jtxtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtIdKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre: ");

        jtxtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtNombreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //buscarCliente : busca un cliente y si existe agrega su nombre automaticamente, 
    //                si no existe da la opcion de crear el cliente en la base de datos
    public void buscarCliente(int id) {
        
        
        String nombre;
        boolean existe = false;
        ArrayList<Cliente> listadoClientes = new ArrayList();
        listadoClientes = ControladorCliente.listadoCliente();
        for (int i = 0; i < listadoClientes.size(); i++) {
            if (listadoClientes.get(i).getIdCliente() == id) {
                nombre = listadoClientes.get(i).getNombre() + " " + listadoClientes.get(i).getApellido();
                jtxtNombre.setText(nombre);
                existe = true;
                break;
            }
        }

        if (!existe) {
            int opciones = JOptionPane.YES_NO_OPTION;
            int resultadoOpciones = JOptionPane.showConfirmDialog(this,
                    "No existe un cliente con el numero de identificacion: " + id + " ¿Desea agregarlo a la base de datos?",
                    "Informacion importante", opciones);
            if (resultadoOpciones == 0) {
                if (!vistaHuesped.isVisible()) {
                    JDpanel.add(vistaHuesped);
                    vistaHuesped.setVisible(true);
                    int x = (JDpanel.getWidth() / 2) - vistaHuesped.getWidth() /2;
                    int y = (JDpanel.getHeight() / 2) - vistaHuesped.getHeight() /2;
                    vistaHuesped.setLocation(x, y);
                    vistaHuesped.setIconifiable(false);
                } else {
                    vistaHuesped.moveToFront();
                }
            }
        }

    }
    
    //buscarReserva : retorna true si la reserva ingresada existe en la base de datos o false si no
    public boolean buscarReserva(int cod){
        ArrayList<Reserva> listadoReservas = new ArrayList();
        listadoReservas = ControladorReserva.listadoReserva();
        for (int i = 0; i < listadoReservas.size(); i++) {
            if(listadoReservas.get(i).getCodigoReserva()== cod){
                return true;
            }   
        }
        return false;
    }
    
    
     //buscarRegistro : retorna true si el registro ingresado existe en la base de datos o false si no
    public boolean buscarRegistro(int cod){
        ArrayList<Registro> listadoRegistro = new ArrayList();
        listadoRegistro = ControladorRegistro.listadoRegistro();
        for (int i = 0; i < listadoRegistro.size(); i++) {
            if(listadoRegistro.get(i).getCodigoRegistro() == cod){
                return true;
            }   
        }
        return false;
    }
    // generarNumReserva : genera un numero de reserva que no exista en la base de datos
    public void generarNumReserva(){
        String num = "";
        int codReserva;
        for (int i = 0; i < 3; i++) {
            int valorAle = (int) Math.floor(Math.random()*9);
            num = num+valorAle;      
        }
        codReserva = parseInt(num);
        
        if(buscarReserva(codReserva) || buscarRegistro(codReserva)){
            generarNumReserva();
        }else{
            jlReserva.setText(num);
        }
    }
    
    
    //numHabitacion : agrega el numero de las habitaciones existentes
    public void numHabitaciones(JComboBox j){
        ArrayList<Habitacion> listadoHabitacion = new ArrayList();
        listadoHabitacion = ControladorHabitacion.listadoHabitaciones();      
        for (int i = 0; i < listadoHabitacion.size(); i++) {
            j.addItem(listadoHabitacion.get(i).getNumero());
        }
    }
    
    //infHabitacion : trae la descripcion y el estado de la habitacion seleccionada
    public void infHabitacion(){
        String habitacion = jcbNumHabitacion.getSelectedItem().toString();
        int numHabitacion = Integer.parseInt(habitacion);
        ArrayList<Habitacion> listadoHabitacion = new ArrayList();
        listadoHabitacion = ControladorHabitacion.listadoHabitaciones(); 
        for (int i = 0; i < listadoHabitacion.size(); i++) {
            if(listadoHabitacion.get(i).getNumero()== numHabitacion){
                jlEstado.setText(listadoHabitacion.get(i).getEstado());
                jtxtAreaDescripcion.setText(listadoHabitacion.get(i).getDescripcion());
            }
        }
    }
    
    // camposVacios retorna true si todos los campos estan llenos o false si hay campos vacios
    public boolean camposVacios(){
        if("".equals(jtxtId.getText()) || "".equals(jDIngreso.getDate().toString()) || "".equals(jDSalida.getDate().toString()) || jcbNumHabitacion.getSelectedItem().toString()=="" || "".equals(jtxtNumPersonas.getText())){
            JOptionPane.showMessageDialog(this, "por favor llene todos los campos");
            return false;
        }
        else{
            return true;
        }
    }
    
    // limpìatCampos : borra toda al informacion de la ventana y crea un nuevo numero de reserva
    public void limpiarCampos(){
        jtxtId.setText("");
        jtxtAreaDescripcion.setText("");
        jtxtNombre.setText("");
        jtxtNumPersonas.setText("");
        jlEstado.setText("...");
        jcbNumHabitacion.setSelectedItem(-1);
        generarNumReserva();
    }
    
     // verificarFechas : verifica que para una habitacion no se crucen las fechas de reserva
    public boolean verificarFechas() {
        java.util.Date fechaNuevaI = jDIngreso.getDate();
        java.util.Date fechaNuevaS = jDSalida.getDate();
        int numHabitacion = (int) jcbNumHabitacion.getSelectedItem();
        ArrayList<Reserva> listadoReservas = new ArrayList();
        listadoReservas = ControladorReserva.listadoReserva();
        for (Reserva r: listadoReservas) {
            if(r.getNumeroHabitacion() == numHabitacion){
                java.sql.Date fechaBaseI = r.getFechaEntrada();
                java.sql.Date fechaBaseS = r.getFechaSalida();
                if(fechaNuevaI.after(fechaBaseI) && fechaNuevaI.before(fechaBaseS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" Ya se encuentra reservada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
                if(fechaNuevaS.after(fechaBaseI) && fechaNuevaS.before(fechaBaseS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" Ya se encuentra reservada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
                if(fechaBaseI.after(fechaNuevaI) && fechaBaseI.before(fechaNuevaS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" Ya se encuentra reservada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
                if(fechaBaseS.after(fechaNuevaI) && fechaBaseS.before(fechaNuevaS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" Ya se encuentra reservada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
            }
        }
        for (Registro re: ControladorRegistro.listadoRegistro()) {
            if(re.getNumeroHabitacion() == numHabitacion){
                java.sql.Date fechaBaseI = re.getFechaEntrada();
                java.sql.Date fechaBaseS = re.getFechaSalida();
                if(fechaNuevaI.after(fechaBaseI) && fechaNuevaI.before(fechaBaseS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" se encuentra ocupada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
                if(fechaNuevaS.after(fechaBaseI) && fechaNuevaS.before(fechaBaseS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" se encuentra ocupada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
                if(fechaBaseI.after(fechaNuevaI) && fechaBaseI.before(fechaNuevaS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" se encuentra ocupada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
                if(fechaBaseS.after(fechaNuevaI) && fechaBaseS.before(fechaNuevaS)){
                    JOptionPane.showMessageDialog(this, "La habitacion : "+numHabitacion+" se encuentra ocupada desde la fecha : "+fechaBaseI+
                                " hasta la fecha : "+fechaBaseS);
                    return true;
                }
            }
        }
        return false;
    }
    
    
    //crearReserva :  crea la reserva si toda la informacion esta completa
    public void crearReserva(){
        if(camposVacios() && !verificarFechas()){            
            java.util.Date dateI = jDIngreso.getDate();
            java.util.Date dateS = jDSalida.getDate();
            long i = dateI.getTime();
            long s = dateS.getTime();
            java.sql.Date fechaI = new java.sql.Date(i);
            java.sql.Date fechaS = new java.sql.Date(s);
            Reserva unaReserva = new Reserva();
            unaReserva.setCodigoReserva(parseInt(jlReserva.getText()));
            unaReserva.setNumeroHabitacion(Integer.parseInt(jcbNumHabitacion.getSelectedItem().toString()));
            unaReserva.setCodCliente(parseInt(jtxtId.getText()));
            unaReserva.setFechaEntrada(fechaI);
            unaReserva.setFechaSalida(fechaS);
            unaReserva.setCantidadPersonas(parseInt(jtxtNumPersonas.getText()));
            
            int resultado = 0;
            resultado = ControladorReserva.crearReserva(unaReserva);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this,
                        "Reserva Realizada Con éxito",
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error Al Realizar Reserva",
                        "Confirmación", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // verificarCampoId : verifica si el campo id contiene informacion
    public boolean verificarCampoId(){
        if(jtxtId.getText().trim().equalsIgnoreCase("")){
            return false;
        }else{
            return true;
        }
    }
     


    private void jtxtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIdKeyTyped
        // codigo para no dejar escribir caracteres de tipo string en el campo txt
        char valor = evt.getKeyChar();
        if (!Character.isDigit(valor)){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtIdKeyTyped

    private void jtxtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIdKeyReleased


    }//GEN-LAST:event_jtxtIdKeyReleased

    private void jtxtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIdKeyPressed

    }//GEN-LAST:event_jtxtIdKeyPressed

    private void jtxtIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtIdMouseExited

    }//GEN-LAST:event_jtxtIdMouseExited

    private void jtxtIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtIdMouseReleased

    }//GEN-LAST:event_jtxtIdMouseReleased

    private void jtxtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtIdMousePressed

    }//GEN-LAST:event_jtxtIdMousePressed

    private void jtxtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtNombreMousePressed
        if(verificarCampoId()){
            buscarCliente(parseInt(jtxtId.getText()));
        }
    }//GEN-LAST:event_jtxtNombreMousePressed

    private void jcbNumHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNumHabitacionActionPerformed
        infHabitacion();
    }//GEN-LAST:event_jcbNumHabitacionActionPerformed

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservarActionPerformed
        crearReserva();
    }//GEN-LAST:event_jbReservarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDIngreso;
    private com.toedter.calendar.JDateChooser jDSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbReservar;
    private javax.swing.JComboBox jcbNumHabitacion;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlReserva;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel093;
    private javax.swing.JTextPane jtxtAreaDescripcion;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNumPersonas;
    // End of variables declaration//GEN-END:variables
}
