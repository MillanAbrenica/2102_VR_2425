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
                "Car ID", "Brand", "Year", "Model", "Price", "Availability"
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

            // Get rental dates from the spinners
            Date dateRentedDate = (Date) DateStartedSp.getValue();
            Date dateEndedDate = (Date) DateEndedSp.getValue();

            // Convert Date to LocalDateTime
            LocalDateTime dateRented = dateRentedDate.toInstant()
                                                     .atZone(ZoneId.systemDefault())
                                                     .toLocalDateTime();
            LocalDateTime dateEnded = dateEndedDate.toInstant()
                                                   .atZone(ZoneId.systemDefault())
                                                   .toLocalDateTime();

            // Calculate rental days
            long rentalDays = ChronoUnit.DAYS.between(dateRented, dateEnded);
            if (rentalDays <= 0) {
                JOptionPane.showMessageDialog(this, "End date must be after the start date.", "Date Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calculate total price
            double totalPrice = rentalDays * pricePerDay;

            // Retrieve or prompt for client ID
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

            // Step 1: Check if the car is available before proceeding with the rental
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
                return; // If database error occurs, exit method
            }

            if (!isCarAvailable) {
                JOptionPane.showMessageDialog(this, "Car is already rented or unavailable.", "Car Unavailable", JOptionPane.WARNING_MESSAGE);
                return; // Exit method if car is not available
            }

            // Display rental details and total price
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
                // Prompt for payment
                String input = JOptionPane.showInputDialog(this, 
                    "Enter your payment amount:", 
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
                            // Rent the car and record the payment
                            rentCarInDatabase(carID, brand, model, payment, clientID); // Updated method call with clientID
                            // Show the success message only after the database action is complete
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
        // Set current date and time in the "Date Started" spinner
        DateStartedSp.setModel(new javax.swing.SpinnerDateModel());
        DateStartedSp.setValue(new java.util.Date()); // Current date and time
        JSpinner.DateEditor editorStart = new JSpinner.DateEditor(DateStartedSp, "MM/dd/yyyy, h:mm a");
        DateStartedSp.setEditor(editorStart);

        // Set current date and time in the "Date Ended" spinner
        DateEndedSp.setModel(new javax.swing.SpinnerDateModel());
        DateEndedSp.setValue(new java.util.Date()); // Current date and time
        JSpinner.DateEditor editorEnd = new JSpinner.DateEditor(DateEndedSp, "MM/dd/yyyy, h:mm a");
        DateEndedSp.setEditor(editorEnd);
    }//GEN-LAST:event_formWindowOpened

    private void ReserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReserveBtnActionPerformed

    private void rentCarInDatabase(int carID, String brand, String model, double payment, int clientID) {
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Step 1: Check if the car is available
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

            // Step 2: Fetch the client's full name
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

            // Step 3: Insert a record into the Rentals table
            String insertQuery = "INSERT INTO Rentals (CarID, Brand, Model, full_name) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStmt = con.prepareStatement(insertQuery);
            insertStmt.setInt(1, carID);
            insertStmt.setString(2, brand);
            insertStmt.setString(3, model);
            insertStmt.setString(4, fullName);

            int rowsInserted = insertStmt.executeUpdate();

            if (rowsInserted > 0) {
                // Step 4: Update the car's availability
                String updateQuery = "UPDATE Cars SET isAvailable = ? WHERE CarID = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setBoolean(1, false); // Set as not available
                updateStmt.setInt(2, carID);
                updateStmt.executeUpdate();
                updateStmt.close();

                JOptionPane.showMessageDialog(null, "Car rented successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadCarsIntoTable(); // Refresh table
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

        // Clear existing rows in the table
        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            // Establish database connection
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Query to select all required columns including isAvailable
            String query = "SELECT CarID, Brand, Model, Year, Price, isAvailable FROM Cars";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iterate through result set and populate table rows
            while (rs.next()) {
                int carID = rs.getInt("CarID");
                String brand = rs.getString("Brand");
                String modelText = rs.getString("Model");
                int year = rs.getInt("Year");
                double price = rs.getDouble("Price");
                boolean isAvailable = rs.getBoolean("isAvailable");

                // Add row to table, displaying "Available" or "Not Available"
                String availabilityText = isAvailable ? "Available" : "Not Available";
                model.addRow(new Object[]{carID, brand, modelText, year, price, availabilityText});
            }

            // Close resources
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
