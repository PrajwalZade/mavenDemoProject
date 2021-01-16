package com.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)	;
	public static final Pattern  VALID_MOBILE_NUMBER_REGEX=Pattern.compile("^((\\\\+|00)(\\\\d{1,3})[\\\\s-]?)?(\\\\d{10})$");
	public boolean validateEmail(String email) {
	
		
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
		
	}
	public boolean validateMobileNo(String mobileNo) {
		
		
		Matcher matcher = VALID_MOBILE_NUMBER_REGEX.matcher(mobileNo);
		
		return matcher.find();
		
	}
	
//	public static void main(String args[]) {
//		
//		validation validate = new validation();
//		System.out.println(validate.validateEmail("prajwalzade@gmail.com"));
//		System.out.println(validate.validateEmail("prajwalzadegmail.com"));
//		System.out.println(validate.validateEmail("prajwalzade@gmailcom"));
//		System.out.println(validate.validateEmail("+123-9588628791"));
//		System.out.println(validate.validateEmail("5586586"));
//	}

}
