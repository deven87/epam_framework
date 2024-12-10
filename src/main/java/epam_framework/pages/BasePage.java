package epam_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * BasePage
 * add common pages methods here
 */
public class BasePage {

	public void click(WebDriver driver, By by, String name) {

		driver.findElement(by).click();
	}

	public void enterText(WebDriver driver, By by, String text, String name) {

		driver.findElement(by).click();
	}

}
