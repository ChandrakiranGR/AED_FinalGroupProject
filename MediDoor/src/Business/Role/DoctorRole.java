/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.OrganizationAdminPanels.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vish
 */
public class DoctorRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, business, account, network, organization, enterprise); 
}
    }
