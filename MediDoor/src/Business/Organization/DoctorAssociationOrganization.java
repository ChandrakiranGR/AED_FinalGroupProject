/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.PrescriberRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandrkiran
 */
public class DoctorAssociationOrganization extends Organization {
    
    public DoctorAssociationOrganization(String name, String location, int zipcode) {
        super(Organization.Type.Doctor.getValue(), name, location, zipcode);
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        roles.add(new PrescriberRole());
        
        return roles;
    }
}
