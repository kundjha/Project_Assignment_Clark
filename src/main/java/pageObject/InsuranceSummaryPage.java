package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsuranceSummaryPage {
public WebDriver driver;


By btnSubmit=By.xpath("//button[normalize-space()='Zum Abschluss']");


public InsuranceSummaryPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public WebElement SubmitSummary()
{
	return driver.findElement(btnSubmit);
}

}

