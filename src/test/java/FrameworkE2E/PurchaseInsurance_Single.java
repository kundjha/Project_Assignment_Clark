package FrameworkE2E;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utility.ExcelUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pageObject.BankDetailsPage;
import pageObject.InsuranceSummaryPage;
import pageObject.OfferDetailsPage;
import pageObject.PersonalDetailsPage;
import pageObject.RegistrationPage;
import pageObject.StartDatePage;
import pageObject.ThankYouPage;
import resources.Base;
import utilities.CommonLibrary;

public class PurchaseInsurance_Single extends Base {
	
	 public static Logger log =LogManager.getLogger(PurchaseInsurance_Single.class.getName());
	@BeforeMethod
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		log.info("Driver is initalized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to URL ");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	//This method is to Select Angebote and move to offer selection Page
	public void Purchase_PrivateIns_Single_PublicServant_YesDeductible() throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\ClarkAssignment_Automation\\Configuration\\config.properties");
		prop.load(fis);
		String zipcode=prop.getProperty("ZipCode");
		String telefoneNummer=prop.getProperty("TelefoneNummer");
		String iBAN=prop.getProperty("IBAN");
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC1");
		Actions a =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		ThankYouPage tp=new ThankYouPage(driver);
		CommonLibrary cl=new CommonLibrary();
		CommonLibrary.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		cl.ChooseInsuranceType(driver, insuranceType);
		cl.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		cl.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		cl.IsPublicServiceEmp(driver, pubServiceEmp);
		String selbstbeteiligung=testdata.get(13);
		cl.NeedSelbstbeteiligung(driver, selbstbeteiligung);
		cl.ShowMyOffers(driver);
		String offerTypeToSelect=testdata.get(14);
		cl.SelectOffer(driver, offerTypeToSelect);
		
