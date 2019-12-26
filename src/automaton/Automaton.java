package automaton;

import javax.swing.UIManager;

/**
 *
 * @author Omar Elashry <3ashry>
 */
public class Automaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // Invoke the main program screen
        MainFrame form = new MainFrame();
        form.pack();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }

}
