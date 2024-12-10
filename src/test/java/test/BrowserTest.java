package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import epam_framework.framework.annotation.FrameworkAnnotation;
import epam_framework.framework.browser.BrowerDriverFactory;
import epam_framework.framework.browser.MyFirefoxDriver;

/*
 * BrowserTest class
 * to demonstrate browser run
 */
public class BrowserTest {

	@Test
	@FrameworkAnnotation(authorname = "devendra")
	public void browserTest() {

		BrowerDriverFactory factory = new BrowerDriverFactory();

		WebDriver driver = factory.startDriver("chrome").getDriver();
		driver.get("https://www.google.com");

		// adding new driver
		factory.addDriver("firefox", new MyFirefoxDriver());
		driver = factory.startDriver("firefox").getDriver();

		driver.get("https://www.google.com");
	}
}
