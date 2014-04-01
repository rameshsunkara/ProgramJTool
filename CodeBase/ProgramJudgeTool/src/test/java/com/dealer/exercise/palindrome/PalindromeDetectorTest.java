/*package com.dealer.exercise.palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import edu.louisiana.cacs.programjudge.Main;
import edu.louisiana.cacs.programjudge.exception.PalindromeDetectorException;
import edu.louisiana.cacs.programjudge.util.Configurator;


*//**
 * Tests the palindrome detector
 * @author rsunkara
 * @since Feb 11,2014
 * @version 1.0
 *//*
public class PalindromeDetectorTest {

	private static Configurator m_Config = null;
	
	@BeforeClass
	public static void testSetup(){
		m_Config = Main.loadSystemConfig();
	}
	
	@AfterClass
	public static void testCleanUp(){
		m_Config = null;
	}
	
	@Test
	public void isPalindromePassTest(){
		PalindromeDetector pd = new PalindromeDetector(m_Config);
		try {
			assertTrue(pd.isPalindrome("pop"));
		} catch (PalindromeDetectorException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void isPalindromePassNonAlphaTest(){
		PalindromeDetector pd = new PalindromeDetector(m_Config);
		try {
			assertTrue(pd.isPalindrome("#&*pop/.,"));
		} catch (PalindromeDetectorException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void isPalindromeFailTest(){
		PalindromeDetector pd = new PalindromeDetector(m_Config);
		try {
			assertFalse(pd.isPalindrome("#&*p1op/.,"));
		} catch (PalindromeDetectorException e) {
			e.printStackTrace();
		}
	}
}
*/