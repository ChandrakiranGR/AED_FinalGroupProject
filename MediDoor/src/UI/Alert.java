/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author antaradeshmukh
 */
public class Alert {
      private String message;

    public void ShowAlert(String message) {
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.white);
        Object put = UIManager.put("Panel.background", Color.white);

        JOptionPane.showMessageDialog(null, message);

    }

    public Alert() {

    }
    
}
