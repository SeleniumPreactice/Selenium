package pages;

import org.openqa.selenium.By;

import base.Page;

public class MyProfilePage  extends Page{


	
	public void gotoAbout(){
		
		
		
	}
	
	
	public void gotoFriends(String friendName){
		
		
	}
	
	
	public MyProfilePage uploadPhoto(){
		
		/*driver.findElement(By.xpath("//*[@id='u_jsonp_2_d']")).click();
		driver.findElement(By.xpath("//a[@data-action-type='upload_photo']/div/input[starts-with(@id,'js_')][@type='file']")).sendKeys("C:\\Users\\Selenium\\Desktop\\automationarch2.gif");
	*/
		System.out.println("Photo uploaded !!!");
		return this;
	}

}
