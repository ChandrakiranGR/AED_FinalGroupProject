/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.BloodBankRole.BloodBankWorkAreaPanel;
import UI.LabEnterpriseRole.LabEnterpriseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author antaradeshmukh
 */
public class EnterpriseBloodbank extends EnterpriseRole {

    JPanel BloodBankWorkAreaPanel;

   
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new BloodBankWorkAreaPanel(userProcessContainer);
    }
}
