package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='my-account']");
	By email = By.name("email");
	By password = By.id("passwd");
	By submitButton = By.id("SubmitLogin");
	
	public loginPageObject (WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement emailAdress() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement submitButton() {
		return driver.findElement(submitButton);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(signIn);
	}
}
