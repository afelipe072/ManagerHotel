/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Usuario;
import modelo.UsuarioDAO;
/**
 *
 * @author user
 */
public class ControladorUsuario {
    
    public static ArrayList<Usuario> listadoUsuario (String codigo)
    {
        ArrayList<Usuario> listado;
        listado = new ArrayList();
        UsuarioDAO usuariodao = new UsuarioDAO();
        listado = usuariodao.listadoUsuario(codigo);
        return listado; 
    }
       
}
