package Home_Admin;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;


public class RemoveCarFrame extends javax.swing.JFrame {

    
    public RemoveCarFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        CarIDtxtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REMOVE CARS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
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

        CarIDtxtf.setBackground(new java.awt.Color(0, 0, 0));
        CarIDtxtf.setForeground(new java.awt.Color(255, 255, 255));
        CarIDtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarIDtxtfActionPerformed(evt);
            }
        });
        jPanel1.add(CarIDtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 85, 186, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 88, 37, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DELETE CARS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 35, 95, -1));

        DeleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 130, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/dashboards_add.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_admin mainMenu = new Home_admin();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";
        
        
        String carID = CarIDtxtf.getText();

        if (carID.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Car ID is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Delete query to remove the car entry based on CarID
            String query = "DELETE FROM Cars WHERE CarID = ?";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, Integer.parseInt(carID));  // Set the CarID for deletion

            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Car deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                CarIDtxtf.setText("");  // Clear the Car ID field after deletion
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "No car found with the specified Car ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: Please enter a valid number for Car ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void CarIDtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarIDtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarIDtxtfActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveCarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JTextField CarIDtxtf;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
