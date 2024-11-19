package Home_Client;

public class EditDataFrame extends javax.swing.JFrame {

    
    public EditDataFrame() {
        initComponents();
        emailtxtf.setEditable(false);
        passtxtf.setEditable(false);
        fullnametxtf.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        emailtxtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passtxtf = new javax.swing.JTextField();
        fullnametxtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        changeEmailBtn = new javax.swing.JButton();
        changePassBtn = new javax.swing.JButton();
        changeNameBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDIT DATA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenuBtn.setText("Back To Main Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        emailtxtf.setBackground(new java.awt.Color(0, 0, 0));
        emailtxtf.setForeground(new java.awt.Color(255, 255, 255));
        emailtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtfActionPerformed(evt);
            }
        });
        jPanel1.add(emailtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, -1));

        jLabel1.setFont(jLabel1.getFont().deriveFont((jLabel1.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT PERSONAL INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 180, -1));

        passtxtf.setBackground(new java.awt.Color(0, 0, 0));
        passtxtf.setForeground(new java.awt.Color(255, 255, 255));
        passtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtfActionPerformed(evt);
            }
        });
        jPanel1.add(passtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, -1));

        fullnametxtf.setBackground(new java.awt.Color(0, 0, 0));
        fullnametxtf.setForeground(new java.awt.Color(255, 255, 255));
        fullnametxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnametxtfActionPerformed(evt);
            }
        });
        jPanel1.add(fullnametxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full Name ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        changeEmailBtn.setText("Change Email");
        changeEmailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailBtnActionPerformed(evt);
            }
        });
        jPanel1.add(changeEmailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 130, -1));

        changePassBtn.setText("Change Password");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });
        jPanel1.add(changePassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 130, -1));

        changeNameBtn.setText("Change Name");
        changeNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameBtnActionPerformed(evt);
            }
        });
        jPanel1.add(changeNameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 130, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/dashboards_add.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

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

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_client mainMenu = new Home_client();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void emailtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtfActionPerformed

    private void passtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtfActionPerformed

    private void fullnametxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnametxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnametxtfActionPerformed

    private void changeEmailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailBtnActionPerformed
        emailtxtf.setEditable(true);
        passtxtf.setEditable(false);
        fullnametxtf.setEditable(false);
    }//GEN-LAST:event_changeEmailBtnActionPerformed

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        passtxtf.setEditable(true);
        emailtxtf.setEditable(false);
        fullnametxtf.setEditable(false);
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void changeNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameBtnActionPerformed
        fullnametxtf.setEditable(true);
        emailtxtf.setEditable(false);
        passtxtf.setEditable(false);
    }//GEN-LAST:event_changeNameBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (fullnametxtf.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Full Name cannot be empty", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Full Name has been updated successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            fullnametxtf.setEditable(false);
        }

        if (emailtxtf.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Email cannot be empty", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Email has been updated successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            emailtxtf.setEditable(false);
        }

        if (passtxtf.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Password cannot be empty", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Password has been updated successfully!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            passtxtf.setEditable(false);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JButton changeEmailBtn;
    private javax.swing.JButton changeNameBtn;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JTextField emailtxtf;
    private javax.swing.JTextField fullnametxtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passtxtf;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
