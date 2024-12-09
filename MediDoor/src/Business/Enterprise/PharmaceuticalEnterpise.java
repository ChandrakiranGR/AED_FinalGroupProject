/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Role.EnterpriseRole;
import Business.Enterprise.Role.PharmaceuticalEnterpriseAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivanisugurushetty
 */
public class PharmaceuticalEnterpise extends Enterprise {
    public PharmaceuticalEnterpise(String name, String location){
        super(EnterpriseType.Pharmaceutical, name, location);
    }

    public ArrayList<EnterpriseRole> getSupportedRole() {
        ArrayList<EnterpriseRole> roles = new ArrayList();
        roles.add(new PharmaceuticalEnterpriseAdminRole());
        
        return roles;
    }
}
