
package feel_gemini.screen;

import feel_gemini.MainFrame;


public class ReadingPanel extends javax.swing.JPanel {

    private MainFrame mainFrame; 
    
    public ReadingPanel() {
        initComponents();
    }

    public ReadingPanel(MainFrame aThis) {
        this.mainFrame = aThis;   // nếu bạn có biến mainFrame, dùng để gọi lại MainFrame
        initComponents();         // luôn cần để giao diện hiển thị
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Reading = new javax.swing.JLabel();
        jButton_Backscreen_R = new javax.swing.JButton();
        jButton_Closescreen_R = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_Text = new javax.swing.JPanel();
        jPanel_inp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_inp = new javax.swing.JTextArea();
        jButton_inp = new javax.swing.JButton();
        jPanel_out = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_inp1 = new javax.swing.JTextArea();
        jButton_back = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel_Reading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Reading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Reading.setText("READING");
        jLabel_Reading.setMaximumSize(new java.awt.Dimension(150, 32));
        jLabel_Reading.setMinimumSize(new java.awt.Dimension(150, 32));
        jLabel_Reading.setPreferredSize(new java.awt.Dimension(150, 32));

        jButton_Backscreen_R.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton_Backscreen_R.setText("BACK");
        jButton_Backscreen_R.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_R.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_R.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton_Backscreen_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Backscreen_RActionPerformed(evt);
            }
        });

        jButton_Closescreen_R.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton_Closescreen_R.setText("CLOSE");
        jButton_Closescreen_R.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_R.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_R.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton_Closescreen_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Closescreen_RActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setMaximumSize(new java.awt.Dimension(388, 5));
        jSeparator1.setMinimumSize(new java.awt.Dimension(388, 5));
        jSeparator1.setPreferredSize(new java.awt.Dimension(388, 5));

        jPanel_Text.setBackground(new java.awt.Color(204, 204, 255));
        jPanel_Text.setMaximumSize(new java.awt.Dimension(388, 366));
        jPanel_Text.setLayout(new java.awt.CardLayout());

        jPanel_inp.setMaximumSize(new java.awt.Dimension(388, 366));
        jPanel_inp.setMinimumSize(new java.awt.Dimension(388, 366));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(388, 300));

        jTextArea_inp.setColumns(20);
        jTextArea_inp.setRows(5);
        jScrollPane1.setViewportView(jTextArea_inp);

        jButton_inp.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton_inp.setText("INPUT");
        jButton_inp.setMaximumSize(new java.awt.Dimension(75, 25));
        jButton_inp.setMinimumSize(new java.awt.Dimension(75, 25));
        jButton_inp.setPreferredSize(new java.awt.Dimension(75, 25));

        javax.swing.GroupLayout jPanel_inpLayout = new javax.swing.GroupLayout(jPanel_inp);
        jPanel_inp.setLayout(jPanel_inpLayout);
        jPanel_inpLayout.setHorizontalGroup(
            jPanel_inpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_inpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_inpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_inp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        jPanel_inpLayout.setVerticalGroup(
            jPanel_inpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_inp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Text.add(jPanel_inp, "card2");

        jPanel_out.setMaximumSize(new java.awt.Dimension(388, 366));
        jPanel_out.setMinimumSize(new java.awt.Dimension(388, 366));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(388, 300));

        jTextArea_inp1.setColumns(20);
        jTextArea_inp1.setRows(5);
        jScrollPane2.setViewportView(jTextArea_inp1);

        jButton_back.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jButton_back.setText("BACK");
        jButton_back.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_back.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_back.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel_outLayout = new javax.swing.GroupLayout(jPanel_out);
        jPanel_out.setLayout(jPanel_outLayout);
        jPanel_outLayout.setHorizontalGroup(
            jPanel_outLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_outLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_outLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_outLayout.setVerticalGroup(
            jPanel_outLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_outLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Text.add(jPanel_out, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton_Backscreen_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel_Reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Closescreen_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Closescreen_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Backscreen_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Backscreen_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Backscreen_RActionPerformed
        // TODO add your handling code here:
        // Chuyển về Home. Screen1 vẫn là component trong mainPanel, trạng thái được giữ.
        mainFrame.showScreen("Home"); 
    }//GEN-LAST:event_jButton_Backscreen_RActionPerformed

    private void jButton_Closescreen_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Closescreen_RActionPerformed
        // TODO add your handling code here:
        // Gọi MainFrame để loại bỏ component và gán null.        
        mainFrame.closeScreen("Reading");
    }//GEN-LAST:event_jButton_Closescreen_RActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Backscreen_R;
    private javax.swing.JButton jButton_Closescreen_R;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_inp;
    private javax.swing.JLabel jLabel_Reading;
    private javax.swing.JPanel jPanel_Text;
    private javax.swing.JPanel jPanel_inp;
    private javax.swing.JPanel jPanel_out;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea_inp;
    private javax.swing.JTextArea jTextArea_inp1;
    // End of variables declaration//GEN-END:variables
}
