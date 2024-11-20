package Home_Client;

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



public class RentNReserveCarFrame extends javax.swing.JFrame {

    public RentNReserveCarFrame() {
        initComponents();
        loadCarsIntoTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentCarTable = new javax.swing.JTable();
        BackToMenuBtn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DateEndedSp = new javax.swing.JSpinner();
        DateStartedSp = new javax.swing.JSpinner();
        ReserveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Magneto", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Nextstop Rentals");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 300, -1));

        rentCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        jScrollPane1.setViewportView(rentCarTable);
        rentCarTable.getAccessibleContext().setAccessibleName("Car Table");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 60, 480, 480));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 110, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date Ended");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Rented");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel1.add(DateEndedSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, -1));
        jPanel1.add(DateStartedSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, -1));

        ReserveBtn.setText("Reserve Car");
        ReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarBtnActionPerformed
         int selectedRow = rentCarTable.getSelectedRow();

        if (selectedRow != -1) {
            try {
                Object carIDObj = rentCarTable.getValueAt(selectedRow, 0);
                Object brandObj = rentCarTable.getValueAt(selectedRow, 1);
                Object modelObj = rentCarTable.getValueAt(selectedRow, 2);
                Object priceObj = rentCarTable.getValueAt(selectedRow, 4); // Assume price is in column 4

                if (carIDObj == null || brandObj == null || modelObj == null || priceObj == null) {
                    JOptionPane.showMessageDialog(this, "Selected row contains invalid data.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int carID = Integer.parseInt(carIDObj.toString());
                String brand = brandObj.toString();
                String model = modelObj.toString();
                double pricePerDay = Double.parseDouble(priceObj.toString());

                Date dateRentedDate = (Date) DateStartedSp.getValue();
                Date dateEndedDate = (Date) DateEndedSp.getValue();

                LocalDateTime dateRented = dateRentedDate.toInstant()
                                                         .atZone(ZoneId.systemDefault())
                                                         .toLocalDateTime();
                LocalDateTime dateEnded = dateEndedDate.toInstant()
                                                       .atZone(ZoneId.systemDefault())
                                                       .toLocalDateTime();

                long rentalDays = ChronoUnit.DAYS.between(dateRented, dateEnded);
                if (rentalDays <= 0) {
                    JOptionPane.showMessageDialog(this, "End date must be after the start date.", "Date Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double totalPrice = rentalDays * pricePerDay;

                String clientIDInput = JOptionPane.showInputDialog(this, 
                    "Enter the Client ID:", 
                    "Client Information", 
                    JOptionPane.PLAIN_MESSAGE);

                if (clientIDInput == null || clientIDInput.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Client ID is required to proceed.", "Client Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int clientID;
                try {
                    clientID = Integer.parseInt(clientIDInput.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid Client ID. Please enter a numeric value.", "Client Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
                String dbUser = "root";
                String dbPassword = "";
                boolean isCarAvailable = false;

                try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                    String query = "SELECT isAvailable FROM Cars WHERE CarID = ?";
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setInt(1, carID);
                        try (ResultSet rs = pst.executeQuery()) {
                            if (rs.next()) {
                                isCarAvailable = rs.getBoolean("isAvailable");
                            }
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error checking car availability: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!isCarAvailable) {
                    JOptionPane.showMessageDialog(this, "Car is already rented or unavailable.", "Car Unavailable", JOptionPane.WARNING_MESSAGE);
                    return; 
                }

                String message = "You selected:\n" +
                    "Car ID: " + carID + "\n" +
                    "Brand: " + brand + "\n" +
                    "Model: " + model + "\n" +
                    "Price Per Day: $" + pricePerDay + "\n" +
                    "Rental Days: " + rentalDays + "\n" +
                    "Total Price: $" + totalPrice + "\n\n" +
                    "Do you want to proceed with the rental?";

                int option = JOptionPane.showConfirmDialog(this, message, "Confirm Rental", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    String input = JOptionPane.showInputDialog(this, 
                        "Enter your payment amount ( Total Price: $" + totalPrice +" ):", 
                        "Payment Input", 
                        JOptionPane.PLAIN_MESSAGE);

                    if (input != null && !input.trim().isEmpty()) {
                        try {
                            double payment = Double.parseDouble(input.trim());
                            if (payment < totalPrice) {
                                JOptionPane.showMessageDialog(this, 
                                    "You must pay at least the total rental price. Please try again.", 
                                    "Insufficient Payment", 
                                    JOptionPane.WARNING_MESSAGE);
                            } else {
                                rentCarInDatabase(carID, brand, model, payment, clientID);
                                JOptionPane.showMessageDialog(this, 
                                    "Car rented successfully!\nPayment: $" + payment, 
                                    "Success", 
                                    JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(this, 
                                "Invalid payment amount entered. Please enter a numeric value.", 
                                "Input Error", 
                                JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (ClassCastException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error retrieving car data: " + e.getMessage(), "Data Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    private void ReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBtnActionPerformed
        int selectedRow = rentCarTable.getSelectedRow();

        if (selectedRow != -1) {
            try {
                if (rentCarTable.getColumnCount() < 6) {
                    JOptionPane.showMessageDialog(this, "Table structure is incorrect. Please check the data source.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Object carIDObj = rentCarTable.getValueAt(selectedRow, 0); 
                Object brandObj = rentCarTable.getValueAt(selectedRow, 1);  
                Object modelObj = rentCarTable.getValueAt(selectedRow, 2);  
                Object availabilityObj = rentCarTable.getValueAt(selectedRow, 5); 

                if (carIDObj == null || brandObj == null || modelObj == null || availabilityObj == null) {
                    JOptionPane.showMessageDialog(this, "Selected row contains invalid data.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int carID = Integer.parseInt(carIDObj.toString());
                String brand = brandObj.toString();
                String model = modelObj.toString();

                boolean isAvailable;
                if (availabilityObj instanceof Boolean) {
                    isAvailable = (Boolean) availabilityObj;
                } else if (availabilityObj.toString().equalsIgnoreCase("true") || availabilityObj.toString().equalsIgnoreCase("available")) {
                    isAvailable = true;
                } else if (availabilityObj.toString().equalsIgnoreCase("false") || availabilityObj.toString().equalsIgnoreCase("unavailable")) {
                    isAvailable = false;
                } else {
                    isAvailable = Integer.parseInt(availabilityObj.toString()) == 1;
                }

                if (!isAvailable) {
                    JOptionPane.showMessageDialog(this, "Selected car is not available for reservation.", "Car Unavailable", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Date rentedDate = (Date) DateStartedSp.getValue();
                if (rentedDate == null) {
                    JOptionPane.showMessageDialog(this, "Please select a valid rental date.", "Date Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String clientIDInput = JOptionPane.showInputDialog(this, "Enter the Client ID:", "Client Information", JOptionPane.PLAIN_MESSAGE);
                if (clientIDInput == null || clientIDInput.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Client ID is required to proceed.", "Client Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int clientID;
                try {
                    clientID = Integer.parseInt(clientIDInput.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid Client ID. Please enter a numeric value.", "Client Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                reserveCarInDatabase(carID, brand, model, clientID, rentedDate);

            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(this, "Table column index out of bounds. Please check the table structure.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error parsing numeric data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a car first.", "No Car Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ReserveBtnActionPerformed

    
    private void reserveCarInDatabase(int carID, String brand, String model, int clientID, Date dateRented) {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String clientQuery = "SELECT full_name FROM client WHERE id = ?";
            String clientFullName = null;
            try (PreparedStatement clientStmt = con.prepareStatement(clientQuery)) {
                clientStmt.setInt(1, clientID);
                try (ResultSet rs = clientStmt.executeQuery()) {
                    if (rs.next()) {
                        clientFullName = rs.getString("full_name");
                    } else {
                        JOptionPane.showMessageDialog(this, "Client not found.", "Client Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            String reserveQuery = "INSERT INTO reserves (CarID, RentedDate, Brand, Model, full_name, ClientID) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement reserveStmt = con.prepareStatement(reserveQuery)) {
                reserveStmt.setInt(1, carID);
                reserveStmt.setTimestamp(2, new java.sql.Timestamp(dateRented.getTime()));
                reserveStmt.setString(3, brand);
                reserveStmt.setString(4, model);
                reserveStmt.setString(5, clientFullName);
                reserveStmt.setInt(6, clientID);

                int rowsInserted = reserveStmt.executeUpdate();
                if (rowsInserted > 0) {
                    String updateQuery = "UPDATE Cars SET isAvailable = ? WHERE CarID = ?";
                    try (PreparedStatement updateStmt = con.prepareStatement(updateQuery)) {
                        updateStmt.setBoolean(1, false);
                        updateStmt.setInt(2, carID);
                        updateStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(this, "Car reserved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadCarsIntoTable(); 
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to reserve the car. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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
        DefaultTableModel model = (DefaultTableModel) rentCarTable.getModel();

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
    
    
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RentNReserveCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentNReserveCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentNReserveCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentNReserveCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentNReserveCarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn2;
    private javax.swing.JSpinner DateEndedSp;
    private javax.swing.JSpinner DateStartedSp;
    private javax.swing.JButton ReserveBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rentCarTable;
    // End of variables declaration//GEN-END:variables
}
