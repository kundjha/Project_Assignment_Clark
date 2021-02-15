package stepDefinitions;


import java.io.FileInputStream;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.Base;
import Workflow.NonPublicServantWorkFlow;
import Workflow.PublicServantWorkFlow;

public class StepDefination extends Base {
	
	@Given("Initialize the Browser with Chrome")
	public void initialize_the_Browser_with_Chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		
			driver=InitializeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			
		
	    
	}

	@Given("Navigate to ClarkHomePage")
	public void navigate_to_ClarkHomePage() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User selects Privathaftpflicht category")
	public void user_selects_Privathaftpflicht_category() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user type is  Single_PublicServant_YesDeductible")
	public void user_type_is_Single_PublicServant_YesDeductible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String filePath=System.getProperty("user.dir")+"\\Configuration\\config.properties";		
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		PublicServantWorkFlow ps=new PublicServantWorkFlow();
		String testCase="Purchase_PrivateIns_SingleMitKindern_PublicServant_YesDeductible";
		ps.PublicServant(driver,testCase);
	    
	}
	
	
	@Then("user is able to purchase insurance")
	public void user_is_able_to_purchase_insurance() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
