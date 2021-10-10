/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Car;

/**
 *
 * @author ronak
 */
public class ViewJPanel extends javax.swing.JPanel {

    Car car;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(Car car) {
        initComponents();

        this.car = car;
//        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        search_ser_no = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        search_manufacture_by = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        search_manufacture_year = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        search_location = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fleetDtlsTable = new javax.swing.JTable();
        search_avail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        min_seats = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        max_seats = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        search_model_no = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        search_avail1 = new javax.swing.JTextField();
        search_certi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("Serial No.");

        search_ser_no.setToolTipText("Serial no.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("Manufacture By.");

        search_manufacture_by.setToolTipText("Manufacture By");
        search_manufacture_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_manufacture_byActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setText("Manufacture Year");

        search_manufacture_year.setToolTipText("Manufacture Year");
        search_manufacture_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_manufacture_yearActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("Location");

        search_location.setToolTipText("Location");
        search_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_locationActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(153, 204, 255));
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("Fleet Details");

        fleetDtlsTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fleetDtlsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Car Serial No.", "Mnf By", "Mnf Year", "Model No.", "Location", "Car Seat No.", "Availability", "Maint Certi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        fleetDtlsTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        fleetDtlsTable.setRowHeight(25);
        fleetDtlsTable.setSelectionBackground(new java.awt.Color(102, 153, 255));
        fleetDtlsTable.getTableHeader().setReorderingAllowed(false);
        fleetDtlsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fleetDtlsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(fleetDtlsTable);

        search_avail.setToolTipText("Serial no.");
        search_avail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_availActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("Available");

        min_seats.setToolTipText("Serial no.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 153, 255));
        jLabel14.setText("Seat");

        jLabel15.setText("--");

        max_seats.setToolTipText("Serial no.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("Model Number");

        search_model_no.setToolTipText("Manufacture Year");
        search_model_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_model_noActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setText("Maintenance Certified");

        search_avail1.setToolTipText("Serial no.");

        search_certi.setToolTipText("Serial no.");
        search_certi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_certiActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ronak\\Dropbox\\PC\\Downloads\\images\\taxi-service-yellow-cab-hands-260nw-557073058.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Advanced Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel7)
                        .addContainerGap(345, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_ser_no, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(min_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(max_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(search_manufacture_by, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_location, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_manufacture_year, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(search_avail, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(search_avail1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(search_certi, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(search_model_no)))
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(btnSearch)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_ser_no, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_manufacture_by, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(max_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_location, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_manufacture_year, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_model_no, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search_certi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(search_avail1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void search_manufacture_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_manufacture_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_manufacture_byActionPerformed

    private void search_manufacture_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_manufacture_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_manufacture_yearActionPerformed

    private void search_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_locationActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

        String serNo = search_ser_no.getText();
        String manufacture_by = search_manufacture_by.getText();
        String manufacture_year = search_manufacture_year.getText();
        String location = search_location.getText();
        String modelNo = search_model_no.getText();
        int minSeats;
        int maxSeats;
        boolean checkSeats = false;
        try {
            minSeats = Integer.parseInt(min_seats.getText());
            maxSeats = Integer.parseInt(max_seats.getText());
        checkSeats = true;
        } catch(NumberFormatException nfe){
            minSeats = 0;
            maxSeats = 0;
        }




        // System.out.println("search_avail.getText()search_avail.getText()" + search_avail.getText());

        boolean filterByAvailability = false;
        boolean isAvailable = false;
        if(search_avail.getText().equals("Yes")){
            filterByAvailability = true;
            isAvailable = true;
        }else if(search_avail.getText().equals("No")){
            filterByAvailability = true;
            isAvailable = false;
        }
        boolean filterByMaintenance = false;
        boolean isCertified = false;
        if(search_certi.getText().equals("Valid")){
            filterByMaintenance = true;
            isCertified = true;
        }else if(search_certi.getText().equals("Invalid")){
            filterByMaintenance = true;
            isCertified = false;
        }
        List<Car> result = new ArrayList<>();



        if (serNo.isEmpty() && manufacture_by.isEmpty() && manufacture_year.isEmpty()
            && location.isEmpty() && search_avail.getText().equals("") && modelNo.isBlank() && !checkSeats && !filterByMaintenance) {
            getAllDataCarDtlsForGrid();
        } else {
            for (Car obj : MainJFrame.carObjList) {
                if (obj.getCarSerialNo().equalsIgnoreCase(serNo) || obj.getManufactureBy().equalsIgnoreCase(manufacture_by)
                    || obj.getManufactureYear().equalsIgnoreCase(manufacture_year)
                    || obj.getLocation().equalsIgnoreCase(location)
                    || (filterByAvailability && obj.getCarAvail().equals(isAvailable))
                    || obj.getModelNo().equals(modelNo) 
                    || (checkSeats && obj.getNoOfSeats() >= minSeats && obj.getNoOfSeats() <= maxSeats)
                    || (filterByMaintenance && obj.getMainCerti().equals(isCertified))) {
                   result.add(obj);
                }
            }



        //set search data in jtable
        DefaultTableModel model = (DefaultTableModel) fleetDtlsTable.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[9];
        for (int index = 0; index < result.size(); index++) {
            Integer id = result.get(index).getId();
            System.out.println("ID " + id);
            rowData[0] = result.get(index).getId();
            rowData[1] = result.get(index).getCarSerialNo();
            rowData[2] = result.get(index).getManufactureBy();
            rowData[3] = result.get(index).getManufactureYear();
            rowData[4] = result.get(index).getModelNo();
            rowData[5] = result.get(index).getLocation();
            rowData[6] = result.get(index).getNoOfSeats();
            rowData[7] = result.get(index).getCarAvail() ? "Yes" : "No";
            rowData[8] = result.get(index).getMainCerti() ? "Valid" : "Invalid";
            model.addRow(rowData);
            }
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void fleetDtlsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fleetDtlsTableMouseClicked

    }//GEN-LAST:event_fleetDtlsTableMouseClicked

    private void search_model_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_model_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_model_noActionPerformed

    private void search_availActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_availActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_availActionPerformed

    private void search_certiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_certiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_certiActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) fleetDtlsTable.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[9];
        for (int index = 0; index < MainJFrame.carObjList.size(); index++) {
            Integer id = MainJFrame.carObjList.get(index).getId();
            System.out.println("ID " + id);
            rowData[0] = MainJFrame.carObjList.get(index).getId();
            rowData[1] = MainJFrame.carObjList.get(index).getCarSerialNo();
            rowData[2] = MainJFrame.carObjList.get(index).getManufactureBy();
            rowData[3] = MainJFrame.carObjList.get(index).getManufactureYear();
            rowData[4] = MainJFrame.carObjList.get(index).getModelNo();
            rowData[5] = MainJFrame.carObjList.get(index).getLocation();
            rowData[6] = MainJFrame.carObjList.get(index).getNoOfSeats();
            rowData[7] = MainJFrame.carObjList.get(index).getCarAvail() ? "Yes" : "No";
            rowData[8] = MainJFrame.carObjList.get(index).getMainCerti() ? "Valid" : "Invalid";
            model.addRow(rowData);

        }
    }

    public void getAllDataCarDtlsForGrid() {
        try {
            //with array
            DefaultTableModel model = (DefaultTableModel) fleetDtlsTable.getModel();
            model.setRowCount(0);
            Object rowData[] = new Object[9];
            for (int index = 0; index < MainJFrame.carObjList.size(); index++) {
                Integer id = MainJFrame.carObjList.get(index).getId();
                System.out.println("ID " + id);
                rowData[0] = MainJFrame.carObjList.get(index).getId();
                rowData[1] = MainJFrame.carObjList.get(index).getCarSerialNo();
                rowData[2] = MainJFrame.carObjList.get(index).getManufactureBy();
                rowData[3] = MainJFrame.carObjList.get(index).getManufactureYear();
                rowData[4] = MainJFrame.carObjList.get(index).getModelNo();
                rowData[5] = MainJFrame.carObjList.get(index).getLocation();
                rowData[6] = MainJFrame.carObjList.get(index).getNoOfSeats();
                rowData[7] = MainJFrame.carObjList.get(index).getCarAvail() ? "Yes" : "No";
                rowData[8] = MainJFrame.carObjList.get(index).getMainCerti() ? "Valid" : "Invalid";
                model.addRow(rowData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JTable fleetDtlsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField max_seats;
    private javax.swing.JTextField min_seats;
    private javax.swing.JTextField search_avail;
    private javax.swing.JTextField search_avail1;
    private javax.swing.JTextField search_certi;
    private javax.swing.JTextField search_location;
    private javax.swing.JTextField search_manufacture_by;
    private javax.swing.JTextField search_manufacture_year;
    private javax.swing.JTextField search_model_no;
    private javax.swing.JTextField search_ser_no;
    // End of variables declaration//GEN-END:variables
}
