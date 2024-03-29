/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Order;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ronak
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {
 Order order;
 EcoSystem ecoSystem;
    JPanel userProcessContainer;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, Order order, EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.order = order;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDeliveryStatus = new javax.swing.JLabel();
        btnStatusUpdated = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 174, 65));

        lblDeliveryStatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDeliveryStatus.setForeground(new java.awt.Color(102, 51, 255));
        lblDeliveryStatus.setText("Update Delivery Status");

        btnStatusUpdated.setBackground(new java.awt.Color(153, 153, 255));
        btnStatusUpdated.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnStatusUpdated.setText("Update");
        btnStatusUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusUpdatedActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblStatus.setText("Status:");

        txtStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        backJButton.setBackground(new java.awt.Color(153, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(265, 265, 265)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatusUpdated)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblStatus)
                            .addGap(29, 29, 29)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblDeliveryStatus)))
                .addGap(0, 280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(lblDeliveryStatus))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnStatusUpdated)
                .addContainerGap(414, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusUpdatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusUpdatedActionPerformed
        if (txtStatus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Status cannot be empty.");
            return;
        }
        order.setStatus("Order Delivered");
        Customer customer = ecoSystem.getCustomerDirectory().getCustomer(order.getCustomerName());
        for (Order ord : customer.getOrderList()) {
            if (ord.getOrderId().equalsIgnoreCase(order.getOrderId())) {
                ord.setStatus("Ordered Delivered");
                JOptionPane.showMessageDialog(null, "Order Delivered.");
            }
        }
        JOptionPane.showMessageDialog(null, "Status Updated Successfully.");
    }//GEN-LAST:event_btnStatusUpdatedActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DeliveryManWorkAreaJPanel deliveryManWorkAreaJPanel = (DeliveryManWorkAreaJPanel) component;
        deliveryManWorkAreaJPanel.populateDelTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnStatusUpdated;
    private javax.swing.JLabel lblDeliveryStatus;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
