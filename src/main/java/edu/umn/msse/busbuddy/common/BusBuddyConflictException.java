package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

/**
 * This exception object is thrown when a request would create a conflict which violates constraints set within the
 * system.
 */
public class BusBuddyConflictException extends BusBuddyException {
	private static final long serialVersionUID = -2044397352042431762L;

	public BusBuddyConflictException() {
		super();
	}
	
	public BusBuddyConflictException(String message) {
		super(message);
	}
	
	public BusBuddyConflictException(Throwable cause) {
		super(cause);
	}
	
	public BusBuddyConflictException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * This method returns the HTTP status code associated with this exception.
	 * @return HTTP 409 Conflict
	 */
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.CONFLICT;
	}
}
