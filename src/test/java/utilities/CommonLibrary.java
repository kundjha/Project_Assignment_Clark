package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.DetailsSubmittedPage;
import pageObject.LandingPage;
import pageObject.OfferTypePage;
import pageObject.QuestionairePage;

public class CommonLibrary {
	//public static WebDriver driver;
	public boolean ListAngebote(WebDriver driver)
	{
		try {
		LandingPage l = new LandingPage(driver);
		WebElement btnAccept=l.AcceptCookie();
		btnAccept.click();
		WebElement linkAngebote=l.Angebote();
		linkAngebote.click();
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	
	public boolean ChooseInsuranceType(WebDriver driver,String instype)
	{
		OfferTypePage ot=new OfferTypePage(driver);
		try {
		if(instype.equalsIgnoreCase("Privathaftpflicht"))
		{
			ot.optforPrivathaftpflicht().click();
		}
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	public boolean ChooseInsuranceCategory(WebDriver driver,String inscategory)
	{
		QuestionairePage qp=new QuestionairePage(driver);
		try {
		if(inscategory.equalsIgnoreCase("Single"))
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			WebElement whoAreCovered=qp.WhoAreCovered();
			wait.until(ExpectedConditions.visibilityOf(whoAreCovered));
			qp.FirstAnswer().click();
		}
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	public boolean isPublicServiceEmp(WebDriver driver,String isPublicServant)
	{
		QuestionairePage qp=new QuestionairePage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			WebElement publicService=qp.isPublicServiceEmp();
			wait.until(ExpectedConditions.visibilityOf(publicService));
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
		try {
		if(isPublicServant.equalsIgnoreCase("Ja"))
		{   
				
			WebElement publicService=qp.FirstAnswer();
			publicService.click();
		}
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	public boolean needSelbstbeteiligung(WebDriver driver,String needSelbsteidlung)
	{
		QuestionairePage qp=new QuestionairePage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			WebElement qSelbSteidlung=qp.isSelbstbeteiligung();
			wait.until(ExpectedConditions.visibilityOf(qSelbSteidlung));
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
			
		}
		try {
		if(needSelbsteidlung.equalsIgnoreCase("Ja"))
		{   
				
			WebElement yesSelbSteidlung=qp.FirstAnswer();
			yesSelbSteidlung.click();
			WebElement angebot=qp.AngebotAnfordern();
			wait.until(ExpectedConditions.elementToBeClickable(angebot));
			angebot.click();
			
		}
		return true;
		
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	public boolean ShowMyOffers(WebDriver driver)
	{
		DetailsSubmittedPage dp=new DetailsSubmittedPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			WebElement goForInsDetails=dp.DeinAngebot();
			wait.until(ExpectedConditions.visibilityOf(goForInsDetails));
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
			
		}
		try {
		 
			dp.ZumAngebot().click();
			return true;
			
		}
		
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }

	
	
	public boolean BeginQuestion(WebDriver driver)
	{
		OfferTypePage ot=new OfferTypePage(driver);
		try {
		ot.BeginQuestion().click();
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	
	
}