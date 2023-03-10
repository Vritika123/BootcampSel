package TestNG2.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	
	          
	public WebDriver driver;
	
	@BeforeClass
		public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			
		}
		
		@Test(priority=1)
		public void testurl() {
			driver.get("http://www.fb.com");
			driver.manage().window().maximize();
		}
	
	@Test(priority=2)
	public void login()
	{
	
		String url="https://www.facebook.com/";
		String acurl=driver.getCurrentUrl();
		System.out.println(acurl);
		Assert.assertEquals(url,acurl );
		
		}
	
	
		@Test(priority=3)
		void check()
		{
		try
		{
		boolean status=driver.findElement(By.linkText("Create new account")).isDisplayed();
		Assert.assertEquals(status,true);
		}
		catch(Exception e)
		{
		Assert.fail();
		}
		
		
		}
		@Test(priority=4)
		void values() {
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("Vritika");
			driver.findElement(By.name("lastname")).sendKeys("Kalra");
		}
		
		
	}
	
