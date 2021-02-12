package Utility;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.model.Log;

public class Generic {
	
		
		public static boolean isElementAv(WebDriver d,By objectf) {
			
			
			try {
				
				return d.findElement(objectf).isDisplayed();
			}
			
			
			catch(NoSuchElementException e)
			{
				System.out.println(e.getMessage());
				return false;
				
			}
			
			
		}
		
		public static WebElement getAnyElementByAnyLocator(WebDriver driver, String locatorPath){
			try{
			if(locatorPath.startsWith("css_")){
			return driver.findElement(By.cssSelector(locatorPath.replace("css_", "")));
			}

			else if(locatorPath.startsWith("xpath_")){
			return driver.findElement(By.xpath(locatorPath.replace("xpath_", "")));
			}

			else if(locatorPath.startsWith("id_")){
			return driver.findElement(By.id(locatorPath.replace("id_", "")));
			}

			else if(locatorPath.startsWith("name_")){
			return driver.findElement(By.name(locatorPath.replace("name_", "")));
			}

			else if(locatorPath.startsWith("link_")){
			return driver.findElement(By.linkText(locatorPath.replace("link_", "")));
			}

			else if(locatorPath.startsWith("partiallink_")){
			return driver.findElement(By.partialLinkText(locatorPath.replace("partiallink_", "")));
			}

			else if(locatorPath.startsWith("class_")){
			return driver.findElement(By.className(locatorPath.replace("class_", "")));
			}

			else if(locatorPath.startsWith("tag_")){
			return driver.findElement(By.tagName(locatorPath.replace("tag_", "")));
			}

			else
			return null;
			}

			catch (Exception ex) {
			//log.("Unable to get element" + e.getMessage(), driver);
				System.out.println(ex.getMessage());
			return null;
			}
			} 

	}



