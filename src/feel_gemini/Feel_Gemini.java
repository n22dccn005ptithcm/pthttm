
package feel_gemini;

import javax.swing.SwingUtilities;

public class Feel_Gemini {

    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
    
}
