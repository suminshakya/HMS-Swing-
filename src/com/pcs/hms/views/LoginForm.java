package com.pcs.hms.views;

import com.pcs.hms.repo.UserDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm  extends JFrame implements ActionListener {

    Container container;
    JLabel message, usernameLabel, passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton signup, login;

    public LoginForm(){
        setTitle("Login");
        setVisible(true);
        setBounds(500, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        message = new JLabel("Login Form", SwingConstants.LEFT);

        message.setFont(new Font("Courier", Font.BOLD, 20));
        usernameLabel = new JLabel("Username");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();

        container = getContentPane();
        container.setLayout(null);

        signup = new JButton("Signup");
        login = new JButton("Login");

        setBounds();
        addComponents();
        buttons();
    }

    public void setBounds() {
        message.setBounds(50, 10, 600, 30);

        usernameLabel.setBounds(50, 60, 100, 30);
        usernameField.setBounds(130, 60, 200, 30);

        passwordLabel.setBounds(50, 110, 100, 30);
        passwordField.setBounds(130, 110, 200, 30);

        signup.setBounds(50, 170, 100, 30);
        login.setBounds(250, 170, 100, 30);
    }

    public void addComponents() {
        container.add(message);
        container.add(usernameLabel);
        container.add(usernameField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(signup);
        container.add(login);
    }

    public void buttons() {
        signup.addActionListener(this);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
           String message =  new UserDAO().login(usernameField.getText().trim(),String.valueOf(passwordField.getPassword()).trim());
           JOptionPane.showMessageDialog(null, message);
        }

        if (e.getSource() == signup) {
            System.out.println("singup");
            dispose();
            new RegisterForm();
        }
    }
}
