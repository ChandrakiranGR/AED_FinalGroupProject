/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Cart;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import UI.Alert;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanisugurushetty
 */
public class PharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyJPanel
     */
    Ecosystem ecosystem;
    Network network;
    Enterprise enterprise;
    Organization organization;
    Customer customer;
    DefaultTableModel tableModel;
    Alert alert;

    public PharmacyJPanel(Ecosystem system, Network network, Customer c) {
        initComponents();

        this.ecosystem = system;
        this.network = network;
        this.customer = c;
        this.alert = new Alert();
        this.tableModel = (DefaultTableModel) prodTable.getModel();

        this.enterprise = this.network.getEnterpriseDirectory().getEnterprise("Pharmaceutical");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Pharmacy");

        String[] columns = {"PRODUCT ID", "PRODUCT NAME", "PRODUCT  PRICE", "PRODUCT QTY", "PRODUCT", "ADD TO CART"};

        this.tableModel = new DefaultTableModel(null, columns) {
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Integer.class;
                    case 1:
                        return String.class;
                    case 2:
                        return Double.class;
                    case 3:
                        return Integer.class;
                    case 4:
                        return ImageIcon.class;
                    case 5:
                        return Boolean.class;
                    default:
                        return Object.class;
                }
            }
        };
        prodTable.setModel(tableModel);
        populateTable();
        populateStockList();
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
        prodTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 252, 249));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT", "PRICE", "QTY", "ADD TO CART"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prodTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 690, 380));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, -1, -1));

        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 100, -1));

        stockList.setBackground(new java.awt.Color(239, 239, 254));
        stockList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(stockList);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 200, 310));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("OUT OF STOCK :(");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pharmacy.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 510, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        Customer adds to cart

        int rows = tableModel.getRowCount();
        Cart custoemrcart = this.customer.getCustomerCart();

        ArrayList<OrderItem> customerCartItems = this.customer.getCustomerCart().getCartItems();

        try {
            for (int i = 0; i < rows; i++) {
                if ((Boolean) tableModel.getValueAt(i, 5)) {

                    System.out.println(custoemrcart.getCartId() + " :: THIS IS HIS CART ID");
//                    Look for an already existing order in the cart
                    if (customerCartItems.size() > 0) {
                        System.out.println("CART IS > 0 ");
                        Boolean found = false;
                        for (OrderItem item : customerCartItems) {
                            System.out.println(item.getProductName() + " ******** item");
                            if (item.getProductName().equals(String.valueOf(tableModel.getValueAt(i, 1)))) {
                                System.out.println(item.getProductName() + " ******** item exists");
                                this.alert.ShowAlert("Chosen item" + item.getProductName() + " already in cart!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            OrderItem o = new OrderItem();
                            o.setProductId(Integer.valueOf((Integer) tableModel.getValueAt(i, 0)));
                            o.setProductName((String) tableModel.getValueAt(i, 1));
                            o.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                            o.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                            o.setOrganizationname("Pharmacy");
                            customerCartItems.add(o);
                            this.alert.ShowAlert("Added " + o.getProductName() + " to cart!");
                        }
                    } else {
                        System.out.println("NEW ITEMS ADDED ");
                        OrderItem o = new OrderItem();
                        o.setProductId(Integer.valueOf((Integer) tableModel.getValueAt(i, 0)));
                        o.setProductName((String) tableModel.getValueAt(i, 1));
                        o.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                        o.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                        o.setOrganizationname("Pharmacy");
                        customerCartItems.add(o);
                        this.alert.ShowAlert("Added " + o.getProductName() + " to cart!");
                    }
                } else {
                }

            }

        } catch (Exception e) {
            System.out.println(e + " CART PROBLEM ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateTable() {
//        populate pharmacy products
        tableModel.setRowCount(0);
        prodTable.setRowHeight(50);
        ArrayList<Product> products = this.organization.getOrganizationProducts();
        try {
            for (Product p : products) {
                if (p.getStockunits() != 0) {
                    if (p.getProductImage() != null) {
                        ImageIcon icon = new ImageIcon(p.getProductImage().getAbsolutePath());

                        tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                            p.getProductId(),
                            p.getName(),
                            p.getPrice(),
                            1,
                            icon,
                            false
                        });
                    } else {
                        ImageIcon icon = new ImageIcon("pill.png");

                        tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                            p.getProductId(),
                            p.getName(),
                            p.getPrice(),
                            1,
                            icon,
                            false
                        });

                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void populateStockList() {
        ArrayList<Product> products = this.organization.getOrganizationProducts();
        DefaultListModel dlm = new DefaultListModel();
        try {
            int counter = 0;
            for (Product p : products) {
                if (p.getStockunits() == 0) {                    
                    dlm.addElement(p.getName());
                }
            }
            stockList.setModel(dlm);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable prodTable;
    private javax.swing.JList<String> stockList;
    // End of variables declaration//GEN-END:variables
}
