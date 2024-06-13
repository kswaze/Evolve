/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import visu.LoginVisu;
import visu.MenuVisu;

/**
 *
 * @author LENOVO
 */
public class LoginController {
    
    private LoginVisu visu;

    public LoginController(LoginVisu visu) {
        this.visu = visu;
    }
    
    public void autenciar() throws SQLException {
        
        String usuario = visu.getjTextFieldUsuario().getText();
        String senha = visu.getjTextFieldSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(usuario, senha);
        
        
        Connection conexao = new Conexao().getConnection();
             UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
             
             boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);
             if(existe){
                 MenuVisu telaDeMenu = new MenuVisu();
        telaDeMenu.setVisible(true);
             }else{
                 JOptionPane.showMessageDialog(visu, "usuario e senha inválidos");
             }
          
        
        }
    
    
    
}
