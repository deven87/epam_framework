package epam_framework.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * MyFirefoxDriver for implementing firefox driver
 */
public class MyFirefoxDriver implements BrowserDriverInterf {

	@Override
	public WebDriver getDriver() {
		return new FirefoxDriver();
	}

}
