package AutomationPractice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.LoginPage;

public class loginPage extends base{
	
	@BeforeMethod
	public void initialize () throws IOException
	{
		driver=initializeDriver();
    	driver.get(prop.getProperty("url"));	
	}
	
	@Test(dataProvider="getData")
	public void Login(String username, String password, String Account) throws IOException //verify if the login form is working
	{
    	LoginPage lp = new LoginPage(driver);
    	lp.getLogin().click();
    	Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account");
    	lp.emailAdress().sendKeys(username);
    	lp.password().sendKeys(password);
    	lp.submitButton().click();
      	System.out.println(Account);
    	
    	}
	
	 @DataProvider
	    public Object[][] getData()
	    {
	    	Object[][] data=new Object[2][3]; 
	    	data[0][0]="stanchev.m@abv.bg";
	    	data[0][1]="Martin";
	    	data[0][2]="ValidAccount";
	    	
	    	data[1][0]="invalidaccount@abv.bg";
	    	data[1][1]="12345";
	    	data[1][2]="InValidAccount";
	    	
	    	return data;
	    }
	 
	 @AfterMethod
	 public void closeTheBrowser()
	 {
		 driver.quit();
	 }
	

}
