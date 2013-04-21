package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class BaseController {
	@ExceptionHandler(BusBuddyException.class)
	public ResponseEntity<String> handleBusBuddyException(BusBuddyException e) {
		/* TODO : Write real code to extract exception data, and not this prototype. */
		String exceptionJson = "{ \"error\" : \"" + e.getMessage() + "\" }";

		ResponseEntity<String> response = new ResponseEntity<>(exceptionJson, e.getHttpCode());
		return response;
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGenericException(BusBuddyException e) {
		/* TODO : Write real code to extract exception data, and not this prototype. */
		String exceptionJson = "{ \"error\" : \"" + e.getMessage() + "\" }";

		ResponseEntity<String> response = new ResponseEntity<>(exceptionJson, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
}
