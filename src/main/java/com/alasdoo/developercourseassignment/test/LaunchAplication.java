package com.alasdoo.developercourseassignment.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAplication {

	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "/Users/markomarinkovic/Documents/Napredna Java/3 modul/WebDriver/chromedriver-2");
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/student");
		System.out.println(driver.getTitle());
		
	}
	
	public void failed() {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File("/Users/markomarinkovic/git/test-alas/screenshots/"+"failshot_" + this.getClass().getName() + ".jpg"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
