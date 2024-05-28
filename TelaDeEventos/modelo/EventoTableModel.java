/**
 * @author raphael
 */
import TelaDeEventos.bd.Evento;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class EventoTableModel extends AbstractTableModel{
    private List<Evento> eventos;
    public EventoTableModel(List<Evento> eventos){
        this.eventos = eventos;
    }

    @Override
    public int getRowCount() {
        return eventos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Evento e = eventos.get(rowIndex);
        if (columnIndex == 0) {
            return e.getCodigo();
        } else {
            // Retorne o valor apropriado para outras colunas (caso necessário)
            return null; // Ou outro valor adequado
                }
        }
}


