package Home_Client;

import javax.swing.JOptionPane;


public class Home_client extends javax.swing.JFrame {

    
    public Home_client() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ViewBtn = new javax.swing.JButton();
        RentBtn = new javax.swing.JButton();
        ReturnBtn = new javax.swing.JButton();
        ShowMyRentsBtn = new javax.swing.JButton();
        EditMyDataBtn = new javax.swing.JButton();
        ReserveBtn = new javax.swing.JButton();
        QuitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        Right.setBackground(new java.awt.Color(0, 0, 0));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NextStop Rentals");
        jLabel1.setOpaque(true);

        ViewBtn.setBackground(new java.awt.Color(0, 0, 0));
        ViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewBtn.setText("View Cars");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        RentBtn.setBackground(new java.awt.Color(255, 255, 255));
        RentBtn.setForeground(new java.awt.Color(0, 0, 0));
        RentBtn.setText("Rent Car");
        RentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentBtnActionPerformed(evt);
            }
        });

        ReturnBtn.setBackground(new java.awt.Color(0, 0, 0));
        ReturnBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBtn.setText("Return Car");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });

        ShowMyRentsBtn.setBackground(new java.awt.Color(0, 0, 0));
        ShowMyRentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowMyRentsBtn.setText("Show My Rents");
        ShowMyRentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMyRentsBtnActionPerformed(evt);
            }
        });

        EditMyDataBtn.setBackground(new java.awt.Color(255, 255, 255));
        EditMyDataBtn.setForeground(new java.awt.Color(0, 0, 0));
        EditMyDataBtn.setText("Edit My Data");
        EditMyDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMyDataBtnActionPerformed(evt);
            }
        });

        ReserveBtn.setBackground(new java.awt.Color(255, 255, 255));
        ReserveBtn.setForeground(new java.awt.Color(0, 0, 0));
        ReserveBtn.setText("Reserver Car");
        ReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBtnActionPerformed(evt);
            }
        });

        QuitBtn.setBackground(new java.awt.Color(0, 0, 0));
        QuitBtn.setForeground(new java.awt.Color(255, 255, 255));
        QuitBtn.setText("Quit");
        QuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReserveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReturnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShowMyRentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditMyDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QuitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReserveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowMyRentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditMyDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QuitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 400, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentBtnActionPerformed
             RentCarFrame RentCarFrame = new RentCarFrame();
             RentCarFrame.setVisible(true);
             RentCarFrame.pack();
             RentCarFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_RentBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
             ViewCarsFrame ViewCarsFrame = new ViewCarsFrame();
             ViewCarsFrame.setVisible(true);
             ViewCarsFrame.pack();
             ViewCarsFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
             ReturnCarFrame ReturnCarFrame = new ReturnCarFrame();
             ReturnCarFrame.setVisible(true);
             ReturnCarFrame.pack();
             ReturnCarFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_ReturnBtnActionPerformed

    private void ShowMyRentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMyRentsBtnActionPerformed
             ShowRentsFrame ShowRentsFrame = new ShowRentsFrame();
             ShowRentsFrame.setVisible(true);
             ShowRentsFrame.pack();
             ShowRentsFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_ShowMyRentsBtnActionPerformed

    private void EditMyDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMyDataBtnActionPerformed
             EditDataFrame EditDataFrame = new EditDataFrame();
             EditDataFrame.setVisible(true);
             EditDataFrame.pack();
             EditDataFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_EditMyDataBtnActionPerformed

    private void ReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBtnActionPerformed
             ReserveCarFrame ReserveCarFrame = new ReserveCarFrame();
             ReserveCarFrame.setVisible(true);
             ReserveCarFrame.pack();
             ReserveCarFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_ReserveBtnActionPerformed

    private void QuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBtnActionPerformed
 
    }//GEN-LAST:event_QuitBtnActionPerformed

   
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home_client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditMyDataBtn;
    private javax.swing.JButton QuitBtn;
    private javax.swing.JButton RentBtn;
    private javax.swing.JButton ReserveBtn;
    private javax.swing.JButton ReturnBtn;
    private javax.swing.JPanel Right;
    private javax.swing.JButton ShowMyRentsBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
