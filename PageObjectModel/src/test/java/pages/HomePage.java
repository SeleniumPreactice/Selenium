package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page{
	
	/*
	 * 
	 * Properties
	 * Logs
	 * Excel
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public LandingPage doLogin(String username, String password){
		
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();

		return new LandingPage();
	
	}
	

	public void createAccount(String firstName, String lastName, String email, String dob){
		
		
		
	}
	
	
	public void validateLinks(){
		
		
		
	}
	
	
	public void logOut(){
		
		
	}
}
