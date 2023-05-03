/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.alurahotel.controller;

import java.util.List;
import mx.com.alurahotel.dao.UsuarioDAO;
import mx.com.alurahotel.factory.ConnectionFactory;
import mx.com.alurahotel.modelo.Usuario;


public class UsuarioController {

    private final UsuarioDAO usuarioDAO;

    
    public UsuarioController() {
        this.usuarioDAO = new UsuarioDAO(new ConnectionFactory().realizarConexion());
    }

    
    public List<Usuario> listar() {
        return usuarioDAO.listar();
    }

   
    public List<Usuario> listar(String categoriaUsuario) {
        return usuarioDAO.listar(categoriaUsuario);
    }

   
     
    public List<Usuario> listar(String nombreUsuario, String password) {
        return usuarioDAO.listar(nombreUsuario, password);
    }

   
    public void guardar(Usuario usuario) {
        usuarioDAO.guardar(usuario);
    }

   
    public int actualizar(Integer idUsuario, String nombreUsuario,
            String categoriaUsuario, String password) {
        return usuarioDAO.actualizar(idUsuario, nombreUsuario, categoriaUsuario, password);
    }

 
    public int eliminar(Integer IdUsuario) {
        return usuarioDAO.eliminar(IdUsuario);
    }
}
