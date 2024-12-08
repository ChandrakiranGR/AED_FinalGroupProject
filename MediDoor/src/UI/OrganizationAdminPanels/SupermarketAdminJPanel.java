/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrganizationAdminPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanisugurushetty
 */
public class SupermarketAdminJPanel extends javax.swing.JPanel {

    private final JPanel userprocessocntainer;
    private final UserAccount user;
    private final Ecosystem ecosystem;
    private final Network network;
    private final Organization organization;
    private final Enterprise enterprise;
    DefaultTableModel prodTableMode;
    DefaultTableModel temTbleModel;
    private Integer orderid;
    private Order currentOrder;
    private Customer currentCustomer;

    /**
     * Creates new form SupermarketAdminJPanel
     */
    public SupermarketAdminJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount user, Network network, Organization organization, Enterprise enterprise) {
        initComponents();

        this.userprocessocntainer = userProcessContainer;
        this.user = user;
        this.ecosystem = system;
        this.network = network;
        this.organization = organization;
        this.enterprise = enterprise;

        this.prodTableMode = (DefaultTableModel) ordeTable.getModel();
        this.temTbleModel = (DefaultTableModel) prodTable.getModel();

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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordeTable = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnreject = new javax.swing.JButton();
        btnreqPrescription = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(253, 252, 249));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(253, 252, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "ORDER PRICE", "ORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ordeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ordeTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 276));

        btnAccept.setBackground(new java.awt.Color(0, 102, 102));
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("ACCEPT ORDER");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        jPanel2.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        btnreject.setBackground(new java.awt.Color(255, 153, 51));
        btnreject.setForeground(new java.awt.Color(255, 255, 255));
        btnreject.setText("REJECT ORDER");
        btnreject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrejectActionPerformed(evt);
            }
        });
        jPanel2.add(btnreject, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        btnreqPrescription.setBackground(new java.awt.Color(102, 102, 102));
        btnreqPrescription.setForeground(new java.awt.Color(255, 255, 255));
        btnreqPrescription.setText("REQUEST PRESCRIPTION");
        btnreqPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreqPrescriptionActionPerformed(evt);
            }
        });
        jPanel2.add(btnreqPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ID", "ITEM NAME", "ITEM PRICE", "ITEM QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(prodTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, 280));

        jTabbedPane1.addTab("MANAGE ORDERS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(253, 252, 249));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MANAGE PRODUCTS", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ordeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordeTableMouseClicked
        // TODO add your handling code here:

        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = source.columnAtPoint(evt.getPoint());

        this.orderid = Integer.valueOf((Integer) source.getModel().getValueAt(row, column));
        fetchOrderObject();
        populateItems();
    }//GEN-LAST:event_ordeTableMouseClicked

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

        try {

            this.currentOrder.setStatus("ACCEPTED");
            JOptionPane.showMessageDialog(null, "ACCEPTED");

        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnrejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrejectActionPerformed
        // TODO add your handling code here:

        try {

            this.currentOrder.setStatus("REJECTED");
            JOptionPane.showMessageDialog(null, "REJECTED");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnrejectActionPerformed

    private void btnreqPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreqPrescriptionActionPerformed
        // TODO add your handling code here:

        //        SEND MAIL TO REQUEST PRESCRIPTION
        this.currentOrder.setStatus("PRESCRIPTION REQUIRED");
        populateOrders();
    }//GEN-LAST:event_btnreqPrescriptionActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        System.out.println("CAME HERE!!!");
        jPanel2.add(new PharmacyProductJPanel(userprocessocntainer, ecosystem, user, network, organization, enterprise));
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        populateOrders();
        jTabbedPane1.setComponentAt(0, jPanel1);
        jTabbedPane1.setComponentAt(1, new PharmacyProductJPanel(userprocessocntainer, ecosystem, user, network, organization, enterprise));
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    public void fetchOrderObject() {
        for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
            for (Order o : customer.getOrderlist()) {
                if (o.getOrderId() == this.orderid) {
                    this.currentOrder = o;
                    this.currentCustomer = customer;
                }
            }
        }
    }

    public void populateItems() {
        this.temTbleModel.setRowCount(0);
        try {
            for (OrderItem oi : this.currentOrder.getItemsOrdered()) {
                this.temTbleModel.insertRow(this.temTbleModel.getRowCount(), new Object[]{
                    oi.getProductId(),
                    oi.getProductName(),
                    oi.getProductPrice(),
                    oi.getQty()
                });
            }
        } catch (Exception e) {
            System.out.println("IN ITEMS TABLE OF SUPERMARKET ---- " + e);
        }
    }

    public void populateOrders() {
        try {
            this.prodTableMode.setRowCount(0);

            for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
                ArrayList<Order> customerorder = customer.getOrderlist();

                for (Order o : customerorder) {
                    if (o.getOrganizationname().equals(this.organization.getName())) {
//                        populate orders table
                        this.prodTableMode.insertRow(prodTableMode.getRowCount(), new Object[]{
                            o.getOrderId(),
                            customer.getUsername(),
                            o.getPrice(),
                            o.getStatus()
                        });

                    }
                }
            }

        } catch (Exception e) {
            System.out.println("IN SUPERMARKET Admin POPULATE ORDER ------ " + e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnreject;
    private javax.swing.JButton btnreqPrescription;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable ordeTable;
    private javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
