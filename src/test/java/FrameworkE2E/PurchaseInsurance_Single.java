package FrameworkE2E;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Workflow.NonPublicServantWorkFlow;
import Workflow.PublicServantWorkFlow;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resources.Base;

public class PurchaseInsurance_Single extends Base {
	
	 public static Logger log =LogManager.getLogger(PurchaseInsurance_Single.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver=InitializeDriver();
		log.info("Driver is initalized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to URL ");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void Purchase_PrivateIns_Single_PublicServant_YesDeductible() throws Throwable
	{
		String filePath=System.getProperty("user.dir")+"\\Configuration\\config.properties";		
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		PublicServantWorkFlow ps=new PublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_Single_PublicServant_YesDeductible";
		ps.PublicServant(driver,testCase);
				
	}

	@Test(priority=2)
	public void Purchase_PrivateIns_Single_PublicServant_NoDeductible() throws Throwable
	{
		
		PublicServantWorkFlow ps=new PublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_Single_PublicServant_NoDeductible";
	    ps.PublicServant(driver, testCase);
				
	}
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_YesPensionar_YesDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_Single_NotPublicServant_YesPensionar_YesDeductible";
		nps.NotPublicServant(driver,testCase);
	}
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_YesPensionar_NoDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_Single_NotPublicServant_YesPensionar_NoDeductible";
		nps.NotPublicServant(driver,testCase);
				
	}
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_NotPensionar_YesDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_Single_NotPublicServant_NotPensionar_YesDeductible";
		nps.NotPublicServant(driver,testCase);
				
		
	}
	@Test
	public void Purchase_PrivateIns_Single_NotPublicServant_NotPensionar_NotDeductible() throws Throwable
	{
		NonPublicServantWorkFlow nps=new NonPublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_Single_NotPublicServant_NotPensionar_NotDeductible";
		nps.NotPublicServant(driver,testCase);
				
	}
	@AfterTest
	public void teardown()
	{
		driver.close();	
	}

}
