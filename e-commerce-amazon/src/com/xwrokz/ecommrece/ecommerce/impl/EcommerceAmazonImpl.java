package com.xwrokz.ecommrece.ecommerce.impl;

import com.xwrokz.ecommrece.dto.CustomerDTO;
import com.xwrokz.ecommrece.ecommerce.Ecommerce;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EcommerceAmazonImpl  implements Ecommerce {
    @Override
    public boolean addCustomer(CustomerDTO dto) {
        //Step 1 - load and register the drive - Driver class - given by mysql api
        Connection con = null;
        PreparedStatement stmt = null;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "jav@123");
           stmt = con.prepareStatement("insert into amazon_details values(?, ?, ?, ?, ?, ?)");
           stmt.setInt(1, dto.getId());
           stmt.setString(2, dto.getName());
           stmt.setString(3,dto.getEmail());
           stmt.setString(4, dto.getAddress());
           stmt.setLong(5, dto.getPhoneNo());
           stmt.setBoolean(6, dto.isHistoryOfCustomer());
           int isAdded = stmt.executeUpdate();
           System.out.println(isAdded);
           return true;
       }catch (SQLException e){
           e.printStackTrace();
       }finally {
          try {
              if (stmt != null) {
                  stmt.close();
              }
          }catch (SQLException e){
              e.printStackTrace();
          }
           try {
               if (con != null) {
                   con.close();
               }
           }catch(SQLException e){
               e.printStackTrace();
           }
       }
        return false;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "jav@123");
            stmt =  con.createStatement();
            resultSet = stmt.executeQuery("select * from amazon_details");
            while(resultSet.next()){
                CustomerDTO dto = new CustomerDTO();
                int customer_id = resultSet.getInt(1);
                dto.setId(customer_id);
                String customer_name = resultSet.getString("name");
                dto.setName(customer_name);
                String customer_email = resultSet.getString(3);
                dto.setEmail(customer_email);
                String customer_address = resultSet.getString(4);
                dto.setAddress(customer_address);
                long phone_number = resultSet.getLong(5);
                dto.setPhoneNo(phone_number);
                boolean history_of_customer = resultSet.getBoolean(6);
                dto.setHistoryOfCustomer(history_of_customer);
                customerDTOList.add(dto);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return customerDTOList;
    }

    @Override
    public CustomerDTO getCustomersByCustomerId(int id) {
        CustomerDTO dto = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "jav@123");
            stmt = con.prepareStatement("select * from amazon_details where id = ?");
            stmt.setInt(1, id);
            resultSet = stmt.executeQuery();

            while(resultSet.next()){
                dto = new CustomerDTO();
                dto.setId(resultSet.getInt("id"));
                dto.setName(resultSet.getString("name"));
                dto.setEmail(resultSet.getString("email"));
                dto.setAddress(resultSet.getString("address"));
                dto.setPhoneNo(resultSet.getLong("phone_no"));
                dto.setHistoryOfCustomer(resultSet.getBoolean("history_of_customer"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
