package TestNG2.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 {
 public WebDriver driver;
 
 //constructor
 loginpage2(WebDriver driver){
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 
 //webelements = locators+identification
 @FindBy(xpath=" //img[@alt='company-branding']")   // finding the webelement and then assign it to any variable
 WebElement img_logo;
 
 @FindBy(name="username")
 WebElement txt_username;
 
 
 @FindBy(xpath="//input[@placeholder='Password']")
 WebElement txt_password;
}

//action methods


