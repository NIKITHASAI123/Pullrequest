package com.SocialSite.SignUp;

public class TestSignUp {
	public static void main(String args[]) {
		SignUp SU=new SignUp();

		String expected_name="John";
		String expected_surname="Wick";
		String expected_dob="2012/10/10";
		long expected_num=9234687919l;

		//String name=;
		String surname=SU.Surname("smith");
		String dob=SU.DOB("2012/10/10");
		long num=SU.Mobile(56789021);

		if(expected_name==SU.Name("John")) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Not Passed");
		}
		if(expected_surname==surname) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Not Passed");
		}
		if(expected_dob==dob) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Not Passed");
		}
		if(expected_num==num) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Not Passed");
		}




	}
}
