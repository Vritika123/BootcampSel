package TestNG2.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test6 {
	@Test
	public void abc()
	{
		int a=20;
		int b=10;
		//if(a>b) {
			//System.out.println("passed");
		//}else {
			//System.out.println("failed");
		//Assert.assertEquals(a,b);
	//Assert.assertEquals(actual, expected,description);
		Assert.assertEquals(a<b, true,"a is not greater than b ");
		//description is only printed in case of fail
		String s1="abc";
		String s2="xyz";
		Assert.assertEquals(s1,s2, "Strings are not equal ");
		}
	}

//} testng depend on execution of code, in this way we can use if else in testng
