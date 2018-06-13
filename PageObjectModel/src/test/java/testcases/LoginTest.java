package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;

public class LoginTest {
	
	@Test//dataProvider='getData'
	public void doLogin(/*String username, String password*/){
		
		HomePage home = new HomePage();
		home.doLogin("prafulgupta84@yahoo.in", "architect1234");
	
		
	}

	
	/*@DataProvider
	public Object[][] getData(){
		
	
		return TestUtil.getData("OpenAccountTest");
		
		
		
	}*/
	
}

