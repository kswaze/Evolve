/**
 *
 * @author raphael
 */
public class UsuarioDAO {
    public Usuario existe(Usuario u) throws Exception {
        var sql = "SELECT * FROM tb_usuario_psc_quinta WHERE login = ? AND  senha = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        var rs = ps.executeQuery();
        var usuarioExiste = rs.next();
        if(usuarioExiste){
            var tipo = rs.getInt("tipo");
            u.setTipo(tipo);
        }
        else{
            u = null;
        }
        rs.close();
        ps.close();
        conexao.close();
          return u;
    }
            
    public void cadastrar(User u)  throws Exception{
        var sql = "INSERT INTO tb_usuario_psc_quinta(login, senha) VALUES(?, ?)";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        ps.execute();
        conexao.close();
    }     
}
