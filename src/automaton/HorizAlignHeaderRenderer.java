package automaton;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Omar Elashry <3ashry>
 * 
 * this class just for UI style and alignment
 */
public class HorizAlignHeaderRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        TableCellRenderer r = table.getTableHeader().getDefaultRenderer();
        JLabel l = (JLabel) r.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setFont(table.getFont().deriveFont(Font.BOLD));
        return l;
    }

}
