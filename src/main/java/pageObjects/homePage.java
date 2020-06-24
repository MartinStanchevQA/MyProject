package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='my-account']");
	By contactUs= By.cssSelector("a[href*='contact']");
	By searchBar= By.id("search_query_top");
	By menuContent= By.xpath("//*[@class='cat_title']//ul");
	By productList= By.xpath("//*[@id='homefeature']//ul");
	By contentHome = By.xpath("//*[@id='htmlcontent_home']");
	By womenCategory = By.xpath("//a[title='Women']");
	
	public homePage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement getContact()
	{
		return driver.findElement(contactUs);
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
	

}
