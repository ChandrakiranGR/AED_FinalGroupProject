
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabEnterpriseRole;
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
 * @author chandrakiran
 */
public class ManageLabDeliveryAgentJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
    Ecosystem business;
    UserAccountDirectory userdir;
    UserAccount ua;
    DeliveryAgent dlvrymn;
    Enterprise enterprise;
    DefaultTableModel dtm;
    ArrayList<DeliveryAgent> del;
    ArrayList<Integer> z;
    Network network;

    /**
     * Creates new form ManageLabDeliveryAgentJPanel
     */
    public ManageLabDeliveryAgentJPanel(JPanel userProcessContainer, Ecosystem ecosystem,Network network, UserAccount ua,UserAccountDirectory userdir, Enterprise enterprise) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = ecosystem;
        this.ua = ua;
        this.userdir = userdir;
        this.enterprise = enterprise;
        this.network = network;
        this.z = new ArrayList<>();
        System.out.println("CAME INTO LAB DELIVERY AGENT PANEL");



        this.dtm = (DefaultTableModel) delivery.getModel();
        System.out.println("Going inside populate table");
        populateTable();
        displaycombo();



        if(this.business.getUserAccountDirectory() == null) {
            this.userdir = new UserAccountDirectory();
            business.setUserAccountDirectory(userdir);
        } else {
            this.userdir = business.getUserAccountDirectory();

        }




    }

    private void displaycombo() {

         del = enterprise.getDeliveryAgentsInEnterpiselist();

              z = network.getZipcodes();
              for(int i =0; i< z.size(); i++){
              cmbzipcode.addItem(z.get(i).toString());
              }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        delivery = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jcheckyes = new javax.swing.JCheckBox();
        jcheckno = new javax.swing.JCheckBox();
        cmbzipcode = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1500, 1000));

        jPanel3.setBackground(new java.awt.Color(253, 252, 249));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery agent");

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        jLabel2.setText("Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 155, -1, -1));

        jLabel7.setText("Zipcode");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel8.setText("Username");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel9.setText("Password");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 150, 200, -1));
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 194, -1));
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 194, -1));

        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 30));

        btndelete.setBackground(new java.awt.Color(0, 102, 102));
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 110, 30));

        delivery.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(delivery);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 477, 323));

        jLabel3.setText("Active");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jcheckyes.setText("yes");
        jcheckyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckyesActionPerformed(evt);
            }
        });
        jPanel3.add(jcheckyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jcheckno.setText("no");
        jcheckno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchecknoActionPerformed(evt);
            }
        });
        jPanel3.add(jcheckno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        cmbzipcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel3.add(cmbzipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        //        userProcessContainer.remove(this);
        //        Component[] componentArray = userProcessContainer.getComponents();
        //        Component component = componentArray[componentArray.length - 1];
        //        PharmaceuticalEnterpriseJPanel sysAdminwjp = (PharmaceuticalEnterpriseJPanel) component;
        //      populateTable();
        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        Employee em = new Employee();
        DeliveryAgent d = new DeliveryAgent();
        UserAccount u = d.getUseraccount();

        String name = txtName.getText();
        int zip = Integer.parseInt((String) cmbzipcode.getSelectedItem());
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        boolean available;
        if(jcheckyes.isSelected() == true){
            available = true;
        }
        else if(jcheckno.isSelected() == true)
        {
            available = true;
        }else{
            available = false;
        }

        if(name.isEmpty() ||
            txtPassword.getText().isEmpty() || username.isEmpty() || password.isEmpty() || cmbzipcode.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill the empty fields", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        if(txtZipcode.getText().length() < 5 || txtZipcode.getText().length() > 6){
//            JOptionPane.showMessageDialog(null, "Zip code must be 5 or 6 digits", "Warining", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        System.out.println("Inside loop");
        boolean flag = business.getUserAccountDirectory().checkIfUsernameIsUnique(username);
        if(flag == false){
            JOptionPane.showMessageDialog(null, "User name already exists");
        }

        else{
            //ecosystem.getCustomerdirectory().newCustomer(name, phone, age, streetaddress, emailaddress, username, password, country, city, zipcode);
            System.out.println("Inside else statement");
            //Employee employee = business.getEmployeeDirectory().createEmployee(name);
            //business.getUserAccountDirectory().createUserAccount(username, password, employee , new DeliveryAgentRole());

            ArrayList<Integer> zipcodes = new ArrayList<Integer>();
            zipcodes.add(zip);
            ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
            em.setName(name);
            u.setUsername(username);
            u.setPassword(password);
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
           // d.setUseraccount(u);
            d.setZipcodes(zipcodes);
            d.setEnterprisename(enterprise);

            if(available == true){
                d.setActive(true);
            }else{
                d.setActive(false);
            }
            delList.add(d);
            enterprise.setDeliveryAgentsInEnterpiselist(delList);

            JOptionPane.showMessageDialog(null,"Delivery agent Added.");
            populateTable();
        }

        txtName.setText("");
        cmbzipcode.setSelectedItem("");
        txtUsername.setText("");
        txtPassword.setText("");
        jcheckyes.setSelected(false);
        jcheckno.setSelected(false);


    }//GEN-LAST:event_btnAddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectrow = delivery.getSelectedRow();
        String name = delivery.getValueAt(selectrow, 0).toString();

        if(selectrow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ArrayList<UserAccount> usrl = userdir.getUserAccountList();
        ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
        String deliveryman = dtm.getValueAt(selectrow,0).toString();
        //        ArrayList<Integer> z1 = new ArrayList<>();
        //        z1.add((Integer) dtm.getValueAt(selectrow,1));
        // String zipcodes = dtm.getValueAt(selectrow,1).toString();
        //  String available = dtm.getValueAt(selectrow, 2).toString();
        String uname = dtm.getValueAt(selectrow,3).toString();
        String passwd = dtm.getValueAt(selectrow,4).toString();
        int dialogueb = JOptionPane.YES_NO_OPTION;
        int dialoguer = JOptionPane.showConfirmDialog(this, "Delete this data","Delete", dialogueb);
        if(dialoguer == 0){

            try{
                for(DeliveryAgent dm: delList){
                    if(dm.getUseraccount().getEmployee().getName().equals(deliveryman) && dm.getUseraccount().getUsername().equals(uname)){
                        delList.remove(dm);
                        System.out.println("Removed delivery man");
                    }
                }
            }
            catch(Exception ex){
                System.out.println("Exception caught");
            }

            for(UserAccount ua:usrl ){
                if(ua.getUsername().equals(uname) || ua.getPassword().equals(passwd)){
                    // usrl.remove(uname);
                    usrl.remove(dtm.getValueAt(selectrow,3));
                    usrl.remove(dtm.getValueAt(selectrow,4));
                    //  usrl.remove(ua.getPassword().equals(passwd));

                    System.out.println("Removed username and password");
                }
            }

            this.dtm.removeRow(selectrow);
        }

        populateTable();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jcheckyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckyesActionPerformed

    private void jchecknoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchecknoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchecknoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox<String> cmbzipcode;
    private javax.swing.JTable delivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcheckno;
    private javax.swing.JCheckBox jcheckyes;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
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
}
