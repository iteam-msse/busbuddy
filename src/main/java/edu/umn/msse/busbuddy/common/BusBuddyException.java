package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

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
	
	protected abstract HttpStatus getHttpCode();
}
