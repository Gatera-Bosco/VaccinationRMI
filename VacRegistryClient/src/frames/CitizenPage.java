package frames;

import java.rmi.registry.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import model.*;
import service.VacRegInterface;

public class CitizenPage extends javax.swing.JInternalFrame {
    
    public CitizenPage() {
        initComponents();
        showTableData("unvac");
        showTableData("vac");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        citizenID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namesField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        citizenBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vacTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        unVacTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setText("CITIZEN REGISTRATION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Citizen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 1, 12))); // NOI18N

        jLabel2.setText("Citizen Id");

        jLabel3.setText("Fullnames");

        jLabel4.setText("Phone No.");

        citizenBtn.setText("Save Citizen");
        citizenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citizenBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(citizenID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namesField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(citizenBtn)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(citizenID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namesField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(citizenBtn)
                .addContainerGap())
        );

        vacTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullnames", "Phone", "Brand", "Vac. Date"
            }
        ));
        jScrollPane1.setViewportView(vacTable);

        jLabel5.setText("Vaccinated Citizens");

        jLabel6.setText("Unvaccinated Citizens");

        unVacTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullnames", "Phone", "Brand", "Vac. Date"
            }
        ));
        jScrollPane2.setViewportView(unVacTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(jLabel6))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void saveCitizen() {
        try {
            //GETTING THE CREATED REGISTRY AND ADDING THE PATH AND PORT FROM SERVER
            Registry registry = LocateRegistry.getRegistry("localhost", 4050);

            //LOOKING UP FOR THE REGISTRY NAME
            VacRegInterface vacReg = (VacRegInterface) registry.lookup("vacservice");
            String id = citizenID.getText();
            String name = namesField.getText();
            String phone = phoneField.getText();
            
            Citizen cit = new Citizen(id, name, phone);
            
            vacReg.saveCitizen(cit);
            JOptionPane.showMessageDialog(null, "Saved Successfully!");
            citizenID.setText("");
            namesField.setText("");
            phoneField.setText("");

            //UPDATE TABLE
            DefaultTableModel model = (DefaultTableModel) unVacTable.getModel();
            model.setRowCount(0);
            showTableData("unvac");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showTableData(String type) {
        try {
            //GETTING THE CREATED REGISTRY AND ADDING THE PATH AND PORT FROM SERVER
            Registry registry = LocateRegistry.getRegistry("localhost", 4050);

            //LOOKING UP FOR THE REGISTRY NAME
            VacRegInterface vacReg = (VacRegInterface) registry.lookup("vacservice");

            //GETTING FACULTIES/MASTERS FROM THE INTERFACE
            List result = vacReg.showTableData(type);
            
            DefaultTableModel model;
            if (type.equals("unvac")) {
                model = (DefaultTableModel) unVacTable.getModel();
            } else {
                model = (DefaultTableModel) vacTable.getModel();
            }
            
            Object[] tblRow = new Object[5];
            for (Object object : result) {
                Map row = (Map) object;
                tblRow[0] = row.get("citizenid");
                tblRow[1] = row.get("fullname");
                tblRow[2] = row.get("phonenumber");
                if (type.equals("unvac")) {
                    tblRow[3] = "-";
                    tblRow[4] = "-";
                } else {
                    tblRow[3] = row.get("brand");
                    tblRow[4] = row.get("vacdate");
                }
                
                model.addRow(tblRow);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void citizenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citizenBtnActionPerformed
        saveCitizen();
    }//GEN-LAST:event_citizenBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton citizenBtn;
    private javax.swing.JTextField citizenID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField namesField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTable unVacTable;
    private javax.swing.JTable vacTable;
    // End of variables declaration//GEN-END:variables
}
