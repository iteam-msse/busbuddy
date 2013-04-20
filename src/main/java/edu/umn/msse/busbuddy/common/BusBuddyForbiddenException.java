package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;

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
	
	@Override
	public HttpStatus getHttpCode() {
		return HttpStatus.FORBIDDEN;
	}
}
