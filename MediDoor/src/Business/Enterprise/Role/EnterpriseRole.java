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
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author shivanisugurushetty
 */
public abstract class EnterpriseRole {
    public enum EnterpriseRoleType {
        EnterpriseAdmin("Enterprise Admin"),
        VaccinationAdmin("Vaccination Admin"),
        Pharmacies("Pharmacies Admin"),
        EquipmentsAdmin("Equipments Admin"),
        DiagnosticsAdmin("Lab Diagnostics Admin");
        
        private String value;
        private EnterpriseRoleType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override 
        public String toString() {
            return value;
        }

        public static ArrayList<EnterpriseRoleType> allEnterpriseRoles() {
            ArrayList<EnterpriseRoleType> al = new ArrayList<>();
            al.add(EnterpriseRoleType.DiagnosticsAdmin);
            al.add(EnterpriseRoleType.EnterpriseAdmin);
            al.add(EnterpriseRoleType.Pharmacies);
            al.add(EnterpriseRoleType.VaccinationAdmin);
            al.add(EnterpriseRoleType.EquipmentsAdmin);
            
            return al;
        }
   }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem system);
}
