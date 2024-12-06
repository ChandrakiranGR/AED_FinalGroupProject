/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;

import Business.DeliveryAgent.DeliveryAgent;
import Business.LabAssistants.LabAssistants;
import Business.Payment.Payment;
import java.util.ArrayList;
import java.io.File;
/**
 *
 * @author chandrkiran
 */
public class Order {
    
    private String name;
    private String status;
    private double price;
    private File prescription;
    private int orderId;
    private static int count = 0;
    private String organizationname;
    private String enterprisename;
    
    private ArrayList<OrderItem> itemsOrdered;
    
    // A payment is attached to an order
    Payment orderPayment;
    DeliveryAgent deliveryAgent;
    LabAssistants labAssistant;
    
    public Order() {
        this.name = "";
        this.price = 0.0;
        this.orderPayment = new Payment();
        this.count++;
        this.orderId = this.count;
        this.itemsOrdered = new ArrayList<OrderItem>();
        this.deliveryAgent = new DeliveryAgent();
        this.labAssistant = new LabAssistants();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public File getPrescription() {
        return prescription;
    }

    public void setPrescription(File prescription) {
        System.out.println("CAME TO SET PRESCRIPTION "+ prescription.getAbsolutePath());
        this.prescription = prescription;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Payment getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(Payment orderPayment) {
        this.orderPayment = orderPayment;
    }

    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public void calcOrderTotal() {
        double sum = 0.0;
        for(OrderItem oi: this.itemsOrdered) {
            sum += oi.getQty()*oi.getProductPrice();
        }
        this.price = sum;
    }

    public ArrayList<OrderItem> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(ArrayList<OrderItem> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LabAssistants getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(LabAssistants labAssistant) {
        this.labAssistant = labAssistant;
    }
    
    
}
