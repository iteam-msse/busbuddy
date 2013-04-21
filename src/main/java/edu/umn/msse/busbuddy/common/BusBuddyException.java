package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

/**
 * This exception object is an abstract base class.  Other excpetions within the BusBuddy application will extend this
 * class.  This provides a common base for all application exceptions.
 */
public abstract class BusBuddyException extends Exception {
	private static final long serialVersionUID = 5906063726935813830L;

	protected BusBuddyException() {
		super();
	}
	
	protected BusBuddyException(String message) {
		super(message);
	}
	
	protected BusBuddyException(Throwable cause) {
		super(cause);
	}
	
	protected BusBuddyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * This method returns a Spring HTTP status code object representing the HTTP status code tied to this exception.
	 * @return HTTP Status Code object
	 */
	protected abstract HttpStatus getHttpCode();
}
