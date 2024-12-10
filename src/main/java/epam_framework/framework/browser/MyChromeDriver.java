package epam_framework.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * MyChromeDriver
 * for implementing chrome driver
 */
public class MyChromeDriver implements BrowserDriverInterf {

	@Override
	public WebDriver getDriver() {
		return new ChromeDriver();
	}

}
