
package feel_gemini.screen;

import feel_gemini.MainFrame;


public class HomePanel extends javax.swing.JPanel {

    private MainFrame mainFrame; 
    
    public HomePanel() {
        initComponents();
    }  

    public HomePanel(MainFrame aThis) {
        this.mainFrame = aThis;   // nếu bạn có biến mainFrame, dùng để gọi lại MainFrame
        initComponents();         // luôn cần để giao diện hiển thị
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_home = new javax.swing.JLabel();
        jButton_Catholic = new javax.swing.JButton();
        jButton_Flashcard = new javax.swing.JButton();
        jButton_Reading = new javax.swing.JButton();
        jButton_Setting = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel_home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_home.setText("HOME");
        jLabel_home.setMaximumSize(new java.awt.Dimension(200, 34));
        jLabel_home.setMinimumSize(new java.awt.Dimension(200, 34));
        jLabel_home.setPreferredSize(new java.awt.Dimension(200, 34));

        jButton_Catholic.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_Catholic.setText("CATHOLIC");
        jButton_Catholic.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton_Catholic.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton_Catholic.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton_Catholic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CatholicActionPerformed(evt);
            }
        });

        jButton_Flashcard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_Flashcard.setText("FLASH CARD");
        jButton_Flashcard.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton_Flashcard.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton_Flashcard.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton_Flashcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FlashcardActionPerformed(evt);
            }
        });

        jButton_Reading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_Reading.setText("READING");
        jButton_Reading.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton_Reading.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton_Reading.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton_Reading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReadingActionPerformed(evt);
            }
        });

        jButton_Setting.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_Setting.setText("SETTING");
        jButton_Setting.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton_Setting.setMinimumSize(new java.awt.Dimension(200, 40));
        jButton_Setting.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton_Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_home, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Flashcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Catholic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_home, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Catholic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton_Reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jButton_Flashcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton_Setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CatholicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CatholicActionPerformed
        // TODO add your handling code here:
        mainFrame.requestScreen("Catholic");
    }//GEN-LAST:event_jButton_CatholicActionPerformed

    private void jButton_ReadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReadingActionPerformed
        // TODO add your handling code here:
        mainFrame.requestScreen("Reading");
    }//GEN-LAST:event_jButton_ReadingActionPerformed

    private void jButton_FlashcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FlashcardActionPerformed
        // TODO add your handling code here:
        mainFrame.requestScreen("Flash Card");
    }//GEN-LAST:event_jButton_FlashcardActionPerformed

    private void jButton_SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SettingActionPerformed
        // TODO add your handling code here:
        mainFrame.requestScreen("Setting");
    }//GEN-LAST:event_jButton_SettingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Catholic;
    private javax.swing.JButton jButton_Flashcard;
    private javax.swing.JButton jButton_Reading;
    private javax.swing.JButton jButton_Setting;
    private javax.swing.JLabel jLabel_home;
    // End of variables declaration//GEN-END:variables
}
