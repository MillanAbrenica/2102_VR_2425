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
        populateCarIDs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        CarIDCB = new javax.swing.JComboBox<>();
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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 37, -1));

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

        CarIDCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarIDCBActionPerformed(evt);
            }
        });
        jPanel1.add(CarIDCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 160, -1));

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

        // Get the selected Car ID from the combo box
        String selectedCarID = (String) CarIDCB.getSelectedItem();

        // Check if no Car ID is selected
        if (selectedCarID == null || selectedCarID.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a Car ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Delete query to remove the car entry based on CarID
            String query = "DELETE FROM Cars WHERE CarID = ?";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, selectedCarID);  // Set the CarID for deletion (from combo box)

            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Car deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Optionally, clear the selection in the combo box
                CarIDCB.setSelectedIndex(-1);  // Deselect the combo box

                // Refresh the combo box to remove the deleted Car ID
                populateCarIDs();  // Refresh the combo box with updated car IDs

            } else {
                JOptionPane.showMessageDialog(new JFrame(), "No car found with the specified Car ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void CarIDCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarIDCBActionPerformed
        // Get the selected CarID from the ComboBox
        String selectedCarID = (String) CarIDCB.getSelectedItem();

        // Check if the combo box selection is valid
        if (selectedCarID == null || selectedCarID.isEmpty()) {
            // Optionally, you can show a message to inform the user to select a Car ID
            // but do NOT delete anything here.
            JOptionPane.showMessageDialog(new JFrame(), "Please select a Car ID to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Exit the method to prevent further execution
        }

        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            // Load the JDBC driver and establish connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Query to delete the car based on the selected CarID
            String query = "DELETE FROM Cars WHERE CarID = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, selectedCarID); // Use selected CarID for deleting

            // Close resources
            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CarIDCBActionPerformed

    
    private void populateCarIDs() {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Fetch car IDs from the database
            String query = "SELECT CarID FROM Cars";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            // Populate the JComboBox
            CarIDCB.removeAllItems();  // Clear any existing items before populating
            while (rs.next()) {
                CarIDCB.addItem(rs.getString("CarID"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveCarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JComboBox<String> CarIDCB;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
