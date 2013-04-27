package edu.umn.msse.busbuddy.alert.controller;

import edu.umn.msse.busbuddy.alert.enums.AlertInitiator;

/**
 * A factory that picks the appropriate strategy {@link ISessionHandler} to verify the encrypted token.
 */
public class SessionVerificationFactory {

	/**
	 * This method takes in an {@link alert.enums.AlertInitiator} and depending upon the value can invoke different strategy to
	 * verify the token.
	 * 
	 * @param alertInitiator
	 *            A valid {@link alert.enums.AlertInitiator}
	 * @return A implementation of {@link ISessionHandler}
	 */
	public static ISessionHandler getSessionTokenVerificationStrategy(AlertInitiator alertInitiator) {

		// TODO write switch case or if else to select appropriate
		// IsessionHandler implementation.
		return null;
	}
}
