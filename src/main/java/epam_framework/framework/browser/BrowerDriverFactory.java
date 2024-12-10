package epam_framework.framework.browser;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

/**
 * BrowerDriverFactory factory for browser driver
 */
public class BrowerDriverFactory {

	private BrowserDriverInterf driver;
	private static final Map<String, BrowserDriverInterf> map = new HashMap<>();

	static {
		map.put("chrome", new MyChromeDriver());
	}

	public BrowserDriverInterf startDriver(String browserName) {
		return map.get(browserName);
	}

	public void addDriver(String browserName, BrowserDriverInterf driver) {
		map.put(browserName, driver);
	}

	public WebDriver createDriver() {
		return driver.getDriver();
	}
}
