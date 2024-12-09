
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.PrescriberRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UI.EquipmentEnterpriseRole.EquipmentEnterpriseWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class EquipmentEnterpriseRole extends EnterpriseRole {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem business) {
      return new EquipmentEnterpriseWorkAreaJPanel(userProcessContainer,account,network,organization,enterprise,business); 
    }
}
