package edu.umn.msse.busbuddy.user;

import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyBadRequestException;
import edu.umn.msse.busbuddy.common.BusBuddyException;
import edu.umn.msse.busbuddy.common.BusBuddyForbiddenException;
import edu.umn.msse.busbuddy.common.BusBuddyInternalException;
import edu.umn.msse.busbuddy.common.BusBuddyNotFoundException;

/**
 * This is the generic BusBuddy UserLoginService interface. This interface contains methods dealing with user login and
 * session management. It is one of three interfaces that a user module implementation must implement. It can be
 * implemented as a service or as a service client.
 */
@Controller
public interface UserLoginService {
	/**
	 * This method handles the login process. A username and password are supplied. A valid session is created for this
	 * user.
	 * 
	 * @pre Login credentials must be valid and linked to an active account, or a
	 *      {@link edu.umn.msse.busbuddy.common.BusBuddyForbiddenException} will be thrown.
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

	/**
	 * This method logs a user out, invalidating their session in the database.
	 * 
	 * @pre The sessionToken parameter must be a valid session identifier in the database.
	 * @post The session will be invalidated and future calls using that sessionToken will fail.
	 * @param sessionToken
	 *            This is the session token that identifies the session.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown if the session token is blank or missing on the request..
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown if the session token is invalid.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if an internal error prevents processing of the request.
	 */
	void logout(String sessionToken) throws BusBuddyException;

	/**
	 * This method retrieves the user tied to a supplied session token. It will also update the expiration time on the
	 * session to keep it valid.
	 * 
	 * @pre The session token must be linked to an active and valid session, which must be linked to an active account.
	 * @post The returned session token points to a valid session for this user. The expiration time will be advanced
	 *       based on this activity against the session.
	 * @param sessionToken
	 *            The session token identifying the session that the user information should be retrieved for.
	 * @return User object for the user linked to the session represented by the session token parameter.
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown if the session token is blank.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the session token is invalid, linked to an expired session, or the user
	 *             does not have permission to be signed in.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if an internal error prevents processing of the request.
	 */
	User getUser(String sessionToken) throws BusBuddyException;

	/**
	 * This method creates a new session to be used by an alert. Since creation of an alert requires an active user
	 * session, this takes an active sessionToken as a parameter. It will then create a new alert session for the same
	 * user as the active session. This "alert session" will be long-lived, so it won't expire like the main session.
	 * This will allow the Alert module to use this sessionToken when the alert executes.
	 * 
	 * @pre The session token must be linked to an active and valid session, which must be linked to an active account.
	 * @post The returned session token points to a valid alert session for this user, which will not expire. The base
	 *       session's expiration time will be advanced based on this activity against the session.
	 * @param sessionToken
	 *            The session token identifying the session that is creating the new alert session.
	 * @return Session token representing the new alert seession.
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown if the session token is blank.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the session token is invalid, linked to an expired session, or the user
	 *             does not have permission to be signed in.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if an internal error prevents processing of the request.
	 */
	String createAlertSession(String sessionToken) throws BusBuddyException;

	/**
	 * This method sends a user his or her username via e-mail.
	 * 
	 * @pre The e-mail address provided must be linked to a valid and active account.
	 * @post An e-mail has been sent to the user, containing the user's username.
	 * @param email
	 *            E-mail address of the account to send to.
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown if the e-mail address is blank or invalid.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the e-mail address is linked to an account that is suspended or deleted.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown if the e-mail address doesn't link to a valid user.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if an internal error prevents processing of the request.
	 */
	void sendUsername(String email) throws BusBuddyException;

	/**
	 * This method sends a user his or her username via SMS.
	 * 
	 * @pre The mobile details provided must be linked to a valid and active account.
	 * @post An e-mail has been sent to the user, containing the user's username.
	 * @param email
	 *            E-mail address of the account to send to.
	 * @throws BusBuddyBadRequestException
	 *             This exception is thrown if the e-mail address is blank or invalid.
	 * @throws BusBuddyForbiddenException
	 *             This exception is thrown if the e-mail address is linked to an account that is suspended or deleted.
	 * @throws BusBuddyNotFoundException
	 *             This exception is thrown if the e-mail address doesn't link to a valid user.
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if an internal error prevents processing of the request.
	 */
	void sendUsername(short countryCode, String mobile) throws BusBuddyException;

	void resetPassword(String username, String email) throws BusBuddyException;

	void resetPassword(String username, short countryCode, String mobile) throws BusBuddyException;
}
