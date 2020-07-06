package com.test;

import org.testng.annotations.Test;

public class TestNG_Features {
	@Test
	public void loginTest() {
		
		System.out.println("Login Test");
	
	}
	
	
	@Test(enabled=false)
	public void forumTest() {
		System.out.println("Forum Test");
		
	}
	
	
	@Test(dependsOnMethods= "loginTest")
	public void interviewQuestionTest() {
		System.out.println("Interview Question Test");
		
	}
	@Test(priority=2)
	public void seleniumTest() {
		
	System.out.println("Selenium Test");	
	}
    @Test(priority=1)	
    public void testNGTest() {
    	
    System.out.println("TestNG Test");	
	
    }
}
