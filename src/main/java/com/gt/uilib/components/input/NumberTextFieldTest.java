package com.gt.uilib.components.input;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTextFieldTest {
	private NumberTextField NTF;
	private NumberFormatDocument NFD;
	
//	@Before
//	void setup(){
//		NTF = new NumberTextField();
//	}
//	

	
	/**
	*Purpose: check the constructor is well made
	*Input: int maxLength
	*Expected:
	*	Return false of boolean isPositiveOnly
	*	
	*	
	*/
	@Test
	public void testNumberTextFieldInt() {
		NTF = new NumberTextField(15);
		assertFalse(NTF.isRestrictPositiveNumber());
	}

	/**
	*Purpose: check the constructor is well made
	*Input: int maxLength, boolean isPositiveOnly
	*Expected:
	*	Return
	*
	*			true -> isPositiveOnly(true)
	*			false -> isPositiveOnly(false)
	*	
	*/
	@Test
	public void testNumberTextFieldIntBoolean() {
		NTF = new NumberTextField(15, true);
		assertTrue(NTF.isRestrictPositiveNumber());
		NTF = new NumberTextField(15, false);
		assertFalse(NTF.isRestrictPositiveNumber());
	}

	/**
	*Purpose: check the constructor is well made
	*Input: just constructor
	*Expected:
	*	Return false of boolean isPositiveOnly
	*	
	*/
	@Test
	public void testNumberTextField() {
		NTF = new NumberTextField();
		assertFalse(NTF.isRestrictPositiveNumber());
	}

	
	/**
	*Purpose: check the constructor is well made
	*Input: boolean isPositiveOnly
	*Expected:
	*	Return 
	*			false if boolean isPositiveOnly is false
	*			true if boolean isPositiveOnly is true
	*	
	*/
	@Test
	public void testNumberTextFieldBoolean() {
		NTF = new NumberTextField(true);
		assertTrue(NTF.isRestrictPositiveNumber());
		NTF = new NumberTextField();
		assertFalse(NTF.isRestrictPositiveNumber());
	}

	/**
	*Purpose: check boolean value is true or false
	*Input: numberTextField instance
	*Expected:
	*	Return 
	*			false if boolean isPositiveOnly is false
	*			true if boolean isPositiveOnly is true
	*	
	*/
	@Test
	public void testIsRestrictPositiveNumber() {
		NTF = new NumberTextField(true);
		assertTrue(NTF.isRestrictPositiveNumber());
		NTF = new NumberTextField();
		assertFalse(NTF.isRestrictPositiveNumber());
	}

	/**
	*Purpose: check boolean value is set
	*Input: boolean value
	*Expected:
	*	Return 
	*			true if boolean value is true
	*	
	*/
	@Test
	public void testSetRestrictPositiveNumber() {
		NTF = new NumberTextField();
		NTF.setRestrictPositiveNumber(true);
		assertTrue(NTF.isRestrictPositiveNumber());
	}

	/**
	*Purpose: check nonzero is entered
	*Input: instance of NumberTextField
	*Expected:
	*	Return 
	*			true if bigdecimal is not zero
	*	
	*/
	@Test
	public void testIsNonZeroEntered() {
		NTF = new NumberTextField();
		NTF.setText("0");
		assertFalse(NTF.isNonZeroEntered());
		NTF.setText("123454,5");
		assertTrue(NTF.isNonZeroEntered());
	}

	/**
	*Purpose: check equals between createDefaultModel and NumberFormatDocument
	*Input: NumberFormatDocument instance and NumberTextField
	*Expected:
	*	Return 
	*			true same object
	*	
	*/
	@Test
	public void testCreateDefaultModel() {
		NTF = new NumberTextField();
		NFD = new NumberFormatDocument(NTF);
		assertEquals(NFD, NTF.createDefaultModel());
	}

//	@Test
//	public void testSetMaxLength() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetDecimalPlace() {
//		fail("Not yet implemented");
//	}

	/**
	*Purpose: check text is well replaced
	*Input: text of instance of NumberTextField
	*Expected:
	*	Return 
	*			String value if text is not null
	*	
	*/
	@Test
	public void testGetText() {
		NTF = new NumberTextField();
		NTF.setText("12345,5");
		assertEquals("123455", NTF.getText());
	}

//	@Test
//	public void testSelectAll() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	public void testInitProperties() {
//		fail("Not yet implemented");
//	}

}
