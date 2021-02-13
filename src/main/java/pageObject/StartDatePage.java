package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;

public class StartDatePage {
public WebDriver driver;


String radioNextWorkingDay="xpath_//div[@class='_form-fields_y7l2mq']/div[1]/fieldset/ul/li[1]/label/span[1]";
String radioPreDamage="xpath_//div[@class='_form-fields_y7l2mq']/div[2]/fieldset/ul/li[1]/label/span[1]";
String btnSubmit="xpath_//button[@type='submit']";
String insPlan="css_._plan-name_vl28qq";
String insPrice="css_._price_vl28qq";

public StartDatePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement StartNextWd()
{
	return Generic.getAnyElementByAnyLocator(driver, radioNextWorkingDay);
}

public WebElement PreviousDamage()
{
	return Generic.getAnyElementByAnyLocator(driver, radioPreDamage);
}
public WebElement SubmitStartDate()
{
	return Generic.getAnyElementByAnyLocator(driver, btnSubmit);
}

public WebElement InsPlan()
{
	return Generic.getAnyElementByAnyLocator(driver, insPlan);
}

public WebElement InsPrice()
{
	return Generic.getAnyElementByAnyLocator(driver, insPrice);
}

}

