package Selenium_Webdriver_Api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Xpath_Css_Locator {

	WebDriver driver;

	@BeforeClass
	public void beforeclass() {
		// Khởi tạo trình duyệt FireFox
		driver = new FirefoxDriver();
		// Phóng to cửa sổ lên
		driver.manage().window().maximize();
		// Chờ cho element stable trước vòng xx seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Mở Url
		driver.get(" http://live.demoguru99.com/");
	}

	// Use element in the tagname
	// <button type="submit" class="button" title="Login" name="send"
	// id="send2"><span><span>Login</span></span></button>
	@Test
	public void TC_01_ID() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("id@gmail.com");;
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		
	}

	@Test
	public void TC_02_Class() throws InterruptedException {
		driver.findElement(By.className("input-text required-entry validate-email")).sendKeys("123465");;
		Thread.sleep(2000);
		driver.findElement(By.className("input-text required-entry validate-email")).clear();
	}

	@Test
	public void TC_03_Name() throws InterruptedException {
		driver.findElement(By.name("login[username]")).sendKeys("id@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("login[username]")).clear();
	}

	@Test
	public void TC_04_Tagname() throws InterruptedException {
		
	int linkNumber= driver.findElements(By.tagName("a")).size();
	System.out.println("Sum link = " + linkNumber);
				Thread.sleep(2000);
				
	}

	@Test
	public void TC_05_Link_Text() throws InterruptedException {
		driver.findElement(By.linkText("SITE MAP"));
		Thread.sleep(2000);
	}

	@Test
	public void TC_06_Partial_Link_Text() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Test
	public void TC_07_Css() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Test
	public void TC_08_Xpath() {

	}
}
