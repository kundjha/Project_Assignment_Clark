package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferDetailsPage {
public WebDriver driver;

By choice1=By.xpath("//section[@class='offer-header _header_2yb545']/div/div[1]/div[2]/div[1]/button");



public OfferDetailsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement FirstOffer()
{
	return driver.findElement(choice1);
}





}

