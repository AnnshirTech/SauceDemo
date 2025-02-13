package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.page.Page;

public class BaseTests {
	
	private static WebDriver  webDriver;
	//add a handle to the page so my test can access it and make it protected so my test class will have 
	//access to it
	
	protected static Page homePage;
	
	//make a method that will launch the browser and also add an annotation before this so that before
	//every test it will launch the application
	@BeforeClass
	public static void launchApplication() {
		setChromeDriverProperty();
		//then instantiate the web driver
		webDriver = new ChromeDriver();
		//the command to launch the browser 
		webDriver.get(Links.HOME);
		//instantiate so test class can access
		homePage = new Page();
		
	}
	//add an annotation after so that after every test class close the browser
	//so by adding these annotations in the base class it will be done automatically so that every test doesn't
	//have to launch and close the browser
	@AfterClass
	public static void closeBrowser() {
		webDriver.quit();
	}
	private static void setChromeDriverProperty() {
		System.setProperty
		("webdriver.chrome.driver", "resources/chromedriver.exe");
		
		
	}

}
