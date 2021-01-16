package com.utility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class validationTest {
	
	validation val;
	@Before
	public void init() {
		
		val = new validation();
		
	}
	

	@Test
	public void canTestValidEmailId() {
		
		boolean isValid = val.validateEmail("Pz@gmail.com");
		assertTrue(isValid);
		
	}
	@Test
	public void canTestInvalidEmailIdMissingAtTheRate() {
		
		boolean isValid = val.validateEmail("Pzgmail.com");
		assertFalse(isValid);
	}
	
	@Test
	public void canTestInvalidEmailIdMissingDotAfterAtTheRate() {
		
		boolean isValid = val.validateEmail("Pz@gmail.com");
		assertFalse(isValid);
	}
	@Test
	
	public void canTestInvalidEmailIdMissingAfterAtTheRateNoChar() {
		
		boolean isValid = val.validateEmail("Pzgmail@com");
		assertFalse(isValid);
	}
	@Test
	
 public void canTestValidMobileNumber() {
		
		boolean isValid = val.validateEmail("9588629791");
		assertTrue(isValid);
		
	}
	
	




}
