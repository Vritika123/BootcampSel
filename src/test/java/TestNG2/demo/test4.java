package TestNG2.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test4 {

	@Test
	public void xyz() {
		System.out.println("this is xyz from test 2");
	}
	
	@AfterTest
	void n() {
		System.out.println("this after class");
	}
}
