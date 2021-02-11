package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankDetailsPage {
public WebDriver driver;

By txtIBAN=By.xpath("//input[@name='iban']");

By chkDDmandate=By.xpath("//span[@class='_checkbox_qoz8b6']");
By btnSubmit=By.xpath("//button[@type='submit']");



public BankDetailsPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public WebElement IbanInfo()
{
	return driver.findElement(txtIBAN);
}

public WebElement DirectDebitMandate()
{
	return driver.findElement(chkDDmandate);
}

public WebElement SubmitBankDetails()
{
	return driver.findElement(btnSubmit);
}

}

