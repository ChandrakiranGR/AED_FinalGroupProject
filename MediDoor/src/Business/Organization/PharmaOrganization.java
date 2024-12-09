/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.PharmaOrgManagerRole;
import Business.Role.PrescriberRole;
import Business.Role.Role;
import Business.Role.VaccinatorRole;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class PharmaOrganization extends Organization {
    public PharmaOrganization(String name, String location, int zipcode) {
        super(Organization.Type.PharmaOrgAdmin.getValue(), name, location, zipcode);
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmaOrgManagerRole());
        roles.add(new VaccinatorRole());
        
        return roles;
    }
}
