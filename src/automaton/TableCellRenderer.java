package automaton;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Omar Elashry <3ashry>
 * 
 * this class just for UI style and alignment
 */
public class TableCellRenderer extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 1L;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        this.setValue(table.getValueAt(row, column));
        this.setHorizontalAlignment(CENTER);
        this.setFont(this.getFont().deriveFont(Font.BOLD));
        return this;
    }
}
