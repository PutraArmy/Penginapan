/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster.room;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lukman
 */
public class roomAddView extends javax.swing.JDialog {
    databaseRoom db = new databaseRoom(); 
    /**
     * Creates new form RoomAddView
     */
    public roomAddView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        noRoomLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        no_roomField = new javax.swing.JTextField();
        classRoomBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/olegblack.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 100));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel2.setText("Add Room Data");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 200, 80));

        noRoomLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        noRoomLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        noRoomLabel.setText("No. Room");
        getContentPane().add(noRoomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 222, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel1.setText("Class Room");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 288, -1, -1));
        getContentPane().add(no_roomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 242, 48, -1));

        classRoomBox.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        classRoomBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Family", "Single Bed", "Double Bed" }));
        getContentPane().add(classRoomBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 313, -1, -1));

        saveButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        saveButton.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 371, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/roomadd.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        db.insert_room(new room(
             Integer.valueOf(no_roomField.getText()),
                String.valueOf(classRoomBox.getSelectedItem()),
                "Available"
        )
        );
            
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambah");
        setVisible(false);
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classRoomBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel noRoomLabel;
    private javax.swing.JTextField no_roomField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
