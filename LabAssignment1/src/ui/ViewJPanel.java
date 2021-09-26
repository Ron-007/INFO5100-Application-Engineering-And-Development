/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Profile;

/**
 *
 * @author ronak
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel1
     */
    
    Profile profile;
    public ViewJPanel(Profile profile) {
        initComponents();
        this.profile = profile;
        displayProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDeviceIdentifier = new javax.swing.JTextField();
        lblLinkedIn = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblIPAdd = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        txtGeoData = new javax.swing.JTextField();
        lblTelNum = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtMedRecord = new javax.swing.JTextField();
        lblMedRecord = new javax.swing.JLabel();
        txtHealthBenf = new javax.swing.JTextField();
        txtIPAdd = new javax.swing.JTextField();
        lblGeoData = new javax.swing.JLabel();
        lblHealthBenf = new javax.swing.JLabel();
        txtBankAcc = new javax.swing.JTextField();
        lblBankAcc = new javax.swing.JLabel();
        txtCertiNum = new javax.swing.JTextField();
        lblCertiNum = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        lblLicensePlate = new javax.swing.JLabel();
        lblDeviceIdentifier = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtTelNum = new javax.swing.JTextField();

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name");

        txtDeviceIdentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceIdentifierActionPerformed(evt);
            }
        });

        lblLinkedIn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLinkedIn.setText("LinkedIn");

        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSSN.setText("Social Security number");

        lblIPAdd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIPAdd.setText("IP Address");

        lblDob.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDob.setText("Date of birth");

        lblTelNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelNum.setText("Telephone Number");

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("EmailID");

        txtMedRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedRecordActionPerformed(evt);
            }
        });

        lblMedRecord.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedRecord.setText("Medical record number");

        txtHealthBenf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthBenfActionPerformed(evt);
            }
        });

        lblGeoData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGeoData.setText("Geographic Data");

        lblHealthBenf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHealthBenf.setText("Health plan beneficiary number");

        lblBankAcc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBankAcc.setText("Bank account number");

        lblCertiNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCertiNum.setText("Certificate/license number");

        lblLicensePlate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLicensePlate.setText("License plate");

        lblDeviceIdentifier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeviceIdentifier.setText("Device identifier");

        lblFax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFax.setText("Fax Number");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblGeoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addComponent(lblMedRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMedRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                    .addComponent(txtFax, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGeoData, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblLinkedIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDeviceIdentifier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLicensePlate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCertiNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(lblBankAcc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHealthBenf, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(lblIPAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLinkedIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLicensePlate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCertiNum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBankAcc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHealthBenf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIPAdd)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelNum))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelNum)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(40, 40, 40)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(518, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDob)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelNum)
                                .addComponent(txtTelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGeoData))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFax)
                                .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSSN)
                                .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMedRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMedRecord))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblHealthBenf)
                                .addComponent(txtHealthBenf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBankAcc)
                                .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCertiNum)
                                .addComponent(txtCertiNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLicensePlate)
                                .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDeviceIdentifier)
                                .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLinkedIn)
                                .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(61, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeviceIdentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceIdentifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceIdentifierActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtMedRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedRecordActionPerformed

    private void txtHealthBenfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthBenfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthBenfActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBankAcc;
    private javax.swing.JLabel lblCertiNum;
    private javax.swing.JLabel lblDeviceIdentifier;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblGeoData;
    private javax.swing.JLabel lblHealthBenf;
    private javax.swing.JLabel lblIPAdd;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedRecord;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBankAcc;
    private javax.swing.JTextField txtCertiNum;
    private javax.swing.JTextField txtDeviceIdentifier;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtGeoData;
    private javax.swing.JTextField txtHealthBenf;
    private javax.swing.JTextField txtIPAdd;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedRecord;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelNum;
    // End of variables declaration//GEN-END:variables
private void displayProfile() {
        
        txtName.setText(profile.getName());
        txtDob.setText(profile.getDob());
        txtTelNum.setText(Long.toString(profile.getTeleNum()));
        txtEmail.setText(profile.getEmail());
        txtGeoData.setText(profile.getGeodata());
        txtFax.setText(Long.toString(profile.getFax()));
        txtSSN.setText(Long.toString(profile.getSsn()));
        txtMedRecord.setText(Long.toString(profile.getMedRecordNum()));
        txtHealthBenf.setText(Long.toString(profile.getHealtBenfNum()));
        txtBankAcc.setText(Long.toString(profile.getBankAccount()));
        txtCertiNum.setText(profile.getCertificateNum());
        txtLicensePlate.setText(profile.getLicensePlate());
        txtDeviceIdentifier.setText(Long.toString(profile.getDeviceIdentifier()));
        txtLinkedIn.setText(profile.getLinkedin());
        txtIPAdd.setText(profile.getIpAddress());
        lblPhoto.setIcon(profile.getImage());
        
    }
}

