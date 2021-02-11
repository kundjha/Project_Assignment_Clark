package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
public WebDriver driver;

By txtemail=By.xpath("//input[@type='email']");
By txtpassord=By.xpath("//input[@type='password']");
By btnRegister=By.xpath("//button[@type='submit']");


public RegistrationPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement userid()
{
	return driver.findElement(txtemail);
}

public WebElement password()
{
	return driver.findElement(txtpassord);
}

public WebElement SubmitRegistration()
{
	return driver.findElement(btnRegister);
}

}

