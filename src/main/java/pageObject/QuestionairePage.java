package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionairePage {
public WebDriver driver;

By radioQ1=By.xpath("//li[1]//div[1]//span[1]");

By radioQ2=By.xpath("//main[@class='page-main']//li[2]//div[1]//span[1]");
By btnZuruck=By.cssSelector("button[class='btn btn-secondary btn--mobile-block btn--arrow btn-back-split']");
By btnWeider=By.cssSelector("button[class='btn btn-primary btn--arrow btn--mobile-block btn-next-split']");
By btnAngebotanfordern=By.xpath("//button[@class='btn btn-primary btn--arrow btn--mobile-block btn-next-split']");
By btnZumAngebot=By.xpath("//a[normalize-space()='Zum Angebot']");
By txtWhoCovered=By.xpath("//h1[normalize-space()='Wen möchtest du versichern?']");
By txtisPublicService=By.xpath("//h1[normalize-space()='Bist du im öffentlichen Dienst beschäftigt?']");
By txtOptSelbstbeteiligung=By.xpath("//h1[normalize-space()='Möchtest du eine Selbstbeteiligung?']");


public QuestionairePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public WebElement FirstAnswer()
{
	return driver.findElement(radioQ1);
}

public WebElement SecondAnswer()
{
	return driver.findElement(radioQ2);
}

public WebElement zuruck()
{
	return driver.findElement(btnZuruck);
}
public WebElement weider()
{
	return driver.findElement(btnWeider);
}
public WebElement AngebotAnfordern()
{
	return driver.findElement(btnAngebotanfordern);
}

public WebElement ZumAngebot()
{
	return driver.findElement(btnZumAngebot);
}

public WebElement WhoAreCovered()
{
	return driver.findElement(txtWhoCovered);
}

public WebElement isPublicServiceEmp()
{
	return driver.findElement(txtisPublicService);
}
public WebElement isSelbstbeteiligung()
{
	return driver.findElement(txtOptSelbstbeteiligung);
}

}

