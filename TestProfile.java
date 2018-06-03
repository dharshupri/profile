package com.personal;

import java.nio.charset.MalformedInputException;

public class TestProfile extends SaraProfile
{
	
public static  void printProfile(IProfile profile) {

profile.myBasicInfo();
profile.myHobbies();
}
public static void main (String[] args)
{
IProfile myProfile= new SaraProfile();
TestProfile.printProfile(myProfile);



}
}



