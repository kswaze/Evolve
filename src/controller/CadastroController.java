/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import visu.CadastroVisu;

/**
 *
 * @author LENOVO
 */
public class CadastroController {
    
    private CadastroVisu visu;

    public CadastroController(CadastroVisu visu) {
        this.visu = visu;
    }
    
    public void salvaUsuario(){
    
        String usuario = visu.getjTextFieldUsuario().getText();
        String senha = visu.getjTextFieldSenha().getText();
        
        Usuario usuarioNorlan = new Usuario(usuario, senha);
        
        try {
            Connection conexao = new Conexao().getConnection();
             UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
             usuarioDao.insert(usuarioNorlan);
             JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(CadastroVisu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
}}
