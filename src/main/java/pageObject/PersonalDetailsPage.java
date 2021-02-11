package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalDetailsPage {
public WebDriver driver;

By radioHerr=By.xpath("//input[@value='male']");
By radioFrau=By.xpath("//ul[@class='_choices_1sjhfx']/li[2]");
By txtVorname=By.xpath("//input[@name='firstName']");
By txtStrasse=By.xpath("//input[@name='street']");
By txtHaunr=By.xpath("//input[@name='houseNumber']");
By txtNachName=By.xpath("//input[@name='lastName']");
By txtPlz=By.xpath("//input[@name='zipcode']");
By txtOrt=By.xpath("//input[@name='city']");
By txtGeburtsdaturm=By.xpath("//input[@name='birthdate']");
By txtTelefonenummer=By.xpath("//input[@name='phoneNumber']");
By btnSubmit=By.xpath("//button[@type='submit']");
By insPlan=By.cssSelector("._plan-name_vl28qq");
By insPrice=By.cssSelector("._price_vl28qq");

public PersonalDetailsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement Herr()
{
	return driver.findElement(radioHerr);
}
public WebElement Frau()
{
	return driver.findElement(radioFrau);
}
public WebElement FirstName()
{
	return driver.findElement(txtVorname);
}
public WebElement StrasseName()
{
	return driver.findElement(txtStrasse);
}
public WebElement HouseNumber()
{
	return driver.findElement(txtHaunr);
}
public WebElement NachName()
{
	return driver.findElement(txtNachName);
}
public WebElement zipcode()
{
	return driver.findElement(txtPlz);
}
public WebElement ort()
{
	return driver.findElement(txtOrt);
}
public WebElement BirthDate()
{
	return driver.findElement(txtGeburtsdaturm);
}
public WebElement Telefonenummer()
{
	return driver.findElement(txtTelefonenummer);
}
public WebElement SubmitPersonalInfo()
{
	return driver.findElement(btnSubmit);
}

public WebElement InsPlanPersonalInfo()
{
	return driver.findElement(insPlan);
}
public WebElement InsPricePersonalInfo()
{
	return driver.findElement(insPrice);
}

}

