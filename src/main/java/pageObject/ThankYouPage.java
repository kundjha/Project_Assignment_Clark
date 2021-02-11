package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThankYouPage {
public WebDriver driver;



By btnSubmit=By.xpath("//div[@class='_actions_yje2cq _orientation-vertical_yje2cq']");
//button[@type='submit']


public ThankYouPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement AcceptThanks()
{
	return driver.findElement(btnSubmit);
}

}

