package com.xworkz.socialmedia.instagram;

import com.xworkz.socialmedia.dto.ProfileDTO;

import java.util.List;

public interface Instagram {

    public boolean addProfile(ProfileDTO dto);

    public List<ProfileDTO> getAllProfiles();

    public ProfileDTO getProfileByProfileId(int id);

    public ProfileDTO getProfileByProfilePhoneNumber(long profilePhoneNumber);

    //public Object[] getProfilePhoneNumberAndAge(String profileName);

    public List getProfilePhoneNumberAndAge(String profileName);

    public ProfileDTO getProfileByAge(int age);

    public boolean updateProfileFollowersByProfileName(int updatedFollowers , String profileName);

    public boolean updateProfilePhoneNumberByProfileName(long updatedProfilePhoneNumber , String profileName);

    public boolean updateNoOfFollowingByAge(int updatedFollowing , int age);

    public boolean updatePasswordById(String updatedPassword , int id);

    public boolean deleteProfile(int id);

    public boolean deleteProfileByProfileName(String profileName);

    public boolean deleteProfileByAge(int age);
}
