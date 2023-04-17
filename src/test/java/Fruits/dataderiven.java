package Fruits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataderiven {
	 public static String url="https://demo.guru99.com/test/newtours/index.php";
	 WebDriver driver;
	 @BeforeTest
	public void bt() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
	}
	 @Test(dataProvider = "tannu")
		public void login(String mannu,String tannu) throws InterruptedException {
		// String beforelogin=driver.getTitle();
		 //System.out.println(driver.getTitle());
		WebElement userA = driver.findElement(By.name("username"));
		userA.sendKeys(mannu);
		Thread.sleep(3000);
		WebElement userB= driver.findElement(By.name("password"));
	    userB.sendKeys(tannu);
	    Thread.sleep(3000);
		WebElement userC = driver.findElement(By.name("submit"));
		userC.click();
		Thread.sleep(3000);
}
	 @DataProvider
	 public Object [][] tannu(){
		 return new Object [][] {
			 new Object[] {"user","user"}
		 }; 
		 }
	 }

	 
