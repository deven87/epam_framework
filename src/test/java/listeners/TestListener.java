package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import epam_framework.framework.annotation.FrameworkAnnotation;
import epam_framework.framework.reporting.ExtentReporting;

/*
 * TestListener
 * implements ITestListener and override its default methods
 */
public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
		ExtentReporting.createTest(result.getName());
		if (result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class) != null) {
			System.out.println("EXECUTED");
			ExtentReporting.addAuthor(result.getMethod().getConstructorOrMethod().getMethod()
					.getAnnotation(FrameworkAnnotation.class).authorname());
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		ExtentReporting.getTest().pass("test passed");

		// add logging and logics when test passed

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		// ExtentReporting.getTest().fail("test failed");
		// add logging and logics when test passed e.g. taking screenshot and attaching
		// to extent report

	}

	@Override
	public void onStart(ITestContext context) {

		// can set dependency here which will be available in all test methods via
		// ITestContext
		context.setAttribute("dependency injection", "value");
		System.out.println("onStart");
	}
	@Override
	public void onFinish(ITestContext context) {

		System.out.println("onFinish");
		System.out.println(context.getAttribute("dependency injection"));

	}

}