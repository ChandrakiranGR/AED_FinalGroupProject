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
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author vish
 */
public abstract class Role {
    
    public enum RoleType {
        Admin("Organization Administrator"),
        Doctor("Doctor"),
        PharmaOrgAdmin("Pharma Vaccine Administrator"),
        Prescriber("Prescriber"),
        Pharmacist("Pharmacist"),
        EquipmentManager("Equipment Manager"),
        MarketManager("Supermarket Manager"),
        LabAssistant("Lab Assistant"),
        LabTester("Lab Tester"),
        DeliveryAgent("Delivery Agent");
        
        private String value;
        private RoleType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override 
        public String toString() {
            return value;
        }

        public static ArrayList<String> allRoles() {
            ArrayList<String> al = new ArrayList<>();
            al.add(RoleType.Admin.getValue());
            al.add(RoleType.DeliveryAgent.getValue());
            al.add(RoleType.Doctor.getValue());
            al.add(RoleType.EquipmentManager.getValue());
            al.add(RoleType.LabAssistant.getValue());
            al.add(RoleType.LabTester.getValue());
            al.add(RoleType.MarketManager.getValue());
            al.add(RoleType.PharmaOrgAdmin.getValue());
            al.add(RoleType.Pharmacist.getValue());
            al.add(RoleType.Prescriber.getValue());
            
            return al;
            
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem system);
}
