/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodBank;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author antaradeshmukh
 */
public class BloodBankDirectory {
    UserAccount userAccount;
    private ArrayList<BloodBank> bloodBankList;
   

    public ArrayList<BloodBank> getBloodBankList() {
        return bloodBankList;
    }

    public BloodBankDirectory() {
        this.bloodBankList = new ArrayList<>();
    }

  public BloodBank addBloodBank(String name, String location, String bloodType, int availableUnits, String contactInfo, String username, String password) {
    // Create the BloodBank object with the given parameters
    BloodBank bloodBank = new BloodBank(name, location, bloodType, availableUnits, contactInfo);

    // Create the UserAccount for the BloodBank admin
    UserAccount userAccount = new UserAccount(username, password);  // Use passed parameters for the UserAccount
    bloodBank.setUserAccount(userAccount);  // Associate the UserAccount with the BloodBank

    // Add the BloodBank to the list
    this.bloodBankList.add(bloodBank);

    // Return the created BloodBank
    return bloodBank;
}

    public void removeBloodBank(BloodBank bloodBank) {
        bloodBankList.remove(bloodBank);
    }
}
