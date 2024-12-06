/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DeliveryAgent;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author antaradeshmukh
 */
public class DeliveryAgent {
    
    private int deliveryboyId;
    private Enterprise enterprisename;
    private static int count = 0;
    private boolean active;
    private ArrayList<Integer> zipcodes;
    UserAccount useraccount;

    public DeliveryAgent() {
        this.deliveryboyId = this.count++;
        this.active = true;
        this.useraccount = new UserAccount();
        this.zipcodes = new ArrayList<>();
    }
    
    public int getDeliveryboyId() {
        return deliveryboyId;
    }

    public void setDeliveryboyId(int deliveryboyId) {
        this.deliveryboyId = deliveryboyId;
    }

    public Enterprise getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(Enterprise enterprisename) {
        this.enterprisename = enterprisename;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DeliveryAgent.count = count;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ArrayList<Integer> getZipcodes() {
        return zipcodes;
    }

    public void setZipcodes(ArrayList<Integer> zipcodes) {
        this.zipcodes = zipcodes;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
    
    public String toString(){
        return String.valueOf(deliveryboyId);
    }
    
}
