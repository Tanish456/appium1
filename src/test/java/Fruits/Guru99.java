package Fruits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99 {
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
		 
		@Test
		public void login() throws InterruptedException {
		 String beforelogin=driver.getTitle();
		 System.out.println(driver.getTitle());
		WebElement userA = driver.findElement(By.name("userName"));
		userA.sendKeys("user");
		WebElement userB= driver.findElement(By.name("password"));
	    userB.sendKeys("user");
		WebElement userC = driver.findElement(By.name("submit"));
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
		}
		 WebElement userD = driver.findElement(By.xpath("//*[@href='register.php']"));
	     userD.click();
		 driver.findElement(By.name("firstName")).sendKeys("Tanishka");
		 driver.findElement(By.name("lastName")).sendKeys("Gupta");
		 driver.findElement(By.name("phone")).sendKeys("7870458599");
		 driver.findElement(By.name("userName")).sendKeys("tannu@gamil.com");
		 Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("kundallahali");
		driver.findElement(By.name("city")).sendKeys("banglore");
		 driver.findElement(By.name("state")).sendKeys("karnataka");
		driver.findElement(By.name("postalCode")).sendKeys("517305");
		
		 WebElement e = driver.findElement(By.name("country"));
		
		 Select s= new Select(e);
		 s.selectByVisibleText("INDIA");
		 Thread.sleep(2000);
		 driver.findElement(By.name("email")).sendKeys("user");
		 driver.findElement(By.name("password")).sendKeys("user");
	     driver.findElement(By.name("confirmPassword")).sendKeys("user");
		 Thread.sleep(2000);
		 driver.findElement(By.name("submit")).click();
		 System.out.println("Thank you for Regestering");
		}
		
		@AfterTest
		public void at() {
		driver.close();
		}

		}




