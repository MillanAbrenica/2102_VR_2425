package Home_Admin;

import Home_Client.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Home_admin_cars extends javax.swing.JFrame {

    
    public Home_admin_cars() {
        initComponents();
        loadCarsIntoTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UpadateBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCarsTable = new javax.swing.JTable();
        BackToMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpadateBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpadateBtn.setForeground(new java.awt.Color(0, 0, 0));
        UpadateBtn.setText("Update Car");
        UpadateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpadateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpadateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 40));

        RemoveBtn.setBackground(new java.awt.Color(0, 0, 0));
        RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        RemoveBtn.setText("Remove Car");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RemoveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 40));

        AddBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add Cars");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, 40));

        viewCarsTable.setBackground(new java.awt.Color(51, 51, 51));
        viewCarsTable.setForeground(new java.awt.Color(255, 255, 255));
        viewCarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Brand", "Model", "Year", "Price", "Availability"
            }
        ));
        jScrollPane1.setViewportView(viewCarsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 470, 500));

        BackToMenuBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setForeground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setText("Back To Main Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NextStop Rentals");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 320, 80));

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

    private void UpadateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpadateBtnActionPerformed
             UpdateCarFrame UpdateCarFrame = new UpdateCarFrame();
             UpdateCarFrame.setVisible(true);
             UpdateCarFrame.pack();
             UpdateCarFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_UpadateBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
             RemoveCarFrame RemoveCarFrame = new RemoveCarFrame();
             RemoveCarFrame.setVisible(true);
             RemoveCarFrame.pack();
             RemoveCarFrame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
             AddCarFrame AddCarFrame = new AddCarFrame();
             AddCarFrame.setVisible(true);
             AddCarFrame.pack();
             AddCarFrame.setLocationRelativeTo(null);           
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_admin mainMenu = new Home_admin();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

   
    public void loadCarsIntoTable() {
        DefaultTableModel model = (DefaultTableModel) viewCarsTable.getModel();

        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String query = "SELECT CarID, Brand, Model, Year, Price, isAvailable FROM Cars";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int carID = rs.getInt("CarID");
                String brand = rs.getString("Brand");
                String modelText = rs.getString("Model");
                int year = rs.getInt("Year");
                double price = rs.getDouble("Price");
                boolean isAvailable = rs.getBoolean("isAvailable");

                String availabilityText = isAvailable ? "Available" : "Not Available";
                model.addRow(new Object[]{carID, brand, modelText, year, price, availabilityText});
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Home_admin_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_admin_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_admin_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_admin_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Home_admin_cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JButton UpadateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewCarsTable;
    // End of variables declaration//GEN-END:variables
}
