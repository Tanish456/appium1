package Fruits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.SuiteHTMLReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreport {
	public static String url="https://demo.guru99.com/test/newtours/index.php";
	Extentreport er;  //introducing variables
	ĒxtentHTMLReporter ehr;
	ExtentTest et;
	 WebDriver driver;
	 @BeforeTest
	public void bt() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	 driver.get(url);
	 er= new Extentreport();  //create object
	 ehr=new ExtentHTMLReporter("Extent.html");  //name for reporting
	 et =new ExtentTest "ehr";                //this will add before two lines
	 et =  er.createTest("This is BeforeTest.");  // creation of new report
	 }
	 @Test
		public void login() throws InterruptedException {
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
	     String beforelogin=driver.getTitle();
		 System.out.println(driver.getTitle());
		 Thread.sleep(4000);
		WebElement userA = driver.findElement(By.name("userName"));
		userA.sendKeys("user");
		  userA.pass("user is able to enter the username");     // this line is for recording steps.ss//n showing for username record 
		WebElement userB= driver.findElement(By.name("password"));
	    userB.sendKeys("user");
	    userB.pass("user is able to enter the password");     //here pass is for pass step and fail is for fail.
		WebElement userC = driver.findElement(By.name("submit"));
		userC.click();
	      userC.info("user is able to click the submit button");  //here we can alsso mention pass in the place of info//info for passing info. 
		Thread.sleep(3000);
		System.out.println("login successfull");
	
	}
	     @AfterTest
	     public void cl() {
	    	 driver.close();
	    	   driver.flush();  //give it at the last for recording till close steps// this is also create recording.
	     }
}
