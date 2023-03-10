package TestNG2.demo; //This package is made in between TestNG method

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {

	@Test
	public void abc() {
		System.out.println("this is abc from test 1");
	}
	@BeforeTest
	void m() {
		System.out.println("this before class");
	}
	@BeforeSuite
	void a() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	void b() {
		System.out.println("After suite");
	}
}
