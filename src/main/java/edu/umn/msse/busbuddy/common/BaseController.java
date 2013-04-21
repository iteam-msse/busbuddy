package edu.umn.msse.busbuddy.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * This is a base class to be extended by each of the controller classes. This provides a means to handle exceptions
 * that need to be thrown back up to the user. It could be modified to add other common logic that apply to multiple
 * controllers.
 */
public abstract class BaseController {
	/**
	 * This method handles cases where {@link BusBuddyException} is thrown from controller methods. It will format the
	 * exception for the user, and return the correct HTTP status code, based on the code stored within the exception.
	 * 
	 * @param e
	 *            exception which was thrown
	 * @return ResponseEntity object
	 */
	@ExceptionHandler(BusBuddyException.class)
	public ResponseEntity<String> handleBusBuddyException(BusBuddyException e) {
		/* TODO : Write real code to extract exception data, and not this prototype. */
		String exceptionJson = "{ \"error\" : \"" + e.getMessage() + "\" }";

		ResponseEntity<String> response = new ResponseEntity<>(exceptionJson, e.getHttpCode());
		return response;
	}

	/**
	 * This method handles cases where a generic Exception is thrown from controller methods (other than
	 * {@link BusBuddyException}). It will format the exception for the user, and return a generic HTTP 500. Since
	 * handled exceptions should result in a {@link BusBuddyException}, if this happens, it is unexpected behavior and
	 * should be treated as an internal error.
	 * 
	 * @param e
	 *            exception which was thrown
	 * @return ResponseEntity object
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGenericException(BusBuddyException e) {
		/* TODO : Write real code to extract exception data, and not this prototype. */
		String exceptionJson = "{ \"error\" : \"" + e.getMessage() + "\" }";

		ResponseEntity<String> response = new ResponseEntity<>(exceptionJson, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
}
