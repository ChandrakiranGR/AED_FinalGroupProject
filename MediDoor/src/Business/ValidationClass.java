/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author antaradeshmukh
 */
public class ValidationClass {
    String name;
    String email;
    String location;
    String address;
    String username;
    String password;
    int phone;
    int zipcode;
    Pattern p;

    public boolean validateName(String name) {
        String nameValidate = "[A-Za-z]{1,100}";
        p = Pattern.compile(nameValidate);

        if (!p.matcher(name).matches()) {
            JOptionPane.showMessageDialog(null, "Entered name is not correct!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }

        return false;

    }

    public boolean validateEmail(String email) {
        String emailvalidate = "[a-z0-9!-_.&#*]{2,100}[@][a-z]{3,100}[.][a-z]{3}";
        p = Pattern.compile(emailvalidate);

        if (!p.matcher(email)
                .matches()) {
            JOptionPane.showMessageDialog(null, "Email format : someone@email.com", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean valdiateAddress(String address) {
        String addressValidate = "[0-9]{1,3}\\s[A-Za-z]{1,30}\\s[A-Za-z]{1,30}\\s[A-Za-z]{1,30}";
        p = Pattern.compile(addressValidate);

        if (!p.matcher(address)
                .matches()) {
            JOptionPane.showMessageDialog(null, "Enter the street number, lane and city.", "Warining", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validateUsername(String username) {
        String uservalidate = "[a-zA-Z0-9!@_]{4,100}";
        p = Pattern.compile(uservalidate);

        if (!p.matcher(username)
                .matches()) {
            JOptionPane.showMessageDialog(null, "Invalid username.", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validatePassword(String password) {
        String passvalidate = "[a-zA-Z0-9!@_*$#%&^()-]{4,100}";
        p = Pattern.compile(passvalidate);

        if (!p.matcher(password)
                .matches()) {
            JOptionPane.showMessageDialog(null, "Invalid password.", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validateLocation(String location) {
        String locvalidate = "[a-zA-Z]{1,100}";
        p = Pattern.compile(locvalidate);

        if (!p.matcher(location)
                .matches()) {
            JOptionPane.showMessageDialog(null, "Invalid location.", "Warining", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validatePhone(int phone) {
        if (String.valueOf(phone)
                .length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be 10 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    public boolean validateZipcode(String zipcode) {
        if (String.valueOf(zipcode)
                .length() < 5 || String.valueOf(zipcode)
                        .length() >= 6) {
            JOptionPane.showMessageDialog(null, "Zip code must be 5 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return true;
        }

        return false;
    }
}
