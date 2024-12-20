/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanisugurushetty
 */
public class OrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrdersJPanel
     */
    private Customer customer;
    private Ecosystem ecosystem;
    DefaultTableModel tableModel;
    DefaultTableModel delTableModel;

    public OrdersJPanel(Ecosystem system, Customer customer) {
        initComponents();
        this.ecosystem = system;
        this.customer = customer;
        this.tableModel = (DefaultTableModel) orderhistoryTable.getModel();
        this.delTableModel = (DefaultTableModel) jTable1.getModel();

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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderhistoryTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "ORDER STATUS", "DELIVERY AGENT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 740, 180));

        jLabel1.setText("ORDER HISTORY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 140, -1));

        orderhistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "ORDER STATUS", "PAYMENT STATUS", "ORDER PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane2.setViewportView(orderhistoryTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 740, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateOrders();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populateOrders() {
        tableModel.setRowCount(0);
        try {
            for (Order o : this.customer.getOrderlist()) {
                //                populate items

                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    o.getOrderId(),
                    o.getStatus(),
                    o.getOrderPayment().getStatus(),
                    o.getPrice()
                });

            }

        } catch (Exception e) {

        }

    }

    public void populateOrderDelivery() {
        delTableModel.setRowCount(0);
        try {
            for (Order o : this.customer.getOrderlist()) {
                //                populate items
                if (o.getStatus().equalsIgnoreCase("out for delivery")) {
                    delTableModel.insertRow(delTableModel.getRowCount(), new Object[]{
                        o.getOrderId(),
                        o.getStatus(),
                        o.getOrderPayment().getStatus(),
                        o.getPrice()
                    });
                }
            }

        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable orderhistoryTable;
    // End of variables declaration//GEN-END:variables
}
