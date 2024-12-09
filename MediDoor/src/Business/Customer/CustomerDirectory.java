/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerlist;
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }
    
    public void setCustomerDirectory(ArrayList<Customer> customerdirectory) {
        this.customerlist = customerdirectory;
    }
    
    public ArrayList<Customer> getCustomerList() {
        return this.customerlist;
    }
    
    public Customer createCustomer(String name, String email, String username, String password, int zipcode, String location, String address, int phoneNumber) {
        Customer customer = new Customer();
        customer.setAddress(address);
        customer.setEmail(email);
        customer.setUsername(username);
        customer.setPassword(password);
        customer.setLocation(location);
        customer.setName(name);
        customer.setPhoneNumber(phoneNumber);
        customer.setZipcode(zipcode);
        
        this.customerlist.add(customer);
        
        return customer;
    }
    
    public Customer authenticateCustomer(String username, String password) {
        for(Customer c: customerlist) {
            if(c.getUsername().equals(username) && c.getPassword().equals(password)) {
                return c;
            }
        }
        
        return null;
    }
    
    public Customer searchCustomer(String name){
        for (Customer cust : customerlist) {
            if (cust.getName().equalsIgnoreCase(name)) {
                return cust;
            }
        }
        return null;
    }
}
