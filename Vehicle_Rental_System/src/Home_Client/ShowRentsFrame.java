package Home_Client;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ShowRentsFrame extends javax.swing.JFrame {
    
    private int clientId;
    
    public ShowRentsFrame() {
        this.clientId = clientId;
        initComponents();
        loadRentedCars();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        refreshRentalsTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ReturnBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showRentsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOW RENTS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RENTS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        ReturnBtn.setBackground(new java.awt.Color(0, 0, 0));
        ReturnBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReturnBtn.setText("Return Car");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        showRentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Rental ID", "Car ID", "Rented Date", "Brand", "Model", "Client"
            }
        ));
        jScrollPane2.setViewportView(showRentsTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 800, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/dashboards.png"))); // NOI18N
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

    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        int selectedRow = showRentsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a rental to return.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) showRentsTable.getModel();
        int rentalID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString()); 
        int carID = Integer.parseInt(model.getValueAt(selectedRow, 1).toString());   

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            con.setAutoCommit(false);

            try {
                String updateCarQuery = "UPDATE Cars SET isAvailable = 1 WHERE CarID = ?";
                try (PreparedStatement updateCarStmt = con.prepareStatement(updateCarQuery)) {
                    updateCarStmt.setInt(1, carID);
                    updateCarStmt.executeUpdate();
                }

                String deleteRentalQuery = "DELETE FROM Rentals WHERE RentalID = ?";
                try (PreparedStatement deleteRentalStmt = con.prepareStatement(deleteRentalQuery)) {
                    deleteRentalStmt.setInt(1, rentalID);
                    deleteRentalStmt.executeUpdate();
                }

                con.commit();

                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "Car returned successfully. Rental record deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException e) {
                con.rollback();
                throw e;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ReturnBtnActionPerformed

    
    private void loadRentedCars() {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        DefaultTableModel model = (DefaultTableModel) showRentsTable.getModel();

        if (model.getColumnCount() != 6) {
            JOptionPane.showMessageDialog(this, "Table columns not properly initialized!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = """
            SELECT 
                Rentals.RentalID, 
                Rentals.CarID, 
                Rentals.RentedDate, 
                Rentals.Brand, 
                Rentals.Model, 
                COALESCE(client.full_name, 'No Client') AS Client
            FROM Rentals
            LEFT JOIN client ON Rentals.ClientID = client.id
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                int rentalID = rs.getInt("RentalID");
                int carID = rs.getInt("CarID");
                String rentedDate = rs.getString("RentedDate");
                String brand = rs.getString("Brand");
                String modelStr = rs.getString("Model");
                String clientName = rs.getString("Client");

                model.addRow(new Object[]{rentalID, carID, rentedDate, brand, modelStr, clientName});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void refreshRentalsTable() {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";
        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            String query = "SELECT * FROM Rentals";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel tableModel = (DefaultTableModel) showRentsTable.getModel();
            tableModel.setRowCount(0); 

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("RentalID"),
                    rs.getString("CarID"),
                    rs.getTimestamp("RentedDate"),
                    rs.getString("Brand"),
                    rs.getString("Model"),
                    rs.getString("full_name"),
                    rs.getInt("ClientID")
                };
                tableModel.addRow(row);
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error refreshing rentals table: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowRentsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReturnBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable showRentsTable;
    // End of variables declaration//GEN-END:variables
}
