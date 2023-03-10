package TestNG2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	void login() {
		System.out.println("Login...");
	}
	@BeforeMethod
	void search() {
		System.out.println("Search...");
	}
	@AfterMethod
	
	void logout() {
		System.out.println("logout...");
	}
	

}
