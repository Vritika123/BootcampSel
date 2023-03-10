package TestNG2.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test7 {
	@Test
	public void abc()
	{
		int a=20;
		int b=10;
		if(a>b) {
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		}
	}

//} testng depend on execution of code, in this way we can use if else in testng
