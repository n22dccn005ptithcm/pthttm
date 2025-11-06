
package feel_gemini.screen;

import feel_gemini.MainFrame;


public class FlashCardPanel extends javax.swing.JPanel {

    private MainFrame mainFrame; 
    
    public FlashCardPanel() {
        initComponents();
    }

    public FlashCardPanel(MainFrame aThis) {
        this.mainFrame = aThis;   // nếu bạn có biến mainFrame, dùng để gọi lại MainFrame
        initComponents();         // luôn cần để giao diện hiển thị
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_FlashCard = new javax.swing.JLabel();
        jButton_Backscreen_Fc = new javax.swing.JButton();
        jButton_Closescreen_fc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_word = new javax.swing.JLabel();
        jLabel_informationofword = new javax.swing.JLabel();
        jButton_Backword = new javax.swing.JButton();
        jButton_Nextword = new javax.swing.JButton();
        jButton_Loveword = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel_FlashCard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FlashCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FlashCard.setText("FLASH CARD");
        jLabel_FlashCard.setMaximumSize(new java.awt.Dimension(150, 32));
        jLabel_FlashCard.setMinimumSize(new java.awt.Dimension(150, 32));
        jLabel_FlashCard.setPreferredSize(new java.awt.Dimension(150, 32));

        jButton_Backscreen_Fc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton_Backscreen_Fc.setText("BACK");
        jButton_Backscreen_Fc.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_Fc.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_Fc.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_Fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Backscreen_FcActionPerformed(evt);
            }
        });

        jButton_Closescreen_fc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton_Closescreen_fc.setText("CLOSE");
        jButton_Closescreen_fc.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_fc.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_fc.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Closescreen_fcActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setMaximumSize(new java.awt.Dimension(388, 5));
        jSeparator1.setMinimumSize(new java.awt.Dimension(388, 5));
        jSeparator1.setPreferredSize(new java.awt.Dimension(388, 5));

        jLabel_word.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_word.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_word.setForeground(new java.awt.Color(0, 51, 51));
        jLabel_word.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_word.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel_word.setMinimumSize(new java.awt.Dimension(200, 50));
        jLabel_word.setOpaque(true);
        jLabel_word.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel_informationofword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_informationofword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_informationofword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        jButton_Backword.setText("Back");

        jButton_Nextword.setText("Next");

        jButton_Loveword.setText("Love");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_informationofword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel_FlashCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton_Closescreen_fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel_word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Backscreen_Fc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton_Backword)
                        .addGap(79, 79, 79)
                        .addComponent(jButton_Loveword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Nextword)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Closescreen_fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_FlashCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Backscreen_Fc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_informationofword, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Backword)
                    .addComponent(jButton_Nextword)
                    .addComponent(jButton_Loveword))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Backscreen_FcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Backscreen_FcActionPerformed
        // TODO add your handling code here:
        // Chuyển về Home. Screen1 vẫn là component trong mainPanel, trạng thái được giữ.
        mainFrame.showScreen("Home"); 
    }//GEN-LAST:event_jButton_Backscreen_FcActionPerformed

    private void jButton_Closescreen_fcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Closescreen_fcActionPerformed
        // TODO add your handling code here:
        // Gọi MainFrame để loại bỏ component và gán null.        
        mainFrame.closeScreen("Flash CardS");
    }//GEN-LAST:event_jButton_Closescreen_fcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Backscreen_Fc;
    private javax.swing.JButton jButton_Backword;
    private javax.swing.JButton jButton_Closescreen_fc;
    private javax.swing.JButton jButton_Loveword;
    private javax.swing.JButton jButton_Nextword;
    private javax.swing.JLabel jLabel_FlashCard;
    private javax.swing.JLabel jLabel_informationofword;
    private javax.swing.JLabel jLabel_word;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
