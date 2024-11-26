package Home_Admin;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class AddCarFrame extends javax.swing.JFrame {

    
    public AddCarFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMenuBtn = new javax.swing.JButton();
        Brandtxtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Modeltxtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Yeartxtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pricetxtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        isAvailableCB = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenuBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackToMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackToMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/back (white).png"))); // NOI18N
        BackToMenuBtn.setText("Back To Menu");
        BackToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackToMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 30));

        Brandtxtf.setBackground(new java.awt.Color(0, 0, 0));
        Brandtxtf.setForeground(new java.awt.Color(255, 255, 255));
        Brandtxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandtxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Brandtxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 186, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 37, -1));

        Modeltxtf.setBackground(new java.awt.Color(0, 0, 0));
        Modeltxtf.setForeground(new java.awt.Color(255, 255, 255));
        Modeltxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeltxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Modeltxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 186, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Model");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 37, -1));

        Yeartxtf.setBackground(new java.awt.Color(0, 0, 0));
        Yeartxtf.setForeground(new java.awt.Color(255, 255, 255));
        Yeartxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeartxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Yeartxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 186, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 37, -1));

        Pricetxtf.setBackground(new java.awt.Color(0, 0, 0));
        Pricetxtf.setForeground(new java.awt.Color(255, 255, 255));
        Pricetxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricetxtfActionPerformed(evt);
            }
        });
        jPanel1.add(Pricetxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 186, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 37, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD CARS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 95, -1));

        SubmitBtn.setBackground(new java.awt.Color(0, 0, 0));
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        isAvailableCB.setBackground(new java.awt.Color(0, 0, 0));
        isAvailableCB.setForeground(new java.awt.Color(255, 255, 255));
        isAvailableCB.setText("Available");
        isAvailableCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAvailableCBActionPerformed(evt);
            }
        });
        jPanel1.add(isAvailableCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundAndicons/add, update, remove.png"))); // NOI18N
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

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed

        String dbUrl = "jdbc:mysql://localhost:3306/vehiclerentaldb";
        String dbUser = "root";
        String dbPassword = "";

        String brand = Brandtxtf.getText().trim();
        String model = Modeltxtf.getText().trim();
        String year = Yeartxtf.getText().trim();
        String price = Pricetxtf.getText().trim();
        boolean isAvailable = isAvailableCB.isSelected();
        boolean isReserved = false; 

        if (brand.isEmpty() || model.isEmpty() || year.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isAvailable) {
            JOptionPane.showMessageDialog(new JFrame(), "Availability must be selected.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int carYear = Integer.parseInt(year);
            if (carYear < 1886 || carYear > java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)) {
                JOptionPane.showMessageDialog(new JFrame(), "Please enter a valid year for the car.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double carPrice = Double.parseDouble(price);
            if (carPrice <= 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Price must be greater than zero.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try (Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
                String query = "INSERT INTO Cars (Brand, Model, Year, Price, isAvailable, isReserved) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pst = con.prepareStatement(query)) {
                    pst.setString(1, brand);
                    pst.setString(2, model);
                    pst.setInt(3, carYear);
                    pst.setDouble(4, carPrice);
                    pst.setBoolean(5, isAvailable);
                    pst.setBoolean(6, isReserved); 

                    int rowsInserted = pst.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "Car added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        Brandtxtf.setText("");
                        Modeltxtf.setText("");
                        Yeartxtf.setText("");
                        Pricetxtf.setText("");
                        isAvailableCB.setSelected(false);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error connecting to the database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Please enter valid numbers for Year and Price.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void isAvailableCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailableCBActionPerformed
       
    }//GEN-LAST:event_isAvailableCBActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenuBtn;
    private javax.swing.JTextField Brandtxtf;
    private javax.swing.JTextField Modeltxtf;
    private javax.swing.JTextField Pricetxtf;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField Yeartxtf;
    private javax.swing.JCheckBox isAvailableCB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
