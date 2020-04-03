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

/**
 *
 * @author user
 */
public class Inicial extends JFrame{
    
    private JMenuBar barraMenu;
    private JMenu menu0, menu1, menu2,menu3, menu4;
    private JMenuItem item0, item1,item2,item3, item4,item5,item6,item7,item8,item9, item10, item11, item12;
    
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
        setTitle("Manager Hotel 0.0.1 ");        
        setExtendedState(6); 
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/hotel.png")).getImage());
        
        
        
        barraMenu=new JMenuBar();
        setJMenuBar(barraMenu);
        
        menu0=new JMenu("Hospedaje");
        menu1=new JMenu("Reservas");
        menu2=new JMenu("Facturacion");
        menu3=new JMenu("configuraciones");
        menu4=new JMenu("Servicios");
        
        item0=new JMenuItem("Huespedes");
        item1=new JMenuItem("Habitaciones");
        item2=new JMenuItem("checkin y Checkout");
        item3=new JMenuItem("Reservaciones");
        item4=new JMenuItem("Cancelar Reserva");
        item5=new JMenuItem("Consultar Reservaciones");
        item6=new JMenuItem("Facturar");
        item7=new JMenuItem("consulta de Facturas");
        item8=new JMenuItem("Gestion de usuarios");
        item9=new JMenuItem("Salir");
        item10=new JMenuItem("Ayuda");
        item11=new JMenuItem("Servicio Habitacion");
        item12=new JMenuItem("Lavanderia");
        
        menu0.add(item0);menu0.add(item1);menu0.add(item2);
        menu1.add(item3);menu1.add(item4);menu1.add(item5);
        menu2.add(item6);menu2.add(item7);
        menu3.add(item8);menu3.add(item9);menu3.add(item10);
        menu4.add(item11);menu4.add(item12);
        
        
        usuarioActivo=new JLabel("Usuario Activo: "+ unUsuario.getNombre() + " "+ unUsuario.getApellido()+"    ");
        usuarioActivo.setForeground(Color.GRAY);
        
        
        barraMenu.add(menu0);barraMenu.add(menu1);barraMenu.add(menu2);barraMenu.add(menu4);barraMenu.add(menu3);
        barraMenu.add(Box.createHorizontalGlue());
        barraMenu.add(usuarioActivo);
       
        
        
        JDpanel=new JDesktopPane();
        
        contenedor=getContentPane();
        contenedor.add(JDpanel);
        JDpanel.setBorder(new ImagenFondo());
        
        
        item9.addActionListener(new java.awt.event.ActionListener() {            
            public void actionPerformed(ActionEvent e) {
                dispose();
            }            
        });
        
        item0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VHuespedes v=new VHuespedes();
                
                

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
        });
        
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VReserva v=new VReserva();
                
                

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
        });
        
         item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VFacturaciones v=new VFacturaciones();
                
                

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
        });
         item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Configuracion v=new Configuracion();
                
                

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
        });
        
        
        
        
    }
    
    
    
}
