package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	

}
