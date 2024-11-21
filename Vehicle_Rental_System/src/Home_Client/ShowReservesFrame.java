package Home_Client;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;


public class ShowReservesFrame extends javax.swing.JFrame {
    
    private int clientId;
    
    public ShowReservesFrame() {
        this.clientId = clientId;
        initComponents();
        loadReserveCars();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CancelReserveBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showReserveTable = new javax.swing.JTable();
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
        setTitle("SHOW RESERVE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RESERVATIONS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        CancelReserveBtn.setBackground(new java.awt.Color(0, 0, 0));
        CancelReserveBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelReserveBtn.setText("Cancel Reservation");
        CancelReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 140, 30));

        showReserveTable.setBackground(new java.awt.Color(0, 0, 0));
        showReserveTable.setForeground(new java.awt.Color(255, 255, 255));
        showReserveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Reserve ID", "Car ID", "Reserve Date", "Brand", "Model", "Client"
            }
        ));
        jScrollPane2.setViewportView(showReserveTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 850, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/dashboards.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelReserveBtnActionPerformed
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        int selectedRow = showReserveTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a reservation to cancel.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) showReserveTable.getModel();
        int reserveID = (int) model.getValueAt(selectedRow, 0); 
        int carID = (int) model.getValueAt(selectedRow, 1); 

        String deleteReserveQuery = "DELETE FROM Reserves WHERE ReserveID = ?";
        String updateCarQuery = "UPDATE cars SET isAvailable = 1, isReserved = 0 WHERE CarID = ?";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            con.setAutoCommit(false);

            try (PreparedStatement pstDelete = con.prepareStatement(deleteReserveQuery);
                 PreparedStatement pstUpdate = con.prepareStatement(updateCarQuery)) {

                pstDelete.setInt(1, reserveID);
                pstDelete.executeUpdate();

                pstUpdate.setInt(1, carID);
                pstUpdate.executeUpdate();

                con.commit();

                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "Reservation cancelled successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                con.rollback();
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                con.setAutoCommit(true); 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CancelReserveBtnActionPerformed
 
    private void loadReserveCars() {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        DefaultTableModel model = (DefaultTableModel) showReserveTable.getModel();

        if (model.getColumnCount() != 6) {
            JOptionPane.showMessageDialog(this, "Table columns not properly initialized!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = """
            SELECT 
                Reserves.ReserveID, 
                Reserves.CarID, 
                Reserves.ReserveDate, 
                Reserves.Brand, 
                Reserves.Model, 
                client.full_name AS Client
            FROM Reserves
            LEFT JOIN client ON Reserves.ClientID = client.id
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            model.setRowCount(0);

            while (rs.next()) {
                int reserveID = rs.getInt("ReserveID");
                int carID = rs.getInt("CarID");
                String rentedDate = rs.getString("ReserveDate");
                String brand = rs.getString("Brand");
                String modelStr = rs.getString("Model");
                String clientName = rs.getString("Client");

                if (clientName == null) {
                    clientName = "No Client";  
                }

                model.addRow(new Object[]{reserveID, carID, rentedDate, brand, modelStr, clientName});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void rentCarInDatabase(int carID, String brand, String model, double payment, int clientID) {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String checkQuery = "SELECT isAvailable FROM Cars WHERE CarID = ?";
            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setInt(1, carID);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                boolean isAvailable = rs.getBoolean("isAvailable");
                if (!isAvailable) {
                    JOptionPane.showMessageDialog(null, "Car is already rented.", "Unavailable", JOptionPane.WARNING_MESSAGE);
                    rs.close();
                    checkStmt.close();
                    con.close();
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Car not found.", "Error", JOptionPane.ERROR_MESSAGE);
                rs.close();
                checkStmt.close();
                con.close();
                return;
            }
            rs.close();
            checkStmt.close();

            String clientQuery = "SELECT full_name FROM client WHERE id = ?";
            PreparedStatement clientStmt = con.prepareStatement(clientQuery);
            clientStmt.setInt(1, clientID);
            ResultSet clientRs = clientStmt.executeQuery();

            String fullName = null;
            if (clientRs.next()) {
                fullName = clientRs.getString("full_name");
            } else {
                JOptionPane.showMessageDialog(null, "Client not found.", "Error", JOptionPane.ERROR_MESSAGE);
                clientRs.close();
                clientStmt.close();
                con.close();
                return;
            }
            clientRs.close();
            clientStmt.close();

            String insertQuery = "INSERT INTO Rentals (CarID, Brand, Model, ClientID, full_name) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStmt = con.prepareStatement(insertQuery);
            insertStmt.setInt(1, carID);
            insertStmt.setString(2, brand);
            insertStmt.setString(3, model);
            insertStmt.setInt(4, clientID);  
            insertStmt.setString(5, fullName);  

            int rowsInserted = insertStmt.executeUpdate();

            if (rowsInserted > 0) {
                String updateQuery = "UPDATE Cars SET isAvailable = ? WHERE CarID = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setBoolean(1, false);  
                updateStmt.setInt(2, carID);
                updateStmt.executeUpdate();
                updateStmt.close();

                JOptionPane.showMessageDialog(null, "Car rented successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadCarsIntoTable();  
            } else {
                JOptionPane.showMessageDialog(null, "Failed to rent the car. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            insertStmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void loadCarsIntoTable() {
        DefaultTableModel model = (DefaultTableModel) showReserveTable.getModel();
        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String query = "SELECT CarID, Brand, Model, Year, Price, isAvailable, isReserved FROM Cars";
            try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    int carID = rs.getInt("CarID");
                    String brand = rs.getString("Brand");
                    String modelText = rs.getString("Model");
                    int year = rs.getInt("Year");
                    double price = rs.getDouble("Price");
                    boolean isAvailable = rs.getBoolean("isAvailable");
                    boolean isReserved = rs.getBoolean("isReserved");

                    String availabilityText;
                    if (isReserved) {
                        availabilityText = "Reserved";
                    } else if (!isAvailable) {
                        availabilityText = "Not Available";
                    } else {
                        availabilityText = "Available";
                    }

                    model.addRow(new Object[]{carID, brand, modelText, year, price, availabilityText});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
             
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowReservesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelReserveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable showReserveTable;
    // End of variables declaration//GEN-END:variables
}
