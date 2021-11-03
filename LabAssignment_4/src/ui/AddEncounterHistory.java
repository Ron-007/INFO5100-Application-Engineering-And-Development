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
import model.Encounter;
import model.EncounterHistory;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author ronak
 */
public class AddEncounterHistory extends javax.swing.JPanel {

    /**
     * Creates new form AddEncounterHistory
     */
    
     PatientDirectory history;
    City city;
    public AddEncounterHistory(PatientDirectory history,City city) {
        initComponents();
        
        this.history = history;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRespiratoryRate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHR = new javax.swing.JTextField();
        Weigh = new javax.swing.JLabel();
        Weight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        btnUpdateVital = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Update Patient Vital signs");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Respiratory");

        txtRespiratoryRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRespiratoryRateKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Heart Rate");

        txtHR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHRKeyReleased(evt);
            }
        });

        Weigh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Weigh.setForeground(new java.awt.Color(51, 102, 255));
        Weigh.setText("Weight");

        Weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WeightKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("Blood Pressure");

        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBPKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Temperature");

        txtTemperature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTemperatureKeyReleased(evt);
            }
        });

        btnUpdateVital.setBackground(new java.awt.Color(153, 204, 255));
        btnUpdateVital.setText("Update");
        btnUpdateVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateVitalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Patient ID");

        txtPatientID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPatientIDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Weigh)
                                .addComponent(jLabel7)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(49, 49, 49)
                                .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149)))
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(btnUpdateVital)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Weigh)
                            .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(38, 38, 38)
                .addComponent(btnUpdateVital)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateVitalActionPerformed
        // TODO add your handling code here:

        Integer id = Integer.parseInt(txtPatientID.getText());
         
        Integer bp = Integer.parseInt(txtBP.getText());
      Integer pulse = Integer.parseInt(txtHR.getText());
      Integer bt = Integer.parseInt(txtTemperature.getText());
      Integer respiration = Integer.parseInt(txtRespiratoryRate.getText());
      Integer weight = Integer.parseInt(txtRespiratoryRate.getText());
    String timestamp = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(Calendar.getInstance().getTime());

  

for(int i=0; i<history.getPatientList().size(); i++)
{
   int patientid = (history.getPatientList().get(i).getPatientID());
    if(id == patientid)
    {
      EncounterHistory eh=history.getPatientList().get(i).getEncounterHistory();
    VitalSigns signs = new VitalSigns( pulse,bp,weight,respiration,bt);
      Encounter encounter=new Encounter(signs,timestamp);
       eh.addNewEncounter(encounter);
        
    

JOptionPane.showMessageDialog(this,"New vitals added for the patient.");
      
     
      txtPatientID.setText("");
      txtBP.setText("");
      txtHR.setText("");
      txtBP.setText("");
      txtRespiratoryRate.setText("");
      Weight.setText("");
}  
}
    }//GEN-LAST:event_btnUpdateVitalActionPerformed

    private void txtRespiratoryRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespiratoryRateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespiratoryRateKeyReleased

    private void txtHRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHRKeyReleased
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtHRKeyReleased

    private void WeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WeightKeyReleased
        // TODO add your handling code here: 
    }//GEN-LAST:event_WeightKeyReleased

    private void txtBPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPKeyReleased

    private void txtTemperatureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureKeyReleased

    private void txtPatientIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIDKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPatientIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Weigh;
    private javax.swing.JTextField Weight;
    private javax.swing.JButton btnUpdateVital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtHR;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
