/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationPanels;

import Business.Customer.Customer;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanisugurushetty
 */
public class PaymentsJPanel extends javax.swing.JPanel {

    private final Customer customer;
    private final DefaultTableModel tableModel;
    private final DefaultTableModel payModel;
    private Order order;

    /**
     * Creates new form PaymentsJPanel
     */
    public PaymentsJPanel(Customer c) {
        initComponents();
        
        this.customer  = c;
        this.tableModel = (DefaultTableModel) itemtable.getModel();
        this.payModel = (DefaultTableModel) PAYtABLE.getModel();
        populateDropdown();
        populatePayments();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboOrder = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LABELtOTAL = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PAYtABLE = new javax.swing.JTable();

        setBackground(new java.awt.Color(253, 252, 249));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SWIFT PAYMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 62, -1, -1));

        add(comboOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ORDER REVIEW");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        itemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ", "ITEM QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 280, 250));

        jLabel3.setText("DELIVERY FEE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel4.setText("TAX");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel5.setText("ADDRESS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel6.setText("ORDER TOTAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel7.setText("....");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel8.setText("$ 5.00");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel9.setText("$ 3.5");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        LABELtOTAL.setText(".");
        jPanel1.add(LABELtOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 40, -1));

        jLabel10.setText("$");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 320, 510));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Retrieve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, -1, -1));

        PAYtABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PAYMENT ID", "ORDER ID", "AMOUNT", "DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PAYtABLE);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            this.order = this.customer.findOrderById((int) comboOrder.getSelectedItem());
            
            Double total = this.order.getPrice()  + 5.00 + 3.5;
            
            populateItems();
            jLabel7.setText(this.customer.getAddress());
            LABELtOTAL.setText(String.valueOf(total));
            
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
       this.order.getOrderPayment().setStatus("PAID");
       this.order.getOrderPayment().setPaymentDate(new Date());
       this.order.getOrderPayment().setAmount(Double.valueOf(LABELtOTAL.getText()));
       
       this.order.setPrice(Double.valueOf(LABELtOTAL.getText()));
       
       JOptionPane.showMessageDialog(null, "PAYMENT RECEIVED \n" + this.order.getOrderPayment().getPaymentID() + " is your Payment ID");
       populatePayments();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populatePayments() {
          this.payModel.setRowCount(0);
        
        try{
            
            for(Order o: this.customer.getOrderlist()) {
                if(o.getOrderPayment().getStatus().equalsIgnoreCase("paid")) {
                   this.payModel.insertRow(this.payModel.getRowCount(), new Object[] {
                       o.getOrderPayment().getPaymentID(),
                       o.getOrderId(),
                       o.getOrderPayment().getAmount(),
                       o.getOrderPayment().getPaymentDate()
                   });
                }
            }
            
        } catch (Exception e) {
            
        }
    }
    
    public void populateItems() {
        this.tableModel.setRowCount(0);
        
        try {
            
            for(OrderItem oi: this.order.getItemsOrdered()) {
                this.tableModel.insertRow(this.tableModel.getRowCount(), new Object[] {
                    oi.getProductName(),
                    oi.getQty()
                });
            }
            
        } catch (Exception e) {
            
        }
    }
    
    public void populateDropdown() {
        try{
            
            for(Order o: this.customer.getOrderlist()) {
                if(o.getOrderPayment().getStatus().equalsIgnoreCase("not paid")) {
                    comboOrder.addItem(o.getOrderId());
                }
            }
            
        } catch (Exception e) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABELtOTAL;
    private javax.swing.JTable PAYtABLE;
    private javax.swing.JComboBox comboOrder;
    private javax.swing.JTable itemtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
