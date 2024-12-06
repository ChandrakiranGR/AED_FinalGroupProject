package Business.Organization;


import Business.Role.LabAssistantRole;
import Business.Role.LabTesterRole;
import Business.Role.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chandrkiran
 */
public class PharmacyOrganization extends Organization {
    public PharmacyOrganization(String name, String location, int zipcode) {
        super(Organization.Type.Pharmacist.getValue(), name, location, zipcode);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new PharmacistRole());
        
        return roles;
    }
}
