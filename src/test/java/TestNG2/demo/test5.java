package TestNG2.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test5 {
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login(){
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	void search(){
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void Advsearch(){
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout(){
		Assert.assertTrue(true);
	}




}
