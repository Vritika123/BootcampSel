package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver=new ChromeDriver();
	
  @Test(priority=1)
  public void openapp() { 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  

	  //method body 
  }
  @Test(priority=2)

public void login() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  System.out.println(driver.getTitle());
	

}
  @Test  (priority=3)

public void closeapp() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
	  
	
}
  
}

