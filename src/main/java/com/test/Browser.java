package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browser {
	WebDriver dr;
	
@BeforeMethod
public void openBrowser() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\jamir\\Desktop\\OSA1221201905A\\TestNG_02\\src\\main\\resources\\info.properties");
		Properties p=new Properties();
		p.load(f);
	String brs	=p.getProperty("browser");
	if(brs.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jamir\\Desktop\\chromedriver.exe");
	dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get(p.getProperty("url"));
	
	}
	else {
		System.out.println("can't open");
		
	  }
	
	}
	
}
