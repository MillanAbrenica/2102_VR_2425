package Home_Admin;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;


public class UpdateCarFrame extends javax.swing.JFrame {

    
    public UpdateCarFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formWindowOpened();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Brandtxtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Modeltxtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Yeartxtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pricetxtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        carIDcombobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UPDATE CARS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setText("Back To Main Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 88, 37, -1));

        Brandtxtf.setBackground(new java.awt.Color(0, 0, 0));
        Brandtxtf.setForeground(new java.awt.Color(255, 255, 255));
        Brandtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandtxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Brandtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 125, 186, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 128, 37, -1));

        Modeltxtf.setBackground(new java.awt.Color(0, 0, 0));
        Modeltxtf.setForeground(new java.awt.Color(255, 255, 255));
        Modeltxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeltxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Modeltxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 165, 186, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Model");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 168, 37, -1));

        Yeartxtf.setBackground(new java.awt.Color(0, 0, 0));
        Yeartxtf.setForeground(new java.awt.Color(255, 255, 255));
        Yeartxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeartxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Yeartxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 205, 186, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 208, 37, -1));

        Pricetxtf.setBackground(new java.awt.Color(0, 0, 0));
        Pricetxtf.setForeground(new java.awt.Color(255, 255, 255));
        Pricetxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricetxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Pricetxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 245, 186, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 248, 37, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UPDATE CARS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 35, 95, -1));

        UpdateBtn.setBackground(new java.awt.Color(0, 0, 0));
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        carIDcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carIDcomboboxActionPerformed(evt);
            }
        });
        jPanel1.add(carIDcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/dashboards_add.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuBtnActionPerformed
        this.dispose();
        Home_admin mainMenu = new Home_admin();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackToMenuBtnActionPerformed

    private void BrandtxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandtxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandtxtfActionPerformed

    private void ModeltxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeltxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeltxtfActionPerformed

    private void YeartxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeartxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YeartxtfActionPerformed

    private void PricetxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PricetxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PricetxtfActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        String brand = Brandtxtf.getText();
        String model = Modeltxtf.getText();
        String year = Yeartxtf.getText();
        String price = Pricetxtf.getText();
        String selectedCarID = (String) carIDcombobox.getSelectedItem();

        if (selectedCarID == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a Car ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (brand.isEmpty() || model.isEmpty() || year.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String checkQuery = "SELECT IsAvailable FROM Cars WHERE CarID = ?";
            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setString(1, selectedCarID);

            ResultSet rs = checkStmt.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(new JFrame(), "No car found with the specified Car ID.", "Error", JOptionPane.ERROR_MESSAGE);
                rs.close();
                checkStmt.close();
                con.close();
                return;
            }

            boolean isAvailable = rs.getBoolean("IsAvailable");
            rs.close();
            checkStmt.close();

            if (!isAvailable) {
                JOptionPane.showMessageDialog(new JFrame(), "The selected car is not available for updates.", "Error", JOptionPane.ERROR_MESSAGE);
                con.close();
                return;
            }

            String query = "UPDATE Cars SET Brand = ?, Model = ?, Year = ?, Price = ? WHERE CarID = ?";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, brand);
            pst.setString(2, model);
            pst.setInt(3, Integer.parseInt(year));
            pst.setDouble(4, Double.parseDouble(price));
            pst.setString(5, selectedCarID);

            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Car updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                Brandtxtf.setText("");
                Modeltxtf.setText("");
                Yeartxtf.setText("");
                Pricetxtf.setText("");
                carIDcombobox.setSelectedIndex(-1);
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "No car found with the specified Car ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: Please enter valid numbers for Year and Price.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void carIDcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carIDcomboboxActionPerformed
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        String selectedCarID = (String) carIDcombobox.getSelectedItem();

        if (selectedCarID != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

                String query = "SELECT Brand, Model, Year, Price FROM Cars WHERE CarID = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, selectedCarID);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    Brandtxtf.setText(rs.getString("Brand"));
                    Modeltxtf.setText(rs.getString("Model"));
                    Yeartxtf.setText(rs.getString("Year"));
                    Pricetxtf.setText(rs.getString("Price"));
                } else {
                    Brandtxtf.setText("");
                    Modeltxtf.setText("");
                    Yeartxtf.setText("");
                    Pricetxtf.setText("");
                    JOptionPane.showMessageDialog(new JFrame(), "No car found for the selected Car ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                rs.close();
                pst.close();
                con.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_carIDcomboboxActionPerformed
   
    private void formWindowOpened() {                                      
        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String query = "SELECT CarID FROM Cars";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                carIDcombobox.addItem(rs.getString("CarID"));
            }

            rs.close();
            pst.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
        }
    }                      
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JTextField Brandtxtf;
    private javax.swing.JTextField Modeltxtf;
    private javax.swing.JTextField Pricetxtf;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField Yeartxtf;
    private javax.swing.JComboBox<String> carIDcombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
