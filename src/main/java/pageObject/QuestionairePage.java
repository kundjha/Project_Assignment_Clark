package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

}

