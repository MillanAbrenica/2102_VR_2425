package Home_Admin;

import Home_Client.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ReserveListFrame extends javax.swing.JFrame {
    
    private int clientId;
    
    public ReserveListFrame() {
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
        SearchFieldTxtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
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

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search Brand/Client:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        RefreshBtn.setBackground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 87, 800, 450));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchFieldTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldTxtfActionPerformed
        // Trigger the search logic
        String searchKeyword = SearchFieldTxtf.getText().trim();

        if (searchKeyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a client name or car brand to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

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
        WHERE client.full_name LIKE ? OR Reserves.Brand LIKE ?
        """;

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, "%" + searchKeyword + "%");
            pst.setString(2, "%" + searchKeyword + "%");

            try (ResultSet rs = pst.executeQuery()) {
                model.setRowCount(0);

                boolean found = false;
                while (rs.next()) {
                    found = true;
                    int reserveID = rs.getInt("ReserveID");
                    int carID = rs.getInt("CarID");
                    String reserveDate = rs.getString("ReserveDate");
                    String brand = rs.getString("Brand");
                    String modelStr = rs.getString("Model");
                    String clientName = rs.getString("Client");

                    if (clientName == null) {
                        clientName = "No Client";
                    }

                    model.addRow(new Object[]{reserveID, carID, reserveDate, brand, modelStr, clientName});
                }

                if (!found) {
                    JOptionPane.showMessageDialog(this, "No reserved cars found for the search term: " + searchKeyword, "No Results", JOptionPane.INFORMATION_MESSAGE);
                }
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
                JOptionPane.showMessageDialog(this, "Please enter a client name or car brand to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
                return;
            }

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
            WHERE client.full_name LIKE ? OR Reserves.Brand LIKE ?
            """;

            try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
                PreparedStatement pst = con.prepareStatement(query)) {

                pst.setString(1, "%" + searchKeyword + "%");
                pst.setString(2, "%" + searchKeyword + "%");

                try (ResultSet rs = pst.executeQuery()) {
                    model.setRowCount(0);

                    boolean found = false;
                    while (rs.next()) {
                        found = true;
                        int reserveID = rs.getInt("ReserveID");
                        int carID = rs.getInt("CarID");
                        String reserveDate = rs.getString("ReserveDate");
                        String brand = rs.getString("Brand");
                        String modelStr = rs.getString("Model");
                        String clientName = rs.getString("Client");

                        if (clientName == null) {
                            clientName = "No Client";
                        }

                        model.addRow(new Object[]{reserveID, carID, reserveDate, brand, modelStr, clientName});
                    }

                    if (!found) {
                        JOptionPane.showMessageDialog(this, "No reserved cars found for the search term: " + searchKeyword, "No Results", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SearchFieldTxtfKeyPressed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        SearchFieldTxtf.setText("");
        loadReserveCars();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    
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
                new ReserveListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTextField SearchFieldTxtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable showReserveTable;
    // End of variables declaration//GEN-END:variables
}
