package com.pcs.hms.repo;

import com.pcs.hms.config.DBConfig;
import com.pcs.hms.model.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationDAO {


    public String register(Registration form){
        try(Connection con =  DBConfig.connectDB()){
            PreparedStatement pst = con.prepareStatement("insert into tbl_registration(first_name, last_name, address, phone, gender, created_on) values(?,?,?,?,?,?)");
            pst.setString(1, form.getFirstname());
            pst.setString(2, form.getLastname());
            pst.setString(3, form.getAddress());
            pst.setString(4, form.getPhone());
            pst.setString(5, form.getGender());
            pst.setObject(6, form.getCreatedOn());

            pst.executeUpdate();
            return "Record Inserted Successfully!!";
        }catch (SQLException sqlException){
            System.out.println(sqlException);
            return "Error occurs!!!";
        }

    }
}
