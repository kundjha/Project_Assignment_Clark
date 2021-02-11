package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
By btnAccept=By.xpath("//button[normalize-space()='Akzeptieren']");
By linkAngebote=By.xpath("//a[normalize-space()='Angebote']");

public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement AcceptCookie()
{
	//System.out.println(" I am here ");
	return driver.findElement(btnAccept);
}
public WebElement Angebote()
{
	//System.out.println(" I am here ");
	return driver.findElement(linkAngebote);
}

}

