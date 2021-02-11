package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferTypePage {
public WebDriver driver;
By optionPrivathaftpflicht=By.xpath("//div[@role='presentation']//div[1]//div[1]//div[1]//div[1]");
By btnBeginQuestions=By.xpath("//button[@id='ember26']");


public OfferTypePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement optforPrivathaftpflicht()
{
	//System.out.println(" I am here ");
	return driver.findElement(optionPrivathaftpflicht);
}

public WebElement BeginQuestion()
{
	//System.out.println(" I am here ");
	return driver.findElement(btnBeginQuestions);
}

}

