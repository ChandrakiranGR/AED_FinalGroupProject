/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Customer.CustomerWorkAreaJPanel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerRole {
    public JPanel createWorkArea(JPanel userProcessContainer, Ecosystem system, Network network, Customer customer) {
        return new CustomerWorkAreaJPanel(userProcessContainer, system, network, customer); 
    }

}
