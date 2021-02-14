package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;

public class LandingPage {
public WebDriver driver;
String btnAccept="xpath_//button[normalize-space()='Akzeptieren']";
String linkAngebote="xpath_//a[normalize-space()='Angebote']";

public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement AcceptCookie()
{
	//System.out.println(" I am here ");
	return Generic.getAnyElementByAnyLocator(driver,btnAccept);
}
public WebElement Angebote()
{
	//System.out.println(" I am here ");
	return Generic.getAnyElementByAnyLocator(driver, linkAngebote);
}

public static boolean ListAngebote(WebDriver driver)
{
	try {
	LandingPage l = new LandingPage(driver);
	WebElement btnAccept=l.AcceptCookie();
	btnAccept.click();
	WebElement linkAngebote=l.Angebote();
	linkAngebote.click();
	return true;
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
}

}

