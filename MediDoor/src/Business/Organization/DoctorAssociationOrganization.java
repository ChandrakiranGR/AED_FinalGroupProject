/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.PrescriberRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandrakiran
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
