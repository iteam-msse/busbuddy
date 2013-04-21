package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

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
	
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.BAD_REQUEST;
	}
}
