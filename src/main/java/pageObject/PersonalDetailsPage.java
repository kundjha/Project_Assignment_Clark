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

public boolean PersonalInfo(WebDriver driver,ArrayList<String> personalInfodata, ArrayList<String> expectedResult)
{
	
	PersonalDetailsPage pd=new PersonalDetailsPage(driver);
	String zipcode=personalInfodata.get(16);
	String telefoneNummer=personalInfodata.get(17);	
	
	try {
		Actions a=new Actions(driver);
		ArrayList<String> personalinfo=new ArrayList<String>();
		for (int k=0;k<=10;k++)
		{
			personalinfo.add("NULL");
		}
		int j=3;
		
		for (int i=0;i<=5;i++)
		{
					
				personalinfo.set(i,personalInfodata.get(j));
				j++;
			
		}
		personalinfo.set(6, zipcode);
		personalinfo.set(7, telefoneNummer);
		WebElement Frau=pd.Frau();
		a.moveToElement(Frau).sendKeys(Keys.ENTER);
		
		Frau.click();
		pd.FirstName().sendKeys(personalinfo.get(0));
		pd.StrasseName().sendKeys(personalinfo.get(1));
		a.sendKeys(Keys.ESCAPE);
		pd.HouseNumber().sendKeys(personalinfo.get(2));
		a.sendKeys(Keys.ESCAPE);
		pd.NachName().sendKeys(personalinfo.get(3));
		a.sendKeys(Keys.ESCAPE);
		pd.zipcode().sendKeys(personalinfo.get(6));
		a.sendKeys(Keys.ESCAPE);
		pd.ort().sendKeys(personalinfo.get(4));
		a.sendKeys(Keys.ENTER);
		pd.Telefonenummer().sendKeys(personalinfo.get(7));
		a.sendKeys(Keys.ENTER);
		pd.BirthDate().sendKeys(personalinfo.get(5));
		a.sendKeys(Keys.ENTER);
		System.out.println(InsPlanPersonalInfo().getText());
		System.out.println(InsPricePersonalInfo().getText());
		if(InsPlanPersonalInfo().getText().equalsIgnoreCase(expectedResult.get(1)))
			System.out.println("Hurray!!!");
		if(InsPricePersonalInfo().getText().equalsIgnoreCase(expectedResult.get(2)))
			System.out.println("Hurray!!! Again!!!");
		
		SubmitPersonalInfo().click();
	return true;
	}
	catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
	
}

}

