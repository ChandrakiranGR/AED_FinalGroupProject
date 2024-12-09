/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Enterprise.Role.EnterpriseRole;
import Business.Enterprise.Role.LabEnterprise;
import Business.Enterprise.Role.PharmaceuticalEnterpriseAdminRole;
import java.util.ArrayList;

/**
 *
 * @author shivanisugurushetty
 */
public class LabOrgDiagnosticsEnterprise extends Enterprise {
    public LabOrgDiagnosticsEnterprise(String name, String location){
        super(EnterpriseType.LabDiagnostics, name, location);
    }

    public ArrayList<EnterpriseRole> getSupportedRole() {
        ArrayList<EnterpriseRole> roles = new ArrayList();
        roles.add(new LabEnterprise());
        
        return roles;
    }
}
