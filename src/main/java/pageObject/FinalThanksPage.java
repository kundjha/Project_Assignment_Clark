package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Generic;
import resources.Base;

public class FinalThanksPage extends Base{
	public WebDriver driver;
	String btnThanks="xpath_//a[normalize-space()='Zur Vertragsübersicht']";
	public FinalThanksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

//driver.findElement(By.xpath("//a[normalize-space()='Zur Vertragsübersicht']")).click();;

	public WebElement BtnThanks()
	{
		return Generic.getAnyElementByAnyLocator(driver, btnThanks);
	}

	public boolean submitThanks(WebDriver driver)
	{
		try {
			FinalThanksPage ft=new FinalThanksPage(driver);
			ft.BtnThanks().click();
		return true;
		}
		
		catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
		
	}

}
