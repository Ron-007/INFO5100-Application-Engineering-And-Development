/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ronak
 */
public class ManageRestaurantsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    private Restaurant restaurantAccount;
    public ManageRestaurantsJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateRestaurantTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageRestaurantInfo1 = new javax.swing.JLabel();
        lblRestaurantPassword = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        txtRestaurantUsername = new javax.swing.JTextField();
        txtRestaurantPassword = new javax.swing.JTextField();
        btnCreateRestaurant = new javax.swing.JButton();
        lblRestaurantInfo = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        scrollRestaurantInfo = new javax.swing.JScrollPane();
        tblRestaurants = new javax.swing.JTable();
        lblRestaurantName = new javax.swing.JLabel();
        btnUpdateRestaurant = new javax.swing.JButton();
        lblRestaurantUsername = new javax.swing.JLabel();
        btnDeleteRestaurant = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblRestaurantAddress = new javax.swing.JLabel();
        txtRestaurantAddress = new javax.swing.JTextField();
        lblRestaurantNumber = new javax.swing.JLabel();
        txtRestaurantNumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 174, 65));

        lblManageRestaurantInfo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblManageRestaurantInfo1.setForeground(new java.awt.Color(102, 51, 255));
        lblManageRestaurantInfo1.setText("Create Restaurant ");

        lblRestaurantPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRestaurantPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRestaurantPassword.setText("Password:");

        txtRestaurantName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        txtRestaurantUsername.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        txtRestaurantPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        btnCreateRestaurant.setBackground(new java.awt.Color(153, 153, 255));
        btnCreateRestaurant.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCreateRestaurant.setText("Register ");
        btnCreateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRestaurantActionPerformed(evt);
            }
        });

        lblRestaurantInfo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRestaurantInfo.setForeground(new java.awt.Color(102, 51, 255));
        lblRestaurantInfo.setText("Restaurant Details");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblRestaurants.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tblRestaurants.setForeground(new java.awt.Color(153, 153, 255));
        tblRestaurants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password", "Restaurant Address", "Restaurant Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollRestaurantInfo.setViewportView(tblRestaurants);

        lblRestaurantName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRestaurantName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRestaurantName.setText("Name:");

        btnUpdateRestaurant.setBackground(new java.awt.Color(153, 153, 255));
        btnUpdateRestaurant.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUpdateRestaurant.setText("Update");
        btnUpdateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRestaurantActionPerformed(evt);
            }
        });

        lblRestaurantUsername.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRestaurantUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRestaurantUsername.setText("Username:");

        btnDeleteRestaurant.setBackground(new java.awt.Color(153, 153, 255));
        btnDeleteRestaurant.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDeleteRestaurant.setText("Delete");
        btnDeleteRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRestaurantActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 153, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblRestaurantAddress.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRestaurantAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRestaurantAddress.setText("Address:");

        txtRestaurantAddress.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lblRestaurantNumber.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblRestaurantNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRestaurantNumber.setText("Number:");

        txtRestaurantNumber.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRestaurantAddress)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRestaurantName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblRestaurantUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblRestaurantPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRestaurantUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRestaurantPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCreateRestaurant)
                                        .addGap(111, 111, 111))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRestaurantNumber)
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRestaurantInfo)
                                            .addComponent(txtRestaurantNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(441, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdateRestaurant)
                                        .addGap(268, 268, 268)
                                        .addComponent(btnDeleteRestaurant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSave))
                                    .addComponent(scrollRestaurantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(lblManageRestaurantInfo1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblManageRestaurantInfo1)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantName)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantUsername)
                    .addComponent(txtRestaurantUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantPassword)
                    .addComponent(txtRestaurantPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantAddress)
                    .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantNumber)
                    .addComponent(txtRestaurantNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateRestaurant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRestaurantInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollRestaurantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateRestaurant)
                    .addComponent(btnDeleteRestaurant)
                    .addComponent(btnSave))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRestaurantActionPerformed
        // TODO add your handling code here:
        if (txtRestaurantName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty.");
            return;
        }
        if (txtRestaurantUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.");
            return;
        }
        if (txtRestaurantPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty.");
            return;
        }
        if (txtRestaurantAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address cannot be empty.");
            return;
        } else if (txtRestaurantNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone number cannot be empty.");
            return;
        }
        String numberFormat = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        if (Pattern.compile(numberFormat).matcher(txtRestaurantNumber.getText()).matches()) {
            System.out.println("Phone number entered is correct.");
        } else {
            JOptionPane.showMessageDialog(this, "Phone Number entered is not proper, please enter the number in correct format.");
            return;
        }

        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtRestaurantUsername.getText())) {
            UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(txtRestaurantUsername.getText(), txtRestaurantPassword.getText(), null, new AdminRole());
            Restaurant restaurant = ecosystem.getRestaurantDirectory().createRestaurantUserAccount(txtRestaurantName.getText(), txtRestaurantUsername.getText(), txtRestaurantPassword.getText(), txtRestaurantAddress.getText(), txtRestaurantNumber.getText());
            populateRestaurantTable();
            txtRestaurantName.setText("");
            txtRestaurantUsername.setText("");
            txtRestaurantPassword.setText("");
            txtRestaurantAddress.setText("");
            txtRestaurantNumber.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please give a unique username for Restuarant.");
        }
    }//GEN-LAST:event_btnCreateRestaurantActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRestaurantActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurants.getSelectedRow();
        if (selectedRow >= 0) {
            String restaurantName = (String) tblRestaurants.getValueAt(selectedRow, 0);
            String restaurantUsername = (String) tblRestaurants.getValueAt(selectedRow, 1);
            String restaurantPassword = (String) tblRestaurants.getValueAt(selectedRow, 2);
            String restaurantAddress = (String) tblRestaurants.getValueAt(selectedRow, 3);
            String restaurantNumber = (String) tblRestaurants.getValueAt(selectedRow, 4);
            userAccount = ecosystem.getUserAccountDirectory().authenticateUser(restaurantUsername, restaurantPassword);
            restaurantAccount = ecosystem.getRestaurantDirectory().getRestaurant(restaurantUsername);
            txtRestaurantName.setText(restaurantName + "");
            txtRestaurantUsername.setText(restaurantUsername + "");
            txtRestaurantPassword.setText(restaurantPassword + "");
            txtRestaurantAddress.setText(restaurantAddress + "");
            txtRestaurantNumber.setText(restaurantNumber + "");
            JOptionPane.showMessageDialog(null, "Please click on the Save button to update the changes.");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to update the Restaurant User Account.");
        }
    }//GEN-LAST:event_btnUpdateRestaurantActionPerformed

    private void btnDeleteRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRestaurantActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurants.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_CANCEL_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the selected User Account?", "warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String restaurantName = (String) tblRestaurants.getValueAt(selectedRow, 0);
                String restaurantUsername = (String) tblRestaurants.getValueAt(selectedRow, 1);
                String restaurantPassword = (String) tblRestaurants.getValueAt(selectedRow, 2);
                String restaurantAddress = (String) tblRestaurants.getValueAt(selectedRow, 3);
                String restaurantNumber = (String) tblRestaurants.getValueAt(selectedRow, 4);
                UserAccount userAccount = ecosystem.getUserAccountDirectory().authenticateUser(restaurantUsername, restaurantPassword);
                Restaurant restaurantAccount = ecosystem.getRestaurantDirectory().getRestaurant(restaurantUsername);
                ecosystem.getUserAccountDirectory().deleteUserAccount(userAccount);
                ecosystem.getRestaurantDirectory().deleteRestaurantInfo(restaurantAccount.getRestaurantUsername());
                populateRestaurantTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete Restaurant Useraccount.");
        }
    }//GEN-LAST:event_btnDeleteRestaurantActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtRestaurantName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty.");
            return;
        }
        if (txtRestaurantUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.");
            return;
        }
        if (txtRestaurantPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty.");
            return;
        }
        if (txtRestaurantAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address cannot be empty.");
            return;
        } else if (txtRestaurantNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone number cannot be empty.");
            return;
        }
        String numberFormat = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        if (Pattern.compile(numberFormat).matcher(txtRestaurantNumber.getText()).matches()) {
            System.out.println("Phone number entered is correct.");
        } else {
            JOptionPane.showMessageDialog(this, "Phone Number entered is not proper, please enter the number in correct format.");
            return;
        }

        ecosystem.getUserAccountDirectory().saveUserAccount(userAccount, txtRestaurantName.getText(), txtRestaurantUsername.getText(), txtRestaurantPassword.getText());
        ecosystem.getRestaurantDirectory().updateRestaurant(restaurantAccount, txtRestaurantName.getText(), txtRestaurantUsername.getText(), txtRestaurantPassword.getText(), txtRestaurantAddress.getText(), txtRestaurantNumber.getText());
        populateRestaurantTable();
        txtRestaurantName.setText("");
        txtRestaurantUsername.setText("");
        txtRestaurantPassword.setText("");
        txtRestaurantAddress.setText("");
        txtRestaurantNumber.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    public void populateRestaurantTable() {
        DefaultTableModel restaurantModel = (DefaultTableModel) tblRestaurants.getModel();
        restaurantModel.setRowCount(0);
        for (Restaurant restaurant : ecosystem.getRestaurantDirectory().getRestaurantList()) {
            Object[] row = new Object[5];
            row[0] = restaurant.getRestaurantName();
            row[1] = restaurant.getRestaurantUsername();
            row[2] = restaurant.getRestaurantPassword();
            row[3] = restaurant.getRestaurantAddress();
            row[4] = restaurant.getRestaurantNumber();
            restaurantModel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateRestaurant;
    private javax.swing.JButton btnDeleteRestaurant;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdateRestaurant;
    private javax.swing.JLabel lblManageRestaurantInfo1;
    private javax.swing.JLabel lblRestaurantAddress;
    private javax.swing.JLabel lblRestaurantInfo;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblRestaurantNumber;
    private javax.swing.JLabel lblRestaurantPassword;
    private javax.swing.JLabel lblRestaurantUsername;
    private javax.swing.JScrollPane scrollRestaurantInfo;
    private javax.swing.JTable tblRestaurants;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtRestaurantNumber;
    private javax.swing.JTextField txtRestaurantPassword;
    private javax.swing.JTextField txtRestaurantUsername;
    // End of variables declaration//GEN-END:variables
}