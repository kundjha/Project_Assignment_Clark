package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver InitializeDriver() throws IOException
	{
		
	   prop =new Properties();
	   String filePath=System.getProperty("user.dir")+"\\Configuration\\config.properties";	
	   FileInputStream fis = new FileInputStream(filePath);
		//How properties file will know about this file 
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome"))
		{
			System.out.println("Invoked");
			String chromePath=System.getProperty("user.dir")+"\\driver\\chromedriver.exe";	
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver=new ChromeDriver();
			
		}
		else if (browserName.equals("firefox"))
		{
			String firefoxPath=System.getProperty("user.dir")+"\\driver\\geckodriver.exe";	
			System.setProperty("webdriver.chrome.driver", firefoxPath);
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("Edge"))
		{
			String edgePath=System.getProperty("user.dir")+"\\driver\\msedgedriver.exe";	
			System.setProperty("webdriver.chrome.driver",edgePath);
			driver=new EdgeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
				
	}
	public String getScreenShotPath(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}
	

}
