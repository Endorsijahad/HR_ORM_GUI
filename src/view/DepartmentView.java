/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DepartmentController;
import controller.EmployeeController;
import controller.LocationController;
import daos.GeneralDAO;
import entities.Department;
import entities.Employee;
import entities.Location;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author Martin
 */
public class DepartmentView extends javax.swing.JInternalFrame {

//    private final GeneralDAO gdao;
    private final DepartmentController controller;
    
    private String[] cmbItem = {"departmentId", "departmentName", "managerId", "locationId"};
    
    
    /**
     * Creates new form DepartmentView
     */
    public DepartmentView(SessionFactory sessionFactory) {
        initComponents();
        //this.gdao = new GeneralDAO(HibernateUtil.getSessionFactory(), Department.class);
        controller = new DepartmentController(sessionFactory);
       // Object ambilSemua = controller.getAll();
       
       controller.loadCmbDepartmentName(cmbDepartmentName);
       controller.loadCmbLocationId(cmbLocationId);
       controller.loadCmbManagerId(cmbManagerId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartment = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDepartmentId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbDepartmentName = new javax.swing.JComboBox<>();
        cmbManagerId = new javax.swing.JComboBox<>();
        cmbLocationId = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department ID", "Department Name", "Manager ID", "Location ID" }));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        jLabel1.setText("Search :");

        tblDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDepartment);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jLabel2.setText("Department ID :");

        txtDepartmentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Department Name :");

        jLabel4.setText("Manager ID :");

        jLabel5.setText("Location ID :");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(txtDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbLocationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbLocationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if(!txtSearch.getText().equalsIgnoreCase("")){
//                bindingDepartment(controller.search(cmbItem[cmbKategori.getSelectedIndex()], txtSearch.getText()));
//            }
//        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtDepartmentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentIdActionPerformed

    /**
     * Melakukan simpan atau update saat tombol save di tekan
     * @param evt jenis event
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
//        if(!txtDepartmentId.isEnabled()){
//            controller.saveOrUpdate(txtDepartmentId.getText(), cmbDepartmentName.getSelectedItem().toString(),
//                cmbManagerId.getSelectedItem().toString(), cmbLocationId.getSelectedItem().toString());
//        serbaGuna.tampilPesan(this, pesanUpdate, "Pesan Update");
//        bindingDepartment(controller.getAll());
//        reset();
//        }
//        else{
//            controller.saveOrUpdate(txtDepartmentId.getText(), cmbDepartmentName.getSelectedItem().toString(),
//                cmbManagerId.getSelectedItem().toString(), cmbLocationId.getSelectedItem().toString());
//        serbaGuna.tampilPesan(this, pesanSimpan, "Pesan Simpan");
//        bindingDepartment(controller.viewDepartment());
//        reset();
//        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//        int messageBox = JOptionPane.showConfirmDialog(this, "Are You Sure ?", "Delete", JOptionPane.YES_NO_OPTION ,JOptionPane.WARNING_MESSAGE);
//        if(messageBox == JOptionPane.YES_OPTION){
//            String pesan = controller.hapusDepartment(txtDepartmentId.getText());
//        serbaGuna.tampilPesan(this, pesan, "Pesan Delete");
//        bindingDepartment(controller.viewDepartment());
//        reset();
//        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentMouseClicked
        // TODO add your handling code here:
//        int row = tblDepartment.getSelectedRow();
//        txtDepartmentId.setText(tblDepartment.getValueAt(row, 1).toString());
//        cmbDepartmentName.setSelectedItem(tblDepartment.getValueAt(row, 2).toString());
//        if(tblDepartment.getValueAt(row, 3) == null) cmbManagerId.setSelectedItem(null);
//        else cmbManagerId.setSelectedItem(tblDepartment.getValueAt(row, 3).toString());
//        cmbLocationId.setSelectedItem(tblDepartment.getValueAt(row, 4).toString());
//        edit();
    }//GEN-LAST:event_tblDepartmentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbDepartmentName;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JComboBox<String> cmbLocationId;
    private javax.swing.JComboBox<String> cmbManagerId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDepartment;
    private javax.swing.JTextField txtDepartmentId;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

     private void bindingDepartment(List<Object> department) {
//        String[] header = {"No", "Department ID", "Department Name", "Manager Name", "City"};
//        String[][] data = new String[department.size()][header.length];
//        for (int i = 0; i < department.size(); i++) {
//            Employee employee = department.get(i).getEmployee();
//            data[i][0] = (i + 1) + "";
//            data[i][1] = department.get(i).getDepartmentId() + "";
//            data[i][2] = department.get(i).getDepartmentName() + "";
//            if(employee!=null) data[i][3] = department.get(i).getEmployee().getEmployeeId() + " - " + department.get(i).getEmployee().getLastName()+ "";
//            data[i][4] = department.get(i).getLocation().getLocation_id()+ " - " + department.get(i).getLocation().getCity() + "";
//        }
//        tblDepartment.setModel(new DefaultTableModel(data, header));
//        reset();

        String[] header = {"No", "Department ID", "Department Name", "Manager Name", "City"};
        String[][] data = new String[department.size()][header.length];
        int i = 0;
        for (Object object : department) {
            Department dept = (Department) object;
            Employee employee = dept.getManagerId();
            data[i][0] = (i + 1) + "";
            data[i][1] = dept.getDepartmentId() + "";
            data[i][2] = dept.getDepartmentName() + "";
            if(employee!=null) data[i][3] = dept.getManagerId().getEmployeeId() + " - " + dept.getManagerId().getLastName()+ "";
            data[i][4] = dept.getLocationId().getLocationId()+ " - " + dept.getLocationId().getCity() + "";
        }
        tblDepartment.setModel(new DefaultTableModel(data, header));
        reset();
    }
    
     
     
    /**
     * Menyalakan tombol delete dan mematikan textfield Department Id
     */
    private void edit() {
        txtDepartmentId.setEnabled(false);
        btnDelete.setEnabled(true);
    }
    
    /**
     * Mengeset textfield department Id dengan method autoId, menyalakan textfield dan menghilangkan kemampuan edit dari
     * Department Id, mematikan tombol delete, mengembalikan seluruh combobox ke pilihan pertama
     */
    private void reset() {
        txtDepartmentId.setText(controller.getNewId()+"");
        txtDepartmentId.setEnabled(true);
        btnDelete.setEnabled(false);
        txtDepartmentId.setEditable(false);
        cmbDepartmentName.setSelectedIndex(0);
        cmbManagerId.setSelectedIndex(0);
        cmbLocationId.setSelectedIndex(0);
    }
    
}
