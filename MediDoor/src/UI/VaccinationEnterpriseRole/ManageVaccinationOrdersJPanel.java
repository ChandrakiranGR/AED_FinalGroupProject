/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.VaccinationEnterpriseRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.activation.*;
import javax.mail.Address;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;

/**
 *
 * @author vish
 */
public class ManageVaccinationOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVaccinationOrdersJPanel
     */

    private JPanel userProcessContainer;
    private Ecosystem business;
    private CustomerDirectory customerDirectory;
    UserAccount ua;
    DeliveryAgent dlvrymn;
    Enterprise enterprise;
    DefaultTableModel dtm;
    //ArrayList<DeliveryAgent> d;
    UserAccountDirectory userdir;
    Customer customer;
    private OrderItem itemsdir;
    private Order order;
    private ArrayList<Order> orderplaced = new ArrayList<Order>();
    Organization organization;
    Network network;
    ArrayList<DeliveryAgent> del;
    ArrayList<Integer> z;

    public ManageVaccinationOrdersJPanel(JPanel userProcessContainer, Ecosystem business,Network network,UserAccountDirectory userdir, Enterprise enterprise, Customer customer, Organization organization, UserAccount ua) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userdir = userdir;
        this.enterprise = enterprise;
        this.customer = customer;
        this.network = network;
        this.organization = organization;
         this.z = new ArrayList<>();
         this.ua = ua;
         this.dlvrymn = new DeliveryAgent();

        System.out.println("CAME INTO PHARMA ORDER PANEL");
        dtm = (DefaultTableModel) VaccineOrderTable.getModel();



        populateDp();
        //Immunization

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
        jScrollPane1 = new javax.swing.JScrollPane();
        VaccineOrderTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        deliverycmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        assignbtn = new javax.swing.JButton();
        btnshoworders = new javax.swing.JButton();
        orderscmb = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1500, 1000));

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VaccineOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product Name", "Name", "Zipcode", "Price", "Delivery agent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VaccineOrderTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 803, 120));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        deliverycmb.setForeground(new java.awt.Color(0, 102, 102));
        deliverycmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverycmbActionPerformed(evt);
            }
        });
        jPanel1.add(deliverycmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 148, 20));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Assign Delivery agent");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, -1, -1));

        assignbtn.setBackground(new java.awt.Color(0, 102, 102));
        assignbtn.setForeground(new java.awt.Color(255, 255, 255));
        assignbtn.setText("Assign");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });
        jPanel1.add(assignbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 680, 105, -1));

        btnshoworders.setBackground(new java.awt.Color(0, 102, 102));
        btnshoworders.setForeground(new java.awt.Color(255, 255, 255));
        btnshoworders.setText("Show Orders");
        btnshoworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowordersActionPerformed(evt);
            }
        });
        jPanel1.add(btnshoworders, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 130, -1));

        orderscmb.setForeground(new java.awt.Color(0, 102, 102));
        orderscmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderscmbActionPerformed(evt);
            }
        });
        jPanel1.add(orderscmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void deliverycmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverycmbActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_deliverycmbActionPerformed

    private void assignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtnActionPerformed
        // TODO add your handling code here:
       String agent = deliverycmb.getSelectedItem().toString();
        boolean emailsend = true;
        System.out.println("Inside assign button");
        dtm.setRowCount(0);
         ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
        String recipients = null;


             System.out.println("Inside table after assigning");
             try{
           for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                        if(o.getOrganizationname().equals("Immunization"))
                      {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> pr = new ArrayList<>();
                //  Order o : this.customer.getOrderlist()//              populate items
                for (int i = 0; i < oi.size(); i++) {

                    pr.add(oi.get(i).getProductName());
                }

                if("ACCEPTED".equals(o.getStatus()) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
                     System.out.println(" "+agent);
                     ArrayList<DeliveryAgent> del = enterprise.getDeliveryAgentsInEnterpiselist();
                     for(DeliveryAgent d: del){
                     if(d.getUseraccount().getUsername().equals(agent)){
                      d.setActive(false);
                      o.setDeliveryAgent(d);
                      System.out.println(" "+ o.getDeliveryAgent().getUseraccount().getUsername());
                      System.out.println(" "+ d.getActive());
                    //  o.getDeliveryAgent().getUseraccount().getUsername();
                      //d.getUseraccount().getUsername();

                    System.out.println("cmae hre ");
                     }
                     }
                     populateTable();

                    ArrayList<String> agentslist = new ArrayList<>();
                    agentslist.add(agent);

                    System.out.println(o.getDeliveryAgent().getUseraccount().getUsername());

        if(emailsend = true){

        JOptionPane.showMessageDialog(null, "Delivery agent assigned successful");
        int dialogueb = JOptionPane.INFORMATION_MESSAGE;
        System.out.println(""+dialogueb);
        int dialoguer = JOptionPane.showConfirmDialog(this, "SENDING EMAIL\n"
                + "If yes please wait","DELIVERY AGENT ASSIGNMENT", dialogueb);
        if(dialoguer == 0){
         recipients = cust.getEmail();
         System.out.println("Entering assign for email ==========");
         String subjects = "Delivery";
         String messaget = "Delivered agent assigned successfully";


        System.out.println("Start");
        final String username = "pannagaveeramohan@gmail.com";
        final String password = "9686300037";

        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "465");
        p.put("mail.transport.protocol", "smtp");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

         Session session = Session.getInstance(p,
                  new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                  });


        try {

            Transport transport=session.getTransport();
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("pannagaveeramohan@gmail.com"));//formBean.getString("fromEmail")

            final Address[] recipientAddresses = InternetAddress.parse(recipients);
            message.setRecipients(Message.RecipientType.TO,recipientAddresses);
            message.setSubject(subjects);//formBean.getString(
            message.setText(messaget);
            transport.connect();
            transport.send(message, recipientAddresses);//(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            System.out.println("e="+e);
            e.printStackTrace();
            throw new RuntimeException(e);

        }

    JOptionPane.showMessageDialog(null, "Email sent to customer successful");
  }else{
         JOptionPane.showMessageDialog(null, "Email sending cancelled");
        }

    }
    }
    }
    }
    }
             }catch(Exception ex){
                 System.out.println(" "+ex);
             }
    }//GEN-LAST:event_assignbtnActionPerformed

    private void btnshowordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowordersActionPerformed
        // TODO add your handling code here:

        ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
        System.out.println("Inside table");

        for(Customer cust: customerdir){
            for (Order o : cust.getOrderlist()) {
                if(orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId())) && o.getOrganizationname().equals("Immunization")){
                    deliverycmb.removeAllItems();
                    populateTable();
                }
            }
        }

    }//GEN-LAST:event_btnshowordersActionPerformed

    private void orderscmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderscmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderscmbActionPerformed

    private void displaycombobox() {

    }

    private void populateCustomerOrderTable() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VaccineOrderTable;
    private javax.swing.JButton assignbtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnshoworders;
    private javax.swing.JComboBox<String> deliverycmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> orderscmb;
    // End of variables declaration//GEN-END:variables

    private void populateDp() {
       ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
         System.out.println("Inside combo box");

            for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                //  Order o : this.customer.getOrderlist()//              populate items
                if("ACCEPTED".equals(o.getStatus()) && o.getOrganizationname().equals("Immunization")){
                orderscmb.addItem(String.valueOf(o.getOrderId()));
            }
        }

    }
    }

    private void populateTable() {
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);
         ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
          del = this.enterprise.getDeliveryAgentsInEnterpiselist();
         ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();
