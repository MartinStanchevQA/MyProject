package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
	
	public WebDriver driver;
	
	By productPrice = By.id("our_price_display");
	By quantityPlusButton = By.xpath("//i[@class='icon-plus']");
	By selectSize = By.cssSelector("#group_1]");
	By addToCartButton = By.name("Submit");
	By successfullyAddedMessage = By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]");
	
	public productPage (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public WebElement getProductPrice()
	{
		return driver.findElement(productPrice);
	}
	
	public WebElement getQuantityPlusButton()
	{
		return driver.findElement(quantityPlusButton);
	}
	
	public WebElement getSelectSize()
	{
		return driver.findElement(selectSize);
	}
	
	public WebElement addtoCartButton()
	{
		return driver.findElement(addToCartButton);
	}
	
	public WebElement successfullyAddedMessage()
	{
		return driver.findElement(successfullyAddedMessage);
	}
	

}
