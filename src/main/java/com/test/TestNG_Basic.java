package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNG_Basic {
public WebDriver dr;
     @BeforeMethod
     @Parameters({"url","browser"})
	
	 public void openB(String url, String browser) {
if(browser=="chrome") {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamir\\Desktop\\chromedriver.exe");
	 dr = new ChromeDriver();
	 dr.manage().window().maximize();
	 dr.manage().deleteAllCookies();
	 dr.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
	 dr.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	 dr.get(url);
}

else if(browser=="firefox") {
	 System.out.println("firefox");
}
else {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamir\\Desktop\\chromedriver.exe");
	 dr=new ChromeDriver();
	 dr.manage().window().maximize();
	 dr.manage().deleteAllCookies();
	 dr.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
	 dr.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
	 dr.get(url);
 }
}
     
     @Test(priority=1)
public void OSATitleTest() {
	 String actualTitle=dr.getTitle();
	 System.out.println(actualTitle);
	 Assert.assertEquals(actualTitle,"OSA Consulting Tech Corp || Best Available Resources For Software Industry");
}

     @Test(priority=2)
public void OSALogoTest() {
	
     boolean logo= dr.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a")).isDisplayed();
     Assert.assertTrue(logo);
}
     @Test(priority=3)
     @Parameters({"username","password"})
public void ForumLoginTest(String username, String password) {
	dr.findElement(By.xpath("//*[@id=\\\"ftco-nav\\\"]/ul/li[7]/a")).click();
	dr.findElement(By.xpath("//*[@id=\\\"username\\\"]")).sendKeys(username);
	dr.findElement(By.xpath("//*[@id=\\\"password\\\"]")).sendKeys(password);
	dr.findElement(By.xpath("//*[@id=\\\"login_button\\\"]")).click();
	//a[@href='/Forum/logins/forum_login.html']
} 
    @AfterMethod
public void closeB() {
	dr.close();
  }
}
