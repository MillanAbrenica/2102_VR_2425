package Home_Admin;

import Home_Client.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class TotalRevenueFrame extends javax.swing.JFrame {
    
    private int clientId;
    
    public TotalRevenueFrame() {
        this.clientId = clientId;
        initComponents();
        loadTotalRevenue();
        TotalRevenueTxtfActionPerformed(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TotalRevenueTxtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TotalRevenueTable = new javax.swing.JTable();
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
        setTitle("SHOW TOTAL REVENUE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL REVENUE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        TotalRevenueTxtf.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        TotalRevenueTxtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalRevenueTxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRevenueTxtfActionPerformed(evt);
            }
        });
        jPanel1.add(TotalRevenueTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 512, 250, 50));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Revenue:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        TotalRevenueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Payment ID", "Car ID", "Client Name", "Brand", "Model", "Rents Payment", "Reserves DownPayment", "Reserves FullPayment"
            }
        ));
        jScrollPane2.setViewportView(TotalRevenueTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 87, 800, 410));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalRevenueTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalRevenueTxtfActionPerformed
       String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        String query = """
            SELECT 
                SUM(Rent_Payments) AS TotalRentPayments,
                SUM(ReserveDown_Payments) AS TotalReserveDownPayments,
                SUM(ReserveFull_Payments) AS TotalReserveFullPayments
            FROM payments
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            double totalRentPayments = 0.0;
            double totalReserveDownPayments = 0.0;
            double totalReserveFullPayments = 0.0;

            if (rs.next()) {
                totalRentPayments = rs.getDouble("TotalRentPayments");
                if (rs.wasNull()) totalRentPayments = 0.0;

                totalReserveDownPayments = rs.getDouble("TotalReserveDownPayments");
                if (rs.wasNull()) totalReserveDownPayments = 0.0;

                totalReserveFullPayments = rs.getDouble("TotalReserveFullPayments");
                if (rs.wasNull()) totalReserveFullPayments = 0.0;
            }

            double grandTotal = totalRentPayments + totalReserveDownPayments + totalReserveFullPayments;

            TotalRevenueTxtf.setText("$" + String.format("%.2f", grandTotal));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TotalRevenueTxtfActionPerformed

    
    private void loadTotalRevenue() {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        DefaultTableModel model = (DefaultTableModel) TotalRevenueTable.getModel();

        if (model.getColumnCount() != 8) {
            JOptionPane.showMessageDialog(this, "Table columns not properly initialized!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = """
            SELECT 
                PaymentID, 
                CarID, 
                full_name AS ClientName, 
                Brand, 
                Model, 
                Rent_Payments, 
                ReserveDown_Payments, 
                ReserveFull_Payments
            FROM payments
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            model.setRowCount(0); 

            while (rs.next()) {
                int paymentID = rs.getInt("PaymentID");
                int carID = rs.getInt("CarID");
                String clientName = rs.getString("ClientName");
                String brand = rs.getString("Brand");
                String modelStr = rs.getString("Model");
                Double rentPayment = rs.getDouble("Rent_Payments");
                Double reserveDownPayment = rs.getDouble("ReserveDown_Payments");
                Double reserveFullPayment = rs.getDouble("ReserveFull_Payments");

                rentPayment = (rentPayment != null) ? rentPayment : 0.0;
                reserveDownPayment = (reserveDownPayment != null) ? reserveDownPayment : 0.0;
                reserveFullPayment = (reserveFullPayment != null) ? reserveFullPayment : 0.0;

                model.addRow(new Object[]{
                    paymentID, 
                    carID, 
                    clientName, 
                    brand, 
                    modelStr, 
                    rentPayment, 
                    reserveDownPayment, 
                    reserveFullPayment
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TotalRevenueFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TotalRevenueTable;
    private javax.swing.JTextField TotalRevenueTxtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
