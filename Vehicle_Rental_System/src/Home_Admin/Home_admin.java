package Home_Admin;

import Home_Client.*;
import javax.swing.JOptionPane;
import vehicle_rental_system.Login;


public class Home_admin extends javax.swing.JFrame {

    
    public Home_admin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReserveListBtn = new javax.swing.JButton();
        ShowRentsBtn = new javax.swing.JButton();
        ViewClientsBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        TotalRevenueBtn = new javax.swing.JButton();
        CarsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReserveListBtn.setBackground(new java.awt.Color(0, 0, 0));
        ReserveListBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReserveListBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReserveListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/reservation.png"))); // NOI18N
        ReserveListBtn.setText("Reserve List");
        ReserveListBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReserveListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveListBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReserveListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 160, 40));

        ShowRentsBtn.setBackground(new java.awt.Color(255, 255, 255));
        ShowRentsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowRentsBtn.setForeground(new java.awt.Color(0, 0, 0));
        ShowRentsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/rent List.png"))); // NOI18N
        ShowRentsBtn.setText("Show Rents");
        ShowRentsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ShowRentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRentsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowRentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 160, 40));

        ViewClientsBtn.setBackground(new java.awt.Color(255, 255, 255));
        ViewClientsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewClientsBtn.setForeground(new java.awt.Color(0, 0, 0));
        ViewClientsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/users-alt.png"))); // NOI18N
        ViewClientsBtn.setText("View Clients");
        ViewClientsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewClientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClientsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ViewClientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, 40));

        LogOutBtn.setBackground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/exit.png"))); // NOI18N
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 60, 40));

        TotalRevenueBtn.setBackground(new java.awt.Color(0, 0, 0));
        TotalRevenueBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalRevenueBtn.setForeground(new java.awt.Color(255, 255, 255));
        TotalRevenueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/growth.png"))); // NOI18N
        TotalRevenueBtn.setText("Total Revenue");
        TotalRevenueBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TotalRevenueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRevenueBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TotalRevenueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 180, 40));

        CarsBtn.setBackground(new java.awt.Color(255, 255, 255));
        CarsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CarsBtn.setForeground(new java.awt.Color(0, 0, 0));
        CarsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/car.png"))); // NOI18N
        CarsBtn.setText("Cars");
        CarsBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CarsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CarsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 130, 40));

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

    private void ShowRentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowRentsBtnActionPerformed
            RentListFrame RentListFrame = new RentListFrame();
            RentListFrame.setVisible(true);
            RentListFrame.pack();
            RentListFrame.setLocationRelativeTo(null);      
    }//GEN-LAST:event_ShowRentsBtnActionPerformed

    private void ViewClientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewClientsBtnActionPerformed
            ClientListFrame ClientListFrame = new ClientListFrame();
            ClientListFrame.setVisible(true);
            ClientListFrame.pack();
            ClientListFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_ViewClientsBtnActionPerformed

    private void ReserveListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveListBtnActionPerformed
            ReserveListFrame ReserveListFrame = new ReserveListFrame();
            ReserveListFrame.setVisible(true);
            ReserveListFrame.pack();
            ReserveListFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_ReserveListBtnActionPerformed

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

    private void CarsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarsBtnActionPerformed
             Home_admin_cars admin_cars = new Home_admin_cars();
             admin_cars.setVisible(true);
             admin_cars.pack();
             admin_cars.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_CarsBtnActionPerformed

    private void TotalRevenueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalRevenueBtnActionPerformed
             TotalRevenueFrame TotalRevenueFrame = new TotalRevenueFrame();
             TotalRevenueFrame.setVisible(true);
             TotalRevenueFrame.pack();
             TotalRevenueFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_TotalRevenueBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarsBtn;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton ReserveListBtn;
    private javax.swing.JButton ShowRentsBtn;
    private javax.swing.JButton TotalRevenueBtn;
    private javax.swing.JButton ViewClientsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
