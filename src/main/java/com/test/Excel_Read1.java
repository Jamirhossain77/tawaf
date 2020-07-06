package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_Read1 {
	
    WebDriver dr;
   
    @DataProvider(name="facebook")
public Object[][] excelRead1() throws IOException {
	FileInputStream fl = new FileInputStream("C:\\Users\\jamir\\Documents\\Book3.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fl);	
    XSSFSheet sheet =workbook.getSheetAt(0);
	int rowSize =sheet.getLastRowNum();
	int cellSize =sheet.getRow(0).getLastCellNum();
	
	System.out.println(rowSize);
	System.out.println(cellSize);

	Object[][]data =new Object[rowSize][cellSize];
	for(int i=1; i<=rowSize;i++) {
	for(int j=0; j<cellSize;j++) {
		
	data[i-1][j]=sheet.getRow(i).getCell(j);
			
	}	
	}
	
	return data;
	}

    @DataProvider(name="login")
public Object[][] getData() {
	Object[][] obj =new Object[2][2];
	
	obj[0][0]="User1";
	obj[0][1]="Pass1";
	
	obj[1][0]="User2";
	obj[1][1]="Pass3";

    Object[][]obj1= {{"User1","Pass"},{"User2","Pass2"}};


     return obj;	
    }

public static int add() {

	int a=9;
	return a;
	}

public static int[] add1() {
	int[] a=new int[4];
	a[0]=5;
	a[1]=6;
	a[2]=7;
	a[3]=8;
	

	return a;
    }
	@Test(dataProvider="facebook")
public void test(Object FirstName, Object LastName, Object Email, Object Password) {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamir\\Desktop\\chromedriver.exe");
	dr = new ChromeDriver();
    dr.get("https://www.facebook.com/");
	dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName.toString());	
	dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName.toString());
	dr.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Email.toString());
	dr.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(Password.toString());
	dr.findElement(By.xpath("//button[@name='websubmit']")).click();
	dr.quit();	
    
	
}

	
}
