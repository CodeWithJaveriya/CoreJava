package com.xworkz.socialmedia;

import com.xworkz.socialmedia.dto.ProfileDTO;
import com.xworkz.socialmedia.instagram.Instagram;
import com.xworkz.socialmedia.instagram.impl.InstagramImpl;

import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Instagram instagram = new InstagramImpl();
        Scanner sc = new Scanner(System.in);
           /*for(int i = 0 ; i <=3; i++) {
               ProfileDTO dto = new ProfileDTO();
               System.out.println("Enter the profile name");
               dto.setProfileName(sc.next());
               System.out.println("Enter the phone number");
               dto.setProfilePhoneNumber(sc.nextLong());
               System.out.println("Enter the age");
               dto.setAge(sc.nextInt());
               System.out.println("Enter the password");
               dto.setPassword(sc.next());
               System.out.println("Enter the no of followers");
               dto.setNoOfFollowers(sc.nextInt());
               System.out.println("Enter the no of following");
               dto.setNoOfFollowing(sc.nextInt());
               instagram.addProfile(dto);
           }*/

        String userInput = null;
        do{

            System.out.println("Press 1 to get all profiles");
            System.out.println("Press 2 to get the profile by profile id");
            System.out.println("Press 3 to get the profile by profile phone number");
            System.out.println("Press 4 to get phone number and age by name");
            System.out.println("Press 5 to get the profile by age");
            System.out.println("Press 6 to update followers by name");
            System.out.println("Press 7 to delete the profile by id");
            System.out.println("Press 8 to update phone number by name");
            System.out.println("Press 9 to update followings by age");
            System.out.println("Press 10 to update password by id");
            System.out.println("Press 11 to delete the profile by name");
            System.out.println("Press 12 to delete the profile by age");

            int options = sc.nextInt();
            switch(options){
                case 1 : List<ProfileDTO> dtoList = instagram.getAllProfiles();
                         dtoList.stream().forEach(System.out::println);
                         break;

                case 2:  System.out.println("Enter the id to get that particular profile");
                         ProfileDTO isProfileFetched = instagram.getProfileByProfileId(sc.nextInt());
                         System.out.println(isProfileFetched.toString());
                         break;

                case 3 :  System.out.println("Enter the phone number to get the particular profile");
                          ProfileDTO isProfileFetchedByPhoneNumber = instagram.getProfileByProfilePhoneNumber(sc.nextLong());
                          System.out.println(isProfileFetchedByPhoneNumber.toString());
                          break;

                case 4:   System.out.println("Enter the name of profile to get its phone number and age");
                            List phoneNumberAndAge = instagram.getProfilePhoneNumberAndAge(sc.next());
                             System.out.println(phoneNumberAndAge);
                             break;

                case 5 :  System.out.println("Enter the age to get the profile");
                    ProfileDTO getProfileByAge = instagram.getProfileByAge(sc.nextInt());
                    System.out.println(getProfileByAge);
                    break;

                case 6 : System.out.println("Enter the followers to be updated and profile name");
                    boolean isUpdated = instagram.updateProfileFollowersByProfileName(sc.nextInt(), sc.next());
                    System.out.println(isUpdated);
                    break;

                case 7 : System.out.println("Enter the id such that the given profile is deleted");
                    boolean isProfileDeleted = instagram.deleteProfile(sc.nextInt());
                    System.out.println(isProfileDeleted);
                    break;

                case 8 :
                    System.out.println("Enter the phone number to be updated and profile name");
                    boolean isPhoneNumberUpdated = instagram.updateProfilePhoneNumberByProfileName(sc.nextLong(), sc.next());
                    System.out.println(isPhoneNumberUpdated);
                    break;

                case 9 :
                    System.out.println("Enter the no of following to be updated and age");
                    boolean isFollowingUpdated = instagram.updateNoOfFollowingByAge(sc.nextInt(), sc.nextInt());
                    System.out.println(isFollowingUpdated);
                    break;

                case 10 :
                    System.out.println("Enter a new password and id");
                    boolean isPasswordUpdated = instagram.updatePasswordById(sc.next(), sc.nextInt());
                    System.out.println(isPasswordUpdated);
                    break;

                case 11 :
                    System.out.println("Enter the profile name to delete the profile");
                    boolean isDeleted = instagram.deleteProfileByProfileName(sc.next());
                    System.out.println(isDeleted);
                    break;

                case 12 :
                    System.out.println("Enter the age to delete the profile");
                    boolean isDeleted1 = instagram.deleteProfileByAge(sc.nextInt());
                    System.out.println(isDeleted1);
                    break;


                    default:
                    System.out.println("Enter any one of the options that are given");
                    break;

            }

            System.out.println("Do you want to continue Yes/No");
            userInput = sc.next();
        }while(userInput.equals("Yes"));
        System.out.println("Thank you!!!!! Visit Again");

    }
}
