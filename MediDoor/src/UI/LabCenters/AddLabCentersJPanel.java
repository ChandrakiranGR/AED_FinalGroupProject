/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabCenters;


import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.LabAssistants.LabAssistants;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.Role.LabAssistantRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chandrakiran
 */
public class AddLabCentersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabCentersJPanel
     */
    JPanel userProcessContainer;
    Ecosystem business;
    UserAccount account;
    Enterprise enterprise;
    Network network;
    Organization organization;
    //ArrayList<LabAssistants> labassistants;
    ArrayList<Product> products;
    
    public AddLabCentersJPanel(JPanel userProcessContainer, Ecosystem business, UserAccount account, Network network, Enterprise enterprise, Organization organization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.network = network;
        this.enterprise = this.network.getEnterpriseDirectory().getEnterprise("Lab Center & Diagnostics");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Sample Collection Center");
        /*
        for (Network n : business.getNetworks()){
            
            this.enterprise = n.getEnterpriseDirectory().getEnterprise("Lab Center & Diagnostics");
        }
        
        labassistants = new ArrayList<LabAssistants>();
        
 
        */
        
        this.products = this.organization.getOrganizationProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTest = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Price ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel7.setText("Test Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));
        add(txtTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 180, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 180, -1));

        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 100, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        Pattern p;
        
        //LabAssistants la = new LabAssistants();

        String test = txtTest.getText();
        double price = Double.parseDouble(txtPrice.getText());
        

        if(test.isEmpty() || txtPrice.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please fill the empty fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String testmatch = "[A-Za-z]{1,100}";
        p = Pattern.compile(testmatch);
        if(p.matcher(test).matches()){
            JOptionPane.showMessageDialog(null, "Use only characters.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        System.out.println("Inside loop");
        boolean flag = business.getUserAccountDirectory().checkIfUsernameIsUnique(test);
        if(flag == false){
            JOptionPane.showMessageDialog(null, "Test already exists");
        }

        else{
            Product prod = new Product();
            //ecosystem.getCustomerdirectory().newCustomer(name, phone, age, streetaddress, emailaddress, username, password, country, city, zipcode);
            System.out.println("Inside else statement");
            //Employee employee = business.getEmployeeDirectory().createEmployee(name);
            //business.getUserAccountDirectory().createUserAccount(username, password, employee , new LabAssistantRole());
            
            prod.setName(test);
            prod.setPrice(price);
            
            products.add(prod);
            /*        
            for(Network n : business.getNetworks()){
                for(int i=0; i<n.getCustomerDirectory().getCustomerList().size(); i++){
                    for(int j=0; j<n.getCustomerDirectory().getCustomerList().get(i).getOrderlist().size(); j++){
                        
                        n.getCustomerDirectory().getCustomerList().get(i).getOrderlist().get(j).setLabAssistant(la);
                    }
                }
            }*/

            JOptionPane.showMessageDialog(null,"Details Added.");
        }

        txtTest.setText("");
        txtPrice.setText("");

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTest;
    // End of variables declaration//GEN-END:variables
}
