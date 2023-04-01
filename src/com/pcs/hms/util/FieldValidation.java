package com.pcs.hms.util;

import com.pcs.hms.model.Registration;

import javax.swing.*;

public class FieldValidation {

    public static boolean validateRegisterData(Registration registration){

        if(registration.getFirstname().isEmpty() ){
            JOptionPane.showMessageDialog(null, "First name must be mandatory");
            return false;
        }

        if(registration.getLastname().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Last name must be mandatory");
            return false;
        }


        if(registration.getAddress().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Address name must be mandatory");
            return false;
        }

        if(registration.getPhone().isEmpty()){
            JOptionPane.showMessageDialog(null, "Phone number must be mandatory");
            return false;
        }

        if(!registration.getPhone().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Phone number must be number between 0 and 9");
            return false;
        }
        return true;
    }
}
