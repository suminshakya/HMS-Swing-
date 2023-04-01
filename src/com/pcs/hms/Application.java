package com.pcs.hms;

import com.pcs.hms.controller.Controller;
import com.pcs.hms.views.LoginForm;

import javax.swing.*;

public class Application extends JFrame {

    public static void main(String[] args) {
        LoginForm frame = new LoginForm();
        frame.setVisible(true);
        frame.setBounds(500, 100, 500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);


        //new Controller();
    }

}
