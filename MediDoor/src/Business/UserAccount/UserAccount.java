/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Role.EnterpriseRole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private EnterpriseRole enterpriseRole;
    private WorkQueue workQueue;

    public UserAccount(String admin, String adminpass123) {
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
