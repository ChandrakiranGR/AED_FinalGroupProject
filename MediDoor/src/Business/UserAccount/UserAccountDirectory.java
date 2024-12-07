/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Role.EnterpriseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vish
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return this.userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount user : userAccountList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }

        }
        return null;
    }

    public UserAccount createEnterpriseUser(String username, String password, Employee employee, EnterpriseRole eRole) {
        UserAccount userEaccount = new UserAccount();
        userEaccount.setEmployee(employee);
        userEaccount.setEnterpriseRole(eRole);
        userEaccount.setUsername(username);
        userEaccount.setPassword(password);
        this.userAccountList.add(userEaccount);
        return userEaccount;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount useraccount = new UserAccount();
        useraccount.setEmployee(employee);
        useraccount.setRole(role);
        useraccount.setUsername(username);
        useraccount.setPassword(password);
        this.userAccountList.add(useraccount);
        return useraccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username) {
        for(UserAccount useracc: userAccountList) {
            if(useracc.getUsername().equals(username)) {
                return false;
            }
        } 
        
        return true;
    }
    
    public UserAccount findUser(String name) {
        for(UserAccount useracc: userAccountList) {
            if(useracc.getUsername().equals(name)) {
                return useracc;
            }
        }
        return null;
    }
}
