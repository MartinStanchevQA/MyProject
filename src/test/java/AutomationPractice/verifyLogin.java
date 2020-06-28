package AutomationPractice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObjects.loginPageObject;

public class verifyLogin extends base{
	
	loginPageObject lp;
	
	@BeforeMethod (groups= {"smoke"})
	public void initialize () throws IOException
	{
		driver=initializeDriver();
    	driver.get(prop.getProperty("url"));
    	lp=new loginPageObject(driver);
	}
	
	@Test (groups= {"smoke"})
	public void verifyLoginWithValidUser()
	{
		// lp=new loginPageObject(driver);
		lp.getLogin().click();
		lp.emailAdress().sendKeys("stanchev.m@abv.bg");
		lp.password().sendKeys("Martin");
		lp.submitButton().click();
		String welcomeMessage = driver.findElement(By.cssSelector(".info-account")).getText();
		Assert.assertTrue(welcomeMessage.equals("Welcome to your account. Here you can manage all of your personal information and orders."));
	}
	
	@Test
	public void verifyLoginWithInvalidUserAndWrongPassword()
	{
		lp.getLogin().click();
		lp.emailAdress().sendKeys("invalidUser");
		lp.password().sendKeys("wrongPassword");
		lp.submitButton().click();
		String wrongPasswordMessage = driver.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText();
		Assert.assertTrue(wrongPasswordMessage.equals("Invalid email address."));
	}
	
	@Test
	public void verifyLoginWithValidUserAndWrongPassword()
	{
		lp.getLogin().click();
		lp.emailAdress().sendKeys("stanchev.m@abv.bg");
		lp.password().sendKeys("wrongPassword");
		lp.submitButton().click();
		String wrongPasswordMessage = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
		Assert.assertTrue(wrongPasswordMessage.equals("Authentication failed."));
	}
	
	@Test
	public void verifyLoginWithInValidUserAndValidPassword()
	{
		lp.getLogin().click();
		lp.emailAdress().sendKeys("wrongEmail");
		lp.password().sendKeys("Martin");
		lp.submitButton().click();
		String wrongPasswordMessage = driver.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText();
		Assert.assertTrue(wrongPasswordMessage.equals("Invalid email address."));
	}
	
	@AfterMethod (groups= {"smoke"})
	public void closeTheBrowser()
	 {
		 driver.quit();
	 }
	
	
	
	
	
	

}
