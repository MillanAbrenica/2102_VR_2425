package Home_Client;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

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

        CancelReserveBtn.setText("Cancel Reservation");
        CancelReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 87, 800, 450));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        String updateCarQuery = "UPDATE cars SET isAvailable = 1 WHERE CarID = ?";

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
                Reserves.RentedDate, 
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
                String rentedDate = rs.getString("RentedDate");
                String brand = rs.getString("Brand");
                String modelStr = rs.getString("Model");
                String clientName = rs.getString("Client");

                if (clientName == null) {
                    clientName = "No Client";  // Handle null value for Client
                }

                model.addRow(new Object[]{reserveID, carID, rentedDate, brand, modelStr, clientName});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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
