/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationAdminPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class MEdicalEquipmentAdminJPanel extends javax.swing.JPanel {

    private Integer orderid;

    /**
     * Creates new form MEdicalEquipmentAdminJPanel
     */
    private final JPanel userprocessocntainer;
    private final UserAccount user;
    private final Ecosystem ecosystem;
    private final Network network;
    private final Organization organization;
    private final Enterprise enterprise;
    DefaultTableModel prodTableMode;
    DefaultTableModel temTbleModel;
    private Order currentOrder;
    private Customer currentCustomer;
    private Object chosenFile;
    DefaultTableModel tableModel;

    public MEdicalEquipmentAdminJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount user, Network network, Organization organization, Enterprise enterprise) {
        initComponents();

        this.userprocessocntainer = userProcessContainer;
        this.user = user;
        this.ecosystem = system;
        this.network = network;
        this.organization = organization;
        this.enterprise = enterprise;

        this.prodTableMode = (DefaultTableModel) ordeTable.getModel();
        this.temTbleModel = (DefaultTableModel) prodTable.getModel();
        this.tableModel = (DefaultTableModel) productsTable.getModel();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordeTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        addBt1 = new javax.swing.JButton();
        fieldProductName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldProductPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTabbedPane1.setBackground(new java.awt.Color(253, 252, 249));

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 276));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, 280));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ACCEPT ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REJECT ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        jTabbedPane1.addTab("MANAGE ORDERS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(253, 252, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "PRODUCT PRICE", "PRODUCT STOCK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(productsTable);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 519, 241));

        addBt1.setBackground(new java.awt.Color(0, 102, 102));
        addBt1.setForeground(new java.awt.Color(255, 255, 255));
        addBt1.setText("ADD PRODUCTS");
        addBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBt1ActionPerformed(evt);
            }
        });
        jPanel2.add(addBt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, -1, -1));
        jPanel2.add(fieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 263, -1));

        jLabel4.setText("PRODUCT NAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));
        jPanel2.add(fieldProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 263, -1));

        jLabel5.setText("PRODUCT PRICE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));
        jPanel2.add(fieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 263, -1));

        jLabel6.setText("STOCK");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("UPDATE PRODUCTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("UPLOAD IMAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        jTabbedPane1.addTab("MANAGE PRODUCTS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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
        populateOrders();

    }//GEN-LAST:event_ordeTableMouseClicked

    private void addBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBt1ActionPerformed
        // TODO add your handling code here:
        try {
            if (fieldProductName.getText().trim().length() > 0 && Double.valueOf(fieldProductPrice.getText()) > 0.0 && Integer.valueOf(fieldStock.getText()) > 0) {
                if (this.organization.getOrganizationProducts().size() > 0) {
                    for (Product p : this.organization.getOrganizationProducts()) {
                        if (p.getName().equals(fieldProductName.getText())) {
                            JOptionPane.showMessageDialog(null, "Product already exists");
                            break;
                        } else {
                            Product prod = new Product();
                            prod.setName(fieldProductName.getText());
                            prod.setPrice(Double.valueOf(fieldProductPrice.getText()));
                            prod.setStockunits(Integer.valueOf(fieldStock.getText()));
                            if (this.chosenFile != null) {
                                prod.setProductImage((File) chosenFile);
                            }
                            this.organization.getOrganizationProducts().add(prod);
                            JOptionPane.showMessageDialog(null, "Added !");
                            break;
                        }
                    }
                } else {
                    ArrayList<Product> plist = this.organization.getProductList();
                    Product prod = new Product();
                    prod.setName(fieldProductName.getText());
                    prod.setPrice(Double.valueOf(fieldProductPrice.getText()));
                    prod.setStockunits(Integer.valueOf(fieldStock.getText()));
                    if (this.chosenFile != null) {
                        prod.setProductImage((File) chosenFile);
                    }

                    plist.add(prod);
                    this.organization.setProductList(plist);
                    JOptionPane.showMessageDialog(null, "Added !");
                }
            }
            populateProducts();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid data fields");
        }
    }//GEN-LAST:event_addBt1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {

            this.currentOrder.setStatus("ACCEPTED");
            populateOrders();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {

            this.currentOrder.setStatus("REJECTED");
            populateOrders();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png", "jpg", "jpeg", "pdf");
        chooser.addChoosableFileFilter(filter);
        this.chosenFile = chooser.getSelectedFile();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void fetchOrderObject() {
        for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
            for (Order o : customer.getOrderlist()) {
                if (o.getOrderId() == this.orderid) {
                    this.currentOrder = o;
                    this.currentCustomer = customer;
                    break;
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
            System.out.println("IN ITEMS TABLE OF EQUIPMENT ---- " + e);
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

    public void populateProducts() {
        tableModel.setRowCount(0);
        for (Product p : this.organization.getOrganizationProducts()) {
            tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                p.getProductId(),
                p.getName(),
                p.getPrice(),
                p.getStockunits(),
                1
            });

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBt1;
    private javax.swing.JTextField fieldProductName;
    private javax.swing.JTextField fieldProductPrice;
    private javax.swing.JTextField fieldStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable ordeTable;
    private javax.swing.JTable prodTable;
    private javax.swing.JTable productsTable;
    // End of variables declaration//GEN-END:variables
}
