package TestNG2.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	public WebDriver driver;
	
	loginpage(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	By img=(By.xpath("//img[@alt='company-branding']"));
	By username=(By.xpath("//input[@placeholder='Username']"));
	By password=(By.xpath("//input[@placeholder='Password']"));
	By submit=(By.xpath("//button[@type='submit']"));
	
	//action methods
	
	public void setup() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void setUsernamme(String username) {
		driver.findElement(username).click();
	}
	
	public void setpassword(String str) {
		driver.findElement(password);
	}
	
	public void setSubmit() {
		driver.findElement(submit);

}
}
