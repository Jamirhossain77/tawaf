package com.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_ReadB extends Browser {

    @DataProvider(name="facebook")
	public Object[][] excelRead() throws IOException {
    FileInputStream fl = new FileInputStream("C:\\Users\\jamir\\Documents\\Book3.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fl);
	XSSFSheet sheet = workbook.getSheetAt(0);
	int rowSize=sheet.getLastRowNum();
	int cellSize=sheet.getRow(0).getLastCellNum();
	
	Object[][]data=new Object[rowSize][cellSize];
	
		for(int i=1;i<=rowSize;i++) {
		for(int j=0;j<cellSize;j++) {
			
		data[i-1][j]=sheet.getRow(i).getCell(j);
		}	
			
			
		}
		
	return data;	
		
	}
    @Test(dataProvider ="facebook")
    public void test(Object FirstName, Object LastName, Object Email, Object Password) {	
	dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName.toString());	
	dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName.toString());
	dr.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Email.toString());
	dr.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(Password.toString());
	dr.findElement(By.xpath("//button[@name='websubmit']")).click();
	dr.quit();	
		
	}
	
	

}
