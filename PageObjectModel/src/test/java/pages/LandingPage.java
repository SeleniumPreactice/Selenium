package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class LandingPage extends Page {
	

	
	public void updateStatus(){
		
		
	}
	
	public MyProfilePage gotoProfile(){
		
		driver.findElement(By.xpath("//*[@id='navItem_100010051393565']/a")).click();
	
		return new MyProfilePage();
	}
	
	
	public void gotoFriendsIndiaPage(){
		
		
	}
	
	
	
	
	
	

}
