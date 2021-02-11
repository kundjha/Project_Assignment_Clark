package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailsSubmittedPage {
	
	public WebDriver driver;
	
	By btnZumAngebot=By.xpath("//a[normalize-space()='Zum Angebot']");
	By yourAngebot=By.xpath("//h1[normalize-space()='Dein Angebot ist da!']");
	
	public DetailsSubmittedPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement ZumAngebot()
	{
		return driver.findElement(btnZumAngebot);
	}
	public WebElement DeinAngebot()
	{
		return driver.findElement(yourAngebot);
	}
	

}
