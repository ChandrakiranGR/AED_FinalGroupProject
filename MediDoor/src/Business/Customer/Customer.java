/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Orders.Cart;
import Business.Orders.Order;
import Business.WorkQueue.PrescriptionUploadWorkRequest;
import Business.WorkQueue.ReportUploadWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Customer {
    private String name;
    private String email;
    private String location;
    private String address;
    private int phoneNumber;
    private int zipcode;
    private String username;
    private String password;
    private String type;
    
    ArrayList<Order> orderlist;
    Cart customerCart;
    
    private WorkQueue workQueue;
    ArrayList<PrescriptionUploadWorkRequest> customerPrescriptionRequestList;
    ArrayList<ReportUploadWorkRequest> labReportRequestList;
    
    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

//    Create orders for customer
    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
    
//    add customer orders to this
    public void addOrder(Order o) {
        this.orderlist.add(o);
    }

    public Order findOrderById(int id) {
        for(Order o: orderlist) {
            if(o.getOrderId() == id) {
                return o;
            }
        } 
        return null;
    }
    
    public Customer() {
        this.name = "";
        this.orderlist = new ArrayList<Order>();
        this.customerCart = new Cart();
        this.workQueue = new WorkQueue();
        this.customerPrescriptionRequestList = new ArrayList<PrescriptionUploadWorkRequest>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cart getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(Cart customerCart) {
        this.customerCart = customerCart;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ArrayList<PrescriptionUploadWorkRequest> getCustomerPrescriptionRequestList() {
        return customerPrescriptionRequestList;
    }

    public void setCustomerPrescriptionRequestList(ArrayList<PrescriptionUploadWorkRequest> customerPrescriptionRequestList) {
        this.customerPrescriptionRequestList = customerPrescriptionRequestList;
    }

    public ArrayList<ReportUploadWorkRequest> getLabReportRequestList() {
        return labReportRequestList;
    }

    public void setLabReportRequestList(ArrayList<ReportUploadWorkRequest> labReportRequestList) {
        this.labReportRequestList = labReportRequestList;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
