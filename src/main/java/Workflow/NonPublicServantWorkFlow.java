package Workflow;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import Utility.ExcelUtility;
import pageObject.BankDetailsPage;
import pageObject.DetailsSubmittedPage;
import pageObject.InsuranceSummaryPage;
import pageObject.LandingPage;
import pageObject.OfferDetailsPage;
import pageObject.OfferTypePage;
import pageObject.PersonalDetailsPage;
import pageObject.QuestionairePage;
import pageObject.RegistrationPage;
import pageObject.StartDatePage;
import resources.Base;
import resources.CommonLibrary;

public class NonPublicServantWorkFlow extends Base {

	public void NotPublicServant(WebDriver driver, String testCase) throws Throwable
	{
		
		ExcelUtility eu=new ExcelUtility();	
		ArrayList<String>testdata=eu.GetTestData(testCase);
		String iban=testdata.get(15);
		StartDatePage start=new StartDatePage(driver);
		BankDetailsPage bd=new BankDetailsPage(driver);
		LandingPage lp=new LandingPage(driver);
		DetailsSubmittedPage ds=new DetailsSubmittedPage(driver);
		InsuranceSummaryPage is=new InsuranceSummaryPage(driver);
		OfferDetailsPage od=new OfferDetailsPage(driver);
		PersonalDetailsPage pd=new PersonalDetailsPage(driver);
		OfferTypePage ot=new OfferTypePage(driver);
		QuestionairePage qp=new QuestionairePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		Actions a =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		lp.ListAngebote(driver);
		String insuranceType=testdata.get(9);		
		ot.ChooseInsuranceType(driver, insuranceType);
		ot.BeginQuestion(driver);
		String insuranceCategory=testdata.get(10);
		qp.ChooseInsuranceCategory(driver, insuranceCategory);
		String pubServiceEmp=testdata.get(11);
		qp.IsPublicServiceEmp(driver, pubServiceEmp);
		String pensionar=testdata.get(12);
		qp.IsPensionar(driver, pensionar);
		String selbstbeteiligung=testdata.get(13);
		qp.NeedSelbstbeteiligung(driver, selbstbeteiligung);
		ds.ShowMyOffers(driver);
		String offerTypeToSelect=testdata.get(14);
		od.SelectOffer(driver, offerTypeToSelect);
		String userId=testdata.get(1);
		String password=testdata.get(2);
		rp.Register(driver, userId, password);
		pd.PersonalInfo(driver, testdata);
		start.provideStartDateDetails(driver);
		bd.provideBankDetails(driver,iban);
		is.acceptInsurance(driver);
		/*Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@class='ember-view _button_dsfphm _appearance-secondary_dsfphm _size-medium_dsfphm']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='_modal-content-rating-feedback_5m20r3']//a")).click();
		a.contextClick();*/
		
		
}
}
