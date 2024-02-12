package com.xworkz.youtube.youtube.impl;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import com.xworkz.youtube.dto.ChannelsDTO;
import com.xworkz.youtube.youtube.Youtube;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class YoutubeImpl implements Youtube {

    @Override
    public boolean addChannel(ChannelsDTO dto) {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "jav@123");
            stmt = con.prepareStatement("update table you_list values(?, ?, ?)");
            stmt.setInt(1, (int)Math.random());
            stmt.setString(2,dto.getChannelName());
            stmt.setString(3, dto.getChannelEmail());
            stmt.setLong(4,dto.getPhoneNumber());
            stmt.setInt(5,dto.getNoOfSubscribers());
            stmt.setDouble(6,dto.getEarnings());
            int isRowsAffected = stmt.executeUpdate();
            System.out.println(isRowsAffected);
        }catch(SQLException e){
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
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<ChannelsDTO> getAllChannels() {
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        List<ChannelsDTO> channelsDTOList = new ArrayList<>();
        try {
           con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=jav@123");
           stmt = con.createStatement();
           resultSet = stmt.executeQuery("select * from table_name");
           while(resultSet.next()){
               ChannelsDTO channelsDTO = new ChannelsDTO();
               int channel_id = resultSet.getInt(1);
               channelsDTO.setId(channel_id);
               String channel_name = resultSet.getString(2);
               channelsDTO.setChannelName(channel_name);
               String channel_email = resultSet.getString(3);
               channelsDTO.setChannelEmail(channel_email);
               long phone_number = resultSet.getLong(4);
               channelsDTO.setPhoneNumber(phone_number);
               int no_of_subscribers = resultSet.getInt(5);
               channelsDTO.setNoOfSubscribers(no_of_subscribers);
               double earnings = resultSet.getDouble(6);
               channelsDTO.setEarnings(earnings);

               channelsDTOList.add(channelsDTO);
           }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
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
        return channelsDTOList;
    }
}
