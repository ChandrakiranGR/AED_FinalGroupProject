/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryAgentRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Payment.Payment;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import UI.MainJFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antaradeshmukh
 */
public class DeliveryAgentWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Ecosystem ecosystem;
    UserAccount account;
    UserAccountDirectory useraccountdirectory;
    Enterprise enterprise;
    Customer customer;
    Organization organization;
    Network network;
    UserAccount delmn;
    ArrayList<Integer> z;
    DefaultTableModel dtm;
    ArrayList<DeliveryAgent> del;
    private final ArrayList<DeliveryAgent> deliveryAgents;
    ArrayList<Order> orderlist;

    /**
     * Creates new form DeliveryAgentWorkAreaJPanel
     */
    public DeliveryAgentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        this.z = new ArrayList<>();
        if (this.ecosystem.getUserAccountDirectory() == null) {
            this.useraccountdirectory = new UserAccountDirectory();
            ecosystem.setUserAccountDirectory(useraccountdirectory);
        } else {
            this.useraccountdirectory = ecosystem.getUserAccountDirectory();

        }

        this.deliveryAgents = this.enterprise.getDeliveryAgentsInEnterpiselist();
        this.orderlist = new ArrayList<Order>();

        for (Customer c : this.network.getCustomerDirectory().getCustomerList()) {
            for (Order o : c.getOrderlist()) {
                if (o.getDeliveryAgent().getUseraccount() != null) {
                    System.out.println("Inside if condition");
                    if (o.getStatus().equalsIgnoreCase("accepted") || o.getStatus().equalsIgnoreCase("request collection")) {
                        if (o.getDeliveryAgent().getUseraccount().getUsername().equals(this.account.getUsername())) {
                            this.orderlist.add(o);
                        }
                    }
                }
            }
        }

        String orderpicked;
        String orderDelivered;

