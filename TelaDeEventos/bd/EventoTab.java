import java.util.ArrayList;
import java.util.List;

public class EventoTab {

    public List<Evento> listar() throws Exception {
        List<Evento> eventos = new ArrayList<>();

        String sql = "SELECT * FROM tb_evento_psc_quinta";

        try (var conexao = new ConnectionFactory().conectar();
             var ps = conexao.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            while (rs.next()) {
                int codigo = rs.getInt("cod_evento");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                java.util.Date dataInicio = rs.getDate("data_inicio");
                java.util.Date dataFim = rs.getDate("data_fim");

                Evento evento = new Evento();
                evento.setCodigo(codigo);
                evento.setNome(nome);
                evento.setDescricao(descricao);
                evento.setDataInicio(dataInicio);
                evento.setDataFim(dataFim);

                eventos.add(evento);
            }
            return eventos;
        }
    }

    public static void main(String[] args) throws Exception {
        EventoTab eventoTab = new EventoTab();
        List<Evento> eventos = eventoTab.listar();
        for (Evento e : eventos) {
            System.out.println(e);
        }
    }
}
