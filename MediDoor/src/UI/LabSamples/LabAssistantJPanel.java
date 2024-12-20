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
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportUploadWorkRequest;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chandrakiran
 */
public class LabAssistantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem business;
    private UserAccount userAccount;
    private Network network;
    private Customer customer;
    private Enterprise enterprise;
    private Organization organization;
    private ReportUploadWorkRequest workrequest;
    File report;
    
    public LabAssistantJPanel(JPanel userProcessContainer, UserAccount userAccount, Ecosystem business, Network network, Organization organization, Enterprise enterprise) {
        System.out.println("Inside lab centre");
        
        initComponents();
        
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        //this.customer = customer;
        this.userAccount = userAccount;
        
        this.enterprise = this.network.getEnterpriseDirectory().getEnterprise("Lab Center & Diagnostics");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");
        
        System.out.println("Inside lab centre122222");
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

        btnProcess = new javax.swing.JButton();
        btnItems = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrdersJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        productsJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1500, 900));

        btnProcess.setBackground(new java.awt.Color(0, 102, 102));
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnItems.setBackground(new java.awt.Color(0, 102, 102));
        btnItems.setForeground(new java.awt.Color(255, 255, 255));
        btnItems.setText("Order Items");
        btnItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemsActionPerformed(evt);
            }
        });

        OrdersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Customer", "Order Status"
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
        jScrollPane2.setViewportView(OrdersJTable);

        productsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test ID", "Test", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane3.setViewportView(productsJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnItems)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcess)
                        .addGap(69, 69, 69))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnItems))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        /*
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        //LabTestWorkRequest request = (LabTestWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
*/
        int selectedRow = OrdersJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int orderid = (int) OrdersJTable.getValueAt(selectedRow, 0);
        
        DefaultTableModel model = (DefaultTableModel) OrdersJTable.getModel();
        model.setRowCount(0);

        ProcessLabWorkRequestJPanel workRequestPanel = new ProcessLabWorkRequestJPanel(userProcessContainer, business, network, customer);
        userProcessContainer.add("manageCustomerJPanel",workRequestPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemsActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) productsJTable.getModel();
        model.setRowCount(0);
        
        int selectedRow = OrdersJTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int orderid = (int) OrdersJTable.getValueAt(selectedRow, 0);
        
        for(Customer c : network.getCustomerDirectory().getCustomerList()){
            for(Order o : c.getOrderlist()){
                for(OrderItem i : o.getItemsOrdered()){
                    
                    //Object[] ob = new Object[3];
                    model.insertRow(model.getRowCount(), new Object[]{
                                i.getProductId(),
                                i.getProductName(),
                                i.getProductPrice()
                            });
                }
            }
        }                                       

    }//GEN-LAST:event_btnItemsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrdersJTable;
    private javax.swing.JButton btnItems;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable productsJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) OrdersJTable.getModel();
        model.setRowCount(0);
        
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
}
