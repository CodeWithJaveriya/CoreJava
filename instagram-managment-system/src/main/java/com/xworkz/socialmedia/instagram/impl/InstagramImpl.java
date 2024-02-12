package com.xworkz.socialmedia.instagram.impl;

import com.xworkz.socialmedia.dto.ProfileDTO;
import com.xworkz.socialmedia.instagram.Instagram;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class InstagramImpl implements Instagram {

    @Override
    public boolean addProfile(ProfileDTO dto) {
        boolean isProfileAdded = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
           con.setAutoCommit(false);
            stmt = con.prepareStatement("insert into instagram values(?,?,?,?,?,?,?)");
            /*stmt = con.prepareStatement("delete from instagram where id = ? ");
            stmt.setInt(1, dto.getId());*/
           /* stmt = con.prepareStatement("update instagram set id = ? where profile_name = taj_javeriya");
            stmt.setInt(1, dto.getId());*/

           stmt.setInt(1, (int)Math.random());
           stmt.setString(2, dto.getProfileName());
           stmt.setLong(3, dto.getProfilePhoneNumber());
           stmt.setInt(4,dto.getAge());
           stmt.setString(5, dto.getPassword());
           stmt.setInt(6, dto.getNoOfFollowers());
           stmt.setInt(7, dto.getNoOfFollowing());
            int isDatabaseCreated = stmt.executeUpdate();
            con.commit();
            System.out.println(isDatabaseCreated);
            isProfileAdded = true;
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            closingConnectionsOfDML();
            if(con!= null){
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return isProfileAdded;
    }

    @Override
    public List<ProfileDTO> getAllProfiles() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        List<ProfileDTO> profileDTOList = new ArrayList<>();
        try {
            //ProfileDTO dtos = new ProfileDTO();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            stmt = con.prepareStatement("select * from instagram");
            //stmt.setInt(1, dtos.getId());
            resultSet = stmt.executeQuery();

            while(resultSet.next()){
                ProfileDTO dto = new ProfileDTO();
                int profile_id = resultSet.getInt(1);
                dto.setId(profile_id);
                String profile_name = resultSet.getString(2);
                dto.setProfileName(profile_name);
                long profile_phoneNumber =  resultSet.getLong(3);
                dto.setProfilePhoneNumber(profile_phoneNumber);
                int profile_age = resultSet.getInt(4);
                dto.setAge(profile_age);
                String profile_password = resultSet.getString(5);
                dto.setPassword(profile_password);
                int noOfFollowers = resultSet.getInt(6);
                dto.setNoOfFollowers(noOfFollowers);
                int nofOfFollowing = resultSet.getInt(7);
                dto.setNoOfFollowing(nofOfFollowing);
                profileDTOList.add(dto);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closingConnectionsOfDQL();
        }
        return profileDTOList;
    }

    @Override
    public ProfileDTO getProfileByProfileId(int id) {
        ProfileDTO dto = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            stmt = con.prepareStatement("select * from instagram where id = ?");
            stmt.setInt(1, id);
            resultSet = stmt.executeQuery();
            while(resultSet.next()){
                dto = new ProfileDTO();
                dto.setId(resultSet.getInt("id"));
                dto.setProfileName(resultSet.getString("profile_name"));
                dto.setProfilePhoneNumber(resultSet.getLong("profile_phone"));
                dto.setAge(resultSet.getInt("age"));
                dto.setPassword(resultSet.getString("password"));
                dto.setNoOfFollowers(resultSet.getInt("followers"));
                dto.setNoOfFollowing(resultSet.getInt("profile_following"));
                //System.out.println(dto);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
           closingConnectionsOfDQL();
        }
        return dto;
    }

    @Override
    public ProfileDTO getProfileByProfilePhoneNumber(long profilePhoneNumber) {
        ProfileDTO dto = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            stmt = con.prepareStatement("select * from instagram where profile_phone  = ?");
            stmt.setLong(1, profilePhoneNumber);
            resultSet = stmt.executeQuery();
            while(resultSet.next()){


                dto = new ProfileDTO();
                dto.setId(resultSet.getInt("id"));
                dto.setProfileName(resultSet.getString("profile_name"));
                dto.setProfilePhoneNumber(resultSet.getLong("profile_phone"));
                dto.setAge(resultSet.getInt("age"));
                dto.setPassword(resultSet.getString("password"));
                dto.setNoOfFollowers(resultSet.getInt("followers"));
                dto.setNoOfFollowing(resultSet.getInt("profile_following"));

            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally{
          closingConnectionsOfDQL();
        }
        return dto ;
    }

   /* @Override
    public Object[] getProfilePhoneNumberAndAge(String profileName) {
        Object[] obj = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            stmt = con.prepareStatement("select profile_phone , age  from instagram where profile_name = ?");
            stmt.setString(1, profileName);
            resultSet = stmt.executeQuery();
            while(resultSet.next()){
                obj = new Object[2];
                long phone_number = resultSet.getLong("profile_phone");
                int age = resultSet.getInt("age");
                    obj[0] = phone_number;
                    obj[1] = age;

            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            closingConnectionsOfDQL();
        }
        return obj;
    }*/

    @Override
    public List getProfilePhoneNumberAndAge(String profileName){
        List list = new ArrayList();
        Connection con =  null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            stmt = con.prepareStatement("select profile_phone , age  from instagram where profile_name = ?");
            stmt.setString(1, profileName);
            resultSet = stmt.executeQuery();
            while(resultSet.next()){
                ProfileDTO dto = new ProfileDTO();
                dto.setProfilePhoneNumber(resultSet.getLong("profile_phone"));
                dto.setAge(resultSet.getInt("age"));
                boolean isAdded = list.add(dto.getProfilePhoneNumber() + " " + dto.getAge());
                System.out.println(isAdded);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            closingConnectionsOfDQL();
        }
        return list;
    }

    @Override
    public ProfileDTO getProfileByAge(int age) {
        ProfileDTO dto = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            stmt = con.prepareStatement("select * from instagram where age = ?");
            stmt.setInt(1, age);
            resultSet = stmt.executeQuery();
            while(resultSet.next()){
                dto = new ProfileDTO();
                dto.setId(resultSet.getInt("id"));
                dto.setProfileName(resultSet.getString("profile_name"));
                dto.setProfilePhoneNumber(resultSet.getLong("profile_phone"));
                dto.setAge(resultSet.getInt("age"));
                dto.setPassword(resultSet.getString("password"));
                dto.setNoOfFollowers(resultSet.getInt("followers"));
                dto.setNoOfFollowing(resultSet.getInt("profile_following"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            closingConnectionsOfDQL();
        }

       return dto;
    }

    @Override
    public boolean updateProfileFollowersByProfileName(int updatedFollowers, String profileName) {
        boolean areFollowersUpdated = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("update instagram set followers = ? where profile_name = ?");
            stmt.setInt(1, updatedFollowers);
            stmt.setString(2,profileName);
            int isRowsAffected = stmt.executeUpdate();
            con.commit();
            if(isRowsAffected >= 1){
                areFollowersUpdated = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            closingConnectionsOfDML();
            if(con!= null){
                try {
                    con.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return areFollowersUpdated;
    }

    @Override
    public boolean updateProfilePhoneNumberByProfileName(long updatedProfilePhoneNumber, String profileName) {
        boolean isPhoneNumberUpdated = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("update instagram set profile_phone = ? where profile_name = ? ");
            stmt.setLong(1, updatedProfilePhoneNumber);
            stmt.setString(2, profileName);
            int noOfRowsAffected = stmt.executeUpdate();
            con.commit();
            System.out.println(noOfRowsAffected);
            if(noOfRowsAffected >= 1){
                isPhoneNumberUpdated = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closingConnectionsOfDML();
            if(con!= null){
                try {
                    con.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isPhoneNumberUpdated;
    }

    @Override
    public boolean updateNoOfFollowingByAge(int updatedFollowing, int age) {
        boolean isFollowingUpdated = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("update instagram set profile_following = ? where age = ?");
            stmt.setInt(1, updatedFollowing);
            stmt.setInt(2, age);
            int noOfRowsAffected = stmt.executeUpdate();
            con.commit();
            if(noOfRowsAffected >= 1){
                isFollowingUpdated = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closingConnectionsOfDML();
            if(con != null){
                try {
                    con.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isFollowingUpdated;
    }


    @Override
    public boolean updatePasswordById(String updatedPassword, int id) {
        boolean isPasswordUpdated = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("update instagram set password = ? where id = ?");
            stmt.setString(1, updatedPassword);
            stmt.setInt(2, id);
            int noOfRowsAffected = stmt.executeUpdate();
            con.commit();
            if(noOfRowsAffected >= 1){
                isPasswordUpdated = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closingConnectionsOfDML();
            if(con != null){
                try {
                    con.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isPasswordUpdated;
    }

    @Override
    public boolean deleteProfile(int id) {
        boolean isProfileDeleted = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            con.setAutoCommit(false);
            stmt =  con.prepareStatement("delete from instagram where id = ?");
            stmt.setInt(1,id);
            int noOfRowsAffected = stmt.executeUpdate();
            con.commit();
            if(noOfRowsAffected >= 1){
                isProfileDeleted = true;
            }
        }catch(SQLException e){
         e.printStackTrace();
        }finally{
            closingConnectionsOfDML();
            if(con!= null){
                try {
                    con.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            }
        return isProfileDeleted;
    }

    @Override
    public boolean deleteProfileByProfileName(String profileName) {
        boolean isProfileDeleted = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("delete from instagram where profile_name = ?");
            stmt.setString(1, profileName);
            int noOfRowsAffected = stmt.executeUpdate();
            con.commit();
            if(noOfRowsAffected >= 1){
                isProfileDeleted = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closingConnectionsOfDML();
            if(con!= null){
                try {
                    con.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isProfileDeleted;
    }

    @Override
    public boolean deleteProfileByAge(int age) {
        boolean isProfileDeleted = false;
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "jav@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("delete from instagram where age = ?");
            stmt.setInt(1, age);
            int noOfRowsAffected = stmt.executeUpdate();
            con.commit();
            if(noOfRowsAffected >= 1){
                isProfileDeleted = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closingConnectionsOfDML();
            if(con!= null){
                try {
                    con.commit();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isProfileDeleted;
    }

    public void closingConnectionsOfDML(){
        Connection con = null;
        Statement stmt = null;
        try {
            if (con != null) {
                con.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        try {
            if (stmt != null) {
                stmt.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void closingConnectionsOfDQL(){
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
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


}
