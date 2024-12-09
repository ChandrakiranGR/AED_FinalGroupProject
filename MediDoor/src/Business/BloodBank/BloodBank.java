/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodBank;

import Business.UserAccount.UserAccount;
import UI.Customer.NewBloodRequestPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author antaradeshmukh
 */
public class BloodBank {
    private String name;
    private String location;
    private String bloodType;
    private int availableUnits;
    private String contactInfo;
    private UserAccount userAccount;

   

    public BloodBank(String name, String location, String bloodType, int availableUnits, String contactInfo) {
        this.name = name;
        this.location = location;
        this.bloodType = bloodType;
        this.availableUnits = availableUnits;
        this.contactInfo = contactInfo;
        this.userAccount = userAccount;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    public void NewRequest(JPanel userProcessContainer) {
        // Create an instance of the NewBloodRequestPanel
        NewBloodRequestPanel newRequestPanel = new NewBloodRequestPanel();

        // Remove all components from the container and add the NewBloodRequestPanel
        userProcessContainer.removeAll();
        userProcessContainer.add("NewBloodRequestPanel", newRequestPanel);

        // Switch to the NewBloodRequestPanel
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.show(userProcessContainer, "NewBloodRequestPanel"); // Show the new request panel
    }
}
