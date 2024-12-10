package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import epam_framework.framework.reporting.ExtentReporting;

/*
 * SuiteListener
 * to perform operation before and after the suite level
 */
public class SuiteListener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart iSuite");
		ExtentReporting.startReport();
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinish iSuite");
		ExtentReporting.flushReport();
	}
}
