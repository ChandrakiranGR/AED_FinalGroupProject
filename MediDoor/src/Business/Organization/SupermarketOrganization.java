/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.LabTesterRole;
import Business.Role.MarketManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chandrakiran
 */
public class SupermarketOrganization extends Organization {
    public SupermarketOrganization(String name, String location, int zipcode) {
        super(Organization.Type.MarketManager.getValue(), name, location, zipcode);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new MarketManagerRole());
        
        return roles;
    }
}
