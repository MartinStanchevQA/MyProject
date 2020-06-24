package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base{
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\QA\\Eclipse-workspace\\MavenJava\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver","D:\\QA\\Eclipse-workspace\\MavenJava\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().fullscreen();
		}
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().fullscreen();
		}
		else if(browserName.equals("IE"));
		{
		   //IE code
		}
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
		}
		
	}
