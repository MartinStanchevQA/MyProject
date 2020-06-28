package AutomationPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Resources.base;
import pageObjects.homePageObjects;
import pageObjects.productPage;

public class addToCard extends base {
	
	homePageObjects h;
	Actions a;
	productPage p;
	//Select s=new Select(p.getSelectSize());
	
	@BeforeMethod (groups= {"smoke"})
	public void initialize () throws IOException
	{
		driver=initializeDriver();
    	driver.get(prop.getProperty("url"));
    	h=new homePageObjects(driver);
    	a=new Actions(driver);
    	p=new productPage(driver);
	}
    	
    @Test (groups={"smoke"})
    public void addtoCard() throws InterruptedException
    {	
    	a.moveToElement(h.getBlouse()).click().build().perform();
    	driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
    	Assert.assertEquals((p.getProductPrice().getText()),"$27.00");
    	p.getQuantityPlusButton().click();
    	p.addtoCartButton().click();
    	driver.switchTo().parentFrame();
    	System.out.println(p.successfullyAddedMessage().getText());
    	
    	}
    
    @AfterMethod (groups= {"smoke"})
	public void closeTheBrowser()
	 {
		 driver.quit();
	 }
    	

}

