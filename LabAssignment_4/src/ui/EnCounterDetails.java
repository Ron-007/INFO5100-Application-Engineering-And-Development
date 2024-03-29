/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author ronak
 */
public class EnCounterDetails extends javax.swing.JPanel {

    /**
     * Creates new form EnCounterDetails
     */
     PatientDirectory pDirectory;
    City city;
    public EnCounterDetails(PatientDirectory history,City city) {
        initComponents();
         this.pDirectory = history;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        btnViewHis = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Encounter History of Patient");

        tblHistory.setBackground(new java.awt.Color(153, 255, 255));
        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Temperature", "Heart Rate", "Respiratory Rate", "Blood Pressure", "Weight", "Time Stamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistory);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Patient ID:");

        btnViewHis.setBackground(new java.awt.Color(153, 204, 255));
        btnViewHis.setText("View History");
        btnViewHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btnViewHis)))))
                        .addGap(0, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnViewHis)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     private void addObjectToRow(Patient p)
    {
        DefaultTableModel model = (DefaultTableModel)tblHistory.getModel();
        model.setRowCount(0);
        for(Encounter e: p.getEncounterHistory().getEncounterHistory())
        {
            Object[] object=
             {           
            p.getName(),
            p.getPatientID(),
            e.getVitalSigns().getTemperature(),
            e.getVitalSigns().getHR(),
            e.getVitalSigns().getRespiratoryRate(),
            e.getVitalSigns().getBloodPressure(),
            e.getVitalSigns().getWeight(),
            e.getDateOfEncounter()
             };
            model.addRow(object); 
        }
        
    }
    
    private void btnViewHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHisActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblHistory.getModel();
      
        model.setRowCount(0);
        
        Integer id = Integer.parseInt(txtPatientID.getText());
            
            if (id == null){
            
             JOptionPane.showMessageDialog(this,"Enter all values for the search!","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        List<Patient> filteredPatients = pDirectory.getPatientList().stream()
                .filter(p -> p.getPatientID().equals(id) 
                        )
                .collect(Collectors.toList());
        if(filteredPatients.isEmpty()){
            JOptionPane.showMessageDialog(this,"No record exists for "
                    + "given values!!","ERROR",JOptionPane.ERROR_MESSAGE );
        }else{
            for(Patient patient: filteredPatients){
                addObjectToRow(patient);
            }
        }
        
//        for(int i=0; i<pDirectory.getPatientList().size(); i++){ 
//            
//            Patient p=pDirectory.getPatientList().get(i);
//            if (id==p.getPatientID() || name==p.getName()){
//                          
//                addObjectToRow(p);
//     
//            }
//           
//            
//            else{
//             JOptionPane.showMessageDialog(this,"No record exists for given values!!","ERROR",JOptionPane.ERROR_MESSAGE );
//                
//            }
//        }
    }//GEN-LAST:event_btnViewHisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewHis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTextField txtPatientID;
    // End of variables declaration//GEN-END:variables
}
