/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.EquipmentEnterpriseRole;

import Business.Customer.Customer;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Employee.Employee;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import javax.swing.JPanel;
import Business.Network.Network;
import Business.Role.DeliveryAgentRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chandrkiran
 */
public class ManageEquipmentDeliveryAgentJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
    Ecosystem business;
    UserAccountDirectory userdir;
    UserAccount ua;
    DeliveryAgent dlvrymn;
    Enterprise enterprise;
    DefaultTableModel dtm;
    ArrayList<DeliveryAgent> del;
    Network network;
    ArrayList<Integer> z;
    /**
     * Creates new form ManageEquipmentDeliveryAgentJPanel
     */
    public ManageEquipmentDeliveryAgentJPanel(JPanel userProcessContainer, Ecosystem ecosystem,Network network, UserAccount ua,UserAccountDirectory userdir, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = ecosystem;
        this.ua = ua;
        this.userdir = userdir;
        this.enterprise = enterprise;
        this.network = network;
        this.z = new ArrayList<>();

        System.out.println("CAME INTO DELIVERY AGENT PANEL");
        dtm = (DefaultTableModel) deliveryjTable.getModel();

        System.out.println("Going inside populate table");
        populateTable();
        cmbzipcode.removeAllItems();
        displaycombo();


        if(this.business.getUserAccountDirectory() == null) {
            this.userdir = new UserAccountDirectory();
            business.setUserAccountDirectory(userdir);
        } else {
            this.userdir = business.getUserAccountDirectory();

        }
    }

    /**
     * Creates new form ManageEquipmentDeliveryAgentJPanel
     */
    public ManageEquipmentDeliveryAgentJPanel(JPanel userProcessContainer, Ecosystem ecosystem, Network network, UserAccount account, UserAccountDirectory useraccountdirectory, Enterprise enterprise) {
        initComponents();
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
        deliveryjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        deliveryjTable.setBackground(new java.awt.Color(204, 255, 204));
        deliveryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Zipcode", "Active", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(deliveryjTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(932, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(632, 632, 632))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable deliveryjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);
        ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
        for(DeliveryAgent dm: delList){
           System.out.println(" \n"+dm.getUseraccount().getEmployee().getName());
            System.out.println(" \n"+dm.getUseraccount().getUsername());
            System.out.println(" \n"+dm.getUseraccount().getPassword());
            System.out.println(" \n"+dm.getZipcodes());
            System.out.println(" \n"+dm.getActive());
            Object[] inrow = {dm.getUseraccount().getEmployee().getName(),dm.getZipcodes(),dm.getActive(),dm.getUseraccount().getUsername(), dm.getUseraccount().getPassword()};
            dtm.insertRow(dtm.getRowCount(),inrow);
            System.out.println("done");
    }
}

    private void displaycombo() {
         del = enterprise.getDeliveryAgentsInEnterpiselist();
              z = network.getZipcodes();
              for(int i =0; i< z.size(); i++){
              cmbzipcode.addItem(z.get(i).toString());
              }

    }
}
