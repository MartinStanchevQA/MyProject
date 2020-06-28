package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myAccountPage {
	
	public WebDriver driver;
	
	By welcomeMessage = By.cssSelector(".info-account");
	
	public myAccountPage (WebDriver driver) {
		this.driver=driver;
	}

	public String getWelcomeMessage()
	{
		return driver.findElement(welcomeMessage).getText();
	}
}
