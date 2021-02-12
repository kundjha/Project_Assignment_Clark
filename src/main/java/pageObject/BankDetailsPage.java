package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;

public class BankDetailsPage {
public WebDriver driver;

String txtIBAN="xpath_//input[@name='iban']";
String chkDDmandate="xpath_//span[@class='_checkbox_qoz8b6']";
String btnSubmit="xpath_//button[@type='submit']";



public BankDetailsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public WebElement IbanInfo()
{
	//return driver.findElement(txtIBAN);
	return Generic.getAnyElementByAnyLocator(driver,txtIBAN);
}

public WebElement DirectDebitMandate()
{
	return Generic.getAnyElementByAnyLocator(driver, chkDDmandate);
}

public WebElement SubmitBankDetails()
{
	return Generic.getAnyElementByAnyLocator(driver,btnSubmit);
}

}

