package com.lessons.eight;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private final JTextField inputField;
    private final StringBuilder sb = new StringBuilder();

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        if(isContainSym(jButton.getText(), new String[] {"+", "-", "*", "/"})) {
            if (inputField.getText().contains(jButton.getText())) {
                return;
            }
        }
        sb.append(inputField.getText()).append(jButton.getText());
        inputField.setText(sb.toString());
        sb.setLength(0);
    }

    private boolean isContainSym(String text, String[] strings) {
        System.out.println(text);
        for (String str:
             strings) {
            if(text.contains(str)) {
                System.out.println("isContainSym: true " + str);
                return true;
            }
        }
        return false;
    }
}
