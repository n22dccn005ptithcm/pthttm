
package feel_gemini;

import feel_gemini.screen.CatholicPanel;
import feel_gemini.screen.ReadingPanel;
import feel_gemini.screen.FlashCardPanel;
import feel_gemini.screen.HomePanel;
import feel_gemini.screen.SettingPanel;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class MainFrame extends javax.swing.JFrame {
    
//    private JPanel mainPanel;
    private HomePanel homePanel; 
    private CatholicPanel catholicPanel; 
    private ReadingPanel readingPanel;
    private FlashCardPanel flashCardPanel;
    private SettingPanel settingPanel; 
    
    public MainFrame() {
        initComponents();
        // Khởi tạo và thêm HomePanel (Màn hình Home luôn được giữ)
        homePanel = new HomePanel(this);
        mainPanel.add(homePanel, "Home");
        
        catholicPanel = new CatholicPanel(this);
        mainPanel.add(catholicPanel, "Catholic");
        
        readingPanel = new ReadingPanel(this);
        mainPanel.add(readingPanel, "Reading");
        
        flashCardPanel = new FlashCardPanel(this);
        mainPanel.add(flashCardPanel, "Flash Card");    
        
        settingPanel = new SettingPanel(this);
        mainPanel.add(settingPanel, "Setting");   
    }
    
    public void showScreen(String screenName) {
        CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
        cardLayout.show(mainPanel, screenName);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    // --- LOGIC CHO NÚT CLOSE (Giải phóng bộ nhớ) ---
    public void closeScreen(String screenName) {
        // 1. Chuyển về HomePanel trước khi xóa
        showScreen("Home"); 
        // 2. Giải phóng bộ nhớ: loại bỏ component khỏi CardLayout và gán null
        if (screenName.equals("Catholic") && catholicPanel != null) {
            mainPanel.remove(catholicPanel);
            catholicPanel = null;
            System.out.println("-> Catholic đã bị đóng và giải phóng bộ nhớ.");
            
        } else if (screenName.equals("Reading") && readingPanel != null) {
            mainPanel.remove(readingPanel);
            readingPanel = null;
            System.out.println("-> Reading đã bị đóng và giải phóng bộ nhớ.");
        } else if (screenName.equals("Flash Card") && flashCardPanel != null) {
            mainPanel.remove(flashCardPanel);
            flashCardPanel = null;
            System.out.println("-> Flash Card đã bị đóng và giải phóng bộ nhớ.");
        } else if (screenName.equals("Setting") && settingPanel != null) {
            mainPanel.remove(settingPanel);
            settingPanel = null;
            System.out.println("-> Setting đã bị đóng và giải phóng bộ nhớ.");
        }         
        showScreen("Home"); 
        mainPanel.revalidate();
    }
    
    // --- LOGIC CHO NÚT BẤM TỪ HOME (Tạo lại/Hiển thị) ---
    public void requestScreen(String screenName) {
        JPanel requestedScreen = getScreenInstance(screenName);
        
        // Nếu màn hình chưa được tạo (hoặc đã bị close và gán null)
        if (requestedScreen == null) {
            System.out.println("-> Tạo MỚI lại Screen: " + screenName);
            requestedScreen = createNewScreenInstance(screenName);
            mainPanel.add(requestedScreen, screenName);
        } else {
            System.out.println("-> Hiển thị lại Screen: " + screenName + " (Giữ trạng thái)");
        }
        
        showScreen(screenName);
    }
    
    // Helper: Lấy thể hiện hiện tại
    private JPanel getScreenInstance(String screenName) {
        if (screenName.equals("Catholic")) return catholicPanel;
        if (screenName.equals("Reading")) return readingPanel;
        if (screenName.equals("Flash Card")) return flashCardPanel;
        if (screenName.equals("Setting")) return settingPanel;
        return null;
    }
    
    // Helper: Tạo thể hiện mới
    private JPanel createNewScreenInstance(String screenName) {
        if (screenName.equals("Catholic")) {
            catholicPanel = new CatholicPanel(this);
            return catholicPanel;
        } else if (screenName.equals("Reading")) {
            readingPanel = new ReadingPanel(this);
            return readingPanel;
        } else if (screenName.equals("Flash Card")) {
            flashCardPanel = new FlashCardPanel(this);
            return flashCardPanel;
        } else if (screenName.equals("Setting")) {
            settingPanel = new SettingPanel(this);
            return settingPanel;
        }
        return null;
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        mainPanel.setMaximumSize(new java.awt.Dimension(400, 500));
        mainPanel.setMinimumSize(new java.awt.Dimension(400, 500));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
