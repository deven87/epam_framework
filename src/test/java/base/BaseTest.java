package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/*
 * Base Test
 * used to setup pre and post conditions
 */
public class BaseTest {

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		System.out.println("beforeSuite");

	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		System.out.println("afterSuite");

	}
}
