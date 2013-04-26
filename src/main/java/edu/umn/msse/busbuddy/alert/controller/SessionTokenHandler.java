package edu.umn.msse.busbuddy.alert.controller;

import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;

/**
 * A concrete strategy implementation of {@link ISessionHandler} that can verify the session token being passed.
 */
public class SessionTokenHandler implements ISessionHandler {

	/**
	 * This method takes in an encrypted session token in a form of string and then validates for its authenticity.
	 * 
	 * @throws BusBuddyForbiddenException
	 *             - Throws an exception when the token is not valid.
	 */
	@Override
	public boolean verifySessionToken(String sessionToken) throws BusBuddyForbiddenException {
		// TODO Auto-generated method stub
		return false;
	}

}
