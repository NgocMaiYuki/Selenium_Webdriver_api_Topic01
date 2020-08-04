package Selenium_Webdriver_Api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic_01_Check_Enviroment {
	 WebDriver driver;
	 @BeforeTest
	 public void setup() throws Exception {
	  driver =new FirefoxDriver();     
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://only-testing-blog.blogspot.com/2014/09/temp.html");
	 }
	 
	 @Test
	 public void selectCheck(){
	  //To select Cow checkbox using position() function.
	  
	  
	  //To select Lion checkbox using last() function.
	  driver.findElement(By.xpath("(//input[@type='checkbox'])[last()-3]")).click();
	  
	  
	 }
}
