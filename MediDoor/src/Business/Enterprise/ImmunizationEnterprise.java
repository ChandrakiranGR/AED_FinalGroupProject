/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Role.EnterpriseRole;
import Business.Enterprise.Role.LabEnterprise;
import Business.Enterprise.Role.VaccinationEnterpriseRole;
import java.util.ArrayList;

/**
 *
 * @author shivanisugurushetty
 */
public class ImmunizationEnterprise extends Enterprise {
     public ImmunizationEnterprise(String name, String location){
        super(Enterprise.EnterpriseType.Vaccination, name, location);
    }

    public ArrayList<EnterpriseRole> getSupportedRole() {
        ArrayList<EnterpriseRole> roles = new ArrayList();
        roles.add(new VaccinationEnterpriseRole());
        
        return roles;
    }
}
