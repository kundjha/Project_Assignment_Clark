package Workflow;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import Utility.ExcelUtility;
import pageObject.BankDetailsPage;
import pageObject.InsuranceSummaryPage;
import pageObject.StartDatePage;
import pageObject.ThankYouPage;
import resources.Base;
import resources.CommonLibrary;

public class PublicServantWorkFlow extends Base {
	public void PublicServant(WebDriver driver, String testCase) throws Throwable
	{
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData(testCase);		
		String iban=testdata.get(15);
		String zipcode=testdata.get(16);
		String telefoneNummer=testdata.get(17);	
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
		String userId=testdata.get(1);
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
		bd.IbanInfo().sendKeys(iban);
		bd.DirectDebitMandate().click();
		bd.SubmitBankDetails().click();
		is.SubmitSummary().click();
		tp.AcceptThanks().click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='ember-view _button_dsfphm _appearance-secondary_dsfphm _size-medium_dsfphm']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_modal-content-rating-feedback_5m20r3']//a")).click();
		a.contextClick();
		
		
}
	
	

}
