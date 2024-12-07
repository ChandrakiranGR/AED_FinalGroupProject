/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author vish
 */
public class CustomerRole {
    public JPanel createWorkArea(JPanel userProcessContainer, Ecosystem system, Network network, Customer customer) {
        return new CustomerWorkAreaJPanel(userProcessContainer, system, network, customer); 
    
}
