/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Orders.Order;
import Business.WorkQueue.PrescriptionUploadWorkRequest;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanisugurushetty
 */
public class PrescriptionHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrescriptionHistoryJPanel
     */
    Ecosystem ecosystem;
    Customer customer;
    DefaultTableModel tableModel;

    public PrescriptionHistoryJPanel(Ecosystem system, Customer customer) {
        initComponents();
        this.ecosystem = system;
        this.customer = customer;

        this.tableModel = (DefaultTableModel) jTable1.getModel();

        populateOrders();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 252, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "ORDER STATUS", "DOCTOR COMMENTS", "DOCTOR SIGNATURE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 791, 349));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/resources/presc.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 500, 450));
    }// </editor-fold>//GEN-END:initComponents

    public void populateOrders() {
        tableModel.setRowCount(0);
        try {
            for (PrescriptionUploadWorkRequest pu : this.ecosystem.getPrescriptionWorkList()) {
                if (pu != null) {
                    if (pu.getCustomer().getUsername().equals(this.customer.getUsername())) {
                        System.out.println(pu.getOrderId());
                        Order o = this.customer.findOrderById(pu.getOrderId());

                        tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                            o.getOrderId(),
                            o.getStatus(),
                            pu.getComments(),
                            pu.getSignature()
                        });
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e + " --------- IN PRESCRIPTION HISTORY ");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
