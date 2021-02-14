package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Generic;

public class OfferDetailsPage {
public WebDriver driver;

String choice1="xpath_//section[@class='offer-header _header_2yb545']/div/div[1]/div[2]/div[1]/button";
String insCompSparangebot="xpath_//div[@class='_options_2yb545']/div[1]/p[1]";
String insCompEmpfehlung="xpath_//div[@class='_options_2yb545']/div[2]/p[1]";
String insCompTopLeistung="xpath_//div[@class='_options_2yb545']/div[3]/p[1]";
String planSparangebot="xpath_//div[@class='_options_2yb545']/div[1]/p[2]";
String planEmpfehlung="xpath_//div[@class='_options_2yb545']/div[2]/p[2]";
String planTopLeistung="xpath_//div[@class='_options_2yb545']/div[3]/p[2]";
String priceSparangebot="xpath_//div[@class='_options_2yb545']/div[1]/div[2]/p[1]";
String priceEmpfehlung="xpath_//div[@class='_options_2yb545']/div[2]/div[2]/p[1]";
String priceTopLeistung="xpath_//div[@class='_options_2yb545']/div[3]/div[2]/p[1]";
String btnSparangebot="xpath_//div[@class='_options_2yb545']/div[1]/button";
String btnEmpfehlung="xpath_//div[@class='_options_2yb545']/div[2]/button";
String btnTopLeistung="xpath_//div[@class='_options_2yb545']/div[3]/button";
String title="class__title_2yb545";

public OfferDetailsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement PlanSparangebot()
{

	return Generic.getAnyElementByAnyLocator(driver, planSparangebot);
	
}

public WebElement PlanEmpfehlung()
{

	return Generic.getAnyElementByAnyLocator(driver, planEmpfehlung);
	
}

public WebElement PlanTopLeistung()
{

	return Generic.getAnyElementByAnyLocator(driver, planTopLeistung);
	
}

public WebElement PriceSparangebot()
{

	return Generic.getAnyElementByAnyLocator(driver, priceSparangebot);
	
}
public WebElement PriceEmpfehlung()
{

	return Generic.getAnyElementByAnyLocator(driver, priceEmpfehlung);
	
}

public WebElement PriceTopLeistung()
{

	return Generic.getAnyElementByAnyLocator(driver, priceTopLeistung);
	
}

public WebElement ButtonSparangebot()
{

	return Generic.getAnyElementByAnyLocator(driver,btnSparangebot);
	
}
public WebElement ButtonEmpfehlung()
{

	return Generic.getAnyElementByAnyLocator(driver, btnEmpfehlung);
	
}

public WebElement ButtonTopLeistung()
{

	return Generic.getAnyElementByAnyLocator(driver, btnTopLeistung);
	
}
public WebElement InsCompSparangebot()
{

	return Generic.getAnyElementByAnyLocator(driver, insCompSparangebot);
	
}
public WebElement InsCompEmpfehlung()
{

	return Generic.getAnyElementByAnyLocator(driver, insCompEmpfehlung);
	
}

public WebElement InsCompTopLeistung()
{

	return Generic.getAnyElementByAnyLocator(driver, insCompTopLeistung);
	
}

public WebElement Title()
{

	return Generic.getAnyElementByAnyLocator(driver, title);
	
}

public boolean SelectOffer(WebDriver driver,String offerType)
{
	
	
	OfferDetailsPage od=new OfferDetailsPage(driver);
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	try {
		WebElement title=od.Title();
		wait.until(ExpectedConditions.visibilityOf(title));
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
		
	}
	System.out.println(od.InsCompEmpfehlung().getText());
	System.out.println(od.PlanEmpfehlung().getText());
	System.out.println(od.PriceEmpfehlung().getText());
	System.out.println(od.InsCompSparangebot().getText());
	System.out.println(od.PlanSparangebot().getText());
	System.out.println(od.PriceSparangebot().getText());
	System.out.println(od.InsCompTopLeistung().getText());
	System.out.println(od.PlanTopLeistung().getText());
	System.out.println(od.PriceTopLeistung().getText());
	try {
		if(offerType.equalsIgnoreCase("Sparangebot"))
		{
			od.ButtonSparangebot().click();
		}
		else if(offerType.equalsIgnoreCase("Empfehlung"))
		{
			od.ButtonEmpfehlung().click();
		}
		else if(offerType.equalsIgnoreCase("TopLeistung"))
		{
			od.ButtonTopLeistung().click();
		}
	return true;
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
}



}

