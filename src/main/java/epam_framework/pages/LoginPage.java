package epam_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * LoginPage
 * add Login Page locators and specific methods here
 */
public class LoginPage extends BasePage {

	private WebDriver driver;

	@FindBy(id = "")
	private WebElement userName;

	By userNameField = By.id("");

	LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void enterUserName(String userName) {
		this.enterText(driver, userNameField, userName, "user name");
	}

}
