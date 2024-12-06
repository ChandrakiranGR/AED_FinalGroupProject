/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.Network.Network;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author antaradeshmukh
 */
public class Ecosystem {
    
    public static Ecosystem ecosystem;
    private ArrayList<Network> networkList;

    public Network createNetwork() {
        Network network = new Network();
        this.networkList.add(network);
        return network;
    }

    private Ecosystem() {
        super(null, "", "", 0);

        this.networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworks() {
        return this.networkList;
    }

    public ArrayList<String> getRoleTypes() {
        return Role.RoleType.allRoles();
    }

    public static Ecosystem getInstance() {
        if (ecosystem == null) {
            return new Ecosystem();
        } else {
            return ecosystem;
        }
    }

    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public Network getNetwork(String name){
        for(Network n : networkList){
            if(n.getNetworkName().equalsIgnoreCase(name))
                return n;
        }
        return null;
    }

    public void removeNetwork(Network n){
        networkList.remove(n);
    }

    public static void main(String args[]) {
//        main function
        System.out.println("Hey there!");
        DB4OUtil database = DB4OUtil.getInstance();
        Ecosystem system = database.retrieveSystem();

        System.out.println("SYSTEM -- " + system.getEmployeeDirectory().getEmployeeList().get(0).getName());
        System.out.println(system.getSupportedRole());

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        System.out.println(system.getNetworks().get(0).getNetworkName());
        for (Network n : system.getNetworks()) {
            System.out.println("Network name -- " + n.getNetworkName());

            for (Customer c : n.getCustomerDirectory().getCustomerList()) {
                System.out.println(c.getName());
            }

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println("Enterprise name -- " + e.getEnterpriseType().toString());

                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    System.out.println("Organizations >> " + o.getName());

                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        System.out.println("USERS :: " + ua.getUsername());
                    }
                }
            }
        }

    }
    
}
