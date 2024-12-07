/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Role.EnterpriseRole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author vish
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private EnterpriseRole enterpriseRole;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
        username = "";
        password = "";
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public EnterpriseRole getEnterpriseRole() {
        return enterpriseRole;
    }

    public void setEnterpriseRole(EnterpriseRole enterpriseRole) {
        this.enterpriseRole = enterpriseRole;
    }

    public ArrayList<String> getRoleTypes() {
        return Role.RoleType.allRoles();
    }

    public ArrayList<EnterpriseRole.EnterpriseRoleType> getEnterpriseRoleTypes() {
        return EnterpriseRole.EnterpriseRoleType.allEnterpriseRoles();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

}
