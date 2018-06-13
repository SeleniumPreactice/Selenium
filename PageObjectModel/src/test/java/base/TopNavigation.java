package base;

import org.openqa.selenium.By;

import pages.LandingPage;

public class TopNavigation {
	
/*	WebDriver driver;
	
	public TopNavigation(WebDriver driver){
		
		this.driver = driver;
	}
	*/
	
	public LandingPage gotoHome(){
		
			Page.driver.findElement(By.xpath("//*[starts-with(@id,'js_')]/div/div/div[1]/div[1]/h1/a/span")).click();
		return new LandingPage();
	}
	
	public void doSearch(){
		
		
		
	}
	
	
	public void doLogOut(){
		
		Page.driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
		Page.driver.findElement(By.xpath("//*[contains(text(),'Log out')]")).click();
		
	}

}
