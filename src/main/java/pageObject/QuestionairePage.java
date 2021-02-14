package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Generic;

public class QuestionairePage {
public WebDriver driver;

String radioQ1="xpath_//li[1]//div[1]//span[1]";
String radioQ2="xpath_//main[@class='page-main']//li[2]//div[1]//span[1]";
String radioQ3="xpath_//main[@class='page-main']//li[3]//div[1]//span[1]";
String radioQ4="xpath_//main[@class='page-main']//li[4]//div[1]//span[1]";
String btnZuruck="css_button[class='btn btn-secondary btn--mobile-block btn--arrow btn-back-split']";
String btnWeider="css_button[class='btn btn-primary btn--arrow btn--mobile-block btn-next-split']";
String btnAngebotanfordern="xpath_//button[@class='btn btn-primary btn--arrow btn--mobile-block btn-next-split']";
String btnZumAngebot="xpath_//a[normalize-space()='Zum Angebot']";
String txtWhoCovered="xpath_//h1[normalize-space()='Wen möchtest du versichern?']";
String txtisPublicService="xpath_//h1[normalize-space()='Bist du im öffentlichen Dienst beschäftigt?']";
String txtOptSelbstbeteiligung="xpath_//h1[normalize-space()='Möchtest du eine Selbstbeteiligung?']";
String txtisPensionar="xpath_//h1[normalize-space()='Beziehst du eine Altersrente oder Pension (ab dem 60. Lebensjahr)?']";



public QuestionairePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement FirstAnswer()
{
	return Generic.getAnyElementByAnyLocator(driver, radioQ1);
}

public WebElement SecondAnswer()
{
	return Generic.getAnyElementByAnyLocator(driver, radioQ2);
}

public WebElement ThirdAnswer()
{
	return Generic.getAnyElementByAnyLocator(driver, radioQ3);
}

public WebElement FourthAnswer()
{
	return Generic.getAnyElementByAnyLocator(driver, radioQ4);
}

public WebElement zuruck()
{
	return Generic.getAnyElementByAnyLocator(driver, btnZuruck);
}


public WebElement weider()
{
	return Generic.getAnyElementByAnyLocator(driver, btnWeider);
}
public WebElement AngebotAnfordern()
{
	return Generic.getAnyElementByAnyLocator(driver,btnAngebotanfordern );
}

public WebElement ZumAngebot()
{
	return Generic.getAnyElementByAnyLocator(driver,btnZumAngebot );
}

public WebElement WhoAreCovered()
{
	return Generic.getAnyElementByAnyLocator(driver,txtWhoCovered );
}

public WebElement isPublicServiceEmp()
{
	return Generic.getAnyElementByAnyLocator(driver,txtisPublicService);
}
public WebElement isSelbstbeteiligung()
{
	return Generic.getAnyElementByAnyLocator(driver,txtOptSelbstbeteiligung);
}

public WebElement PensionInfo()
{
	return Generic.getAnyElementByAnyLocator(driver,txtisPensionar);
}


public boolean ChooseInsuranceCategory(WebDriver driver,String inscategory)
{
	QuestionairePage qp=new QuestionairePage(driver);
	try {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement whoAreCovered=qp.WhoAreCovered();
		wait.until(ExpectedConditions.visibilityOf(whoAreCovered));
	if(inscategory.equalsIgnoreCase("Single"))
	{
		
		qp.FirstAnswer().click();
	}
	else if(inscategory.equalsIgnoreCase("FamilieMitKindern"))
	{
		qp.SecondAnswer().click();;
	}
	else if(inscategory.equalsIgnoreCase("PahrOhneKids"))
	{		
		qp.ThirdAnswer().click();
	}
	else if(inscategory.equalsIgnoreCase("SingleMitKindern"))
	{		
		qp.FourthAnswer().click();
	}
	
	return true;
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
}
public boolean IsPublicServiceEmp(WebDriver driver,String isPublicServant)
{
	QuestionairePage qp=new QuestionairePage(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	try {
		WebElement publicService=qp.isPublicServiceEmp();
		wait.until(ExpectedConditions.visibilityOf(publicService));
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
	try {
	if(isPublicServant.equalsIgnoreCase("Ja"))
	{   
		
		qp.FirstAnswer().click();
	
	}
	else if(isPublicServant.equalsIgnoreCase("Nein"))
	{   
			
		qp.SecondAnswer().click();
	}
	
	return true;
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
}
public boolean IsPensionar(WebDriver driver,String isPensionar)
{
	QuestionairePage qp=new QuestionairePage(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	try {
		WebElement pensioninfo=qp.PensionInfo();
		wait.until(ExpectedConditions.visibilityOf(pensioninfo));
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
	try {
	if(isPensionar.equalsIgnoreCase("Ja"))
	{   
		WebElement angebot=qp.AngebotAnfordern();	
		qp.FirstAnswer().click();
		wait.until(ExpectedConditions.elementToBeClickable(angebot));	
		angebot.click();
	
	}
	else if(isPensionar.equalsIgnoreCase("Nein"))
	{   
		WebElement angebot=qp.AngebotAnfordern();	
		qp.SecondAnswer().click();
		wait.until(ExpectedConditions.elementToBeClickable(angebot));	
		angebot.click();
	}
	
	return true;
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
}
public boolean NeedSelbstbeteiligung(WebDriver driver,String needSelbsteidlung)
{
	QuestionairePage qp=new QuestionairePage(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	try {
		WebElement qSelbSteidlung=qp.isSelbstbeteiligung();
		wait.until(ExpectedConditions.visibilityOf(qSelbSteidlung));
		qp.FirstAnswer().click();
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
		
	}
	try {
		
	if(needSelbsteidlung.equalsIgnoreCase("Ja"))
	{   
		WebElement angebot=qp.AngebotAnfordern();
		
		qp.FirstAnswer().click();
		wait.until(ExpectedConditions.elementToBeClickable(angebot));
		angebot.click();	
	}
	else if(needSelbsteidlung.equalsIgnoreCase("Nein"))
	{   
		WebElement angebot=qp.AngebotAnfordern();	
		qp.SecondAnswer().click();
		wait.until(ExpectedConditions.elementToBeClickable(angebot));	
		angebot.click();	
	}
	return true;
	
	}
    catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
}
}


