package com.alasdoo.developercourseassignment.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class ScreenshotTest extends LaunchAplication {
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(true, true);
	}

}