//        ArrayList<UserAccount> usrl = useraccountdirectory.getUserAccountList();
//        ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
//
        this.delmn = account;
        System.out.println(" " + delmn.getEmployee().getName());
        jLabel_DelMan1.setText(delmn.getEmployee().getName());

        System.out.println("CAME INTO DELIVERY AGENT PANEL");
        this.dtm = (DefaultTableModel) DeliveryOrderTable.getModel();
        //populateTable();
        populateDp();

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
        DeliveryOrderTable = new javax.swing.JTable();
        orderPicked_btn = new javax.swing.JButton();
        orderDelivered_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel_DelMan1 = new javax.swing.JLabel();
        orderscmb = new javax.swing.JComboBox();
        btnshoworders = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeliveryOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Product", "Name", "Zipcode", "Payment", "Delivery Status"
            }
        ));
        jScrollPane1.setViewportView(DeliveryOrderTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 550, 220));

        orderPicked_btn.setBackground(new java.awt.Color(0, 102, 102));
        orderPicked_btn.setForeground(new java.awt.Color(255, 255, 255));
        orderPicked_btn.setText("Order Picked");
        orderPicked_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderPicked_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderPicked_btnMouseEntered(evt);
            }
        });
        orderPicked_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderPicked_btnActionPerformed(evt);
            }
        });
        jPanel1.add(orderPicked_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 190, 44));

        orderDelivered_btn.setBackground(new java.awt.Color(0, 102, 102));
        orderDelivered_btn.setForeground(new java.awt.Color(255, 255, 255));
        orderDelivered_btn.setText("Order Delivered");
        orderDelivered_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderDelivered_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderDelivered_btnMouseEntered(evt);
            }
        });
        orderDelivered_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDelivered_btnActionPerformed(evt);
            }
        });
        jPanel1.add(orderDelivered_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 190, 44));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Welcome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel_DelMan1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel_DelMan1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_DelMan1.setText("<name>");
        jPanel1.add(jLabel_DelMan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        orderscmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderscmbActionPerformed(evt);
            }
        });
        jPanel1.add(orderscmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 110, -1));

        btnshoworders.setBackground(new java.awt.Color(0, 102, 102));
        btnshoworders.setForeground(new java.awt.Color(255, 255, 255));
        btnshoworders.setText("Show Orders");
        btnshoworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowordersActionPerformed(evt);
            }
        });
        jPanel1.add(btnshoworders, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4789, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateDp() {

        try {
            for (Order o : this.orderlist) {
                orderscmb.addItem(o.getOrderId());
            }
        } catch (Exception e) {

        }

    }


    private void orderPicked_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderPicked_btnActionPerformed
        // TODO add your handling code here:

        Date d = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // txtupdatedcat.setText(sdt.format(d));
        String status = null;
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);
        ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
        del = this.enterprise.getDeliveryAgentsInEnterpiselist();
        // ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();

        System.out.println("Inside table");

        for (Customer cust : customerdir) {
            for (Order o : cust.getOrderlist()) {
                if (o.getOrderId() == Integer.valueOf((int) orderscmb.getSelectedItem())) {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> p = new ArrayList<>();
                    for (int i = 0; i < oi.size(); i++) {

                        p.add(oi.get(i).getProductName());
                    }

                    if (o.getStatus().equalsIgnoreCase("ACCEPTED")) {
                        o.setStatus("OUT FOR DELIVERY");
                        status = "Order Picked";
                    } else {
                        o.setStatus("OUT FOR COLLECTION");
                        status = "Out for collection";
                    }

                    dtm.insertRow(dtm.getRowCount(), new Object[]{
                        o.getOrderId(),
                        Arrays.toString(p.toArray()),
                        cust.getName(),
                        cust.getZipcode(),
                        o.getOrderPayment().getStatus(),
                        status
                    });

//             for(DeliveryAgent dd : del ){
//         //   for(int j =0; j < dd.getZipcodes().get(j); j++ )
//           // z.add(dd.getZipcodes().get(j));
//              z = dd.getZipcodes();
//              for(int j =0; j< dd.getZipcodes().size(); j++){
//              if(cust.getZipcode() == z.get(j) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
//                 deliverycmb.addItem(dd.getUseraccount().getEmployee().getName());
//                }
//                }
//                }//closing delivery agent assignment
                }
            }//closing if statement
        }

        System.out.println("Done with order pick up table");

        JOptionPane.showMessageDialog(null, "Delivery agent picked up the order " + sdt.format(d));

    }//GEN-LAST:event_orderPicked_btnActionPerformed

    private void orderDelivered_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDelivered_btnActionPerformed
        // TODO add your handling code here:
        Date d = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String status = null;
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);

        ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
        del = this.enterprise.getDeliveryAgentsInEnterpiselist();
        // ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();

        System.out.println("Inside table");

        for (Customer cust : customerdir) {
            for (Order o : cust.getOrderlist()) {
                if (o.getOrderId() == Integer.valueOf((int) orderscmb.getSelectedItem())) {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> pi = new ArrayList<>();
                    for (int i = 0; i < oi.size(); i++) {

                        pi.add(oi.get(i).getProductName());
                    }

                    System.out.println("Inside out for delivery");
                    if (o.getOrderPayment().getStatus().equalsIgnoreCase("NOT PAID")) {
                        Payment odpayment = new Payment();
                        o.setOrderPayment(odpayment);
                        odpayment.setStatus("AMOUNT COLLECTED");
                    }

                    if (o.getStatus().equalsIgnoreCase("OUT FOR DELIVERY")) {
                        //"OUT FOR DELIVERY".equalsIgnoreCase(o.getStatus())
                        o.setStatus("ORDER DELIVERED");
                        status = "ORDER DELIVERED";
                        JOptionPane.showMessageDialog(null, "Delivery agent delivered the order" + sdt.format(d));
                    } else {
                        o.setStatus("ORDER REQUEST COLLECTED");
                        status = "ORDER REQUEST COLLECTED";
                        JOptionPane.showMessageDialog(null, "Delivery agent collected the order request" + sdt.format(d));
                    }

                    dtm.insertRow(dtm.getRowCount(), new Object[]{
                        o.getOrderId(),
                        Arrays.toString(pi.toArray()),
                        cust.getName(),
                        cust.getZipcode(),
                        o.getOrderPayment().getStatus(),
                        status
                    });

                    String recipients = cust.getEmail();

                    int dialogueb = JOptionPane.INFORMATION_MESSAGE;
                    System.out.println("" + dialogueb);
                    int dialoguer = JOptionPane.showConfirmDialog(this, "Please wait confirmation mail sending", "CUSTOMER NOTIFICATION IN PROCESS", dialogueb);

                    System.out.println(" " + dialoguer);
                    if (dialoguer == 0) {

                        System.out.println("Entering assign for email ==========");
                        String subjects = "Order Delivered";
                        String messaget = "Delivered agent delivered order successfully";

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

                            Transport transport = session.getTransport();
                            Message message = new MimeMessage(session);
                            message.setFrom(new InternetAddress("pannagaveeramohan@gmail.com"));//formBean.getString("fromEmail")

                            final Address[] recipientAddresses = InternetAddress.parse(recipients);
                            message.setRecipients(Message.RecipientType.TO, recipientAddresses);
                            message.setSubject(subjects);//formBean.getString(
                            message.setText(messaget);
                            transport.connect();
                            transport.send(message, recipientAddresses);//(message);

                            System.out.println("Done");

                        } catch (MessagingException e) {
                            System.out.println("e=" + e);
                            e.printStackTrace();
                            throw new RuntimeException(e);

                        }

                        JOptionPane.showMessageDialog(null, "Email sent to customer successful at " + sdt.format(d));
                    } else {
                        JOptionPane.showMessageDialog(null, "Email sent to customer cancelled ");
                    }
                }
            }
        }

    }//GEN-LAST:event_orderDelivered_btnActionPerformed

    private void orderPicked_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPicked_btnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_orderPicked_btnMouseClicked

    private void orderPicked_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPicked_btnMouseEntered
        // TODO add your handling code here:
   //     orderPicked_btn.setBackground(new Color(253, 252, 249));
    }//GEN-LAST:event_orderPicked_btnMouseEntered

    private void orderDelivered_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDelivered_btnMouseEntered
        // TODO add your handling code here:
      //  orderDelivered_btn.setBackground(new Color(253, 252, 249));
    }//GEN-LAST:event_orderDelivered_btnMouseEntered

    private void orderDelivered_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDelivered_btnMouseClicked
        // TODO add your handling code here:
        //  orderDelivered_btn.setBackground(new Color(205,60,180));
    }//GEN-LAST:event_orderDelivered_btnMouseClicked


    private void orderscmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderscmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderscmbActionPerformed

    private void btnshowordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowordersActionPerformed
        // TODO add your handling code here:
        System.out.println("Inside table");
        populateTable();

    }//GEN-LAST:event_btnshowordersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DeliveryOrderTable;
    private javax.swing.JButton btnshoworders;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_DelMan1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderDelivered_btn;
    private javax.swing.JButton orderPicked_btn;
    private javax.swing.JComboBox orderscmb;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        String status = "";
        System.out.println("Inside populate Table Delivery");
        dtm.setRowCount(0);
        ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
        del = this.enterprise.getDeliveryAgentsInEnterpiselist();
        // ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();

        // System.out.println("Inside table");
        for (Customer cust : customerdir) {
            for (Order o : cust.getOrderlist()) {
                if (o.getOrderId() == Integer.valueOf((int) orderscmb.getSelectedItem())) {

                    ArrayList<String> p = new ArrayList<>();
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    for (int i = 0; i < oi.size(); i++) {

                        p.add(oi.get(i).getProductName());
                    }

                    System.out.println(" " + delmn.getUsername());
                    //&& o.getDeliveryAgent().getUseraccount().getUsername() == account.getUsername()
                    dtm.insertRow(dtm.getRowCount(), new Object[]{
                        o.getOrderId(),
                        Arrays.toString(p.toArray()),
                        cust.getName(),
                        cust.getZipcode(),
                        o.getOrderPayment().getStatus(),
                        status
                    });

//             for(DeliveryAgent dd : del ){
//         //   for(int j =0; j < dd.getZipcodes().get(j); j++ )
//           // z.add(dd.getZipcodes().get(j));
//              z = dd.getZipcodes();
//              for(int j =0; j< dd.getZipcodes().size(); j++){
//              if(cust.getZipcode() == z.get(j) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
//                 deliverycmb.addItem(dd.getUseraccount().getEmployee().getName());
//                }
//                }
//                }//closing delivery agent assignment
                }
            }
        }
    }//closing if statement

}
