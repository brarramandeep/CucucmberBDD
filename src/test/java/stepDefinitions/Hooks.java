package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetUp;

public class Hooks{
	
	TestContextSetUp testContextSetUp;

	public Hooks(TestContextSetUp testContextSetUp) {
		this.testContextSetUp = testContextSetUp;

	}

		
	@After
	public void tearDown() throws IOException
	{
		testContextSetUp.testBase.webDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver =testContextSetUp.testBase.webDriverManager();
		if(scenario.isFailed())
		{
		//screenshot
		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
		
		}
		
	}
	
}

	
	



// Before->Background-> Scenario-> After
//this hooks will run for scenarion in every feature file , ofcouse if we mention any tags it will be tied to those feature  only
//we can set setup or teardown mewthods in hooks