package AutomationPractice;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.homePageObjects;

public class verifyHomePageElements extends base{
	
	homePageObjects h;
	
	@BeforeTest
	public void initialize () throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		h = new homePageObjects(driver);
	}
	
	
	@Test
	public void verifyPageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"My Store");
	}
	
	@Test
	public void verifyTheUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php");
	}
	
	@Test
	public void verifyShopPhoneText()
	{	
		Assert.assertTrue(h.getContactInformation().isDisplayed());
		Assert.assertEquals(h.getContactInformation().getText(),"Call us now: 0123-456-789");
	}
	
	@Test
	public void verifySignInButton()
	{
		Assert.assertTrue(h.loginButton().isDisplayed());
		Assert.assertEquals(h.loginButton().getText(),"Sign in");
	}
	
	@AfterTest
	public void closeTheBrowser()
	{
		driver.quit();
	}

}
