package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excel_Read {

	WebDriver dr;
	@Test
public void execlRead() throws IOException {
	
	FileInputStream fl = new FileInputStream("C:\\Users\\jamir\\Documents\\Book1.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fl);
	XSSFSheet sheet = workbook.getSheet("Menu");
	int rowSize = sheet.getLastRowNum();
  //System.out.println(rowSize);
		
	for(int i = 1; i<=rowSize;i++) {
	XSSFRow row = sheet.getRow(i);	
	String username = row.getCell(0).toString();
	String password = row.getCell(1).toString();
  //System.out.println(username+"   "+password);
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamir\\Desktop\\chromedriver.exe");
	dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().deleteAllCookies();
	dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	dr.get("https://www.osaconsultingtech.com/");
	dr.findElement(By.xpath("//a[text()='Forum Login']")).click();
	dr.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	dr.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	dr.findElement(By.xpath("//button[@id='login_button']")).click();
    dr.quit();
            
	  }
	}
 }
