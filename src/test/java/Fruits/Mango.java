package Fruits;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
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
		 @Test(enabled=true ,priority = 0)
		 public void login() throws InterruptedException {
			 System.out.println("Guru99 is opened");
			 Thread.sleep(5000);
			 String beforelogin =driver.getTitle();
			 System.out.println(beforelogin);
			
			 driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("user"); //username
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("user");  //user password 
		    driver.findElement(By.xpath("//*[@value='Submit']")).click(); //Login
			 String afterlogin =driver.getTitle();
			 System.out.println(afterlogin);
			 
				if (beforelogin.equals(afterlogin)) {
				  System.out.println("tittles are same");
				}
				else  {
				System.out.println("tittles are different");
				}}
				@Test(enabled =true ,priority = 1)
				public void Register() throws InterruptedException{
					  driver.findElement(By.linkText("REGISTER")).click();  //Register CTA
					  Thread.sleep(5000);
					driver.findElement(By.name("firstName")).sendKeys("Tanishka");     //firstname
					Thread.sleep(5000);
						driver.findElement(By.name("lastName")).sendKeys("Gupta");      //lastname
						Thread.sleep(5000);
						driver.findElement(By.name("phone")).sendKeys("9540737445");    //mob no.
						Thread.sleep(5000);
						driver.findElement(By.name("userName")).sendKeys("user");  //Email
						Thread.sleep(5000);
						driver.findElement(By.name("address1")).sendKeys("kundalahalli");  //Address
						Thread.sleep(5000);
						driver.findElement(By.name("city")).sendKeys("Bangalore");  //city
						Thread.sleep(5000);
						driver.findElement(By.name("state")).sendKeys("Karnataka");  //state
						Thread.sleep(5000);
						driver.findElement(By.name("postalCode")).sendKeys("828403");  //pincode
						Thread.sleep(5000);
					     //WebElement ele2 =driver.findElement(By.xpath("//*[@name='country']));
						// Select T= new Select(ele2);
						 //T.selectByIndex(34);                      //select method// storing value on dropdown
						WebElement tara= driver.findElement(By.xpath("//*[@name='country']"));
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						if(tara.isEnabled());                          //keyboardover action// storing forthe value
						tara.sendKeys("INDIA");
						driver.findElement(By.name("email")).sendKeys("Tannu@gmail.com");  // username
						Thread.sleep(5000);
						driver.findElement(By.name("password")).sendKeys("user");  //user password
						Thread.sleep(5000);
						driver.findElement(By.name("confirmPassword")).sendKeys("user");  //confirm password
						Thread.sleep(5000);
						driver.findElement(By.name("confirmPassword")).click();  //submit CTA
						Thread.sleep(5000);
						//String beforelogin =driver.getTitle();
						// Thread.sleep(4000);
						 //driver.findElement(By.xpath("//*[@type= 'submit']")).click();
				         //Thread.sleep(4000);
						 //String afterlogin= driver.getTitle();
						 //Thread.sleep(4000);
						 //Assert.assertEquals(beforelogin,afterlogin);
							 //System.out.println("same");}
				}

				       
				@AfterTest
				public void at() {
					driver.close();
				}

				}
		 
			
			 
//					@Test
//					public void linkcount() {
//						List<WebElement> men = driver.findElements(By.tagName("href"));
//						System.out.println(men.size());
//					
//						for(int i=0 ; i< men.size(); i++) {
//							WebDriver men;
//							String workingklink =men.get(i).getAttribute("href");
//							String notworkingl= "https:demo.guru99.com/test/newtours/support.php";
//							if(workinglink.equals(notworkingl)) {
//								System.out.println("links are under construction" + men.get(i).getText());
//							}
