package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		// we need to create only one driver for each test so write this condition as
		// multiple classes are requesting this driver and to avoid
		// each time new creation simple this if condition
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test/resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("URL");
		String browserProperties = prop.getProperty("browser");

		// to get the propeties from maven we have to get the system properties and like
		// cuucmber options this will not automatiaccly take
		// precedence so we have handle it in code and here we are using terniray
		// operator

		String browserMaven = System.getProperty("browser");
		String browser=browserMaven!=null?browserMaven:browserProperties;

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {

				driver = new ChromeDriver();

			}
			if (browser.equalsIgnoreCase("firefox")) {

				driver=new FirefoxDriver();
			}

			driver.get(url);
			driver.manage().window().maximize();

		}
		return driver;
	}
}
