package Home_Client;

import javax.swing.JOptionPane;
import vehicle_rental_system.Login;


public class Home_client extends javax.swing.JFrame {

    
    public Home_client() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ViewBtn = new javax.swing.JButton();
        RentAndReserveBtn = new javax.swing.JButton();
        ShowMyReservesBtn = new javax.swing.JButton();
        ShowMyRentsBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewBtn.setBackground(new java.awt.Color(0, 0, 0));
        ViewBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/View.png"))); // NOI18N
        ViewBtn.setText("View Cars");
        ViewBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, 50));

        RentAndReserveBtn.setBackground(new java.awt.Color(255, 255, 255));
        RentAndReserveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RentAndReserveBtn.setForeground(new java.awt.Color(0, 0, 0));
        RentAndReserveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/Rent.png"))); // NOI18N
        RentAndReserveBtn.setText("Rent And ReserveCar");
        RentAndReserveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RentAndReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentAndReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RentAndReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 220, 50));

        ShowMyReservesBtn.setBackground(new java.awt.Color(255, 255, 255));
        ShowMyReservesBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowMyReservesBtn.setForeground(new java.awt.Color(0, 0, 0));
        ShowMyReservesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/reserves.png"))); // NOI18N
        ShowMyReservesBtn.setText("Show My Reserve");
        ShowMyReservesBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ShowMyReservesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMyReservesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowMyReservesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 190, 50));

        ShowMyRentsBtn.setBackground(new java.awt.Color(0, 0, 0));
        ShowMyRentsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowMyRentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowMyRentsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/Show rents.png"))); // NOI18N
        ShowMyRentsBtn.setText("Show My Rents");
        ShowMyRentsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ShowMyRentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMyRentsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowMyRentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 190, 50));

        LogOutBtn.setBackground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/exit.png"))); // NOI18N
        LogOutBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/New Home_Client.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RentAndReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentAndReserveBtnActionPerformed
             RentNReserveCarFrame RentCarFrame = new RentNReserveCarFrame();
             RentCarFrame.setVisible(true);
             RentCarFrame.pack();
             RentCarFrame.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_RentAndReserveBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
             ViewCarsFrame ViewCarsFrame = new ViewCarsFrame();
             ViewCarsFrame.setVisible(true);
             ViewCarsFrame.pack();
             ViewCarsFrame.setLocationRelativeTo(null); 
             this.dispose();    
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void ShowMyRentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMyRentsBtnActionPerformed
             ShowRentsFrame ShowRentsFrame = new ShowRentsFrame();
             ShowRentsFrame.setVisible(true);
             ShowRentsFrame.pack();
             ShowRentsFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_ShowMyRentsBtnActionPerformed

    private void ShowMyReservesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMyReservesBtnActionPerformed
             ShowReservesFrame ShowReservesFrame = new ShowReservesFrame();
             ShowReservesFrame.setVisible(true);
             ShowReservesFrame.pack();
             ShowReservesFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_ShowMyReservesBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
           // Show confirmation dialog
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to log out?", 
                "Confirm Logout", 
                JOptionPane.YES_NO_OPTION);

        // Check user's choice
        if (confirm == JOptionPane.YES_OPTION) {
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null); 
            this.dispose();
        }
    }//GEN-LAST:event_LogOutBtnActionPerformed

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
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton RentAndReserveBtn;
    private javax.swing.JButton ShowMyRentsBtn;
    private javax.swing.JButton ShowMyReservesBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
