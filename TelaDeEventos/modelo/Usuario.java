package TelaDeEventos;

/**
 *
 * @author raphael
 */
public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private int tipo;
    
    
    public Usuario(){}
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin(){
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
