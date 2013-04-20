package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyBadRequestException;
import edu.umn.msse.busbuddy.common.BusBuddyException;
import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;
import edu.umn.msse.busbuddy.common.BusBuddyInternalException;

@Controller
public interface UserLoginService {
	/**
	 * This method handles the login process. A username and password are supplied. A valid session is created for this
	 * user.
	 * 
	 * @pre Login credentials must be valid and linked to an active account, or a {@link BusBuddForbiddenException} will
	 *      be thrown.
	 * @post The returned session token points to a valid session for this user.
	 * @param username
	 *            Username of the user to login as.
	 * @param password
	 *            Password of the user to login as.
	 * @return session token of the new session
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown if the username or password are blank.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the credentials are incorrect, or the user does not have permission to
	 *             sign in.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if an internal error prevents processing of the request.
	 */
	String login(String username, String password) throws BusBuddyException;

	void logout(String sessionToken) throws BusBuddyException;

	User getUser(String sessionToken) throws BusBuddyException;

	String createAlertSession(String sessionToken) throws BusBuddyException;

	void sendUsername(String email) throws BusBuddyException;

	void sendUsername(short countryCode, String mobile) throws BusBuddyException;

	void resetPassword(String username, String email) throws BusBuddyException;

	void resetPassword(String username, short countryCode, String mobile) throws BusBuddyException;
}
