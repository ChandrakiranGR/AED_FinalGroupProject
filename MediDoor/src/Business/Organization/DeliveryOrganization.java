/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DeliveryAgentRole;
import Business.Role.LabAssistantRole;
import Business.Role.LabTesterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandrkiran
 */
public class DeliveryOrganization extends Organization {
    public DeliveryOrganization(String name, String location, int zipcode) {
        super(Organization.Type.DeliveryAgent.getValue(), name, location, zipcode);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new DeliveryAgentRole());
        
        return roles;
    }
}