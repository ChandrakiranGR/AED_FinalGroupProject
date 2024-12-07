/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.LabTesterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandrkiran
 */
public class SampleCollectionTestingOrganization extends Organization {

    public SampleCollectionTestingOrganization(String name, String location, int zipcode) {
        super(Organization.Type.LabTester.getValue(), name, location, zipcode);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new LabAssistantRole());
        roles.add(new LabTesterRole());
        
        return roles;
    }
    
}
