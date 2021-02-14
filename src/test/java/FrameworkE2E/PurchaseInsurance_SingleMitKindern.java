package FrameworkE2E;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ExcelUtility;
import Workflow.NonPublicServantWorkFlow;
import Workflow.PublicServantWorkFlow;

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
import resources.CommonLibrary;

public class PurchaseInsurance_SingleMitKindern extends Base {
	
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
	public void Purchase_PrivateIns_SingleMitKindern_PublicServant_YesDeductible() throws Throwable
	{
		String filePath=System.getProperty("user.dir")+"\\Configuration\\config.properties";		
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		PublicServantWorkFlow ps=new PublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_SingleMitKindern_PublicServant_YesDeductible";
		ps.PublicServant(driver,testCase);
				
	}

	@Test(priority=2)
	public void Purchase_PrivateIns_SingleMitKindern_PublicServant_NoDeductible() throws Throwable
	{
		
		PublicServantWorkFlow ps=new PublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_SingleMitKindern_PublicServant_NoDeductible";
	    ps.PublicServant(driver, testCase);
				
	}
	@Test
	public void Purchase_PrivateIns_SingleMitKindern_NotPublicServant_YesPensionar_YesDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_SingleMitKindern_NotPublicServant_YesPensionar_YesDeductible";
		nps.NotPublicServant(driver,testCase);
	}
	@Test
	public void Purchase_PrivateIns_SingleMitKindern_NotPublicServant_YesPensionar_NoDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_SingleMitKindern_NotPublicServant_YesPensionar_NoDeductible";
		nps.NotPublicServant(driver,testCase);
				
}
	@Test
	public void Purchase_PrivateIns_SingleMitKindern_NotPublicServant_NotPensionar_YesDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_SingleMitKindern_NotPublicServant_NotPensionar_YesDeductible";
		nps.NotPublicServant(driver,testCase);
				
		
	}
	@Test
	public void Purchase_PrivateIns_SingleMitKindern_NotPublicServant_NotPensionar_NotDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_SingleMitKindern_NotPublicServant_NotPensionar_NotDeductible";
		nps.NotPublicServant(driver,testCase);
				
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();	
	}

}
