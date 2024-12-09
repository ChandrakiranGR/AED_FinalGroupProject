/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DeliveryAgent.DeliveryAgent;
import Business.Orders.OrderItem;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
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
