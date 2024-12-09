/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.UserAccount.UserAccount;
import java.util.Random;

/**
 *
 * @author vish
 */
public abstract class WorkRequest {
//    dealing with work requests across users only
    private Customer customer;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private int requestId;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    
    public void generateRequestId() {
        Random r = new Random(System.currentTimeMillis());
        
        this.requestId = ((1+r.nextInt(2))*10000 + r.nextInt(10000));
    }
    
}

