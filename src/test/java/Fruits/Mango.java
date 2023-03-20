package Fruits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mango {
	public static  String man= "https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
	@BeforeTest
	public void bt()throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(man);
		
		
	}
		 @Test(priority = 0)
		 public void login() throws InterruptedException {
			 System.out.println("Guru99 is opened");
			 Thread.sleep(5000);
			 String beforelogin =driver.getTitle();
			 System.out.println(beforelogin);
			
			 driver.findElement(By.name("//*[@name='userName']")).sendKeys("user");
			 Thread.sleep(5000);
			driver.findElement(By.name("//*[@name='password']")).sendKeys("user");
			Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@value='Submit']")).click(); //Login
			 String afterlogin =driver.getTitle();
			 System.out.println(afterlogin);
			 
				if (beforelogin.equals(afterlogin)) {
				  System.out.println("tittles are same");
				}
				else  {
				System.out.println("tittles are different");
				}
			 }   
		 
			 @Test(priority = 1)
			 public void Register() throws InterruptedException{
				 driver.findElement(By.name("//*[@class='mouseOut']")).click();  //Register CTA
				 Thread.sleep(5000);
				driver.findElement(By.name("//*[@name='firstName']")).sendKeys("Tanishka");     //firstname
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='lastName']")).sendKeys("Gupta");      //lastname
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='phone']")).sendKeys("9540737445");    //mob no.
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@id='userName']")).sendKeys("user");  //Email
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='address1']")).sendKeys("kundalahalli");  //Address
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='city']")).sendKeys("Bangalore");  //city
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='state']")).sendKeys("Karnataka");  //state
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='postalCode']")).sendKeys("828403");  //pincode
					Thread.sleep(5000);
				     //WebElement ele2 =driver.findElement(By.xpath("//*[@name='country'"));
					// Select T= new Select(ele2);
					 //T.selectByIndex(34);                      //select method// storing value on dropdown
					WebElement tara= driver.findElement(By.xpath("//*[@name='country']"));
					Thread.sleep(4000);
					if(tara.isEnabled());                          //keyboardover action// storing forthe value
					tara.sendKeys("India");
					driver.findElement(By.name("//*[@id='email']")).sendKeys("Tannu");  // username
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='password']")).sendKeys("user");  //user password
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@name='confirmPassword']")).sendKeys("user");  //confirm password
					Thread.sleep(5000);
					driver.findElement(By.name("//*[@src='images/submit.gif']")).click();  //submit CTA
					Thread.sleep(5000);
				
					//String beforelogin =driver.getTitle();
					// Thread.sleep(4000);
					 //driver.findElement(By.xpath("//*[@type= 'submit']")).click();
			          //Thread.sleep(4000);
					 //String afterlogin= driver.getTitle();
					 //Thread.sleep(4000);
					 //Assert.assertEquals(beforelogin,afterlogin);
  					 //System.out.println("same");
  					driver.close();


					}}
	
					
            	 
 
		
	


