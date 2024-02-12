package com.xworkz.conversions.databaseToExcel;

import java.sql.*;

public class MySQLConnection {


    public static ResultSet getDataFromDatabase () {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/task_02", "root", "jav@123");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM  university_info");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
}
