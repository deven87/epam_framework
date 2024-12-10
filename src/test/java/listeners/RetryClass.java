package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
 * RetryClass
 * implements IRetryAnalyzer for testng failure retry logic
 */
public class RetryClass implements IRetryAnalyzer {

	final int maxRetry = 2;
	int retryCount = 0;
	@Override
	public boolean retry(ITestResult result) {

		if (retryCount < maxRetry) {
			retryCount++;
			return true;
		}

		return false;
	}

}
