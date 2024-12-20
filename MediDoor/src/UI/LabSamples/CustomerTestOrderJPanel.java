/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabSamples;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Cart;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportUploadWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chandrakiran
 */
public class CustomerTestOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerTestOrderJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem business;
    private Network network;
    private Customer customer;
    DefaultTableModel tableModel;
    private Enterprise enterprise;
    private Organization organization;
    //private final Order labOrder;
    
    Organization labOrganization;
    UserAccount labassAccount, sampleaccount;
    private ArrayList<Order> labOrder;
    
    ArrayList<ReportUploadWorkRequest> workrequests;
    
    
    public CustomerTestOrderJPanel(Ecosystem business, Network network, Customer customer) {
        initComponents();
        
        //this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        this.customer = customer;
        labOrder = customer.getOrderlist();
        
        this.tableModel = (DefaultTableModel) jTable1.getModel();
        workrequests = this.business.getReportWorkList();
        
        this.enterprise = network.getEnterpriseDirectory().getEnterprise("Lab Center & Diagnostics");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");
        /*
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            this.organization = e.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");
        }
        */
        //this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");

        this.tableModel = (DefaultTableModel) jTable1.getModel();
        populateTable();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        labelTotalOrder = new javax.swing.JLabel();
        btnAddtoCart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Order Total: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        labelTotalOrder.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        labelTotalOrder.setForeground(new java.awt.Color(0, 102, 102));
        labelTotalOrder.setText("<value>");
        add(labelTotalOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 104, -1));

        btnAddtoCart.setBackground(new java.awt.Color(0, 102, 102));
        btnAddtoCart.setForeground(new java.awt.Color(255, 255, 255));
        btnAddtoCart.setText("Order");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });
        add(btnAddtoCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 105, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test ID", "Test", "Cost", "Add to Cart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 117, 620, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:
        
        int rows = tableModel.getRowCount();
        //Cart custoemrcart = this.customer.getCustomerCart();

        ArrayList<OrderItem> customerCartItems = new ArrayList<OrderItem>();
                
   
            for (int i = 0; i < rows; i++) {
                if ((Boolean) tableModel.getValueAt(i, 3)) {
                    System.out.println("beforegvjhbj adding order item");
                        
                    OrderItem o = new OrderItem();
                    o.setProductId(Integer.valueOf((Integer) tableModel.getValueAt(i, 0)));
                    o.setProductName((String) tableModel.getValueAt(i, 1));
                    o.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                    o.setQty(1);
                    o.setOrganizationname("Sample Collection Center");
                    
                    
                    customerCartItems.add(o);
                            //JOptionPane.showMessageDialog(null, "Added " + o.getProductName() + " to cart!");
                }
            }
                    
                    //double total=0;
                    /*
                    for(Customer c : network.getCustomerDirectory().getCustomerList()){
                        for(Order ord : c.getOrderlist()){
                            ord.setItemsOrdered(customerCartItems);
                            ord.setEnterprisename("Lab Center & Diagnostics");
                            ord.setOrganizationname("Sample Collection Center");
                            ord.setStatus("Request Collection");
                        }
                    }*/
                    Order list = new Order();
                    list.setItemsOrdered(customerCartItems);
                    list.setEnterprisename("Lab Center & Diagnostics");
                    list.setOrganizationname("Sample Collection Center");
                    list.setStatus("Order Accepted");
                    list.calcOrderTotal();

                    
                    labOrder.add(list);                    
                    
                    //ArrayList<OrderItem> labtestItems = this.labOrder.getItemsOrdered();
                        
                        //Order order = new Order();
                        //order.setItemsOrdered(labtestItems);
                        
                        /*
                        for(Order o : customer.getOrderlist()){
                            o.setItemsOrdered(labtestItems);
                            o.setStatus("Request Collection");
                            o.setEnterprisename(enterprise.getName());
                            o.setOrganizationname(organization.getName());
                            //o.setPrice(total);
                            o.calcOrderTotal();
                        }
                        */
                        
                        //order.calcOrderTotal();
                        
                        labelTotalOrder.setText(String.valueOf(list.getPrice()));
                        
                        //Enterprise e = network.getEnterpriseDirectory().getEnterprise("Lab Center and Diagnostics");
                        //this.labOrganization = e.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");
                        this.labassAccount = this.organization.getUserAccountDirectory().getUserAccountList().get(0);
                        this.sampleaccount = this.organization.getUserAccountDirectory().getUserAccountList().get(0);
                        
                        ReportUploadWorkRequest req = new ReportUploadWorkRequest();
                        
                        //req.setOrderId(ERROR);
                        req.setSender(sampleaccount);
                        req.setOrderId(list.getOrderId());
                        req.setReceiver(this.labassAccount);
                        req.generateRequestId();
                        req.setCustomer(this.customer);
                        req.setStatus("Ordered"); 
                        req.setTestOrderItems(customerCartItems);
                        
                        workrequests.add(req);

    }//GEN-LAST:event_btnAddtoCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTotalOrder;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        tableModel.setRowCount(0);

        System.out.println("Inside populate table"+this.organization.getName());
        ArrayList<Product> products = this.organization.getOrganizationProducts();
        
        try {
            for (Product p : products) {
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    p.getProductId(),
                    p.getName(),
                    p.getPrice(),
                    false
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
