package utilities;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.DetailsSubmittedPage;
import pageObject.LandingPage;
import pageObject.OfferDetailsPage;
import pageObject.OfferTypePage;
import pageObject.PersonalDetailsPage;
import pageObject.QuestionairePage;
import pageObject.RegistrationPage;

public class CommonLibrary {
	//public static WebDriver driver;
	public static boolean ListAngebote(WebDriver driver)
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
			WebDriverWait wait = new WebDriverWait(driver,30);
			WebElement whoAreCovered=qp.WhoAreCovered();
			wait.until(ExpectedConditions.visibilityOf(whoAreCovered));
		if(inscategory.equalsIgnoreCase("Single"))
		{
			
			qp.FirstAnswer().click();
		}
		else if(inscategory.equalsIgnoreCase("FamilieMitKindern"))
		{
			qp.SecondAnswer().click();;
		}
		else if(inscategory.equalsIgnoreCase("PahrOhneKids"))
		{		
			qp.ThirdAnswer().click();
		}
		else if(inscategory.equalsIgnoreCase("SingleMitKindern"))
		{		
			qp.FourthAnswer().click();
		}
		
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	public boolean IsPublicServiceEmp(WebDriver driver,String isPublicServant)
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
			
			qp.FirstAnswer().click();
		
		}
		else if(isPublicServant.equalsIgnoreCase("Nein"))
		{   
				
			qp.SecondAnswer().click();
		}
		
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
    }
	public boolean IsPensionar(WebDriver driver,String isPensionar)
	{
		QuestionairePage qp=new QuestionairePage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			WebElement pensioninfo=qp.PensionInfo();
			wait.until(ExpectedConditions.visibilityOf(pensioninfo));
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
		try {
		if(isPensionar.equalsIgnoreCase("Ja"))
		{   
			WebElement angebot=qp.AngebotAnfordern();	
			qp.FirstAnswer().click();
			wait.until(ExpectedConditions.elementToBeClickable(angebot));	
			angebot.click();
		
		}
		else if(isPensionar.equalsIgnoreCase("Nein"))
		{   
			WebElement angebot=qp.AngebotAnfordern();	
			qp.SecondAnswer().click();
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
	public boolean NeedSelbstbeteiligung(WebDriver driver,String needSelbsteidlung)
	{
		QuestionairePage qp=new QuestionairePage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			WebElement qSelbSteidlung=qp.isSelbstbeteiligung();
			wait.until(ExpectedConditions.visibilityOf(qSelbSteidlung));
			qp.FirstAnswer().click();
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
			
		}
		try {
			
		if(needSelbsteidlung.equalsIgnoreCase("Ja"))
		{   
			WebElement angebot=qp.AngebotAnfordern();
			
			qp.FirstAnswer().click();
			wait.until(ExpectedConditions.elementToBeClickable(angebot));
			angebot.click();	
		}
		else if(needSelbsteidlung.equalsIgnoreCase("Nein"))
		{   
			WebElement angebot=qp.AngebotAnfordern();	
			qp.SecondAnswer().click();
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
	
	public boolean SelectOffer(WebDriver driver,String offerType)
	{
		
		
		OfferDetailsPage od=new OfferDetailsPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		try {
			WebElement title=od.Title();
			wait.until(ExpectedConditions.visibilityOf(title));
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
			
		}
		System.out.println(od.InsCompEmpfehlung().getText());
		System.out.println(od.PlanEmpfehlung().getText());
		System.out.println(od.PriceEmpfehlung().getText());
		System.out.println(od.InsCompSparangebot().getText());
		System.out.println(od.PlanSparangebot().getText());
		System.out.println(od.PriceSparangebot().getText());
		System.out.println(od.InsCompTopLeistung().getText());
		System.out.println(od.PlanTopLeistung().getText());
		System.out.println(od.PriceTopLeistung().getText());
		try {
			if(offerType.equalsIgnoreCase("Sparangebot"))
			{
				od.ButtonSparangebot().click();
			}
			else if(offerType.equalsIgnoreCase("Empfehlung"))
			{
				od.ButtonEmpfehlung().click();
			}
			else if(offerType.equalsIgnoreCase("TopLeistung"))
			{
				od.ButtonTopLeistung().click();
			}
		return true;
		}
        catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			return false;
		}
	}
		public boolean Register(WebDriver driver,String userId,String password)
		{
			RegistrationPage rp=new RegistrationPage(driver);
			try {
			rp.userid().sendKeys(userId);
			rp.password().sendKeys(password);
			rp.SubmitRegistration().click();
			return true;
			}
			catch(Exception ex) {
				
				System.out.println(ex.getMessage());
				return false;
			}
			
        }
		
		public boolean PersonalInfo(WebDriver driver,ArrayList<String> personalDetails)
		{
			
			PersonalDetailsPage pd=new PersonalDetailsPage(driver);
			try {
				Actions a=new Actions(driver);
				
				WebElement Frau=pd.Frau();
				a.moveToElement(Frau).sendKeys(Keys.ENTER);
				
				Frau.click();
				pd.FirstName().sendKeys(personalDetails.get(0));
				pd.StrasseName().sendKeys(personalDetails.get(1));
				a.sendKeys(Keys.ESCAPE);
				pd.HouseNumber().sendKeys(personalDetails.get(2));
				a.sendKeys(Keys.ESCAPE);
				pd.NachName().sendKeys(personalDetails.get(3));
				a.sendKeys(Keys.ESCAPE);
				pd.zipcode().sendKeys(personalDetails.get(6));
				a.sendKeys(Keys.ESCAPE);
				pd.ort().sendKeys(personalDetails.get(4));
				a.sendKeys(Keys.ENTER);
				pd.Telefonenummer().sendKeys(personalDetails.get(7));
				a.sendKeys(Keys.ENTER);
				pd.BirthDate().sendKeys(personalDetails.get(5));
				a.sendKeys(Keys.ENTER);
				System.out.println(pd.InsPlanPersonalInfo().getText());
				System.out.println(pd.InsPricePersonalInfo().getText());
				pd.SubmitPersonalInfo().click();
			return true;
			}
			catch(Exception ex) {
				
				System.out.println(ex.getMessage());
				return false;
			}
			
        }
}