package TestNG2.demo;

import org.testng.annotations.Test;

public class test11 {
	@Test(invocationCount=10)
		void test() {
		System.out.println("testing....");
	}

}
