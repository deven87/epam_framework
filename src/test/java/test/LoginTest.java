package test;

import java.lang.reflect.Method;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import base.BaseTest;
import epam_framework.framework.annotation.FrameworkAnnotation;
import epam_framework.framework.dataprovider.LoginDataProvider;

/*
 *LoginTest
 *contains Login Page specific test methods
 */
public class LoginTest extends BaseTest {

	@Test(groups = { "login" }, enabled = false)
	@FrameworkAnnotation(authorname = "devendra")
	public void loginTest(ITestContext context, Method method) {
		System.out.println("loginTest");
		System.out.println(context.getAttribute("dependency injection"));
		System.out.println(method.getName());

	}

	@Test(dataProvider = "loginDataProvider", dataProviderClass = LoginDataProvider.class)
	@FrameworkAnnotation(authorname = "devendra")
	public void dataDrivenTest(Map<String, String> data, ITestContext context) {

		System.out.println(data.get("username"));
		System.out.println(data.get("password"));

	}

}
