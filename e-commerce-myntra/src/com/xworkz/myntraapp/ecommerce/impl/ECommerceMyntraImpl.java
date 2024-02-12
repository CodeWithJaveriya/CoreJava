package com.xworkz.myntraapp.ecommerce.impl;

import com.xworkz.myntraapp.dto.CustomerDTO;
import com.xworkz.myntraapp.ecommerce.ECommerceMyntra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ECommerceMyntraImpl implements ECommerceMyntra {
    @Override
    public boolean addCustomer(CustomerDTO dto) {
        Connection con = null;
        Statement stmt = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "jav@123");
            stmt = con.createStatement();
            int isRowsAffected = stmt.executeUpdate("insert into ecommerce values(2, 'Raghu', 'rahghu@123gmail.com', 'rag123#', 674983735, 'Banglore' )");
            System.out.println(isRowsAffected);
        }catch ( SQLException e){
       e.printStackTrace();

        }finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
