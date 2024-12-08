/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Orders.OrderItem;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author vish
 */
// An order will be first created and linked to a Prescription

public class PrescriptionUploadWorkRequest extends WorkRequest {
    private File presecription;
    private int orderId;
    private String comments;
    private String signature;
    ArrayList<OrderItem> prescribedOrderItems;
//    status is covered in abstract class
    
    
    public PrescriptionUploadWorkRequest() {
        this.prescribedOrderItems = new ArrayList<>();
    }

    public File getPresecription() {
        return presecription;
    }

    public void setPresecription(File presecription) {
        this.presecription = presecription;
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

    public ArrayList<OrderItem> getPrescribedOrderItems() {
        return prescribedOrderItems;
    }

    public void setPrescribedOrderItems(ArrayList<OrderItem> prescribedOrderItems) {
        this.prescribedOrderItems = prescribedOrderItems;
    }  
    
}
