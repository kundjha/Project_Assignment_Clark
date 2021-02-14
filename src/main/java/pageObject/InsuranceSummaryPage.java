package pageObject;

import org.openqa.selenium.JavascriptExecutor;
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

public boolean acceptInsurance(WebDriver driver)
{
	try {
	SubmitSummary().click();
	return true;
	}
	
	catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
	
}


}

