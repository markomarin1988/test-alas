package com.alasdoo.developercourseassignment.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RunFromAnyBrowser {
	WebDriver driver;
	
	@BeforeMethod
	@org.testng.annotations.Parameters("browser")
	public void BeforMethod(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/markomarinkovic/Documents/Napredna Java/3 modul/WebDriver/geckodriver");
			driver = new RemoteWebDriver(DesiredCapabilities.firefox());
		}
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/markomarinkovic/Documents/Napredna Java/3 modul/WebDriver/chromedriver-2");
			driver = new RemoteWebDriver(DesiredCapabilities.chrome());
	}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "/Users/markomarinkovic/Documents/Napredna Java/3 modul/WebDriver/edgedriver_mac64/msedgedriver");
			driver = new RemoteWebDriver(DesiredCapabilities.edge());
	}
		
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/student");

}
	@Test
	public void Test1() {
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.close();
	}
}
