package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {
	
	public WebDriver driver;
		
	By signInButton = By.linkText("Sign in");
	By contactUsButton = By.cssSelector("a[href*='contact']");
	By searchBar = By.id("search_query_top");
	By searchButton = By.xpath("//button[@name='submit_search']");
	By menuContent= By.xpath("//*[@class='cat_title']//ul");
	By productList= By.xpath("//*[@id='homefeatured']//ul");
	By contentHome = By.xpath("//*[@id='htmlcontent_home']");
	By womenCategory = By.xpath("//a[title='Women']");
	By categoryMenu = By.xpath("//*[contains(@class,'sf-menu')]/li");
	By contactInformation = By.cssSelector("span[class='shop-phone']");
	By rowmenu = By.xpath("//div[@class='row']/a");
	By blouse = By.cssSelector("img[title='Blouse']");
	By products = By.xpath("//*[id='homefeature']/a");
	
	public homePageObjects(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement loginButton()
	{
		return driver.findElement(signInButton);
	}
	
	public WebElement contactUsButton()
	{
		return driver.findElement(contactUsButton);
	}
	
	public WebElement getSearchBar()
	{
		return driver.findElement(searchBar);
	}
	
	public WebElement getCategories()
	{
		return driver.findElement(menuContent);
	}
	
	public WebElement getProductList()
	{
		return driver.findElement(productList);
	}
	
	public WebElement getContentHome()
	{
		return driver.findElement(contentHome);
	}
	public WebElement getWomenCategory()
	{
		return driver.findElement(womenCategory);
	}
	public WebElement categoryMenu()
	{
		return driver.findElement(categoryMenu);
	}
	public WebElement getContactInformation()
	{
		return driver.findElement(contactInformation);
	}
	public void clickOnSearchButton()
	{
		driver.findElement(searchButton).click();
	}
	public WebElement getRowMenu()
	{
		return driver.findElement(rowmenu);
	}
	public List<WebElement> getProducts()
	{
		return driver.findElements(products);
	}
	public WebElement getBlouse()
	{
		return driver.findElement(blouse);
	}
	public int productsDisplayed()
	{
		return driver.findElements(products).size();
	}

}
