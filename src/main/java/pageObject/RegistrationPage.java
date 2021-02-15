package pageObject;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;

public class RegistrationPage {
public WebDriver driver;

String txtemail="xpath_//input[@type='email']";
String txtpassord="xpath_//input[@type='password']";
String btnRegister="xpath_//button[@type='submit']";


public RegistrationPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement userid()
{
	return Generic.getAnyElementByAnyLocator(driver, txtemail);
}

public WebElement password()
{
	return Generic.getAnyElementByAnyLocator(driver, txtpassord);
}

public WebElement SubmitRegistration()
{
	return Generic.getAnyElementByAnyLocator(driver, btnRegister);
}

public boolean Register(WebDriver driver,String userId,String password)
{
	RegistrationPage rp=new RegistrationPage(driver);
	try {
	rp.userid().sendKeys(userId);
	rp.password().sendKeys(password);
	rp.SubmitRegistration().click();
	return true;
	}
	catch(Exception ex) {
		
		System.out.println(ex.getMessage());
		return false;
	}
	
}
}

