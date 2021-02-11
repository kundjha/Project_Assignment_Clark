package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartDatePage {
public WebDriver driver;


By radioNextWorkingDay=By.xpath("//div[@class='_form-fields_y7l2mq']/div[1]/fieldset/ul/li[1]/label/span[1]");
By radioPreDamage=By.xpath("//div[@class='_form-fields_y7l2mq']/div[2]/fieldset/ul/li[1]/label/span[1]");
By btnSubmit=By.xpath("//button[@type='submit']");
By insPlan=By.cssSelector("._plan-name_vl28qq");
By insPrice=By.cssSelector("._price_vl28qq");
//button[@type='submit']


public StartDatePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement StartNextWd()
{
	return driver.findElement(radioNextWorkingDay);
}

public WebElement PreviousDamage()
{
	return driver.findElement(radioPreDamage);
}
public WebElement SubmitStartDate()
{
	return driver.findElement(btnSubmit);
}

public WebElement InsPlan()
{
	return driver.findElement(insPlan);
}

public WebElement InsPrice()
{
	return driver.findElement(insPrice);
}

}

