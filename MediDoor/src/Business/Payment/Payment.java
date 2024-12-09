package Business.Payment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

/**
 *
 * @author chandrakiran
 */
public class Payment {
    private int paymentID;
    private double amount;
    private Date paymentDate;
    private String status;
    private static int count = 0;
    
    public Payment() {
        this.paymentDate = new Date();
        this.amount = 0.0;
        this.count++;
        this.paymentID = this.count;
        this.status = "NOT PAID";
    }
    
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID() {
        this.paymentID = this.count;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
