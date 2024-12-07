/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
