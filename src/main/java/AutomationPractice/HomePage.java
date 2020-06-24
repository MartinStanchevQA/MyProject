package AutomationPractice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.homePage;

public class HomePage extends base {
	
	@BeforeMethod
	public void initialize () throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	homePage h = new homePage(driver);
	
    @Test
    public void verifyElements() throws IOException //verify if the sign button is working as expected
    {
    	Assert.assertEquals(h.getLogin().getText(),"Sign in");//verify the text in the button
    	Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php"); //verify it the Url is "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    	Assert.assertEquals(driver.getTitle(),"Login - My Store"); //verify if the page title is "Login - My Store"
    	Assert.assertTrue(h.getSearchBar().isDisplayed()); //verify if the search bar is displayed
    	Assert.assertTrue(h.getContact().isDisplayed()); //verify if the contact us button is displayed
    	Assert.assertTrue(h.getProductList().isDisplayed()); //verify the product list
    	}
    	
    @AfterMethod
	 public void closeTheBrowser()
	 {
		 driver.quit();
	 }
    

}
	
