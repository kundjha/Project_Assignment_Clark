package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;

public class ThankYouPage {
public WebDriver driver;

String btnSubmit="xpath_//div[@class='_actions_yje2cq _orientation-vertical_yje2cq']";

public ThankYouPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement AcceptThanks()
{
	return Generic.getAnyElementByAnyLocator(driver, btnSubmit);
}

}

