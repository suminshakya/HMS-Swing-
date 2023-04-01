package com.pcs.hms.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {

    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/hms", "root", "root");
        }catch (Exception e){
            throw new RuntimeException("DB not connected", e);
        }
    }
}
