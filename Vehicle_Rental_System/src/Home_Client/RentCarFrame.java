package Home_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RentCarFrame extends javax.swing.JFrame {

    public RentCarFrame() {
        initComponents();
        loadCarsIntoTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackToMenuBtn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENT");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Magneto", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Nextstop Rentals");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 300, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Brand", "Year", "Model", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("Car Table");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 60, 820, 480));

        BackToMenuBtn2.setText("Back To Main Menu");
        BackToMenuBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 571, -1, -1));

        jButton1.setText("Rent Car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, -1));

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

    private void rentCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            // Retrieve car details from the table based on the selected row
            String brand = (String) jTable1.getValueAt(selectedRow, 0);
            int year = (int) jTable1.getValueAt(selectedRow, 1);
            String model = (String) jTable1.getValueAt(selectedRow, 2);
            double dailyPrice = (double) jTable1.getValueAt(selectedRow, 3);

            String message = "You selected:\n" +
            "Brand: " + brand + "\n" +
            "Year: " + year + "\n" +
            "Model: " + model + "\n" +
            "Daily Price: $" + dailyPrice + "\n\n" +
            "Do you want to rent this car?";

            int option = JOptionPane.showConfirmDialog(this, message, "Confirm Rental", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Car rented successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a car first.", "No Car Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_rentCarBtnActionPerformed

    private void BackToMenuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtn2ActionPerformed
        this.dispose();
        Home_client mainMenu = new Home_client();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtn2ActionPerformed

    
    
    public void loadCarsIntoTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String query = "SELECT CarID, Brand, Model, Year, Price FROM Cars";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int carID = rs.getInt("CarID");
                String brand = rs.getString("Brand");
                String modelText = rs.getString("Model");
                int year = rs.getInt("Year");
                double price = rs.getDouble("Price");

                model.addRow(new Object[]{carID, brand, modelText, year, price});
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RentCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentCarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
