package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationDetails {
	
	
	@Test(dataProvider = "testData")
	
	public void registerData(String name,String Password,String city){
		System.out.println(name +"---"+Password+"--"+city);
	}
	@DataProvider
	
	public Object[][] testData(){
		Object[][] data = new Object[2][3];
		
		data[0][0]="User1";
		data[0][1]="pass1";
		data[0][2]="city1";
		
		data[1][0]="User2";
		data[1][1]="pass2";
		data[1][2]="city2";
		
		return data;
		
		
		
	}
}
