package com.company.hidefile;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class WarningMessage {
    
    public static void setWarningMsg(String text, String title, int messageType) {
        JOptionPane optionPane = new JOptionPane(text, messageType);
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
}
