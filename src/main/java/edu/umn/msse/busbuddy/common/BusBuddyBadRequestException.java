package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

/**
 * This exception object represents internal errors which may occur as a result of an error in the client's request.
 */
public class BusBuddyBadRequestException extends BusBuddyException {
	private static final long serialVersionUID = -5974225882272455539L;

	public BusBuddyBadRequestException() {
		super();
	}
	
	public BusBuddyBadRequestException(String message) {
		super(message);
	}
	
	public BusBuddyBadRequestException(Throwable cause) {
		super(cause);
	}
	
	public BusBuddyBadRequestException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * This method returns the HTTP status code associated with this exception.
	 * @return HTTP 400 Bad Request
	 */
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.BAD_REQUEST;
	}
}
