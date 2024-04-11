package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", monochrome = true, tags = "@SmokeTests", 
plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json" ,
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failedScenarios.txt"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

//if we done mention tags and do not provide any tag/tags here then it will by deafuly run all the tests in feature folder
	// to control the execution we can use tags on feature file and each feature
	// file can have one or more that one tags
	// or we can Tags=~@notRequired if we dont want to run these tests
	
	//"@AcceptDataAsList"
	//"@AcceptDataAsList and @SmokeTests"
	//"@AcceptDataAsList or @SmokeTests"
	//"not @LoginTest and not @notRequired",
	
	//if we want reports in json format then : "json:target/cucumber.json" }
	//but this will not be as readable as html but with many other third party pluagins we can get very information reports/charts from these 
	//json reports
	//dryRun=true  it will execute the test cases in real sense but will execute to find if there are any issues, any step definitons missing and all
	
	//for extent report we cannot just direct mention in cucumbe and to use these reports we need to do soke configuartion
	
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		
		return super.scenarios();

	}

}

