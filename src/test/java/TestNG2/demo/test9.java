package TestNG2.demo;import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test9 {
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail() {
		System.out.println("login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("login by facebook");
	}
	
	@Test(priority=1,groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("login by Twitter");
	}
	
}

//} testng depend on execution of code, in this way we can use if else in testng

