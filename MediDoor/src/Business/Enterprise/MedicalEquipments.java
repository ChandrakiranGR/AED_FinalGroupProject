/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Role.EnterpriseRole;
import Business.Enterprise.Role.EquipmentEnterpriseRole;
import Business.Enterprise.Role.PharmaceuticalEnterpriseAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class MedicalEquipments extends Enterprise {
    public MedicalEquipments(String name, String location){
        super(Enterprise.EnterpriseType.MedicalEquipements, name, location);
    }

    public ArrayList<EnterpriseRole> getSupportedRole() {
        ArrayList<EnterpriseRole> roles = new ArrayList();
        roles.add(new EquipmentEnterpriseRole());
        
        return roles;
    }
}
