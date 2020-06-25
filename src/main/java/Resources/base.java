package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base{
	
	public WebDriver driver;
	public Properties prop;
	String projectPath = System.getProperty("user.dir");
	
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(projectPath + "\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
				{
			String chromePath = projectPath + "\\src\\main\\java\\Resources\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",chromePath);
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{	
			//FireFox code...
		}
		else if(browserName.equals("IE"));
		{
		   //IE code...
		}
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
		}
		
	}
