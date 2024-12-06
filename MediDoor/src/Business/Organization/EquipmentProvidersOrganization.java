/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.EquipmentProviderRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author chandrkiran
 */
public class EquipmentProvidersOrganization extends Organization {
    public EquipmentProvidersOrganization(String name, String location, int zipcode) {
        super(Organization.Type.EquipmentManager.getValue(), name, location, zipcode);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new EquipmentProviderRole());
        
        return roles;
    }
}

