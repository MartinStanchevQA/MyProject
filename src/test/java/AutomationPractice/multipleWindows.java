package AutomationPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\QA\\Eclipse-workspace\\MavenJava\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentWindow=it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println("The message in the child windows is " + driver.findElement(By.xpath("//*[@class='example']/h3")).getText() + "'.");
		driver.switchTo().window((parentWindow));
		System.out.println("The message in the parent windows is " + driver.findElement(By.xpath("//*[@class='example']/h3")).getText() + ".");
		
		
		

	}

}
