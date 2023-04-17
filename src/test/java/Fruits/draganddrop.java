package Fruits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	 public static String url="https://jqueryui.com/droppable/";
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
	 public void frame() throws InterruptedException {
     driver.findElements(By.tagName("iframe")).size();
     Thread.sleep(3000);
     System.out.println(driver.findElements(By.tagName("iframe")).size());
     Thread.sleep(3000);
     driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
     Thread.sleep(3000);
     WebElement drag =driver.findElement(By.id("draggable"));
     Thread.sleep(3000);
     WebElement drop=driver.findElement(By.id("droppable"));
     Thread.sleep(3000);
     Actions act =new Actions(driver);
     act.dragAndDrop(drag, drop).build().perform();
     Thread.sleep(3000);
     driver.close();
	 }}
		 