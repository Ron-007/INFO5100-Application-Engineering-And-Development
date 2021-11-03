/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author ronak
 */
public class CreatePatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientPanel
     */
     PatientDirectory plist;
    City city;
    public CreatePatientPanel(PatientDirectory plist,City city) {
        initComponents();
         this.plist = plist;
        this.city=city;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Weigh = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRespiratoryRate = new javax.swing.JTextField();
        txtHR = new javax.swing.JTextField();
        Weight = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCityVal = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblRespiratory = new javax.swing.JLabel();
        lblHR = new javax.swing.JLabel();
        lblWeightVal = new javax.swing.JLabel();
        lblBPVal = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(51, 102, 255));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Add Patient Details");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 102, 255));
        jLabel19.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 102, 255));
        jLabel20.setText("Age");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Email ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("City");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Community");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Patient ID");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });
        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCommunityKeyReleased(evt);
            }
        });

        txtPatientID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPatientIDKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Respiratory");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Heart Rate");

        Weigh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Weigh.setForeground(new java.awt.Color(51, 102, 255));
        Weigh.setText("Weight");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("Blood Pressure");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Temperature");

        txtRespiratoryRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRespiratoryRateKeyReleased(evt);
            }
        });

        txtHR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHRKeyReleased(evt);
            }
        });

        Weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WeightKeyReleased(evt);
            }
        });

        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBPKeyReleased(evt);
            }
        });

        txtTemperature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTemperatureKeyReleased(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 204, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Address");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("Enter Personal Details");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("Enter Vital Sign Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel1))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Weight, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(txtHR)
                                    .addComponent(txtRespiratoryRate)
                                    .addComponent(txtEmail)
                                    .addComponent(txtAge)
                                    .addComponent(txtName))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHR, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRespiratory)
                                            .addComponent(lblWeightVal)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAge)
                                            .addComponent(lblName)
                                            .addComponent(lblEmail)
                                            .addComponent(lblAddress)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCityVal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(Weigh)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(328, 328, 328)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel8))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBPVal)
                                            .addComponent(lblTemperature)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCity)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCommunity)
                                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPatientID)
                                                    .addComponent(lblCommunity)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity, txtCommunity, txtPatientID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel17)
                .addGap(36, 36, 36)
                .addComponent(jLabel21)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblName)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPatientID)
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblCityVal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunity))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(lblAddress)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRespiratory)
                            .addComponent(lblBPVal))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTemperature)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Weigh)
                    .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeightVal))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
      if(!validateInput()){
          JOptionPane.showMessageDialog(this,"Enter valid details.");
      }
         String name = txtName.getText();
      Integer id = Integer.parseInt(txtPatientID.getText());
      Integer age = Integer.parseInt(txtAge.getText());
      String email = txtEmail.getText();
      String residence = txtAddress.getText();
      String community = txtCommunity.getText();
      Community c1=city.getCommunity(community);
       House house=new House(residence);
      if(c1.getCommunityName()!=null)
      {
          c1.addHouse(house);
          System.out.println("Old community found:"+c1.getCommunityName());
      }
      else
      {
           c1.setCommunityName(community);
          c1.addHouse(house);
          city.addCommunity(c1);
          
            System.out.println("New community added:"+c1.getCommunityName());
            
      }
      
      
      Integer bp = Integer.parseInt(txtBP.getText());
      Integer pulse = Integer.parseInt(txtHR.getText());
      Integer bt = Integer.parseInt(txtTemperature.getText());
      Integer respiration = Integer.parseInt(txtRespiratoryRate.getText());
      Integer weight= Integer.parseInt(Weight.getText());
      
      String timestamp = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(Calendar.getInstance().getTime());
      
      EncounterHistory encounterHistory = new EncounterHistory();
      VitalSigns vitalSigns = new VitalSigns( pulse,bp,weight,respiration,bt);
      Encounter  encounter = new Encounter(vitalSigns,timestamp );
      encounterHistory.addNewEncounter(encounter);
      Patient pat=new Patient(encounterHistory,name,id,age,email,city,house,c1);
      plist.addPatient(pat);
    
      
      JOptionPane.showMessageDialog(this,"New Patient added.");
      
      txtName.setText("");
      txtPatientID.setText("");
      txtAge.setText("");
      txtEmail.setText("");
      txtAddress.setText("");
      txtCommunity.setText("");
      txtCity.setText("");
      txtBP.setText("");
      txtHR.setText("");
      txtTemperature.setText("");
      txtRespiratoryRate.setText("");
      Weight.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    
    private boolean validateInput(){
        if(txtName.getText().isEmpty()||txtPatientID.getText().isEmpty()||txtAge.getText().isEmpty()
                ||txtEmail.getText().isEmpty()||txtAddress.getText().isEmpty()||txtCommunity.getText().isEmpty()
                ||txtCity.getText().isEmpty()||txtBP.getText().isEmpty()||txtHR.getText().isEmpty()||txtTemperature.getText().isEmpty()
                ||txtRespiratoryRate.getText().isEmpty()||Weight.getText().isEmpty()){
            return false;
            
        }
        return true;    
    }
    
    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
           String checkName=txtName.getText();
       
        Pattern pattern=Pattern.compile("^[a-zA-Z]{1,50}$");

        Matcher matchPattern=pattern.matcher(checkName);
            if(!matchPattern.matches())
            {
                lblName.setText("Please enter correct name.");
            }
            else
            {
                lblName.setText(null);
            }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String checkAge=txtAge.getText();
       
        Pattern pattern=Pattern.compile("^[0-9]{2}$");

        Matcher matchPattern=pattern.matcher(checkAge);
            if(!matchPattern.matches())
            {
                lblAge.setText("Please Enter Valid Age." );
            
            }
            else{
                lblAge.setText(null);
            }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        String checkEmailAddress=txtEmail.getText();
      
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher matchPattern=pattern.matcher(checkEmailAddress);
            if(!matchPattern.matches())
            {
            JOptionPane.showMessageDialog(this," Please Enter Valid Email Address. ");
            }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        String checkName=txtName.getText();
       
        Pattern pattern=Pattern.compile("^[a-zA-Z]{1,50}$");

        Matcher matchPattern=pattern.matcher(checkName);
            if(!matchPattern.matches())
            {
                lblCityVal.setText("Please enter correct city name.");
            }
            else
            {
                lblCityVal.setText(null);
            }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtCommunityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyReleased
        // TODO add your handling code here:
         String checkName=txtName.getText();
       
        Pattern pattern=Pattern.compile("^[a-zA-Z]{1,50}$");

        Matcher matchPattern=pattern.matcher(checkName);
            if(!matchPattern.matches())
            {
                lblCommunity.setText("Please enter correct community name.");
            }
            else
            {
                lblCommunity.setText(null);
            }
    }//GEN-LAST:event_txtCommunityKeyReleased

    private void txtPatientIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIDKeyReleased
        // TODO add your handling code here:
        String checkAge=txtPatientID.getText();
       
        Pattern pattern=Pattern.compile("^[0-9]{1}$");

        Matcher matchPattern=pattern.matcher(checkAge);
            if(!matchPattern.matches())
            {
                lblPatientID.setText("Please Enter Valid number." );
            
            }
            else{
                lblPatientID.setText(null);
            }
        
    }//GEN-LAST:event_txtPatientIDKeyReleased

    private void txtRespiratoryRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespiratoryRateKeyReleased
        // TODO add your handling code here:
