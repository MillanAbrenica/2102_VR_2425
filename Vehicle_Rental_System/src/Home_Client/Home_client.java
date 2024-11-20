package Home_Client;

import javax.swing.JOptionPane;
import vehicle_rental_system.Login;


public class Home_client extends javax.swing.JFrame {

    
    public Home_client() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewBtn.setBackground(new java.awt.Color(0, 0, 0));
        ViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewBtn.setText("View Cars");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 40));

        RentAndReserveBtn.setBackground(new java.awt.Color(255, 255, 255));
        RentAndReserveBtn.setForeground(new java.awt.Color(0, 0, 0));
        RentAndReserveBtn.setText("Rent And ReserveCar");
        RentAndReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentAndReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RentAndReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 410, 40));

        ShowMyReservesBtn.setBackground(new java.awt.Color(255, 255, 255));
        ShowMyReservesBtn.setForeground(new java.awt.Color(0, 0, 0));
        ShowMyReservesBtn.setText("Show My Reserve");
        ShowMyReservesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMyReservesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowMyReservesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 410, 40));

        ShowMyRentsBtn.setBackground(new java.awt.Color(0, 0, 0));
        ShowMyRentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowMyRentsBtn.setText("Show My Rents");
        ShowMyRentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMyRentsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowMyRentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 410, 40));

        LogOutBtn.setBackground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setText("Log Out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/menu.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null); 
            this.dispose();
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
