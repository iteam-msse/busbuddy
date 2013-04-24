package edu.umn.msse.busbuddy.alert.controller;

import edu.umn.msse.busbuddy.alert.enums.AlertInitiator;

public class SessionVerificationFactory {

	/**
	 * This method takes in an {@link AlertInitiator} and depending upon the
	 * value can invoke different strategy to verify the token.
	 * 
	 * @param alertInitiator
	 *            A valid {@link AlertInitiator}
	 * @return A implementation of {@link ISessionHandler}
	 */
	public static ISessionHandler getSessionTokenVerificationStrategy(
			AlertInitiator alertInitiator) {

		// TODO write switch case or if else to select appropriate
		// IsessionHandler implementation.
		return null;
	}
}
