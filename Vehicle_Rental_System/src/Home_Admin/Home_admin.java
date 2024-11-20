package Home_Admin;

import Home_Client.*;
import javax.swing.JOptionPane;
import vehicle_rental_system.Login;


public class Home_admin extends javax.swing.JFrame {

    
    public Home_admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReserveListBtn = new javax.swing.JButton();
        ShowRentsBtn = new javax.swing.JButton();
        ViewClientsBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        CarsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReserveListBtn.setBackground(new java.awt.Color(255, 255, 255));
        ReserveListBtn.setForeground(new java.awt.Color(0, 0, 0));
        ReserveListBtn.setText("Reserve List");
        ReserveListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveListBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReserveListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 40));

        ShowRentsBtn.setBackground(new java.awt.Color(0, 0, 0));
        ShowRentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowRentsBtn.setText("Show Rents");
        ShowRentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRentsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowRentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 110, 40));

        ViewClientsBtn.setBackground(new java.awt.Color(255, 255, 255));
        ViewClientsBtn.setForeground(new java.awt.Color(0, 0, 0));
        ViewClientsBtn.setText("View Clients");
        ViewClientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClientsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ViewClientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 110, 40));

        LogOutBtn.setBackground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setText("Log Out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 110, 40));

        CarsBtn.setBackground(new java.awt.Color(0, 0, 0));
        CarsBtn.setForeground(new java.awt.Color(255, 255, 255));
        CarsBtn.setText("Cars");
        CarsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CarsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/menu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null); 
            this.dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void CarsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarsBtnActionPerformed
             Home_admin_cars admin_cars = new Home_admin_cars();
             admin_cars.setVisible(true);
             admin_cars.pack();
             admin_cars.setLocationRelativeTo(null); 
             this.dispose();
    }//GEN-LAST:event_CarsBtnActionPerformed

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
    private javax.swing.JButton ViewClientsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
