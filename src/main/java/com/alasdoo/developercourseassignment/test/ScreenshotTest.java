package com.alasdoo.developercourseassignment.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class ScreenshotTest extends LaunchAplication {
	//call method for start aplication
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	//methods checks that the two objects are equals or not
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false, true);
	}

}
