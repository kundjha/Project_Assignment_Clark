package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",glue= {"stepDefinitions"})
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
	
}
