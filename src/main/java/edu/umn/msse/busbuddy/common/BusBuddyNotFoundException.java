package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

public class BusBuddyNotFoundException extends BusBuddyException {
	private static final long serialVersionUID = -5490492502661128777L;

	public BusBuddyNotFoundException() {
		super();
	}
	
	public BusBuddyNotFoundException(String message) {
		super(message);
	}
	
	public BusBuddyNotFoundException(Throwable cause) {
		super(cause);
	}
	
	public BusBuddyNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.NOT_FOUND;
	}
}
