/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Cart;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import UI.Alert;
import UI.LabSamples.CustomerTestOrderJPanel;
import UI.OrganizationPanels.CustomerPrescriptionJPanel;
import UI.OrganizationPanels.MedicalEquipmentsJPanel;
import UI.OrganizationPanels.OrdersJPanel;

//import UI.OrganizationPanels.PaymentsJPanel;

import UI.OrganizationPanels.PaymentsJPanel;

import UI.OrganizationPanels.PrescriptionHistoryJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import UI.OrganizationPanels.PharmacyJPanel;
import UI.OrganizationPanels.VaccineJPanel;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author antaradeshmukh
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

     Ecosystem system;
    Network network;
    Customer customer;
    JPanel userProcessContainer;
    DefaultTableModel tableModel;
    DefaultTableModel model;
    private final Alert alert;
   // private List<BloodRequestWorkRequest> requestList = new ArrayList<>();

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, Ecosystem system, Network network, Customer c) {
        initComponents();
        this.setSize(1000, 800);
        this.system = system;
        this.customer = c;
        this.network = network;//To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.alert = new Alert();
        netname.setText(network.getNetworkName());
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

        supermarketTable.setModel(tableModel);
        populateTable();
        populateBloodTypeComboBox();
        
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
        pane = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        prescriptionBtn = new javax.swing.JButton();
        browseBtn1 = new javax.swing.JButton();
        cartBtn1 = new javax.swing.JButton();
        orderBtn1 = new javax.swing.JButton();
        paymentBTn1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        netname = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        supermarketTable = new javax.swing.JTable();
        addCartButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pane.setDividerSize(1);
        pane.setMinimumSize(new java.awt.Dimension(1500, 900));
        pane.setPreferredSize(new java.awt.Dimension(1500, 1000));

        leftPane.setBackground(new java.awt.Color(253, 252, 249));
        leftPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prescriptionBtn.setBackground(new java.awt.Color(0, 102, 102));
        prescriptionBtn.setForeground(new java.awt.Color(255, 255, 255));
        prescriptionBtn.setText("MY PRESCRIPTIONS");
        prescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionBtnActionPerformed(evt);
            }
        });
        leftPane.add(prescriptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 40));

        browseBtn1.setBackground(new java.awt.Color(0, 102, 102));
        browseBtn1.setForeground(new java.awt.Color(255, 255, 255));
        browseBtn1.setText("BROWSE");
        browseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtn1ActionPerformed(evt);
            }
        });
        leftPane.add(browseBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 40));

        cartBtn1.setBackground(new java.awt.Color(0, 102, 102));
        cartBtn1.setForeground(new java.awt.Color(255, 255, 255));
        cartBtn1.setText("MY CART");
        cartBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtn1ActionPerformed(evt);
            }
        });
        leftPane.add(cartBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 40));

        orderBtn1.setBackground(new java.awt.Color(0, 102, 102));
        orderBtn1.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn1.setText("MY ORDERS");
        orderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtn1ActionPerformed(evt);
            }
        });
        leftPane.add(orderBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 40));

        paymentBTn1.setBackground(new java.awt.Color(0, 102, 102));
        paymentBTn1.setForeground(new java.awt.Color(255, 255, 255));
        paymentBTn1.setText("MY PAYMENTS");
        paymentBTn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBTn1ActionPerformed(evt);
            }
        });
        leftPane.add(paymentBTn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PRESCRIPTION HISTORY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        leftPane.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 40));
        leftPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 120));

        netname.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        netname.setForeground(new java.awt.Color(0, 102, 102));
        leftPane.add(netname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        pane.setLeftComponent(leftPane);

        jTabbedPane2.setBackground(new java.awt.Color(253, 252, 249));
        jTabbedPane2.setOpaque(true);
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(253, 252, 249));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2jPanel3MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supermarketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "PRODUCT PRICE", "PRODUCT QTY", "ADD TO CART"
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
        supermarketTable.setOpaque(false);
        jScrollPane2.setViewportView(supermarketTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 700, 390));

        addCartButton.setBackground(new java.awt.Color(0, 102, 102));
        addCartButton.setForeground(new java.awt.Color(255, 255, 255));
        addCartButton.setText("ADD TO CART");
        addCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 100, -1));

        jScrollPane1.setViewportView(stockList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 210, 330));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("OUT OF STOCK :(");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 90, -1, -1));

        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 600, 420));

        jTabbedPane2.addTab("SUPERMARKETS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(253, 252, 249));
        jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel3jPanel1FocusGained(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3jPanel1MouseClicked(evt);
            }
        });
        jTabbedPane2.addTab("PHARMACY", jPanel3);

        jPanel4.setBackground(new java.awt.Color(253, 252, 249));
        jTabbedPane2.addTab("MEDICAL EQUIPMENTS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(253, 252, 249));
        jPanel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel5FocusGained(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jTabbedPane2.addTab("VACCINE & IMMUNIZATION", jPanel5);

        jPanel6.setBackground(new java.awt.Color(253, 252, 249));
        jTabbedPane2.addTab("LAB CENTER & DIAGNOSTICS", jPanel6);

        pane.setRightComponent(jTabbedPane2);

        jPanel1.add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 5, 1450, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1409, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionBtnActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new CustomerPrescriptionJPanel(this.system, this.customer));
    }//GEN-LAST:event_prescriptionBtnActionPerformed

    private void browseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtn1ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setLeftComponent(null);
        pane.removeAll();
        pane.setRightComponent(new CustomerWorkAreaJPanel(this.userProcessContainer, this.system, this.network, this.customer));
    }//GEN-LAST:event_browseBtn1ActionPerformed

    private void cartBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtn1ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new CustomerCartJPanel(this.system, this.network, this.customer));
    }//GEN-LAST:event_cartBtn1ActionPerformed

    private void orderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtn1ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new OrdersJPanel(this.system, this.customer));
    }//GEN-LAST:event_orderBtn1ActionPerformed

    private void paymentBTn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBTn1ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new PaymentsJPanel(this.customer));
    }//GEN-LAST:event_paymentBTn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new PrescriptionHistoryJPanel(this.system, this.customer));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartButtonActionPerformed
        // TODO add your handling code here:

        int rows = this.tableModel.getRowCount();
        Cart custoemrcart = this.customer.getCustomerCart();

        ArrayList<OrderItem> customerCartItems = this.customer.getCustomerCart().getCartItems();

        try {
            for (int i = 0; i < rows; i++) {
                if ((Boolean) this.tableModel.getValueAt(i, 5)) {

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
                            o.setOrganizationname("Supermarket");
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
                        o.setOrganizationname("Supermarket");
                        customerCartItems.add(o);
                        this.alert.ShowAlert("Added " + o.getProductName() + " to cart!");
                    }
                } else {
                }

            }

        } catch (Exception e) {
            System.out.println(e + " CART PROBLEM ");
        }
    }//GEN-LAST:event_addCartButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel2jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2jPanel3MouseClicked
        // TODO add your handling code here:

        //        add supermarkt items
    }//GEN-LAST:event_jPanel2jPanel3MouseClicked

    private void jPanel3jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3jPanel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3jPanel1FocusGained

    private void jPanel3jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3jPanel1MouseClicked
        // TODO add your handling code here:
        jPanel1.add(new PharmacyJPanel(this.system, this.network, this.customer));
    }//GEN-LAST:event_jPanel3jPanel1MouseClicked

    private void jPanel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5FocusGained

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        jPanel1.add(new VaccineJPanel(this.system, this.network, this.customer));
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jTabbedPane2jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2jTabbedPane1MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setComponentAt(1, new PharmacyJPanel(this.system, this.network, this.customer));
        jTabbedPane2.setComponentAt(3, new VaccineJPanel(this.system, this.network, this.customer));
        jTabbedPane2.setComponentAt(2, new MedicalEquipmentsJPanel(this.system, this.network, this.customer));

        jTabbedPane2.setComponentAt(4, new CustomerTestOrderJPanel(this.system, this.network, this.customer));
    }//GEN-LAST:event_jTabbedPane2jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartButton;
    private javax.swing.JButton browseBtn1;
    private javax.swing.JButton cartBtn1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel leftPane;
    private javax.swing.JLabel netname;
    private javax.swing.JButton orderBtn1;
    private javax.swing.JSplitPane pane;
    private javax.swing.JButton paymentBTn1;
    private javax.swing.JButton prescriptionBtn;
    private javax.swing.JList<String> stockList;
    private javax.swing.JTable supermarketTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        tableModel.setRowCount(0);
        supermarketTable.setRowHeight(50);
        Enterprise e = this.network.getEnterpriseDirectory().getEnterprise("Pharmaceutical");
        Organization o = e.getOrganizationDirectory().getOrganizationByName("Supermarket");

        ArrayList<Product> products = o.getOrganizationProducts();
        try {
            for (Product p : products) {
                if (p != null) {

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
                        System.out.println("CAME --");
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
        } catch (Exception ex) {
            System.out.println(ex + " ************ ");
        }
        populateStocks(o);






//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void populateStocks(Organization o) {
          ArrayList<Product> products = o.getOrganizationProducts();
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
        











//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void populateBloodTypeComboBox() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
