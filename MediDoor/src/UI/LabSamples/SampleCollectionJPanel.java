/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabSamples;

import Business.Customer.Customer;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportUploadWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RepaintManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chandrakiran
 */
public class SampleCollectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabTestResultsJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    Network network;
    Organization organization;
    Enterprise enterprise;
    Ecosystem business;
    ReportUploadWorkRequest req;
    
    private int orderid;
    private Order currentOrder;
    private Customer currentCustomer;
    
    ArrayList<Order> orderslist;
    ArrayList<Customer> customerlist;
    
    public SampleCollectionJPanel(JPanel userProcessContainer, UserAccount account, Ecosystem business, Network network, Organization organization, Enterprise enterprise) {
        initComponents();
        
        System.out.println("Inside Sample Collection");
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.network = network;

        this.orderslist = new ArrayList<Order>();
        this.customerlist = new ArrayList<Customer>();

        this.enterprise = this.network.getEnterpriseDirectory().getEnterprise("Lab Center & Diagnostics");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");

        try {
            for (Customer c : network.getCustomerDirectory().getCustomerList()) {
                for (Order o : c.getOrderlist()) {
                    if (o.getOrganizationname().equalsIgnoreCase(this.organization.getName())) {
                        for (ReportUploadWorkRequest r : this.organization.getReportWorkList()) {
                            
                            if (r.getOrderId() == o.getOrderId()) {
                                this.orderid = r.getOrderId();
                                this.currentOrder = o;
                                this.currentCustomer = c;

                                orderslist.add(o);
                                customerlist.add(c);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //this.currentCustomer = pu.getCustomer();\
        //this.orderid = pu.getOrderId();\
        //this.currentOrder =\
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
        tableOrders = new javax.swing.JTable();
        btnDelivery = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Number", "Customer", "Test", "Order Status"
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
        tableOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrdersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableOrders);

        btnDelivery.setText("Sample Collection");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btnDelivery))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tableOrders.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int orderid = (int) tableOrders.getValueAt(selectedRow, 0);

        ArrayList<ReportUploadWorkRequest> workrequests = this.business.getReportWorkList();

        //ArrayList<UserAccount> users = this.enterprise.getOrganizationDirectory().getOrganizationByName("Sample Collection").getUserAccountDirectory().getUserAccountList();\
        UserAccount labcenterUser = this.enterprise.getOrganizationDirectory().getOrganizationByName("Lab Center").getUserAccountDirectory().getUserAccountList().get(0);

        ArrayList<DeliveryAgent> delag = this.enterprise.getDeliveryAgentsInEnterpiselist();

        UserAccount deliveryman = null;
        /*\
        for(UserAccount u: users) \{\
            if(u.getRole().equals(Role.RoleType.LabTester)) \{\
                deliveryman = u;\
            \}\
        \}*/

        
        for (Customer c : this.network.getCustomerDirectory().getCustomerList()) {
            Order order = c.findOrderById(orderid);
            if (order!=null) {
                
                for(ReportUploadWorkRequest r : workrequests){
                    if(r.getOrderId() == orderid){
                        System.out.println("inside if1");
                        for (DeliveryAgent d : delag) {
                            if (d.getActive() == true) {
                                System.out.println("inside if2");
                                r.setDeliveryAgent(d);
                                
                                System.out.println("compare request id");
                                order.setDeliveryAgent(d);
                                order.setStatus("Request Collection");
                                
                                JOptionPane.showMessageDialog(null, d.getUseraccount().getUsername());
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }

        //this.currentCustomer.getWorkQueue().getWorkRequestList().add(pu);\
        //this.currentOrder.setStatus("Assigned Delivery Agent");\
        populateOrders();

        System.out.println("Assign Delivery Agent");
        
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void tableOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrdersMouseClicked

    }//GEN-LAST:event_tableOrdersMouseClicked


    public void populateOrders() {

        DefaultTableModel model = (DefaultTableModel) tableOrders.getModel();
        model.setRowCount(0);

        System.out.println("Inside populate of sample team");

        try {
            for (Customer c : this.network.getCustomerDirectory().getCustomerList()) {
                for (Order o : c.getOrderlist()) {
                    for (OrderItem i : o.getItemsOrdered()) {
                        if (o.getOrganizationname().equalsIgnoreCase(this.organization.getName())) {

                            //Object[] list = new Object[4];\
                            model.insertRow(model.getRowCount(), new Object[]{
                                o.getOrderId(),
                                c.getName(),
                                i.getProductName(),
                                o.getStatus()
                            });
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivery;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOrders;
    // End of variables declaration//GEN-END:variables
}
