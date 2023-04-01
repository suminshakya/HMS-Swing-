package com.pcs.hms.repo;

import com.pcs.hms.config.DBConfig;
import com.pcs.hms.model.Registration;

import java.sql.*;

public class UserDAO {

    public String login(String username, String password){

        try(Connection con =  DBConfig.connectDB()){
            PreparedStatement pst = con.prepareStatement("select * from  tbl_user where username = ? and password = ?");
            pst.setString(1,username);
            pst.setString(2,password);
            ResultSet resultSet = pst.executeQuery();
            if(resultSet.next() == true){
                return "Login Successfully!! 😁😁😁";
            }
            return "Invalid username or password 😒😒";
        }catch (SQLException sqlException){
            System.out.println(sqlException);
            return "Error occurs!!! 🤣🤣🤣";
        }

    }
}
