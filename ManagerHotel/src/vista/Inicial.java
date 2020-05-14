/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Inicial extends JFrame{
    
    private JMenuBar barraMenu;
    private JMenu menu0, menu1, menu2,menu3, menu4;
    private JMenuItem item0, item1,item2,item3, item4,item5,item6,item7,item8,item9, item10, item11, item12,item13;
    
    private JDesktopPane JDpanel;
    private Container contenedor;    
    private JLabel usuarioActivo;
    
    private Usuario unUsuario;
    
  
    
    public Inicial(Usuario u){
        unUsuario=u;
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        
        setVisible(true);
        setTitle("Manager Hotel 1.0 ");        
        setExtendedState(6); 
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/hotel.png")).getImage());       
                
        barraMenu=new JMenuBar();
        setJMenuBar(barraMenu);
        
        menu0=new JMenu("Hospedaje");
        menu1=new JMenu("Reservas");
        menu2=new JMenu("Facturacion");
        menu3=new JMenu("Configuraciones");
        menu4=new JMenu("Servicios");
        
        item0=new JMenuItem("Huespedes");
        item1=new JMenuItem("Habitaciones");
        item2=new JMenuItem("checkin y Checkout");
        item3=new JMenuItem("Reservaciones");
        item5=new JMenuItem("Consultar Reservaciones");
        item6=new JMenuItem("Facturar");
        item7=new JMenuItem("Consulta de Facturas");
        item8=new JMenuItem("Gestion de usuarios");
        item9=new JMenuItem("Salir");
        item10=new JMenuItem("Acerca de...");
        item11=new JMenuItem("Gestionar Servicios");
       // item12=new JMenuItem("Lavanderia");
        item13=new JMenuItem("Cambiar Contraseña");
        
        menu0.add(item0);menu0.add(item1);menu0.add(item2);
        menu1.add(item3);menu1.add(item5);
        menu2.add(item6);menu2.add(item7);
        menu3.add(item8);menu3.add(item13);menu3.add(item9);menu3.add(item10);
        menu4.add(item11);//menu4.add(item12);
        
        
        usuarioActivo=new JLabel("Usuario Activo: "+ unUsuario.getNombre() + " "+ unUsuario.getApellido()+"    ");
        usuarioActivo.setForeground(Color.GRAY);
        
        
        barraMenu.add(menu0);barraMenu.add(menu1);barraMenu.add(menu2);barraMenu.add(menu4);barraMenu.add(menu3);
        barraMenu.add(Box.createHorizontalGlue());
        barraMenu.add(usuarioActivo);      
        
        JDpanel=new JDesktopPane();
        
        contenedor=getContentPane();
        contenedor.add(JDpanel);
        JDpanel.setBorder(new ImagenFondo());
        
        validarPermisos();
        
        
        
        
        item9.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                dispose();
            }            
        });
        
        item0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VHuespedes v=new VHuespedes(unUsuario);
                centrar(v);
            }
        });
        
         item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VServicios s = new VServicios(unUsuario);
                centrar(s);
            }
        });
        
        
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e){
                VHuespedes vHuesped=new VHuespedes(unUsuario);
                VReserva v=new VReserva(unUsuario,vHuesped,JDpanel);
                centrar(v);
            }
        });
        
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VConsultarReservas vConsultarReservas=new VConsultarReservas();
                centrar(vConsultarReservas);
            }
        });
        
         item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VFacturaciones v=new VFacturaciones();
                centrar(v);
            }
        });
         
         item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GestionarUsuarios v = new GestionarUsuarios();
                centrar(v);
                
            }
        });
         
         item13.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                VCambiarContraseña v= new VCambiarContraseña(unUsuario);
                centrar(v);
            }
        });
         
         item1.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                VHabitaciones v= new VHabitaciones();
                centrar(v);
            }
        });
         
         item10.addActionListener(new java.awt.event.ActionListener() {          
            public void actionPerformed(ActionEvent e) {
                acercaDe( e);
            }
        });
         
         
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VCheckIngCheckOut vCheckIngCheckOut=new VCheckIngCheckOut();
                centrar(vCheckIngCheckOut);
            }
        });
          
        
    }
    
    public void acercaDe(ActionEvent e){
        JOptionPane.showMessageDialog(this,"ManagerHotel V 1.0","Acerca de ",2);
    }
    
    public void centrar (JInternalFrame v){
        int x = (JDpanel.getWidth() / 2) - v.getWidth() /2;
        int y = (JDpanel.getHeight() / 2) - v.getHeight() /2;
        if (v.isShowing()){
        v.setLocation(x,y);
        }
        else{
        JDpanel.add(v);
        v.setLocation(x,y);
        v.setVisible(true);
        }            
    }
    
    
    public void validarPermisos(){
        if(unUsuario.getRol().trim().equalsIgnoreCase("operativo")){
            item1.setEnabled(false);
            item8.setEnabled(false);
        }
    }
    
    
    
    
    
}

 
