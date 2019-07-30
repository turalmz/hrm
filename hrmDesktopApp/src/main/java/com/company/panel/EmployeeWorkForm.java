/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.panel;


import com.company.HrmDesktopAppApplication;
import com.company.entity.EmployeeMonth;
import com.company.entity.EmployeeMonthHours;
import com.company.service.inter.EmployeesServiceInter;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import com.company.entity.Employees;
import com.company.service.inter.EmployeeMonthHoursServiceInter;
import com.company.service.inter.EmployeeMonthServiceInter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author TURAL
 */
public class EmployeeWorkForm extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    
    List<Integer> listSelected =  new ArrayList<Integer>();
    HashMap<Integer, HashMap<Integer,Object>> hmap = new HashMap<Integer, HashMap<Integer,Object>>();
    HashMap<Integer, String> hmapStatus = new HashMap<Integer, String>();

    HashMap<Integer,Object> helement = null;
    
    private final EmployeeMonthServiceInter employeeDao = HrmDesktopAppApplication.employeeMonthService;
    private final EmployeeMonthHoursServiceInter employeehoursDao = HrmDesktopAppApplication.employeeMonthHoursService;
    private final EmployeesServiceInter empDao = HrmDesktopAppApplication.employeeService;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public EmployeeWorkForm() {
        initComponents();
        ///alma();
        
        cbEmp.removeAllItems();

        for (Employees con : empDao.getAll()) {
            cbEmp.addItem(con);
        }

    }
    public void alma(){
        generateEmployees();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    private void generateEmployees() {
        List<EmployeeMonth> users = employeeDao.getAll();
        //DefaultTableModel tableModel = new DefaultTableModel();

        Vector vectorHeaders = new Vector();

        vectorHeaders.add("ID");
        vectorHeaders.add("Employee");
        vectorHeaders.add("Hours");
        vectorHeaders.add("Month");
        vectorHeaders.add("1");
        vectorHeaders.add("2");
        vectorHeaders.add("3");
        vectorHeaders.add("4");
        vectorHeaders.add("5");
        vectorHeaders.add("6");
        vectorHeaders.add("7");
        vectorHeaders.add("8");
        vectorHeaders.add("9");
        vectorHeaders.add("10");
        vectorHeaders.add("11");
        vectorHeaders.add("12");
        vectorHeaders.add("13");
        vectorHeaders.add("14");
        vectorHeaders.add("15");
        vectorHeaders.add("16");
        vectorHeaders.add("17");
        vectorHeaders.add("18");
        vectorHeaders.add("19");
        vectorHeaders.add("20");
        vectorHeaders.add("21");
        vectorHeaders.add("22");
        vectorHeaders.add("23");
        vectorHeaders.add("24");
        vectorHeaders.add("25");
        vectorHeaders.add("26");
        vectorHeaders.add("27");
        vectorHeaders.add("28");
        vectorHeaders.add("29");
        vectorHeaders.add("30");
        vectorHeaders.add("31");

        

        Vector vectorRows = new Vector();
        for (EmployeeMonth us : users) {

            Vector row = new Vector();
            
            row.add(us.getId());
            

            row.add(us.getEmpId());
            //row.add(us.getEmpId());
            
            row.add(us.getHours());
            
            row.add(us.getMonthId());
            
            List<EmployeeMonthHours> lst = us.getEmployeeMonthHoursList();

            for (int i=1;i<=31;i++ ){

                boolean exists = false;

                for (EmployeeMonthHours e :lst){

                    System.out.println("number day - "+i);
                    if(i==e.getDay() && e.getHours()!=null){
                        System.out.println("equal");
                        
                        if(e.getHours()==8)
                            exists=true;
                        else 
                            exists=false;
                        break;
                    }else{
                        exists=false;
                    }

                }
                
                if(exists==true){
                row.add(Boolean.TRUE);
                
                }else{
                row.add(Boolean.FALSE);
                
                }
                
            }
            

            
            vectorRows.add(row);
        }
        
        DefaultTableModel tableModel = new DefaultTableModel(vectorRows, vectorHeaders){
        @Override
        public Class<?> getColumnClass(int col) {
            if(col >= 4 && col<35){
                    return Boolean.class;
                }
                return super.getColumnClass(col);
            }
        };
        
        //tableModel.setDataVector(vectorRows, vectorHeaders);
        tblUsers.setModel(tableModel);
        
        TableColumn sportColumn = tblUsers.getColumnModel().getColumn(1);
//        JComboBox comboBox = new JComboBox();
//        comboBox.addItem("Snowboarding");
//        comboBox.addItem("Rowing");
//        comboBox.addItem("Chasing toddlers");
//        comboBox.addItem("Speed reading");
//        comboBox.addItem("Teaching high school");
//        comboBox.addItem("None");
        //sportColumn.setCellEditor(new DefaultCellEditor(comboBox));
        sportColumn.setCellEditor(new DefaultCellEditor(cbEmp));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        cbEmp = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRemove.setText("remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnRemove)))
        );

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        generateEmployees();


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        
        
        
        int column = 0;

        for (int row : tblUsers.getSelectedRows()) {
            System.out.println("Count : " + row);
            String value = tblUsers.getModel().getValueAt(row, column).toString();
            System.out.println("value : " + value);
            System.out.println("row : " + row);

            employeeDao.removeEmployeeMonth(Integer.parseInt(value));

        }
        generateEmployees();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        EmployeeForm uf = new EmployeeForm();
        uf.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int column = 0;

        int row = tblUsers.getSelectedRow();
        System.out.println("Count : " + row);
        if (row > -1) {

            String value = tblUsers.getModel().getValueAt(row, column).toString();
            listSelected.add(row);
            hmap.put(row,hmap.get(row) );
            System.err.println("--------list----------");
            System.err.println(listSelected);
            System.err.println("----------------------");
            System.err.println("--------hmap----------");
            System.err.println(hmap);
            
            System.err.println("----------------------");

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        // TODO add you            
        
        int row = tblUsers.rowAtPoint(evt.getPoint());
        int col = tblUsers.columnAtPoint(evt.getPoint());
                System.out.println("Count : " + row);

        if (row >= 0 && col >= 0) {
            
            Boolean value = (Boolean) tblUsers.getModel().getValueAt(row, col);
            
            row = (Integer) tblUsers.getModel().getValueAt(row, 0);
            listSelected.add(row);
            
            Object h = hmap.get(row);
            
            if(h == null){
            
                helement = new HashMap<Integer, Object>();
                hmap.get(row);
            }

            System.err.println("----------------------");

            System.err.println("--------hmap----------");
            System.err.println(hmap);
            helement.put(col-3,value);
            System.err.print("print - "+(col-3));
            hmap.put(row, helement);
            
            hmapStatus.put(row, "update");
            
            for (Map.Entry<Integer, HashMap<Integer,Object>> entry : hmap.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
                
                for (Map.Entry<Integer,Object> entr : entry.getValue().entrySet()) {
                    System.out.println(entr.getKey()+" : "+entr.getValue());
                } 
                
            } 

            
            System.err.println("----------------------");

            System.err.println("--------hmapStatus----------");
            
            
            for (Map.Entry<Integer,String> entr : hmapStatus.entrySet()) {
                System.out.println(entr.getKey()+" : "+entr.getValue());
            } 
            
            System.err.println("----------------------");
            
            
        }
        
        

    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        for (Map.Entry<Integer, HashMap<Integer,Object>> entry : hmap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
            Object status = hmapStatus.get(entry.getKey());
            
            if(status == "delete"){
                employeeDao.removeEmployeeMonth(Integer.parseInt(entry.getKey().toString()));
            }else if(status=="update"){
                
                System.err.println("entry value");
                
                System.err.print(entry.getValue());
                
                Integer ind = Integer.parseInt(entry.getKey().toString());
                

                
                System.err.println("index:");

                System.err.println(ind);

                
                EmployeeMonth empMon = employeeDao.getById(ind);
                
                
                
                if(empMon==null){
                
                    System.err.println("I am in empMon is null");           
                    
                //employeeDao.addEmployeeMonth(new EmployeeMonth().setEmpId(empId));
                
                
                }
                
                if(empMon!=null){
                
                    System.err.println("I am in empMon is not null");
                            
                        //emMonHors.setHours(8);
                        for (Map.Entry<Integer,Object> entr : entry.getValue().entrySet()) {
                            System.err.println("val"+entr);
                            EmployeeMonthHours emhors = this.getEmployeeMonthHours(empMon, entr.getKey());
                            emhors.setHours(8);
                            emhors.setMonthId(empMon.getMonthId());
                            
                           
                            employeehoursDao.addEmployeeMonthHours(emhors);
                            System.out.println(entr.getKey()+" : "+entr.getValue());
                        } 


                }
            }


                
        } 
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private EmployeeMonthHours getEmployeeMonthHours(EmployeeMonth empMon, Integer day){
        

        
        
        List<EmployeeMonthHours> emMonHorsList =  empMon.getEmployeeMonthHoursList();
        
        
        if(emMonHorsList!=null){
        
        
            for(EmployeeMonthHours emMonHors : emMonHorsList){

                if(day==emMonHors.getDay()){
                    System.out.println("exists : "+emMonHors.getDay());

                    return emMonHors;
                } 
            }
        }else{
        
            emMonHorsList =  new ArrayList<EmployeeMonthHours>();
            
            
        }
        
        EmployeeMonthHours newEmpMonHours = new EmployeeMonthHours();
        
        newEmpMonHours.setEmpId(empMon.getEmpId());
        newEmpMonHours.setEmpMonthId(empMon);
        newEmpMonHours.setDay(day);
        //newEmpMonHours.setEmpMonthId(empMon);
        
        emMonHorsList.add(newEmpMonHours);
        
        empMon.setEmployeeMonthHoursList(emMonHorsList );
        
        return newEmpMonHours;
    }
    
    
    
    
    
    
    
    
    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int column = 0;

        for (int row : tblUsers.getSelectedRows()) {
            System.out.println("Count : " + row);
            String value = tblUsers.getModel().getValueAt(row, column).toString();
            System.out.println("value : " + value);
            System.out.println("row : " + row);

            

            System.err.println("--------hmapStatus----------");
            
            hmapStatus.put(row, "delete");
            
            hmap.put(row, (HashMap<Integer, Object>) new HashMap<Integer,Object>().put(column, value));
            
            for (Map.Entry<Integer,String> entr : hmapStatus.entrySet()) {
                System.out.println(entr.getKey()+" : "+entr.getValue());
            } 
            
            System.err.println("----------------------");

            //employeeDao.removeEmployeeMonth(Integer.parseInt(value));

        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeWorkForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<Employees> cbEmp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}
