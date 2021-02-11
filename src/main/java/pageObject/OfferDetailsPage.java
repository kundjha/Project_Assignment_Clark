package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferDetailsPage {
public WebDriver driver;

By choice1=By.xpath("//section[@class='offer-header _header_2yb545']/div/div[1]/div[2]/div[1]/button");
By insCompSparangebot=By.xpath("//div[@class='_options_2yb545']/div[1]/p[1]");
By insCompEmpfehlung=By.xpath("//div[@class='_options_2yb545']/div[2]/p[1]");
By insCompTopLeistung=By.xpath("//div[@class='_options_2yb545']/div[3]/p[1]");
By planSparangebot=By.xpath("//div[@class='_options_2yb545']/div[1]/p[2]");
By planEmpfehlung=By.xpath("//div[@class='_options_2yb545']/div[2]/p[2]");
By planTopLeistung=By.xpath("//div[@class='_options_2yb545']/div[3]/p[2]");
By priceSparangebot=By.xpath("//div[@class='_options_2yb545']/div[1]/div[2]/p[1]");
By priceEmpfehlung=By.xpath("//div[@class='_options_2yb545']/div[2]/div[2]/p[1]");
By priceTopLeistung=By.xpath("//div[@class='_options_2yb545']/div[3]/div[2]/p[1]");
By buttonSparangebot=By.xpath("//div[@class='_options_2yb545']/div[1]/button");
By buttonEmpfehlung=By.xpath("//div[@class='_options_2yb545']/div[2]/button");
By buttonTopLeistung=By.xpath("//div[@class='_options_2yb545']/div[3]/button");



public OfferDetailsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement FirstOffer()
{
	return driver.findElement(choice1);
}

public WebElement PlanSparangebot()
{

	return driver.findElement(planSparangebot);
	
}

public WebElement PlanEmpfehlung()
{

	return driver.findElement(planEmpfehlung);
	
}

public WebElement PlanTopLeistung()
{

	return driver.findElement(planTopLeistung);
	
}

public WebElement PriceSparangebot()
{

	return driver.findElement(priceSparangebot);
	
}
public WebElement PriceEmpfehlung()
{

	return driver.findElement(priceEmpfehlung);
	
}

public WebElement PriceTopLeistung()
{

	return driver.findElement(priceTopLeistung);
	
}

public WebElement ButtonSparangebot()
{

	return driver.findElement(buttonSparangebot);
	
}
public WebElement ButtonEmpfehlung()
{

	return driver.findElement(buttonEmpfehlung);
	
}

public WebElement ButtonTopLeistung()
{

	return driver.findElement(buttonTopLeistung);
	
}
public WebElement InsCompSparangebot()
{

	return driver.findElement(insCompSparangebot);
	
}
public WebElement InsCompEmpfehlung()
{

	return driver.findElement(insCompEmpfehlung);
	
}

public WebElement InsCompTopLeistung()
{

	return driver.findElement(insCompTopLeistung);
	
}



}

