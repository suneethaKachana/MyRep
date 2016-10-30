import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class SampleTest {
	@AfterTest
	public void closingDbconnection(){
		
		System.out.println("DB connection closed successfully");
	}
	
	@Test
	public void testsendemail(){
		System.out.println("sending email");
		
	}
	@Test
	public void testreceiveemail(){
		System.out.println("received email");
	}
	@BeforeMethod
	public void openbrowser(){
		System.out.println("opening browser");
		
	}
	@BeforeTest
	public void openDBconnection(){
		System.out.println("DB connection established");
		
	}
	@AfterMethod
	public void closebrowser(){
		System.out.println("browser closed successfully");
	}
} 