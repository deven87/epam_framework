package epam_framework.framework.reporting;

import java.nio.file.Paths;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/*
 * ExtentReporting
 * setup for extent report
 */
public class ExtentReporting {

	private static ExtentReports report;
	private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	public static ExtentReports startReport() {
		ExtentSparkReporter reporter;
		reporter = new ExtentSparkReporter(Paths.get(System.getProperty("user.dir"), "report", "extentreport.html").toFile());
		report = new ExtentReports();
		report.attachReporter(reporter);
		return report;
	}

	public static ExtentReports getReport() {
		return report;
	}

	public static void flushReport() {
		report.flush();
	}

	public static void createTest(String testName) {
		test.set(report.createTest(testName));
	}

	public static ExtentTest getTest() {
		return test.get();
	}

	public static void addAuthor(String authorName) {
		ExtentReporting.getTest().assignAuthor(authorName);
	}

}
