/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabAssistants;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;

/**
 *
 * @author vachanabelgavi
 */
public class LabAssistants {
    
    private int labAssistantId;
    private static int count=0;
    private String name;
    private String email;
    private int phone;
    private String address;
    private String city;
    private int zipcode;
    private UserAccount useraccount;
    private Enterprise enterprisename;
    
    public LabAssistants(){
        
        this.labAssistantId = this.count++;
        this.useraccount = new UserAccount("admin", "adminpass123");

    }

    public int getLabAssistantId() {
        return labAssistantId;
    }

    public void setLabAssistantId(int labAssistantId) {
        this.labAssistantId = labAssistantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    public Enterprise getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(Enterprise enterprisename) {
        this.enterprisename = enterprisename;
    }
    
    public String toString(){
        return String.valueOf(labAssistantId);
    }
    
}
