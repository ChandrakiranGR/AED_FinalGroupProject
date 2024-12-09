/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author chandrkiran
 */
public class Network {
    private String networkName;
    private ArrayList<Integer> zipcodes;
//    Customers 
    private CustomerDirectory customerDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network() {
        this.zipcodes = new ArrayList<>();
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.customerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    private Customer checkCustomerInNetwork(String name) {
        for(Customer cust: customerDirectory.getCustomerList()) {
            if(cust.getUsername().equals(name)) {
                return cust;
            }
        }
        return null;
    }

    public ArrayList<Integer> getZipcodes() {
        return zipcodes;
    }

    public void setZipcodes(ArrayList<Integer> zipcodes) {
        this.zipcodes = zipcodes;
    }
    
    
    
    @Override
    public String toString() {
        return networkName;        
    }
    
}

