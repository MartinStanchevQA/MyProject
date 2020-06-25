package AutomationPractice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.homePageObjects;

public class homePage extends base{
	
	homePageObjects h;
	
	@BeforeTest
	public void initialize () throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyPageTitle()
	{
		h = new homePageObjects(driver);
		Assert.assertEquals(driver.getTitle(),"My Store");
	}
	
	@Test
	public void verifyShopPhoneText()
	{
		Assert.assertEquals(h.getContactInformation().getText(),"Call us now: 0123-456-789");
	}
	
	@Test
	public void verifySignInButton()
	{
		Assert.assertEquals(h.loginButton().getText(),"Sign in");
	}
	
	@Test
	public void verifyRowMenu()
	{
		System.out.println(h.getRowMenu().getSize());
	}
	
	@AfterTest
	public void closeTheBrowser()
	{
		driver.quit();
	}
	

}
