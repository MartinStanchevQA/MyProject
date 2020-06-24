package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","D:\\QA\\Eclipse-workspace\\MavenJava\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Nested Frames")).click();
	driver.switchTo().frame(driver.findElement(By.name("frame-top")));
	driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
	System.out.println(driver.findElement(By.id("content")).getText());
	}

}