//         ArrayList<Product> products = this.organization.getOrganizationProducts();
             System.out.println("Inside table");
                this.z = new ArrayList<>();

                try{
                for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                      if(o.getOrganizationname().equals("Immunization"))
                      {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> p = new ArrayList<>();
                //  Order o : this.customer.getOrderlist()//              populate items
                //&& orderscmb.getSelectedItem().equals(o.getOrderId())
                for (int i = 0; i < oi.size(); i++) {

                    p.add(oi.get(i).getProductName());
                }
                if("ACCEPTED".equals(o.getStatus()) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){

                dtm.insertRow(dtm.getRowCount(), new Object[]{
                     o.getOrderId(),
                     Arrays.toString(p.toArray()),
                    cust.getName(),
                    cust.getZipcode(),
                    o.getPrice(),
                    o.getDeliveryAgent().getUseraccount().getUsername()
                });

             for(DeliveryAgent dd : del ){
         //   for(int j =0; j < dd.getZipcodes().get(j); j++ )
           // z.add(dd.getZipcodes().get(j));
              z = dd.getZipcodes();
              for(int j =0; j< dd.getZipcodes().size(); j++){
              if(cust.getZipcode() == z.get(j) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId())) && dd.getActive() == true){
                 deliverycmb.addItem(dd.getUseraccount().getUsername());
                }
                }
                }//closing delivery agent assignment
               }
               }//closing if statement
            }
      }
                }catch(Exception ex)
                {
                    System.out.println("Inside Vaccination Order Jpanel check it out");

                }

               System.out.println("Done with populate table");
    }
}
