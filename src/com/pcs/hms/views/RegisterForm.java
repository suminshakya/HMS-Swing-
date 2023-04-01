package com.pcs.hms.views;

import com.pcs.hms.model.Registration;
import com.pcs.hms.util.FieldValidation;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import com.pcs.hms.repo.RegistrationDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class RegisterForm extends JFrame implements ActionListener {


    JLabel message;
    JLabel firstNameLabel,lastNameLabel,addressLabel,phoneLabel , dobLabel, genderLabel, dobFormat;
    JTextField firstNameField, lastNameField, addressField, phoneField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
    JLabel mailIdLabel, mobileNoLabel;
    JTextField mailIdField, mobileNoField;
    JLabel passwordLabel, rePasswordLabel;
    JPasswordField passwordField, rePasswordField;
    JLabel programLabel;
    JComboBox<String> programList;
    JLabel branchLabel, semesterLabel;
    JComboBox<String> branchList;
    JComboBox<Integer> semesterList;
    JButton registerButton, cancelButton;
    Container container;
    /*JDatePicker*/
    JDatePanelImpl datePanel;
    JDatePickerImpl datePicker;

    public RegisterForm(){

        setTitle("Register Form");
        setVisible(true);
        setBounds(500, 100, 500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        message = new JLabel("Registration Form", SwingConstants.LEFT);

        message.setFont(new Font("Courier", Font.BOLD, 20));
        firstNameLabel = new JLabel("First Name");
        firstNameField = new JTextField();
        lastNameLabel = new JLabel("Last Name");
        lastNameField = new JTextField();

        addressLabel = new JLabel("Address");
        addressField = new JTextField();

        phoneLabel = new JLabel("Phone");
        phoneField = new JTextField();

        genderLabel = new JLabel("Gender");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);


      /*   dobLabel = new JLabel("DOB");
        //dobField = new JTextField();
        *//*Adding JDatePicker date picker*//*
        UtilDateModel com.pcs.hms.model = new UtilDateModel();
        com.pcs.hms.model.setDate(1999, 01, 02);
        com.pcs.hms.model.setSelected(true);
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datePanel = new JDatePanelImpl(com.pcs.hms.model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        dobFormat = new JLabel("(yyyy-mm-dd)");
        *//*End Date picker*//*
        genderLabel = new JLabel("Gender");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
        mailIdLabel = new JLabel("email");
        mailIdField = new JTextField();
        mobileNoLabel = new JLabel("Phone No");
        mobileNoField = new JTextField();
        addressLabel = new JLabel("Phone No");
        addressField = new JTextField();
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();
        rePasswordLabel = new JLabel("Re Password");
        rePasswordField = new JPasswordField();
*/
        registerButton = new JButton("Register");
        cancelButton = new JButton("Cancel");
        container = getContentPane();
        container.setLayout(null);
        setBounds();
        addComponents();
        register();
    }

    public void setBounds() {
        message.setBounds(50, 10, 600, 30);

        firstNameLabel.setBounds(50, 60, 100, 30);
        firstNameField.setBounds(130, 60, 200, 30);

        lastNameLabel.setBounds(50, 110, 100, 30);
        lastNameField.setBounds(130, 110, 200, 30);

        addressLabel.setBounds(50, 160, 100, 30);
        addressField.setBounds(130, 160, 200, 30);

        addressLabel.setBounds(50, 160, 100, 30);
        addressField.setBounds(130, 160, 200, 30);

        phoneLabel.setBounds(50, 210, 100, 30);
        phoneField.setBounds(130, 210, 200, 30);

        genderLabel.setBounds(50, 260, 100, 30);
        genderMale.setBounds(130, 260, 100, 30);
        genderFemale.setBounds(240, 260, 100, 30);



      /*  dobLabel.setBounds(50, 110, 100, 30);
        datePicker.setBounds(130, 110, 200, 30);
        genderLabel.setBounds(50, 160, 100, 30);
        genderMale.setBounds(130, 160, 100, 30);
        genderFemale.setBounds(240, 160, 100, 30);
        mailIdLabel.setBounds(50, 210, 100, 30);
        mailIdField.setBounds(130, 210, 200, 30);
        mobileNoLabel.setBounds(50, 260, 100, 30);
        mobileNoField.setBounds(130, 260, 200, 30);
        passwordLabel.setBounds(50, 310, 100, 30);
        passwordField.setBounds(130, 310, 200, 30);
        rePasswordLabel.setBounds(50, 360, 100, 30);
        rePasswordField.setBounds(130, 360, 200, 30);*/

        registerButton.setBounds(130, 550, 100, 30);
        cancelButton.setBounds(250, 550, 100, 30);
    }

    public void addComponents() {
        container.add(message);
        container.add(firstNameLabel);
        container.add(firstNameField);
        container.add(lastNameLabel);
        container.add(lastNameField);
        container.add(addressLabel);
        container.add(addressField);
        container.add(phoneLabel);
        container.add(phoneField);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
       /* container.add(dobLabel);
        *//*JDatePicker*//*
        container.add(datePicker);
        container.add(dobFormat);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
        container.add(mailIdLabel);
        container.add(mailIdField);
        container.add(mobileNoLabel);
        container.add(mobileNoField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(rePasswordLabel);
        container.add(rePasswordField);*/

        container.add(registerButton);
        container.add(cancelButton);
    }

    public void register() {

        registerButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            Registration registration = registeredData();
            if(!FieldValidation.validateRegisterData(registration)){
                return;
            }
            String message = new RegistrationDAO().register(registration);
            reset();
            JOptionPane.showMessageDialog(null, message);
        }

        if (e.getSource() == cancelButton){
            dispose();
            new LoginForm();
        }

    }

    private Registration registeredData(){
        String gender = "Female";
        Registration registration = new Registration();
        registration.setFirstname(firstNameField.getText());
        registration.setLastname(lastNameField.getText());
        registration.setAddress(addressField.getText());
        registration.setPhone(phoneField.getText());
        registration.setCreatedOn(LocalDate.now());

        if (genderMale.isSelected()) {
            gender = "Male";
        }

        registration.setGender(gender);
        return registration;
    }

    private void reset(){
        firstNameField.setText("");
        lastNameField.setText("");
        addressField.setText("");
        phoneField.setText("");
    }

    public class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {
        private String datePattern = "yyyy-MM-dd";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
        }
        @Override
        public String valueToString(Object value) throws ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }
            return "";
        }
    }


}
