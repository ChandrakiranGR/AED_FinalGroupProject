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
import UI.DeliveryAgentRole.DeliveryAgentWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vish
 */
public class DeliveryAgentRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem system) {
        System.out.println("Inside Delivery agent role");
        return new DeliveryAgentWorkAreaJPanel(userProcessContainer, account, network,organization, enterprise, system); 
        
    }
}
