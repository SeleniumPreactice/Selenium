package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.Page;
import pages.HomePage;
import pages.LandingPage;
import pages.MyProfilePage;

public class LoginTest {

	public static void main(String[] args) {


		
	
		//driver.manage.window.maximize();
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("prafulgupta84@yahoo.in", "architect1234");
		MyProfilePage mp = lp.gotoProfile();
		mp.uploadPhoto();
		Page.topNav.doLogOut();
		
	/*	new HomePage().doLogin("prafulgupta84@yahoo.in", "architect1234").gotoProfile().uploadPhoto();
*/
		
	}

}
