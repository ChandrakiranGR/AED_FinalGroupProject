/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author chandrkiran
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
