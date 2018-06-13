package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Page {
	
	
	public static WebDriver driver;
	public static TopNavigation topNav;
	
	/*
	 * logs
	 * Excel
	 * Screenshots
	 * Properties
	 * Browsers
	 * Keywords
	 * 
	 * Maven
	 * Jenkins
	 * 
	 */
	
	
	public Page(){
		
		if(driver==null){
		ProfilesIni listProfile = new ProfilesIni();
		FirefoxProfile profile = listProfile.getProfile("default");
		driver = new FirefoxDriver(profile);
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topNav = new TopNavigation();
		}
		
	}

}
