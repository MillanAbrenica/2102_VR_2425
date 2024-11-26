package Home_Client;

import java.awt.event.KeyEvent;
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
import static vehicle_rental_system.Login.loggedInClientID;
import static vehicle_rental_system.Login.loggedInClientName;



public class RentNReserveCarFrame extends javax.swing.JFrame {

    public RentNReserveCarFrame() {
        initComponents();
        loadCarsIntoTable();
        WelcomeMsgTxtf.setText("Welcome, " + loggedInClientName + "!");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentCarTable = new javax.swing.JTable();
        BackToMenuBtn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DateEndedSp = new javax.swing.JSpinner();
        WelcomeMsgTxtf = new javax.swing.JTextField();
        DateStartedSp = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        SearchFieldTxtf = new javax.swing.JTextField();
        ReserveBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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

        rentCarTable.setBackground(new java.awt.Color(0, 0, 0));
        rentCarTable.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 130, 480, 410));

        BackToMenuBtn2.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackToMenuBtn2.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn2.setText("Back To Menu");
        BackToMenuBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/Rent Car.png"))); // NOI18N
        jButton1.setText("Rent Car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 130, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date Ended");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Rent/Reserve");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel1.add(DateEndedSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, -1));

        WelcomeMsgTxtf.setBackground(new java.awt.Color(0, 0, 0));
        WelcomeMsgTxtf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WelcomeMsgTxtf.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeMsgTxtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WelcomeMsgTxtf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WelcomeMsgTxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WelcomeMsgTxtfActionPerformed(evt);
            }
        });
        jPanel1.add(WelcomeMsgTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 380, 90));
        jPanel1.add(DateStartedSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Brand:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 110, -1));

        RefreshBtn.setBackground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, -1));

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
        jPanel1.add(SearchFieldTxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 90, 20));

        ReserveBtn.setBackground(new java.awt.Color(0, 0, 0));
        ReserveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReserveBtn.setForeground(new java.awt.Color(255, 255, 255));
        ReserveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/Reserve Btn.png"))); // NOI18N
        ReserveBtn.setText("Reserve Car");
        ReserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 150, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/dashboards of cars and client.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

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

                // Use loggedInClientID set during login
                if (loggedInClientID == 0) { // Ensure the user is logged in
                    JOptionPane.showMessageDialog(this, "You need to log in first.", "Login Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int clientID = loggedInClientID; // Retrieve the logged-in Client ID

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
                    "Price Per Day: Php" + pricePerDay + "\n" +
                    "Rental Days: " + rentalDays + "\n" +
                    "Total Price: Php" + totalPrice + "\n\n" +
                    "Do you want to proceed with the rental?";

                int option = JOptionPane.showConfirmDialog(this, message, "Confirm Rental", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    String input = JOptionPane.showInputDialog(this, 
                        "Enter your payment amount ( Total Price: Php" + totalPrice + " ):", 
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
                                    "Car rented successfully!\nPayment: Php" + payment, 
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


    private void rentCarInDatabase(int carID, String brand, String model, double payment, int clientID) {
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

            String insertRentalQuery = "INSERT INTO Rentals (CarID, Brand, Model, ClientID, full_name) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement rentalStmt = con.prepareStatement(insertRentalQuery)) {
                rentalStmt.setInt(1, carID);
                rentalStmt.setString(2, brand);
                rentalStmt.setString(3, model);
                rentalStmt.setInt(4, clientID);
                rentalStmt.setString(5, clientFullName);

                int rowsInserted = rentalStmt.executeUpdate();
                if (rowsInserted > 0) {
                    String updateCarQuery = "UPDATE Cars SET isAvailable = ? WHERE CarID = ?";
                    try (PreparedStatement updateStmt = con.prepareStatement(updateCarQuery)) {
                        updateStmt.setBoolean(1, false);
                        updateStmt.setInt(2, carID);
                        updateStmt.executeUpdate();
                    }

                    String paymentQuery = "INSERT INTO payments (CarID, ClientID, full_name, Brand, Model, Rent_Payments) VALUES (?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement paymentStmt = con.prepareStatement(paymentQuery)) {
                        paymentStmt.setInt(1, carID);
                        paymentStmt.setInt(2, clientID);
                        paymentStmt.setString(3, clientFullName);
                        paymentStmt.setString(4, brand);
                        paymentStmt.setString(5, model);
                        paymentStmt.setDouble(6, payment);

                        paymentStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(this, "Car rented successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    loadCarsIntoTable(); 
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to rent the car. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
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

                boolean isAvailable = parseAvailability(availabilityObj);
                if (!isAvailable) {
                    JOptionPane.showMessageDialog(this, "Selected car is not available for reservation.", "Car Unavailable", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Date startDate = (Date) DateStartedSp.getValue();
                if (startDate == null) {
                    JOptionPane.showMessageDialog(this, "Please select a valid start date.", "Date Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int clientID = getClientID();
                if (clientID == -1) {
                    return; 
                }

                double pricePerDay = Double.parseDouble(rentCarTable.getValueAt(selectedRow, 4).toString());
                double totalPrice = pricePerDay;
                double minimumDownPayment = totalPrice * 0.3;

                if (!confirmReservation(carID, brand, model, startDate, totalPrice)) {
                    return; 
                }

                handlePayment(carID, brand, model, clientID, startDate, totalPrice, minimumDownPayment);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a car first.", "No Car Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ReserveBtnActionPerformed

    private void WelcomeMsgTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WelcomeMsgTxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WelcomeMsgTxtfActionPerformed

    private void SearchFieldTxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldTxtfActionPerformed
       String searchBrand = SearchFieldTxtf.getText().trim();

        if (searchBrand.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a brand to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) rentCarTable.getModel();
        model.setRowCount(0);

        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String query = "SELECT CarID, Brand, Model, Year, Price, isAvailable, isReserved FROM Cars WHERE Brand LIKE ?";
            try (PreparedStatement pstmt = con.prepareStatement(query)) {
                pstmt.setString(1, "%" + searchBrand + "%");
                try (ResultSet rs = pstmt.executeQuery()) {
                    boolean found = false;
                    while (rs.next()) {
                        found = true;
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

                    if (!found) {
                        JOptionPane.showMessageDialog(this, "No cars found for the brand: " + searchBrand, "No Results", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchFieldTxtfActionPerformed

    private void SearchFieldTxtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldTxtfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Trigger the search logic
            String searchBrand = SearchFieldTxtf.getText().trim();

            if (searchBrand.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a brand to search.", "Input Required", JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel model = (DefaultTableModel) rentCarTable.getModel();
            model.setRowCount(0);

            String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
            String dbUser = "root";
            String dbPassword = "";

            try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                String query = "SELECT CarID, Brand, Model, Year, Price, isAvailable, isReserved FROM Cars WHERE Brand LIKE ?";
                try (PreparedStatement pstmt = con.prepareStatement(query)) {
                    pstmt.setString(1, "%" + searchBrand + "%");
                    try (ResultSet rs = pstmt.executeQuery()) {
                        boolean found = false;
                        while (rs.next()) {
                            found = true;
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

                        if (!found) {
                            JOptionPane.showMessageDialog(this, "No cars found for the brand: " + searchBrand, "No Results", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SearchFieldTxtfKeyPressed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        SearchFieldTxtf.setText(""); 
        loadCarsIntoTable();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private boolean parseAvailability(Object availabilityObj) {
        if (availabilityObj instanceof Boolean) {
            return (Boolean) availabilityObj;
        } else if (availabilityObj.toString().equalsIgnoreCase("true") || availabilityObj.toString().equalsIgnoreCase("available")) {
            return true;
        } else if (availabilityObj.toString().equalsIgnoreCase("false") || availabilityObj.toString().equalsIgnoreCase("unavailable")) {
            return false;
        } else {
            return Integer.parseInt(availabilityObj.toString()) == 1;
        }
    }


    private int getClientID() {
        if (loggedInClientID == 0) { // Ensure the client is logged in
            JOptionPane.showMessageDialog(this, "You need to log in first to proceed.", "Login Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        return loggedInClientID; // Automatically return the stored Client ID
    }


    private boolean confirmReservation(int carID, String brand, String model, Date startDate, double totalPrice) {
        String message = "You selected:\n" +
                "Car ID: " + carID + "\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Reservation Start Date: " + startDate + "\n" +
                "Total Price: Php" + totalPrice + "\n\n" +
                "Do you want to proceed with the reservation?";

        int option = JOptionPane.showConfirmDialog(this, message, "Confirm Reservation", JOptionPane.YES_NO_OPTION);
        return option == JOptionPane.YES_OPTION;
    }


    private void handlePayment(int carID, String brand, String model, int clientID, Date startDate, double totalPrice, double minimumDownPayment) {
        String paymentType = JOptionPane.showInputDialog(this, 
                "Is this a Downpayment or Fullpayment? (Enter 'down' or 'full')", 
                "Payment Type", 
                JOptionPane.PLAIN_MESSAGE);

        if (paymentType == null || paymentType.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please specify the payment type.", "Payment Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        paymentType = paymentType.trim().toLowerCase();
        if (!paymentType.equals("down") && !paymentType.equals("full")) {
            JOptionPane.showMessageDialog(this, "Invalid payment type. Please enter 'down' or 'full'.", "Payment Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String input = JOptionPane.showInputDialog(this, 
                "Enter your payment amount for the " + paymentType + " payment:\n" +
                "Total Price: Php" + totalPrice + 
                (paymentType.equals("down") ? "\nMinimum Down Payment: Php" + minimumDownPayment : ""),
                "Payment Input", 
                JOptionPane.PLAIN_MESSAGE);

        if (input == null || input.trim().isEmpty()) {
            return; 
        }

        try {
            double payment = Double.parseDouble(input.trim());

            if (paymentType.equals("down") && payment < minimumDownPayment) {
                JOptionPane.showMessageDialog(this, 
                        "The payment for a down payment must be at least Php" + minimumDownPayment + ". Please try again.", 
                        "Insufficient Payment", 
                        JOptionPane.WARNING_MESSAGE);
            } else if (paymentType.equals("full") && payment < totalPrice) {
                JOptionPane.showMessageDialog(this, 
                        "The payment for a full payment must be at least Php" + totalPrice + ". Please try again.", 
                        "Insufficient Payment", 
                        JOptionPane.WARNING_MESSAGE);
            } else {
                boolean isFullPayment = paymentType.equals("full");
                reserveCarInDatabase(carID, brand, model, clientID, startDate, payment, isFullPayment);

                JOptionPane.showMessageDialog(this, 
                        "Car reserved successfully!\nPayment: Php" + payment + 
                        "\nPayment Type: " + paymentType, 
                        "Success", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid payment amount entered. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void reserveCarInDatabase(int carID, String brand, String model, int clientID, Date dateRented, double payment, boolean isFullPayment) {
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

            
            String reserveQuery = "INSERT INTO reserves (CarID, ReserveDate, Brand, Model, full_name, ClientID) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement reserveStmt = con.prepareStatement(reserveQuery)) {
                reserveStmt.setInt(1, carID);
                reserveStmt.setTimestamp(2, new java.sql.Timestamp(dateRented.getTime()));
                reserveStmt.setString(3, brand);
                reserveStmt.setString(4, model);
                reserveStmt.setString(5, clientFullName);
                reserveStmt.setInt(6, clientID);

                int rowsInserted = reserveStmt.executeUpdate();
                if (rowsInserted > 0) {
                    String updateCarQuery = "UPDATE Cars SET isAvailable = ?, isReserved = ? WHERE CarID = ?";
                    try (PreparedStatement updateStmt = con.prepareStatement(updateCarQuery)) {
                        updateStmt.setBoolean(1, false); 
                        updateStmt.setBoolean(2, true); 
                        updateStmt.setInt(3, carID);
                        updateStmt.executeUpdate();
                    }

                    String paymentQuery = isFullPayment
                        ? "INSERT INTO payments (CarID, ClientID, full_name, Brand, Model, ReserveFull_Payments) VALUES (?, ?, ?, ?, ?, ?)"
                        : "INSERT INTO payments (CarID, ClientID, full_name, Brand, Model, ReserveDown_Payments) VALUES (?, ?, ?, ?, ?, ?)";

                    try (PreparedStatement paymentStmt = con.prepareStatement(paymentQuery)) {
                        paymentStmt.setInt(1, carID);
                        paymentStmt.setInt(2, clientID);
                        paymentStmt.setString(3, clientFullName);
                        paymentStmt.setString(4, brand);
                        paymentStmt.setString(5, model);
                        paymentStmt.setDouble(6, payment);

                        paymentStmt.executeUpdate();
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

    
    
    
    public void loadCarsIntoTable() {
        DefaultTableModel model = (DefaultTableModel) rentCarTable.getModel();
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
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton ReserveBtn;
    private javax.swing.JTextField SearchFieldTxtf;
    private javax.swing.JTextField WelcomeMsgTxtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rentCarTable;
    // End of variables declaration//GEN-END:variables
}
