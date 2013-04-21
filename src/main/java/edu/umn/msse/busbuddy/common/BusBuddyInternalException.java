package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

/**
 * This exception object represents internal errors which may occur, which are generally not due to the specifics of
 * what appears to be a valid request.
 */
public class BusBuddyInternalException extends BusBuddyException {
	private static final long serialVersionUID = 4549592428602851924L;

	public BusBuddyInternalException() {
		super();
	}
	
	public BusBuddyInternalException(String message) {
		super(message);
	}
	
	public BusBuddyInternalException(Throwable cause) {
		super(cause);
	}
	
	public BusBuddyInternalException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * This method returns the HTTP status code associated with this exception.
	 * @return HTTP 500 Internal Server Error
	 */
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.INTERNAL_SERVER_ERROR;
	}
}
