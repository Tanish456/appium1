package Fruits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts1 {
	public static String popup = "https://demoqa.com/alerts/";
    WebDriver driver;
	
	@BeforeTest
	public void bt()throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(popup);
	}
	@Test(enabled =true ,priority =0)
	public void alert() {
		driver.findElement(By.id("alertButton")).click();
		Alert art = driver.switchTo().alert();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		art.accept();
		System.out.println("click on popup");
	}
		@Test (enabled =false, priority =1)
		public void alertA() {
			driver.findElement(By.id("timerAlertButton")).click();
			Alert art1 = driver.switchTo().alert();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			art1.accept();
			System.out.println("click on popup");
		}
		@Test (enabled= false, priority= 2)
		public void alertB() {
			driver.findElement(By.id("confirmButton")).click();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Alert art2 = driver.switchTo().alert();
			art2.accept();
			System.out.println("click on popup");	}
		@Test(enabled =false ,priority =4)
		public void alertC() {
			driver.findElement(By.id("promtButton")).click();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Alert art3= driver.switchTo().alert();
			art3.accept();
			System.out.println("you clicked a button");	
		}
		
		}
			



