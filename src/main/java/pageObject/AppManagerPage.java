package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utility.Generic;

public class AppManagerPage {
	public WebDriver driver;

	String btnPop1="xpath_//button[@class='ember-view _button_dsfphm _appearance-secondary_dsfphm _size-medium_dsfphm']";
	String btnPop2="xpath_//div[@class='_modal-content-rating-feedback_5m20r3']//a";
	String txtInsCat="css_._title_niboal";
	String txtInsComp="css_._subtitle_niboal";



	public AppManagerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	/*driver.findElement(By.xpath("//button[@class='ember-view _button_dsfphm _appearance-secondary_dsfphm _size-medium_dsfphm']")).click();
	//Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='_modal-content-rating-feedback_5m20r3']//a")).click();
	a.contextClick();
	System.out.println(driver.findElement(By.cssSelector("._title_niboal")).getText());
	System.out.println(driver.findElement(By.cssSelector("._subtitle_niboal")).getText());
	//a.contextClick();*/
	

	public WebElement BtnPop1()
	{
		return Generic.getAnyElementByAnyLocator(driver,btnPop1);
	}

	public WebElement BtnPop2()
	{
		return Generic.getAnyElementByAnyLocator(driver, btnPop2);
	}

	public WebElement InsCategory()
	{
		return Generic.getAnyElementByAnyLocator(driver,txtInsCat);
	}

	public WebElement InsComp()
	{
		return Generic.getAnyElementByAnyLocator(driver,txtInsComp);
	}
	public boolean InsInfoAppManager(WebDriver driver, String expectedcomp)
	{
		AppManagerPage ap=new AppManagerPage(driver);
		Actions a =new Actions(driver);
		try {
			
			ap.BtnPop1().click();
			ap.BtnPop2().click();	
			a.contextClick();
			String actualcomp=ap.InsComp().getText();
			System.out.println(ap.InsComp().getText());
			System.out.println(ap.InsCategory().getText());
			Assert.assertEquals(actualcomp, expectedcomp);
		return true;
		}
		
		catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
		
	}
}
