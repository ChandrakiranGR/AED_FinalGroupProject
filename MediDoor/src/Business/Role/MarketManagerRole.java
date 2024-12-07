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
import UI.OrganizationAdminPanels.SupermarketAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vish
 */
public class MarketManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new SupermarketAdminJPanel(userProcessContainer, business, account, network, organization, enterprise);
    }
}
