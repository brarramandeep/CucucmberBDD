package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetUp {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public  TestBase testBase;
	 
	
	
	
	
	
	//to share the driver/variable state between the different classes we can use pico container dependeny
	//create a class like this and all the varibles and objects that we want to share among other step definitions classes
	//in each stepn definition class create a constructor and that will accept instance of this classa s argument and declare that as gloabl variable as well so that
	// we can access that that insatance outside of this constructor as well
	//and in constructor assign this instance that we are acceoting as argument to global class variable by using this keyword.
	//then anywhere if we want to use the variables of this class we can call them using the instance of this class
	//THIS CLASS IS like aheart to our framework, it creates the object of pageObjectManager class which needs a driver and it provides driver
	//from testBase class to the pom class. that pom class then is responsible for creating the object of page classes and provide the driver to
	//all page class
	//those page classes then use that driver , perform all the actions required
	//but as this is a heart so we have to inititae TCS in every step defination class and using this class object ,call pom then any page class object
	
public TestContextSetUp() throws IOException {
	testBase= new TestBase();
	
	pageObjectManager=new PageObjectManager(testBase.webDriverManager());
	
	
	
	
	
}
	
	
	
}


