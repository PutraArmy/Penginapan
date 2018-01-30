/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.customer;

import javax.swing.JOptionPane;

/**
 *
 * @author Army
 */
public class customerView extends javax.swing.JFrame {

    databaseCustomer db = new databaseCustomer(); 
    customerTableModel tCustomer = new customerTableModel();
    boolean search = false; 
    String dasarkan;
    
    public customerView() {
        initComponents();
        tampildata();
    }
    public void tampildata() {
        tCustomer.setData(db.tampil_seluruh_customer());
        tblCustomer.setModel(tCustomer);
    }
    
    public void search() {
        dasarkan = (String)cbDasarkan.getSelectedItem();
        tCustomer.setData(db.search_customer(dasarkan, txtSearch.getText()));
        tblCustomer.setModel(tCustomer);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        cbDasarkan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnShowAll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/olegwhite.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 110));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("View Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 22, -1, -1));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 721, 261));

        btnAdd.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 74, -1));

        btnDelete.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        btnSearch.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 108, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, -1, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 120, -1));

        cbDasarkan.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        cbDasarkan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_customer", "nama", "no_identitas", "alamat", "jenisKelamin", "email", "usia"}));
        cbDasarkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDasarkanActionPerformed(evt);
            }
        });
        getContentPane().add(cbDasarkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 130, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Based on");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        btnShowAll.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customerview.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        customerAddView fAdd = new customerAddView(this,true);
        
        fAdd.setVisible(true);
        fAdd.txtNama.setText("");
        fAdd.txtNoIdentitas.setText("");
        fAdd.JK = (String)fAdd.cbJK.getSelectedItem();
        fAdd.txtAlamat.setText("");
        fAdd.txtUsia.setText("");
        refreshData();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            //ambil baris dimana kursor berada
            int baris = tblCustomer.getSelectedRow();
            int ID = (int)tCustomer.getValueAt(baris, 0);
            String nama = (String)tCustomer.getValueAt(baris, 1);
            Object pilihan[] = {"Ya","Tidak"};
            int jawaban = JOptionPane.showOptionDialog(
                    null, 
                    "Apakah data dengan num "+ID+ " yang bernama "+nama+" akan dihapus?",
                    "Apakah anda yakin",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,pilihan,pilihan[0]
            );
            
            if(jawaban==0){
                db.hapus_customer(ID);
                refreshData();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        customerUpdateView fAdd = new customerUpdateView(this,true);
        
        fAdd.setVisible(true);
        fAdd.txtNama.setText("");
        fAdd.txtNoIdentitas.setText("");
        fAdd.JK = (String)fAdd.cbJK.getSelectedItem();
        fAdd.txtAlamat.setText("");
        fAdd.txtUsia.setText("");
        refreshData();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search = true;
        System.out.println(txtSearch.getText());
        System.out.println(dasarkan);
        search();
        tCustomer.fireTableDataChanged();
        tblCustomer.changeSelection(0, 0, false, false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbDasarkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDasarkanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDasarkanActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        tampildata();
        refreshData();
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    
    public void refreshData(){
        tCustomer.setData(db.tampil_seluruh_customer());
        tCustomer.fireTableDataChanged();
        tblCustomer.changeSelection(0, 0, false, false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbDasarkan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}