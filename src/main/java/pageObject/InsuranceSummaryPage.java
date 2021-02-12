package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;

public class InsuranceSummaryPage {
public WebDriver driver;


String btnSubmit="xpath_//button[normalize-space()='Zum Abschluss']";


public InsuranceSummaryPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public WebElement SubmitSummary()
{
	return Generic.getAnyElementByAnyLocator(driver, btnSubmit);
}

}

