/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.DeliveryAgent.DeliveryAgent;
import Business.Orders.OrderItem;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author vish
 */
// An order will be first created and linked to a Lab Reports

public class ReportUploadWorkRequest extends WorkRequest{
    
    private File report;
    private int orderId;
    private String comments;
    private String signature;
    ArrayList<OrderItem> testOrderItems;
    DeliveryAgent deliveryAgent;
    
    //    status is covered in abstract class
    
    public ReportUploadWorkRequest() {
        this.testOrderItems = new ArrayList<>();
    }

    public File getReport() {
        return report;
    }

    public void setReport(File report) {
        this.report = report;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public ArrayList<OrderItem> getTestOrderItems() {
        return testOrderItems;
    }

    public void setTestOrderItems(ArrayList<OrderItem> testOrderItems) {
        this.testOrderItems = testOrderItems;
    }

    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliverAgent) {
        this.deliveryAgent = deliverAgent;
    }

    
}
