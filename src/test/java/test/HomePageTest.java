package test;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import base.BaseTest;
import epam_framework.framework.annotation.FrameworkAnnotation;

@Test
/*
 * HomePageTest contains home page specific test methods
 */
public class HomePageTest extends BaseTest {

	@FrameworkAnnotation(authorname = "devendra")
	public void homePageTest(ITestContext context, Method method) {
		System.out.println("hometest");
		System.out.println(context.getAttribute("dependency injection"));
		System.out.println(method.getName());

	}

}
