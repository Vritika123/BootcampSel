
package TestNG2.demo;import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test8 {
	@Test
	 void Hardassertion()
	{
		
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		Assert.assertEquals(1,2);
		Assert.assertEquals(1,1); // hard assertion  will not execute if any assertion fails
		// methods in hard assertion are static
	}
	@Test
	 void Softassertion()  // soft assertion dont have static method that's why we dont have to made object
		{
			
			System.out.println("testing....");
			System.out.println("testing....");
			System.out.println("testing....");
			System.out.println("testing....");
			
			SoftAssert sa=new SoftAssert();
			
			sa.assertEquals(1,2);
			System.out.println("soft assertion complemented");
			sa.assertEquals(1,1);
			sa.assertAll(); // it is mandatory because otherwise we dont get the correct output
			// if softassertion fails .... rest assertions will execute
			 
		}
}

//} testng depend on execution of code, in this way we can use if else in testng
