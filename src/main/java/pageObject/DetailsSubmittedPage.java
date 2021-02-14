package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Generic;

public class DetailsSubmittedPage {
	
	public WebDriver driver;
	
	String btnZumAngebot="xpath_//a[normalize-space()='Zum Angebot']";
	String yourAngebot="xpath_//h1[normalize-space()='Dein Angebot ist da!']";
	
	public DetailsSubmittedPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement ZumAngebot()
	{
		return Generic.getAnyElementByAnyLocator(driver, btnZumAngebot);
	}
	public WebElement DeinAngebot()
	{
		return Generic.getAnyElementByAnyLocator(driver, yourAngebot);
	}
	
	public boolean ShowMyOffers(WebDriver driver)
	{
		DetailsSubmittedPage dp=new DetailsSubmittedPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			WebElement goForInsDetails=dp.DeinAngebot();
			wait.until(ExpectedConditions.visibilityOf(goForInsDetails));
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
			
		}
		try {
		 
			dp.ZumAngebot().click();
			return true;
			
		}
		
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }

	
	

}
