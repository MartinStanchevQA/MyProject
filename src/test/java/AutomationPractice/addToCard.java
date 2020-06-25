package AutomationPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.homePageObjects;
import pageObjects.loginPageObject;

public class addToCard extends base {
	
	homePageObjects h;
	
	@BeforeMethod
	public void initialize () throws IOException
	{
		driver=initializeDriver();
    	driver.get(prop.getProperty("url"));
	}
    	
    @Test
    public void addtoCard()
    {	
    	h=new homePageObjects(driver);
    	Actions a=new Actions(driver);
    	for (int i=0;i<h.getProducts().size();i++)
    	{
    		String product = h.getProducts().get(i).getText();
    	if(product.contains("Blouse"))
    	{
    		a.moveToElement(h.getProducts().get(i));
     		driver.findElements(By.xpath("//div[@class='button-container']")).get(i).click();
    	}
    	
    }

}
}

