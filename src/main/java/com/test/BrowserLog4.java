package com.test;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.record.formula.functions.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLog4 {
WebDriver dr;
 private static Logger log = Utilities.getLog(BrowserLog4.class);

@Test
	public void openB() throws InterruptedException {
		log.info("Set Property");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jamir\\Desktop\\chromedriver.exe");
		log.info("Open Blank Browser");
		dr=new ChromeDriver();
		log.info("Pass the URL");
		dr.get("https://www.facebook.com/");
		log.info("Enter Username");
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("User1");
		log.info("Enter Password");
		dr.findElement(By.xpath("//input[@name='pass']")).sendKeys("Pass1");
		log.info("click on loginButton");
		dr.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		log.info("Quite the driver");
		dr.quit();
		
		
		
		
	}
}
