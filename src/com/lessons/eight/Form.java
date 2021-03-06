package com.lessons.eight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Form extends JFrame {



    public Form(String title) {
        setTitle(title);
        setBounds(50, 30, 300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(100, 232,214));

        setLayout(new GridLayout(2, 1));

        JTextField inputField = new JTextField();
        inputField.setEditable(false);

        ButtonListener buttonListener = new ButtonListener(inputField);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 3));

        for (int i = 0; i <= 9; i++) {
            JButton digit = new JButton(String.valueOf(i));
            digit.addActionListener(buttonListener);
            buttonPanel.add(digit);
        }

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        JButton multiple = new JButton("*");
        multiple.addActionListener(buttonListener);
        JButton divide = new JButton("/");
        divide.addActionListener(buttonListener);
        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });

        buttonPanel.add(plus);
        buttonPanel.add(minus);
        buttonPanel.add(multiple);
        buttonPanel.add(divide);
        buttonPanel.add(clear);

        add(buttonPanel);

        JPanel inputPanel = new JPanel(new BorderLayout());
        JButton submit = new JButton("Submit");

        submit.addActionListener(e -> {
            String[] str;
            if (inputField.getText().contains("+")) {
                str = inputField.getText().split("\\+");
                inputField.setText(String.valueOf(Integer.parseInt(str[0]) + Integer.parseInt(str[1])));
            } else if (inputField.getText().contains("-")) {
                str = inputField.getText().split("-");
                inputField.setText(String.valueOf(Integer.parseInt(str[0]) - Integer.parseInt(str[1])));
            } else if(inputField.getText().contains("*")) {
                str = inputField.getText().split("\\*");
                inputField.setText(String.valueOf(Integer.parseInt(str[0]) * Integer.parseInt(str[1])));
            } else if (inputField.getText().contains("/")) {
                str = inputField.getText().split("/");
                if (Integer.parseInt(str[1]) != 0) {
                    inputField.setText(String.valueOf(Integer.parseInt(str[0]) / Integer.parseInt(str[1])));
                } else {
                    inputField.setText("Inf");
                }
            }

        });


        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(submit, BorderLayout.EAST);

        add(inputPanel);

        setVisible(true);
    }



}
