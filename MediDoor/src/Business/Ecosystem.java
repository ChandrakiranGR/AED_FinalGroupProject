


package Business;
import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class Ecosystem extends Organization {

    public static Ecosystem ecosystem;
    private ArrayList<Network> networkList;
    
//    private BloodBankDirectory bloodBankDirectory;//

    public Network createNetwork() {
        Network network = new Network();
        this.networkList.add(network);
        return network;
    }

    private Ecosystem() {
        super(null, "", "", 0);

        this.networkList = new ArrayList<Network>();
//        this.bloodBankDirectory = new BloodBankDirectory();
    }
    //Getter for Blood Bank direc
//    public BloodBankDirectory getBloodBankDirectory() {
//        return this.bloodBankDirectory;
//    }

    // Setter for BloodBankDirectory (Optional, depending on design)
//    public void setBloodBankDirectory(BloodBankDirectory bloodBankDirectory) {
//        this.bloodBankDirectory = bloodBankDirectory;
//    }

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
    Ecosystem system = (Ecosystem) database.retrieveSystem();
    
    // Initialize BloodBankDirectory if it's not already initialized
//    if (system.getBloodBankDirectory() == null) {
//        system.setBloodBankDirectory(new BloodBankDirectory());
//    }

    
    
    
    
//    
//     if (system.getBloodBankDirectory() == null) {
//        system.setBloodBankDirectory(new BloodBankDirectory());
//    }
//    
//    // Create UserAccount for BloodBank Admin (During initialization)
//  UserAccount bloodBankAdminAccount = new UserAccount("adminBank", "adminpass123");  // Create UserAccount for BloodBank Admin

// Assign the BloodBankAdminRole to the UserAccount
//bloodBankAdminAccount.setRole(new BloodBankAdminRole());

// Create BloodBank and associate it with the UserAccount
//BloodBank bloodBank = new BloodBank("City Blood Bank", "Downtown", "A+", 50, "123-456-7890");
//bloodBank.setUserAccount(bloodBankAdminAccount);

// Add the blood bank to the directory
//system.getBloodBankDirectory().addBloodBank(bloodBank);
  
         
         
         
         


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
        // Example: Add blood bank during initialization (optional)
//        system.getBloodBankDirectory().addBloodBank(
//            "City Blood Bank",
//            "Downtown",
//            "A+",
//            50,
//            "123-456-7890"
//            
//        );
//         UserAccount bloodBankAdminAccount = new UserAccount("admin", "adminpass123");
//
//        // Print blood bank details (for testing)
//        for (var bloodBank : system.getBloodBankDirectory().getBloodBankList()) {
//            System.out.println("Blood Bank: " + bloodBank.getName() + ", Type: " + bloodBank.getBloodType());
//        }
        
        

    }
}