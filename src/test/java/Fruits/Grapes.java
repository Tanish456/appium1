package Fruits;


import java.awt.Desktop.Action;
import java.sql.DriverAction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grapes {
	public static String van ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	private WebElement admindropdown;
	@BeforeTest
	public void cat() {
		WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		 driver.get(van);
	}
		 
		 @Test(priority = 0)
		 public void login() throws InterruptedException {
			 System.out.println("orangeHRM is opened");
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
			 Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
			Thread.sleep(10000);
			 driver.findElement(By.xpath("//*[@type='submit']")).click();
			 Thread.sleep(3000);
			 // @Test( enabled= false,priority = 5)
			 //public void Search() throws InterruptedException {
			 //driver.findElement(By.xpath("//*[@placeholder='Search']")).click();
			 //Thread.sleep(2000);}
			 
		 @Test(enabled= true, priority=1)
			 public void Admin() throws InterruptedException  {
			 driver.findElement(By.xpath("//*[@class='oxd-main-menu-item active']")).click();
			 Thread.sleep(2000);
			 List<WebElement> ele= driver.findElements(By.tagName("a"));
			 System.out.println(ele.size());
			 for(int i =0; i<ele.size());
			System.out.println(ele.get(i).getText(i));
			System.out.println(ele.get(i).getAttribute(i));
			 driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']//div[5]//div(1)")).sendKeys("Admin");
			 Thread.sleep(2000);
			 Actions act =new Actions(driver);
			// WebElement ele =driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']//div[1]//div(i)"));
			 //act.click(admindropdown).build().perform();//keyboardover action// storing forthe value
			 // act.
			// Select s= new Select(ele);
			 //s.selectByIndex(1);
			// }
			 
			/* @Test (enabled= false ,priority= 4)
			 public void PIM() throws InterruptedException {
				 driver.findElement(By.xpath("//*[@class='oxd-main-menu-item']")).click();
				 Thread.sleep(2000);	 
			 }
			 @AfterTest
			 public void at(){
				 driver.close();
			 }}*/
			 
			 
		 
		 

	
		
	


