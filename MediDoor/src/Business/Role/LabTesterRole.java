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
import UI.LabSamples.SampleCollectionJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vish
 */
public class LabTesterRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new SampleCollectionJPanel(userProcessContainer, account, business, network, organization, enterprise); 
    }
}
