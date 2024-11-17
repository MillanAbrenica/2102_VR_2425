package Home_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReturnCarFrame extends javax.swing.JFrame {

    
    public ReturnCarFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD CARS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADD CARS");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RETURN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setText("Back To Main Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(jLabel1.getFont().deriveFont((jLabel1.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RETURN CAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 128, -1, 20));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 125, 185, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Year");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 208, -1, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Car ID ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 86, -1, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Car ID ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 86, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 248, -1, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Model");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 168, -1, 20));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 205, 185, -1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 85, 185, -1));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 245, 185, -1));

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 165, 185, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/dashboards_add.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_client mainMenu = new Home_client();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String carID = jTextField4.getText();
        String brand = jTextField2.getText();
        String model = jTextField6.getText();
        String year = jTextField3.getText();
        String price = jTextField5.getText();
        
        if (carID.isEmpty() || brand.isEmpty() || model.isEmpty() || year.isEmpty() || price.isEmpty()) {
            // Display an error message if any field is empty
            JOptionPane.showMessageDialog(this, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Assuming you have a method to connect to the database, e.g., getConnection()
                Connection conn = getConnection(); // replace with your actual database connection method
                String query = "UPDATE cars SET brand = ?, model = ?, year = ?, price = ? WHERE car_id = ?";
                
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, brand);
                pst.setString(2, model);
                pst.setString(3, year);
                pst.setString(4, price);
                pst.setString(5, carID);

                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    // If the update was successful, show success message
                    JOptionPane.showMessageDialog(this, "Car information returned successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Optionally, clear the fields after submission
                    jTextField4.setText("");
                    jTextField2.setText("");
                    jTextField6.setText("");
                    jTextField3.setText("");
                    jTextField5.setText("");
                } else {
                    // If no rows were affected, it means the car ID wasn't found
                    JOptionPane.showMessageDialog(this, "Car ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Close connection
                conn.close();
            } catch (Exception e) {
                // Handle any database connection or query errors
                JOptionPane.showMessageDialog(this, "Error connecting to the database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed
    
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/car_rental"; // MySQL example
        String user = "root";
        String password = "password"; // Your database password

        return DriverManager.getConnection(url, user, password);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnCarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