		/*String userId=testdata.get(1);
		String password=testdata.get(2);
		cl.Register(driver, userId, password);
		ArrayList<String> personalinfo=new ArrayList<String>();
		for (int k=0;k<=10;k++)
		{
			personalinfo.add("NULL");
		}
		int j=3;
		
		for (int i=0;i<=5;i++)
		{
					
				personalinfo.set(i,testdata.get(j));
				j++;
			
		}
		personalinfo.set(6, zipcode);
		personalinfo.set(7, telefoneNummer);
		cl.PersonalInfo(driver, personalinfo);
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

	@Test(priority=2)
	public void Purchase_PrivateIns_Single_PublicServant_NoDeductible() throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\ClarkAssignment_Automation\\Configuration\\config.properties");
		prop.load(fis);
		String zipcode=prop.getProperty("ZipCode");
		String telefoneNummer=prop.getProperty("TelefoneNummer");
		String iBAN=prop.getProperty("IBAN");
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC2");
		Actions a =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		ThankYouPage tp=new ThankYouPage(driver);
		CommonLibrary cl=new CommonLibrary();
		CommonLibrary.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		cl.ChooseInsuranceType(driver, insuranceType);
		cl.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		cl.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		cl.IsPublicServiceEmp(driver, pubServiceEmp);
		String selbstbeteiligung=testdata.get(13);
		cl.NeedSelbstbeteiligung(driver, selbstbeteiligung);
		cl.ShowMyOffers(driver);
		String offerTypeToSelect=testdata.get(14);
		cl.SelectOffer(driver, offerTypeToSelect);
		/*String userId=testdata.get(1);
		String password=testdata.get(2);
		cl.Register(driver, userId, password);
		ArrayList<String> personalinfo=new ArrayList<String>();
		for (int k=0;k<=10;k++)
		{
			personalinfo.add("NULL");
		}
		int j=3;
		
		for (int i=0;i<=5;i++)
		{
					
				personalinfo.set(i,testdata.get(j));
				j++;
			
		}
		personalinfo.set(6, zipcode);
		personalinfo.set(7, telefoneNummer);
		cl.PersonalInfo(driver, personalinfo);
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
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_YesPensionar_YesDeductible() throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\ClarkAssignment_Automation\\Configuration\\config.properties");
		prop.load(fis);
		String zipcode=prop.getProperty("ZipCode");
		String telefoneNummer=prop.getProperty("TelefoneNummer");
		String iBAN=prop.getProperty("IBAN");
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC3");
		Actions a =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		ThankYouPage tp=new ThankYouPage(driver);
		CommonLibrary cl=new CommonLibrary();
		CommonLibrary.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		cl.ChooseInsuranceType(driver, insuranceType);
		cl.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		cl.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		cl.IsPublicServiceEmp(driver, pubServiceEmp);
		String pensionar=testdata.get(12);
		cl.IsPensionar(driver, pensionar);
		String selbstbeteiligung=testdata.get(13);
		cl.NeedSelbstbeteiligung(driver, selbstbeteiligung);
		cl.ShowMyOffers(driver);
		String offerTypeToSelect=testdata.get(14);
		cl.SelectOffer(driver, offerTypeToSelect);
		/*String userId=testdata.get(1);
		String password=testdata.get(2);
		cl.Register(driver, userId, password);
		ArrayList<String> personalinfo=new ArrayList<String>();
		for (int k=0;k<=10;k++)
		{
			personalinfo.add("NULL");
		}
		int j=3;
		
		for (int i=0;i<=5;i++)
		{
					
				personalinfo.set(i,testdata.get(j));
				j++;
			
		}
		personalinfo.set(6, zipcode);
		personalinfo.set(7, telefoneNummer);
		cl.PersonalInfo(driver, personalinfo);
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
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_YesPensionar_NoDeductible() throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\ClarkAssignment_Automation\\Configuration\\config.properties");
		prop.load(fis);
		String zipcode=prop.getProperty("ZipCode");
		String telefoneNummer=prop.getProperty("TelefoneNummer");
		String iBAN=prop.getProperty("IBAN");
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC4");
		Actions a =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		ThankYouPage tp=new ThankYouPage(driver);
		CommonLibrary cl=new CommonLibrary();
		CommonLibrary.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		cl.ChooseInsuranceType(driver, insuranceType);
		cl.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		cl.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		cl.IsPublicServiceEmp(driver, pubServiceEmp);
		String pensionar=testdata.get(12);
		cl.IsPensionar(driver, pensionar);
		String selbstbeteiligung=testdata.get(13);
		cl.NeedSelbstbeteiligung(driver, selbstbeteiligung);
		cl.ShowMyOffers(driver);
		String offerTypeToSelect=testdata.get(14);
		cl.SelectOffer(driver, offerTypeToSelect);
		/*String userId=testdata.get(1);
		String password=testdata.get(2);
		cl.Register(driver, userId, password);
		ArrayList<String> personalinfo=new ArrayList<String>();
		for (int k=0;k<=10;k++)
		{
			personalinfo.add("NULL");
		}
		int j=3;
		
		for (int i=0;i<=5;i++)
		{
					
				personalinfo.set(i,testdata.get(j));
				j++;
			
		}
		personalinfo.set(6, zipcode);
		personalinfo.set(7, telefoneNummer);
		cl.PersonalInfo(driver, personalinfo);
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
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_NotPensionar_YesDeductible() throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\ClarkAssignment_Automation\\Configuration\\config.properties");
		prop.load(fis);
		String zipcode=prop.getProperty("ZipCode");
		String telefoneNummer=prop.getProperty("TelefoneNummer");
		String iBAN=prop.getProperty("IBAN");
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC5");
		Actions a =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		ThankYouPage tp=new ThankYouPage(driver);
		CommonLibrary cl=new CommonLibrary();
		CommonLibrary.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		cl.ChooseInsuranceType(driver, insuranceType);
		cl.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		cl.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		cl.IsPublicServiceEmp(driver, pubServiceEmp);
		String pensionar=testdata.get(12);
		cl.IsPensionar(driver, pensionar);
		String selbstbeteiligung=testdata.get(13);
		cl.NeedSelbstbeteiligung(driver, selbstbeteiligung);
		cl.ShowMyOffers(driver);
		String offerTypeToSelect=testdata.get(14);
		cl.SelectOffer(driver, offerTypeToSelect);
		/*String userId=testdata.get(1);
		String password=testdata.get(2);
		cl.Register(driver, userId, password);
		ArrayList<String> personalinfo=new ArrayList<String>();
		for (int k=0;k<=10;k++)
		{
			personalinfo.add("NULL");
		}
		int j=3;
		
		for (int i=0;i<=5;i++)
		{
					
				personalinfo.set(i,testdata.get(j));
				j++;
			
		}
		personalinfo.set(6, zipcode);
		personalinfo.set(7, telefoneNummer);
		cl.PersonalInfo(driver, personalinfo);
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
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_NotPensionar_NotDeductible() throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\ClarkAssignment_Automation\\Configuration\\config.properties");
		prop.load(fis);
		String zipcode=prop.getProperty("ZipCode");
		String telefoneNummer=prop.getProperty("TelefoneNummer");
		String iBAN=prop.getProperty("IBAN");
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC6");
		Actions a =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		ThankYouPage tp=new ThankYouPage(driver);
		CommonLibrary cl=new CommonLibrary();
		CommonLibrary.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		cl.ChooseInsuranceType(driver, insuranceType);
		cl.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		cl.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		cl.IsPublicServiceEmp(driver, pubServiceEmp);
		String pensionar=testdata.get(12);
		cl.IsPensionar(driver, pensionar);
		String selbstbeteiligung=testdata.get(13);
		cl.NeedSelbstbeteiligung(driver, selbstbeteiligung);
		cl.ShowMyOffers(driver);
		String offerTypeToSelect=testdata.get(14);
		cl.SelectOffer(driver, offerTypeToSelect);
		/*String userId=testdata.get(1);
		String password=testdata.get(2);
		cl.Register(driver, userId, password);
		ArrayList<String> personalinfo=new ArrayList<String>();
		for (int k=0;k<=10;k++)
		{
			personalinfo.add("NULL");
		}
		int j=3;
		
		for (int i=0;i<=5;i++)
		{
					
				personalinfo.set(i,testdata.get(j));
				j++;
			
		}
		personalinfo.set(6, zipcode);
		personalinfo.set(7, telefoneNummer);
		cl.PersonalInfo(driver, personalinfo);
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
	@AfterMethod
	public void teardown()
	{
		driver.close();	
	}

}
