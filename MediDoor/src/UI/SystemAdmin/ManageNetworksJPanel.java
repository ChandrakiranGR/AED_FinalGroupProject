/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vish
 */
public class ManageNetworksJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworksJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem business;

    public ManageNetworksJPanel(JPanel userProcessContainer, Ecosystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.business = business;

        populateNetworkTable();
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
        networkJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtNetworkName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 252, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networkJTable.setForeground(new java.awt.Color(0, 102, 204));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 560, 174));

        jLabel2.setText("Network Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, 20));
        add(txtNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 160, 30));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/icons8-thin-client-50.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 140, 60));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/icons8-trash-can-50.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 130, -1));

        jLabel3.setText("Zipcode");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 160, 30));

        jLabel1.setBackground(new java.awt.Color(253, 252, 249));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Networks");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 80));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/icons8-back-50.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtNetworkName.getText();

            Network network = business.createNetwork();
            network.setNetworkName(name);

            ArrayList<Integer> zipcodes = new ArrayList<>();
            int z = Integer.valueOf(jTextField1.getText());
            for (int i = 1; i < 10; i++) {

                zipcodes.add(z + i);
            }

            EnterpriseDirectory edir = new EnterpriseDirectory();
            Enterprise e = edir.createEnterprise(Enterprise.EnterpriseType.Pharmaceutical, "Pharmaceutical", name);
            Enterprise e1 = edir.createEnterprise(Enterprise.EnterpriseType.MedicalEquipements, "Medical Equipments", name);
            Enterprise e2 = edir.createEnterprise(Enterprise.EnterpriseType.LabDiagnostics, "Lab Center & Diagnostics", name);
            Enterprise e3 = edir.createEnterprise(Enterprise.EnterpriseType.Vaccination, "Immunization & Vaccination", name);

            OrganizationDirectory o = e.getOrganizationDirectory();
            OrganizationDirectory o1 = e1.getOrganizationDirectory();
            OrganizationDirectory o2 = e2.getOrganizationDirectory();
            OrganizationDirectory o3 = e3.getOrganizationDirectory();

            Organization orgP = o.createOrganization(Organization.Type.Doctor, "Doctor Associate", name, z);
            Organization orgP1 = o.createOrganization(Organization.Type.Pharmacist, "Pharmacy", name, z);
            Organization orgP2 = o.createOrganization(Organization.Type.MarketManager, "Supermarket", name, z);

            Organization orgM = o1.createOrganization(Organization.Type.EquipmentManager, "Equipments", name, z);

            Organization orgV = o3.createOrganization(Organization.Type.PharmaOrgAdmin, "Immunization", name, z);

            Organization orgL = o2.createOrganization(Organization.Type.LabAssistant, "Lab Center", name, z);
            Organization orgL1 = o2.createOrganization(Organization.Type.LabTester, "Sample Collection Center", name, z);

            network.setZipcodes(zipcodes);

            network.setEnterpriseDirectory(edir);

            JOptionPane.showMessageDialog(btnAdd, "Network Added Successfully");

            populateNetworkTable();

            txtNetworkName.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check input fields");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedrow = networkJTable.getSelectedRow();
        String name = networkJTable.getValueAt(selectedrow, 0).toString();
        Network n = business.getNetwork(name);
        business.removeNetwork(n);
        populateNetworkTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txtNetworkName;
    // End of variables declaration//GEN-END:variables

    public void populateNetworkTable() {

        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworks()) {
            Object[] row = new Object[1];
            row[0] = network.getNetworkName();
            model.addRow(row);
        }
    }
}
