/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrganizationPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import UI.Alert;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanisugurushetty
 */
public class CustomerPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPrescriptionJPanel
     */
    Ecosystem ecosystem;
    Customer customer;
    Alert alerts;
    DefaultTableModel tableModel;
    ArrayList<Order> orderlist;
    Order orderToUpdate;
    File chosenFile;

    public CustomerPrescriptionJPanel(Ecosystem system, Customer customer) {
        initComponents();

        this.customer = customer;
        this.ecosystem = system;
        this.alerts = new Alert();
        this.orderlist = this.customer.getOrderlist();
        this.orderToUpdate = new Order();

        this.tableModel = (DefaultTableModel) itemsTable.getModel();

        populateDp();
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
        jLabel1 = new javax.swing.JLabel();
        dropdownOrders = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jFile = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 460, 600));

        dropdownOrders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        dropdownOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownOrdersActionPerformed(evt);
            }
        });
        jPanel1.add(dropdownOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 69, 160, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Show Items");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 69, -1, -1));

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT NAME", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 124, 294, 350));

        jFile.setBackground(new java.awt.Color(0, 102, 102));
        jFile.setForeground(new java.awt.Color(255, 255, 255));
        jFile.setText("Upload Prescription");
        jFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileActionPerformed(evt);
            }
        });
        jPanel1.add(jFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dropdownOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownOrdersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownOrdersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:1
        populateOrderDetails();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();

        chooser.showOpenDialog(null);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png", "jpg", "jpeg");
        chooser.addChoosableFileFilter(filter);
        this.chosenFile = chooser.getSelectedFile();

        ImageIcon ii = new ImageIcon(this.chosenFile.getAbsolutePath());
        jLabel1.setIcon(ii);
    }//GEN-LAST:event_jFileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //        update order
        if (this.chosenFile != null) {
            this.orderToUpdate.setStatus("PRESCRIPTION UPLOADED");
            this.orderToUpdate.setPrescription(this.chosenFile);

            this.alerts.ShowAlert("Successfully updated your order!");
        } else {
            JOptionPane.showMessageDialog(null, "You forgot an attachment");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
public void populateDp() {

        for (Order o : this.orderlist) {
            if (o.getStatus().equals("PRESCRIPTION REQUIRED")) {
                dropdownOrders.addItem(String.valueOf(o.getOrderId()));
            }

        }

    }

    public void populateOrderDetails() {
        //        In this panel the user see which orders need a prescription to be uploaded
//        Fetch all the orders in the orderlist
//        check if the status is prescriptionreqd
//         show the order and assign it to doctor organization user
        try {
            for (Order o : orderlist) {
                if (o.getOrderId() == Integer.valueOf((String) dropdownOrders.getSelectedItem())) {
                    tableModel.setRowCount(0);
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
//                populate items
                    for (int i = 0; i < oi.size(); i++) {
                        tableModel.insertRow(i, new Object[]{
                            oi.get(i).getProductName(),
                            oi.get(i).getQty()
                        });

                    }

                    this.orderToUpdate = o;
                    break;
                }
            }
        } catch (Exception e) {

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dropdownOrders;
    private javax.swing.JTable itemsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
