package Home_Admin;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

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
        DateStartedSp = new javax.swing.JSpinner();
        DateEndedSp = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SeeTotalBtn = new javax.swing.JButton();
        SearchFieldTxtf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL REVENUE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        TotalRevenueTxtf.setBackground(new java.awt.Color(0, 0, 0));
        TotalRevenueTxtf.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        TotalRevenueTxtf.setForeground(new java.awt.Color(255, 255, 255));
        TotalRevenueTxtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalRevenueTxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRevenueTxtfActionPerformed(evt);
            }
        });
        jPanel1.add(TotalRevenueTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 250, 50));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Revenue:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));
        jPanel1.add(DateStartedSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 160, -1));
        jPanel1.add(DateEndedSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 160, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Started");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Ended");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        SeeTotalBtn.setBackground(new java.awt.Color(0, 0, 0));
        SeeTotalBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SeeTotalBtn.setForeground(new java.awt.Color(255, 255, 255));
        SeeTotalBtn.setText("See total");
        SeeTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeTotalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SeeTotalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, -1));

        SearchFieldTxtf.setBackground(new java.awt.Color(0, 0, 0));
        SearchFieldTxtf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchFieldTxtf.setForeground(new java.awt.Color(255, 255, 255));
        SearchFieldTxtf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        SearchFieldTxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldTxtfActionPerformed(evt);
            }
        });
        SearchFieldTxtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchFieldTxtfKeyPressed(evt);
            }
        });
        jPanel1.add(SearchFieldTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 90, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 60, -1));

        RefreshBtn.setBackground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        TotalRevenueTable.setBackground(new java.awt.Color(0, 0, 0));
        TotalRevenueTable.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 87, 800, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/Client_dashboards(900 x 600).png"))); // NOI18N
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
        DefaultTableModel model = (DefaultTableModel) TotalRevenueTable.getModel();
        double totalRentPayments = 0.0;
        double totalReserveDownPayments = 0.0;
        double totalReserveFullPayments = 0.0;

        for (int i = 0; i < model.getRowCount(); i++) {
            Double rentPayment = (Double) model.getValueAt(i, 5); // Column index 5: Rent_Payments
            Double reserveDownPayment = (Double) model.getValueAt(i, 6); // Column index 6: ReserveDown_Payments
            Double reserveFullPayment = (Double) model.getValueAt(i, 7); // Column index 7: ReserveFull_Payments

            // Accumulate totals, handling possible null values
            totalRentPayments += (rentPayment != null ? rentPayment : 0.0);
            totalReserveDownPayments += (reserveDownPayment != null ? reserveDownPayment : 0.0);
            totalReserveFullPayments += (reserveFullPayment != null ? reserveFullPayment : 0.0);
        }

        // Compute the grand total
        double grandTotal = totalRentPayments + totalReserveDownPayments + totalReserveFullPayments;

        // Display the grand total in the TotalRevenueTxtf field
        TotalRevenueTxtf.setText("Php " + String.format("%.2f", grandTotal));
    }//GEN-LAST:event_TotalRevenueTxtfActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DateStartedSp.setModel(new javax.swing.SpinnerDateModel());
        DateStartedSp.setValue(new java.util.Date()); 
        JSpinner.DateEditor editorStart = new JSpinner.DateEditor(DateStartedSp, "MM/dd/yyyy, h:mm a");
        DateStartedSp.setEditor(editorStart);

        DateEndedSp.setModel(new javax.swing.SpinnerDateModel());
        DateEndedSp.setValue(new java.util.Date()); 
        JSpinner.DateEditor editorEnd = new JSpinner.DateEditor(DateEndedSp, "MM/dd/yyyy, h:mm a");
        DateEndedSp.setEditor(editorEnd);
    }//GEN-LAST:event_formWindowOpened

    private void SeeTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeTotalBtnActionPerformed
        java.util.Date startDate = (java.util.Date) DateStartedSp.getValue();
        java.util.Date endDate = (java.util.Date) DateEndedSp.getValue();

        if (startDate.after(endDate)) {
            JOptionPane.showMessageDialog(this, "Start date cannot be after end date.", "Invalid Date Range", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Load data into the table
        loadTotalRevenue(startDate, endDate);

        // Recalculate total revenue
        TotalRevenueTxtfActionPerformed(evt);
    }//GEN-LAST:event_SeeTotalBtnActionPerformed

    private void SearchFieldTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldTxtfActionPerformed
        // Trigger the search logic
        String searchKeyword = SearchFieldTxtf.getText().trim();

        if (searchKeyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a brand or model to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

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
            WHERE Brand LIKE ? OR Model LIKE ?
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, "%" + searchKeyword + "%");
            pst.setString(2, "%" + searchKeyword + "%");

            try (ResultSet rs = pst.executeQuery()) {
                model.setRowCount(0); // Clear the table before populating new data

                double totalRevenue = 0.0;
                boolean found = false;

                while (rs.next()) {
                    found = true;
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

                    // Calculate row's total revenue
                    double rowTotal = rentPayment + reserveDownPayment + reserveFullPayment;
                    totalRevenue += rowTotal;

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

                if (!found) {
                    JOptionPane.showMessageDialog(this, "No results found for the search term: " + searchKeyword, "No Results", JOptionPane.INFORMATION_MESSAGE);
                } 

                // Update the TotalRevenueTxtf with the calculated total revenue
                TotalRevenueTxtf.setText("Php " + String.format("%.2f", totalRevenue));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchFieldTxtfActionPerformed

    private void SearchFieldTxtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldTxtfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Trigger the search logic
            String searchKeyword = SearchFieldTxtf.getText().trim();

            if (searchKeyword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a brand or model to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
                return;
            }

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
                WHERE Brand LIKE ? OR Model LIKE ?
            """;

            try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
                 PreparedStatement pst = con.prepareStatement(query)) {

                pst.setString(1, "%" + searchKeyword + "%");
                pst.setString(2, "%" + searchKeyword + "%");

                try (ResultSet rs = pst.executeQuery()) {
                    model.setRowCount(0); // Clear table before loading new data

                    double totalRevenue = 0.0; // Initialize total revenue
                    boolean found = false;

                    while (rs.next()) {
                        found = true;
                        int paymentID = rs.getInt("PaymentID");
                        int carID = rs.getInt("CarID");
                        String clientName = rs.getString("ClientName");
                        String brand = rs.getString("Brand");
                        String modelStr = rs.getString("Model");
                        Double rentPayment = rs.getDouble("Rent_Payments");
                        Double reserveDownPayment = rs.getDouble("ReserveDown_Payments");
                        Double reserveFullPayment = rs.getDouble("ReserveFull_Payments");

                        // Handle null values for payments
                        rentPayment = (rentPayment != null) ? rentPayment : 0.0;
                        reserveDownPayment = (reserveDownPayment != null) ? reserveDownPayment : 0.0;
                        reserveFullPayment = (reserveFullPayment != null) ? reserveFullPayment : 0.0;

                        // Calculate total revenue for this row
                        double rowTotal = rentPayment + reserveDownPayment + reserveFullPayment;
                        totalRevenue += rowTotal;

                        // Add row data to table
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

                    if (!found) {
                        // Display no results message and reset the revenue text field
                        JOptionPane.showMessageDialog(this, "No results found for the search term: " + searchKeyword, "No Results", JOptionPane.INFORMATION_MESSAGE);
                        TotalRevenueTxtf.setText("Php 0.00");
                    } else {
                        // Update the TotalRevenueTxtf field with the calculated total revenue
                        TotalRevenueTxtf.setText("Php " + String.format("%.2f", totalRevenue));
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SearchFieldTxtfKeyPressed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        SearchFieldTxtf.setText("");
        loadTotalRevenue();
        updateTotalRevenueTxtf();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    
    private void updateTotalRevenueTxtf() {
        DefaultTableModel model = (DefaultTableModel) TotalRevenueTable.getModel();
        double totalRentPayments = 0.0;
        double totalReserveDownPayments = 0.0;
        double totalReserveFullPayments = 0.0;

        // Iterate over the table rows to compute the totals
        for (int i = 0; i < model.getRowCount(); i++) {
            // Retrieve values from the table model
            Double rentPayment = (Double) model.getValueAt(i, 5); // Column index 5: Rent_Payments
            Double reserveDownPayment = (Double) model.getValueAt(i, 6); // Column index 6: ReserveDown_Payments
            Double reserveFullPayment = (Double) model.getValueAt(i, 7); // Column index 7: ReserveFull_Payments

            // Accumulate totals, handling possible null values
            totalRentPayments += (rentPayment != null ? rentPayment : 0.0);
            totalReserveDownPayments += (reserveDownPayment != null ? reserveDownPayment : 0.0);
            totalReserveFullPayments += (reserveFullPayment != null ? reserveFullPayment : 0.0);
        }

        // Compute the grand total
        double grandTotal = totalRentPayments + totalReserveDownPayments + totalReserveFullPayments;

        // Display the grand total in the TotalRevenueTxtf field
        TotalRevenueTxtf.setText("Php " + String.format("%.2f", grandTotal));
    }
    
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
    
    private void loadTotalRevenue(java.util.Date startDate, java.util.Date endDate) {
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
            WHERE PaymentDate BETWEEN ? AND ?
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setTimestamp(1, new java.sql.Timestamp(startDate.getTime()));
            pst.setTimestamp(2, new java.sql.Timestamp(endDate.getTime()));

            try (ResultSet rs = pst.executeQuery()) {
                model.setRowCount(0); // Clear existing data

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
    private javax.swing.JSpinner DateEndedSp;
    private javax.swing.JSpinner DateStartedSp;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTextField SearchFieldTxtf;
    private javax.swing.JButton SeeTotalBtn;
    private javax.swing.JTable TotalRevenueTable;
    private javax.swing.JTextField TotalRevenueTxtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
