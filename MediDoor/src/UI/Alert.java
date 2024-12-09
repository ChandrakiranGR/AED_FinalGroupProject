/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
