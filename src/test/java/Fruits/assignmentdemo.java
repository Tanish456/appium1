package Fruits;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmentdemo {
    public static String url="https://www.makemytrip.com/";
	 WebDriver driver;
	 
	 @BeforeTest
	public void bt() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	      driver.get(url);
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
      
	 }
	 @Test(enabled=true ,priority = 0)
		public void holidaypackages() throws InterruptedException {    
		System.out.println("Makemytrip is opened");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //  WebElement ele =driver.findElement(By.linkText("flights"));
			//ele.click();
			// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@class='lbl_input appendBottom10']")).sendKeys("Bengaluru");  
			//driver.findElement(By.xpath("//*[@aria-autocomplete='list']")).sendKeys("Singapore");
			WebElement ele1 = driver.findElement(By.xpath("//*[@class='chNavIcon appendBottom2 chSprite chHolidays']"));
			ele1.click();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//holiday packages
//			 Actions act =new Actions(driver);
//			 WebElement ele2 =driver.findElement(By.xpath("//*[@class='citypicker_input']"));
//			// ele2.sendKeys("Bangalore"); 
//			 act.click(ele2).build().perform();
//			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			 Actions act1 =new Actions(driver);
//			 WebElement ele3 = driver.findElement(By.xpath("//*[@class='dest-search-input']"));
//			//ele3 .sendKeys("Singapore");
			 //act1.click(ele3).build().perform();
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div/div[1]/div[1]/div/input")) .sendKeys("Bangalore");

			 List<WebElement> ele= driver.findElements(By.xpath("//*[@class='appendLeft8 blackText']"));
			 for(int i=0;i<ele.size();i++) {
			 String a= ele.get(i).getText();
			 System.out.println(a);
			 Thread.sleep(6000);
			 if(a.contains("Bangalore")) {
			 ele.get(i).click();
			 break;
			 }}
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div/div[2]/label")).click();
			 Thread.sleep(6000);
			 
			 // driver.findElement(By.xpath("//*[@id=\"toCity\"]")).click();
			 //driver.findElement(By.id("toCity")).sendKeys("Singapore");
			 Thread.sleep(6000);
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/input")).sendKeys("Singapore");
			 Thread.sleep(6000);
			 List<WebElement> el = driver.findElements(By.xpath(" //*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[1]"));
			 //*[@id="root"]/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div[1].....xpath for singapore
			 //*[@class='dest-city-container']
			 System.out.println(el.size());
			 for (int i =0;i<el.size();i++) {
			 String st= el.get(i).getText();
			 System.out.println(st);
			 Thread.sleep(6000);
			 if(st.contains("Singapore")) {
			 el.get(i).click();
			 }

			
			 }}}
			 
