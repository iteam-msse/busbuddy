package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

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
	
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.INTERNAL_SERVER_ERROR;
	}
}