//          String check=txtRespiratoryRate.getText();
//       
//        Pattern pattern=Pattern.compile("^[0-9]{2}$");
//
//        Matcher matchPattern=pattern.matcher(check);
//            if(!matchPattern.matches())
//            {
//                lblRespiratory.setText("Please Enter Valid number." );
//            
//            }
//            else{
//                lblRespiratory.setText(null);
//            }
    }//GEN-LAST:event_txtRespiratoryRateKeyReleased

    private void txtBPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyReleased
        // TODO add your handling code here:
//        String check=txtBP.getText();
//       
//        Pattern pattern=Pattern.compile("^[0-9]{2}$");
//
//        Matcher matchPattern=pattern.matcher(check);
//            if(!matchPattern.matches())
//            {
//                lblBPVal.setText("Please Enter Valid number." );
//            
//            }
//            else{
//                lblBPVal.setText(null);
//            }
//        
    }//GEN-LAST:event_txtBPKeyReleased

    private void txtHRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHRKeyReleased
        // TODO add your handling code here:
//         String check=txtHR.getText();
//       
//        Pattern pattern=Pattern.compile("^[0-9]{2}$");
//
//        Matcher matchPattern=pattern.matcher(check);
//            if(!matchPattern.matches())
//            {
//                lblHR.setText("Please Enter Valid number." );
//            
//            }
//            else{
//                lblHR.setText(null);
//            }
//        
    }//GEN-LAST:event_txtHRKeyReleased

    private void txtTemperatureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureKeyReleased
        // TODO add your handling code here:
//        
//        String check=txtTemperature.getText();
//       
//        Pattern pattern=Pattern.compile("^[0-9]{2}$");
//
//        Matcher matchPattern=pattern.matcher(check);
//            if(!matchPattern.matches())
//            {
//                lblTemperature.setText("Please Enter Valid number." );
//            
//            }
//            else{
//                lblTemperature.setText(null);
//            }
    }//GEN-LAST:event_txtTemperatureKeyReleased

    private void WeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WeightKeyReleased
        // TODO add your handling code here:
//        
//        
//        String check=Weight.getText();
//       
//        Pattern pattern=Pattern.compile("^[0-9]{2}$");
//
//        Matcher matchPattern=pattern.matcher(check);
//            if(!matchPattern.matches())
//            {
//                lblWeightVal.setText("Please Enter Valid number." );
//            
//            }
//            else{
//                lblWeightVal.setText(null);
//            }
//        
    }//GEN-LAST:event_WeightKeyReleased

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Weigh;
    private javax.swing.JTextField Weight;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBPVal;
    private javax.swing.JLabel lblCityVal;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHR;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblRespiratory;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblWeightVal;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHR;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
