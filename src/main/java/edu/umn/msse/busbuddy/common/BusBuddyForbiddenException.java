package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

/**
 * This exception object represents internal errors which may occur as a result of attempts to access a resource without
 * authorization.
 */
public class BusBuddyForbiddenException extends BusBuddyException {
	private static final long serialVersionUID = -4463973248172436949L;

	public BusBuddyForbiddenException() {
		super();
	}
	
	public BusBuddyForbiddenException(String message) {
		super(message);
	}
	
	public BusBuddyForbiddenException(Throwable cause) {
		super(cause);
	}
	
	public BusBuddyForbiddenException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * This method returns the HTTP status code associated with this exception.
	 * @return HTTP 403 Forbidden
	 */
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.FORBIDDEN;
	}
}
