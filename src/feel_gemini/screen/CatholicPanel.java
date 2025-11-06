
package feel_gemini.screen;

import feel_gemini.MainFrame;


public class CatholicPanel extends javax.swing.JPanel {

    private MainFrame mainFrame; 
    
    public CatholicPanel() {
        initComponents();
    }

    public CatholicPanel(MainFrame aThis) {
        this.mainFrame = aThis;   // nếu bạn có biến mainFrame, dùng để gọi lại MainFrame
        initComponents();         // luôn cần để giao diện hiển thị
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox_ChooseBook = new javax.swing.JComboBox<>();
        jLabel_ChooseChapter = new javax.swing.JLabel();
        jComboBox_ChooseChapter = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_Catholic = new javax.swing.JLabel();
        jButton_Backscreen_C = new javax.swing.JButton();
        jButton_Closescreen_C = new javax.swing.JButton();
        jLabel_ChooseBook = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_Catholictext = new javax.swing.JPanel();
        jPanel_Catholictext_Eng = new javax.swing.JPanel();
        jPanel_Catholictext_VN = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setName(""); // NOI18N

        jComboBox_ChooseBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel_ChooseChapter.setText("CHƯƠNG");

        jComboBox_ChooseChapter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator2.setPreferredSize(new java.awt.Dimension(398, 5));

        jLabel_Catholic.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Catholic.setText("CATHOLIC");
        jLabel_Catholic.setMaximumSize(new java.awt.Dimension(120, 32));
        jLabel_Catholic.setMinimumSize(new java.awt.Dimension(120, 32));
        jLabel_Catholic.setPreferredSize(new java.awt.Dimension(120, 32));

        jButton_Backscreen_C.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton_Backscreen_C.setText("BACK");
        jButton_Backscreen_C.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_C.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_C.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Backscreen_CActionPerformed(evt);
            }
        });

        jButton_Closescreen_C.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton_Closescreen_C.setText("CLOSE");
        jButton_Closescreen_C.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_C.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_C.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Closescreen_CActionPerformed(evt);
            }
        });

        jLabel_ChooseBook.setText("SÁCH ");

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setMaximumSize(new java.awt.Dimension(398, 5));
        jSeparator1.setMinimumSize(new java.awt.Dimension(398, 5));
        jSeparator1.setPreferredSize(new java.awt.Dimension(398, 5));

        jPanel_Catholictext.setMaximumSize(new java.awt.Dimension(390, 350));
        jPanel_Catholictext.setMinimumSize(new java.awt.Dimension(390, 350));
        jPanel_Catholictext.setPreferredSize(new java.awt.Dimension(390, 350));
        jPanel_Catholictext.setLayout(new java.awt.CardLayout());

        jPanel_Catholictext_Eng.setMaximumSize(new java.awt.Dimension(390, 350));
        jPanel_Catholictext_Eng.setMinimumSize(new java.awt.Dimension(390, 350));
        jPanel_Catholictext_Eng.setPreferredSize(new java.awt.Dimension(390, 350));

        javax.swing.GroupLayout jPanel_Catholictext_EngLayout = new javax.swing.GroupLayout(jPanel_Catholictext_Eng);
        jPanel_Catholictext_Eng.setLayout(jPanel_Catholictext_EngLayout);
        jPanel_Catholictext_EngLayout.setHorizontalGroup(
            jPanel_Catholictext_EngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel_Catholictext_EngLayout.setVerticalGroup(
            jPanel_Catholictext_EngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel_Catholictext.add(jPanel_Catholictext_Eng, "card_Eng");

        jPanel_Catholictext_VN.setMaximumSize(new java.awt.Dimension(390, 350));
        jPanel_Catholictext_VN.setMinimumSize(new java.awt.Dimension(390, 350));
        jPanel_Catholictext_VN.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel_Catholictext_VNLayout = new javax.swing.GroupLayout(jPanel_Catholictext_VN);
        jPanel_Catholictext_VN.setLayout(jPanel_Catholictext_VNLayout);
        jPanel_Catholictext_VNLayout.setHorizontalGroup(
            jPanel_Catholictext_VNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel_Catholictext_VNLayout.setVerticalGroup(
            jPanel_Catholictext_VNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel_Catholictext.add(jPanel_Catholictext_VN, "card_VN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Backscreen_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel_Catholic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton_Closescreen_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_ChooseBook)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_ChooseBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_ChooseChapter)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_ChooseChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel_Catholictext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Backscreen_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Closescreen_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ChooseBook, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_ChooseBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ChooseChapter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_ChooseChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Catholic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(454, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(144, Short.MAX_VALUE)
                    .addComponent(jPanel_Catholictext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Backscreen_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Backscreen_CActionPerformed
        // TODO add your handling code here:
        // Chuyển về Home. Screen1 vẫn là component trong mainPanel, trạng thái được giữ.
        mainFrame.showScreen("Home"); 
    }//GEN-LAST:event_jButton_Backscreen_CActionPerformed

    private void jButton_Closescreen_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Closescreen_CActionPerformed
        // TODO add your handling code here:
        // Gọi MainFrame để loại bỏ component và gán null.        
        mainFrame.closeScreen("Catholic");
    }//GEN-LAST:event_jButton_Closescreen_CActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Backscreen_C;
    private javax.swing.JButton jButton_Closescreen_C;
    private javax.swing.JComboBox<String> jComboBox_ChooseBook;
    private javax.swing.JComboBox<String> jComboBox_ChooseChapter;
    private javax.swing.JLabel jLabel_Catholic;
    private javax.swing.JLabel jLabel_ChooseBook;
    private javax.swing.JLabel jLabel_ChooseChapter;
    private javax.swing.JPanel jPanel_Catholictext;
    private javax.swing.JPanel jPanel_Catholictext_Eng;
    private javax.swing.JPanel jPanel_Catholictext_VN;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
