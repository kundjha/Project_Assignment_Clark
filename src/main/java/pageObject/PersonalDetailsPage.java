package pageObject;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Generic;

public class PersonalDetailsPage {
public WebDriver driver;

String radioHerr="xpath_//input[@value='male']";
String radioFrau="xpath_//ul[@class='_choices_1sjhfx']/li[2]";
String txtVorname="xpath_//input[@name='firstName']";
String txtStrasse="xpath_//input[@name='street']";
String txtHaunr="xpath_//input[@name='houseNumber']";
String txtNachName="xpath_//input[@name='lastName']";
String txtPlz="xpath_//input[@name='zipcode']";
String txtOrt="xpath_//input[@name='city']";
String txtGeburtsdaturm="xpath_//input[@name='birthdate']";
String txtTelefonenummer="xpath_//input[@name='phoneNumber']";
String btnSubmit="xpath_//button[@type='submit']";
String insPlan="css_._plan-name_vl28qq";
String insPrice="css_._price_vl28qq";

public PersonalDetailsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement Herr()
{
	return Generic.getAnyElementByAnyLocator(driver, radioHerr);
}
public WebElement Frau()
{
	return Generic.getAnyElementByAnyLocator(driver, radioFrau);
}
public WebElement FirstName()
{
	return Generic.getAnyElementByAnyLocator(driver, txtVorname);
}
public WebElement StrasseName()
{
	return Generic.getAnyElementByAnyLocator(driver, txtStrasse);
}
public WebElement HouseNumber()
{
	return Generic.getAnyElementByAnyLocator(driver, txtHaunr);
}
public WebElement NachName()
{
	return Generic.getAnyElementByAnyLocator(driver, txtNachName);
}
public WebElement zipcode()
{
	return Generic.getAnyElementByAnyLocator(driver, txtPlz);
}
public WebElement ort()
{
	return Generic.getAnyElementByAnyLocator(driver, txtOrt);
}
public WebElement BirthDate()
{
	return Generic.getAnyElementByAnyLocator(driver, txtGeburtsdaturm);
	
}
public WebElement Telefonenummer()
{
	return Generic.getAnyElementByAnyLocator(driver, txtTelefonenummer);
}
public WebElement SubmitPersonalInfo()
{
	return Generic.getAnyElementByAnyLocator(driver, btnSubmit);
}

public WebElement InsPlanPersonalInfo()
{
	return Generic.getAnyElementByAnyLocator(driver,insPlan);
}
public WebElement InsPricePersonalInfo()
{
	return Generic.getAnyElementByAnyLocator(driver,insPrice);
}

public boolean PersonalInfo(WebDriver driver,ArrayList<String> personalDetails)
{
	
	PersonalDetailsPage pd=new PersonalDetailsPage(driver);
	try {
		Actions a=new Actions(driver);
		
		WebElement Frau=pd.Frau();
		a.moveToElement(Frau).sendKeys(Keys.ENTER);
		
		Frau.click();
		pd.FirstName().sendKeys(personalDetails.get(0));
		pd.StrasseName().sendKeys(personalDetails.get(1));
		a.sendKeys(Keys.ESCAPE);
		pd.HouseNumber().sendKeys(personalDetails.get(2));
		a.sendKeys(Keys.ESCAPE);
		pd.NachName().sendKeys(personalDetails.get(3));
		a.sendKeys(Keys.ESCAPE);
		pd.zipcode().sendKeys(personalDetails.get(6));
		a.sendKeys(Keys.ESCAPE);
		pd.ort().sendKeys(personalDetails.get(4));
		a.sendKeys(Keys.ENTER);
		pd.Telefonenummer().sendKeys(personalDetails.get(7));
		a.sendKeys(Keys.ENTER);
		pd.BirthDate().sendKeys(personalDetails.get(5));
		a.sendKeys(Keys.ENTER);
		System.out.println(pd.InsPlanPersonalInfo().getText());
		System.out.println(pd.InsPricePersonalInfo().getText());
		pd.SubmitPersonalInfo().click();
	return true;
	}
	catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
	
}

}

