package epam_framework.framework.exception;

public class FrameworkException extends RuntimeException {

	/*
	 * FrameworkException custom exception
	 */
	private static final long serialVersionUID = -6040025090495400270L;

	FrameworkException(String exceptionMessage) {
		super(exceptionMessage);
	}

	FrameworkException(String exceptionMessage, Throwable throwable) {
		super(exceptionMessage, throwable);
	}
}
