package Fruits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {
	 public static String url="https://www.saucedemo.com/";
	 WebDriver driver;
	 @BeforeTest
	public void bt() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
	 }
	 
	 @Test
		public void login() throws InterruptedException {
		 String beforelogin=driver.getTitle();
		 System.out.println(driver.getTitle());
		 Thread.sleep(3000);
		WebElement userA = driver.findElement(By.id("user-name"));
		userA.sendKeys("problem_user");
		Thread.sleep(3000);
		WebElement userB= driver.findElement(By.id("password"));
	    userB.sendKeys("secret_user");
	    Thread.sleep(3000);
		WebElement userC = driver.findElement(By.id("login-button"));
		userC.click();
		Thread.sleep(3000);
		System.out.println("login successfull");
		 String afterlogin=driver.getTitle();
	    System.out.println(driver.getTitle());
		 if(beforelogin.equals(afterlogin)) {
		 System.out.println("Titles are same");
		}
		else
		{
		System.out.println("Titles are different");
}}}
