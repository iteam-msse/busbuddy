package edu.umn.msse.busbuddy.alert.controller;

import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;

/**
 * A concrete strategy implementation of {@link ISessionHandler} that can verify the certificate token being passed.
 */
public class CertificateHandler implements ISessionHandler {

	/**
	 * This method takes in an encrypted certificate from Tracking and Transit module in a form of string and then
	 * validates for its authenticity.
	 * 
	 * @throws BusBuddyForbiddenException
	 *             Throws an exception when the token is not valid.
	 */
	@Override
	public boolean verifySessionToken(String sessionToken) throws BusBuddyForbiddenException {
		// TODO Auto-generated method stub
		return false;
	}

}
