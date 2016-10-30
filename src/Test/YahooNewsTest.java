package Test;

import org.testng.Assert;
//import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class YahooNewsTest {
	
	@BeforeSuite
	
	public void openselenium(){
		System.out.println("before executing test suite");
		
	}
	@Test
	public void yahoonews(){
		System.out.println("In Yahoo News Page");
	}
	@Test
	
	public void todaynews(){
		
		System.out.println("In News home page");
		//throw new SkipException("skipping this test case");
		Assert.assertEquals("Good", "Goodyu");
		System.out.println("After Assertion");
		
	}
@AfterSuite
public void destroyselenium(){
	System.out.println("at the end of test execution");
	
}
}
