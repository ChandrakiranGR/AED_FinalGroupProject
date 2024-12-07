/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package UI.LabCenters;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.LabAssistants.LabAssistants;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author chandrkiran
 */
public class ViewLabCentersJPanel extends javax.swing.JPanel {

        JPanel userProcessContainer;
    Ecosystem business;
    UserAccount account;
    Enterprise enterprise;
    //LabAssistants labAssistants;
    Organization organization;
    ArrayList<Product> productslist;

    Product product;
    /** Creates new form ViewLabCentersJPanel */
      public ViewLabCentersJPanel(JPanel userProcessContainer, Ecosystem business, Product product) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        //this.labAssistants = labAssistants;
        this.product = product;

        System.out.println("CAMeTO VIREW PROD");

        for (Network n : business.getNetworks()) {

            this.enterprise = n.getEnterpriseDirectory().getEnterprise("Lab Center & Diagnostics");
            this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");

        }

        this.productslist = this.organization.getOrganizationProducts();

        label.setText(String.valueOf(product.getProductId()));
        txtTest.setText(product.getName());
        txtPrice.setText(String.valueOf(product.getPrice()));

        //label.setEnabled(false);
        btnModify.setEnabled(true);
        txtTest.setEditable(false);
        txtPrice.setEditable(false);
        btnSave.setEnabled(false);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTest = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        btnSave.setBackground(new java.awt.Color(0, 102, 102));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Test ID");

        label.setText("<value>");

        jLabel2.setText("Test Name");

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel3.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTest, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(411, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        if (txtTest.getText().isEmpty() || txtPrice.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill the empty fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = txtTest.getText();
        double price = Double.parseDouble(txtPrice.getText());

        for (Product p : this.organization.getProductList()) {
            if (p.getProductId() == product.getProductId()) {
                p.setName(name);
                p.setPrice(price);

            }
        }

        JOptionPane.showMessageDialog(null, "Lab Test Updated");

        txtTest.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:

        btnModify.setEnabled(false);
        txtTest.setEditable(true);
        txtPrice.setEditable(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTest;
    // End of variables declaration//GEN-END:variables

}
