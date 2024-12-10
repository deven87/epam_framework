package listeners;

import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

/*
 * MethodInterceptor
 * Listener for runtime method
 * e.g. can be used to get list of enabled method based on external source
 */
public class MethodInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {

		for (IMethodInstance instance : methods) {
			System.out.println(instance.getMethod().getEnabled());
		}
		return methods;
	}

}
