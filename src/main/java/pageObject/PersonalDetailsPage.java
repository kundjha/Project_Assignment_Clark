package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

}

