package FrameworkE2E;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ExcelUtility;

import org.testng.AssertJUnit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Test;

import pageObject.BankDetailsPage;
import pageObject.InsuranceSummaryPage;
import pageObject.LandingPage;
import pageObject.OfferDetailsPage;
import pageObject.OfferTypePage;
import pageObject.PersonalDetailsPage;
import pageObject.QuestionairePage;
import pageObject.RegistrationPage;
import pageObject.StartDatePage;
import pageObject.ThankYouPage;
import resources.Base;
import utilities.CommonLibrary;


public class PurchaseInsurance extends Base {
	
	 public static Logger log =LogManager.getLogger(PurchaseInsurance.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		log.info("Driver is initalized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to URL ");
		driver.manage().window().maximize();
		
	}
	@Test
	//This method is to Select Angebote and move to offer selection Page
	public void SelectAngebote() throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\ClarkAssignment_Automation\\Configuration\\config.properties");
		prop.load(fis);
		String zipcode=prop.getProperty("ZipCode");
		String telefoneNummer=prop.getProperty("TelefoneNummer");
		String iBAN=prop.getProperty("IBAN");
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC1");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		OfferDetailsPage od=new OfferDetailsPage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		PersonalDetailsPage pd=new PersonalDetailsPage(driver);
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		ThankYouPage tp=new ThankYouPage(driver);
		CommonLibrary cl=new CommonLibrary();
		cl.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		cl.ChooseInsuranceType(driver, insuranceType);
		cl.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		cl.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		cl.isPublicServiceEmp(driver, pubServiceEmp);
		String selbstbeteiligung=testdata.get(13);
		cl.needSelbstbeteiligung(driver, selbstbeteiligung);
		cl.ShowMyOffers(driver);
		
		//String isPensionar=testdata.get(12);
		
		/*
		
		
		WebElement zumAngebot=question.ZumAngebot();
		zumAngebot.click();
		od.FirstOffer().click();
		rp.userid().sendKeys(testdata.get(1));
		rp.password().sendKeys(testdata.get(2));
		rp.SubmitRegistration().click();		
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement Frau=pd.Frau();
		a.moveToElement(Frau).sendKeys(Keys.ENTER);
		
		Frau.click();
		pd.FirstName().sendKeys(testdata.get(3));
		pd.StrasseName().sendKeys(testdata.get(4));
		a.sendKeys(Keys.ESCAPE);
		pd.HouseNumber().sendKeys(testdata.get(5));
		a.sendKeys(Keys.ESCAPE);
		pd.NachName().sendKeys(testdata.get(6));
		a.sendKeys(Keys.ESCAPE);
		pd.zipcode().sendKeys(zipcode);
		a.sendKeys(Keys.ESCAPE);
		pd.ort().sendKeys(testdata.get(7));
		a.sendKeys(Keys.ENTER);
		pd.Telefonenummer().sendKeys(telefoneNummer);
		a.sendKeys(Keys.ENTER);
		pd.BirthDate().sendKeys(testdata.get(8));
		a.sendKeys(Keys.ENTER);
		pd.SubmitPersonalInfo().click();
		start.StartNextWd().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		start.PreviousDamage().click();
		start.SubmitStartDate().click();
		bd.IbanInfo().sendKeys(iBAN);
		bd.DirectDebitMandate().click();
		bd.SubmitBankDetails().click();
		is.SubmitSummary().click();
		tp.AcceptThanks().click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='ember-view _button_dsfphm _appearance-secondary_dsfphm _size-medium_dsfphm']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_modal-content-rating-feedback_5m20r3']//a")).click();
		a.contextClick();*/
		
		   }
		
	
		
	}
	
	
	/*
	@AfterTest
	public void teardown()
	{
		driver.close();
	}*/
	


