package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;

public class OfferTypePage {
public WebDriver driver;
String optionPrivathaftpflicht="xpath_//div[@role='presentation']//div[1]//div[1]//div[1]//div[1]";
String btnBeginQuestions="xpath_//button[@id='ember26']";


public OfferTypePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement optforPrivathaftpflicht()
{
	//System.out.println(" I am here ");
	return Generic.getAnyElementByAnyLocator(driver, optionPrivathaftpflicht);
}

public WebElement BeginQuestion()
{
	//System.out.println(" I am here ");
	return Generic.getAnyElementByAnyLocator(driver, btnBeginQuestions);
}

}

